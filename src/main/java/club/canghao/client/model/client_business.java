package club.canghao.client.model;


public class client_business {

	private int clientId;
	private int businessId;
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	@Override
	public String toString() {
		return "client_business [clientId=" + clientId + ", businessId=" + businessId + "]";
	}
	
}
