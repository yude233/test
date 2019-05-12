package cn.practice.demo.constant;

public enum ApplicationName {
	Server_1("server_1"),
	Server_2("server_2"),
	
	;
	
	private String applicationName;
	
	private ApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}
	
	public String getApplicationName() {
		return this.applicationName;
	}
}
