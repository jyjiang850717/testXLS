package xlsUtils;

public class XlsReport extends XlsBasic {
	@Override
	public void getSqlByParam() {
		System.out.println("利用查詢條件取得SQL，因每支作業的查詢條件不同");
	}

	public void downLoadReport() {
		System.out.println("下載");
	}
}