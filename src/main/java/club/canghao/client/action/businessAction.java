package club.canghao.client.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import club.canghao.client.model.business;
import club.canghao.client.service.businessService;
import club.canghao.client.utils.jsonUtils;

public class businessAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	Map<String, Object> result=new HashMap<String,Object>();
	private List<business> businesses;
	private String key;
	private String businessId;
	businessService businessService = new businessService();
	
	public String getAllBusiness() throws Exception {
		businesses = businessService.getAllBusiness();
		return SUCCESS;
	}
	
	public String getBusinessByIdOrName()throws Exception  {
		businesses= businessService.getBusinessByIdOrName(key);
		System.out.println(businesses);
		return SUCCESS;
	}
	public String addBusiness()throws Exception  {
		jsonUtils jsonUtils = new jsonUtils();
		business business = jsonUtils.jsonToBusiness();
		result.clear();
		System.out.println(business);
		int i=businessService.addBusiness(business);
		if(i==1) {
			result.put("result",true);
		}
		else result.put("result",false);
		return SUCCESS;
	}
	
	public String deleteBusinessById()throws Exception  {
		System.out.println(businessId);
		int id=Integer.parseInt(businessId);
		result.clear();
		int i=businessService.deleteBusinessById(id);
		if(i==1) {
			result.put("result",true);
		}
		else result.put("result",false);
		return SUCCESS;
	}
	
	public String updateBusinessById()throws Exception  {
		jsonUtils jsonUtils = new jsonUtils();
		business business = jsonUtils.jsonToBusiness();
		result.clear();
		int i=businessService.updateBusinessById(business);
		if(i==1){
			result.put("result",true);
		}
		else result.put("result",false);
		return SUCCESS;
	}
	
	//setter and getter
	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public List<business> getBusinesses() {
		return businesses;
	}

	public void setBusinesses(List<business> businesses) {
		this.businesses = businesses;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getBusinessId() {
		return businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	public businessService getBusinessService() {
		return businessService;
	}

	public void setBusinessService(businessService businessService) {
		this.businessService = businessService;
	}

}
