package xlsUtils;

public class MqReport extends XlsBasic {
	@Override
	public void getSqlByParam() {
		System.out.println("利用查詢條件取得SQL，因每支作業的查詢條件不同");
	}

	public void addDynamicSchedule() {
		System.out.println("加入排程，帶入查詢條件");
	}

	public void sendReport() {
		System.out.println("寄出報表");
	}
}
