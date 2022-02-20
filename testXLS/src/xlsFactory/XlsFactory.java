package xlsFactory;

import constant.ReportEnum;
import xlsUtils.MqReport;
import xlsUtils.XlsBasic;
import xlsUtils.XlsReport;

public class XlsFactory {
	public XlsBasic createReportByCondition(String reportType) {
		System.out.println("-----------我是一支" + reportType + "報表------------");
		XlsBasic report = null;
		if (ReportEnum.XLS.getType().equals(reportType)) {
			report = new XlsReport();
			report.getSqlByParam();

			report.limitDataSize();

			report.getDataBySql();

			report.converDataToJasperReport();

		} else if (ReportEnum.MQ.getType().equals(reportType)) {
			report = new MqReport();
			report.getSqlByParam();

			report.limitDataSize();

			((MqReport) report).addDynamicSchedule();

			report.getSqlByParam();

			report.getDataBySql();

			report.converDataToJasperReport();

		}
		return report;
	}
}
