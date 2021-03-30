package club.canghao.client.model;


public class client {
	private int clientId;
	private String clientName;
	private String clientAge;
	private String clientPhone;
	private String clientSex;
	private String clientEmail;
	private String clientImageUrl;
	private String clientMore;
	private String joinNumber;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientAge() {
		return clientAge;
	}
	public void setClientAge(String clientAge) {
		this.clientAge = clientAge;
	}
	public String getClientPhone() {
		return clientPhone;
	}
	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}
	public String getClientSex() {
		return clientSex;
	}
	public void setClientSex(String clientSex) {
		this.clientSex = clientSex;
	}
	public String getClientEmail() {
		return clientEmail;
	}
	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}
	public String getClientImageUrl() {
		return clientImageUrl;
	}
	public void setClientImageUrl(String clientImageUrl) {
		this.clientImageUrl = clientImageUrl;
	}
	public String getClientMore() {
		return clientMore;
	}
	public void setClientMore(String clientMore) {
		this.clientMore = clientMore;
	}
	public String getJoinNumber() {
		return joinNumber;
	}
	public void setJoinNumber(String joinNumber) {
		this.joinNumber = joinNumber;
	}
	@Override
	public String toString() {
		return "client [clientId=" + clientId + ", clientName=" + clientName + ", clientAge=" + clientAge
				+ ", clientPhone=" + clientPhone + ", clientSex=" + clientSex + ", clientEmail=" + clientEmail
				+ ", clientImageUrl=" + clientImageUrl + ", clientMore=" + clientMore + ", joinNumber=" + joinNumber
				+ "]";
	}
}
