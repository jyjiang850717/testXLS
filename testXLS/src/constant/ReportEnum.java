package constant;

public enum ReportEnum {
	XLS("XLS"), MQ("MQ");

	private final String type;

	ReportEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return this.type;
	}
}
