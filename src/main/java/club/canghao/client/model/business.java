package club.canghao.client.model;

public class business {
	private int businessId;
	private String businessName;
	private String businessDescription;
	private String joinNumber;
	public int getBusinessId() {
		return businessId;
	}
	public void setBusinessId(int businessId) {
		this.businessId = businessId;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getBusinessDescription() {
		return businessDescription;
	}
	public void setBusinessDescription(String businessDescription) {
		this.businessDescription = businessDescription;
	}
	public String getJoinNumber() {
		return joinNumber;
	}
	public void setJoinNumber(String joinNumber) {
		this.joinNumber = joinNumber;
	}
	@Override
	public String toString() {
		return "business [businessId=" + businessId + ", businessName=" + businessName + ", businessDescription="
				+ businessDescription + ", joinNumber=" + joinNumber + "]";
	}
}
