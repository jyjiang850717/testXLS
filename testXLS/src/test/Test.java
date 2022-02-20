package test;

import xlsFactory.XlsFactory;
import xlsUtils.MqReport;
import xlsUtils.XlsReport;

public class Test {
	public static void main(String[] args) {
		XlsFactory xlsFactory=new XlsFactory();
		XlsReport xls=(XlsReport) xlsFactory.createReportByCondition("XLS");
		MqReport mq=(MqReport) xlsFactory.createReportByCondition("MQ");
		xls.downLoadReport();
		mq.sendReport();
	}
}
