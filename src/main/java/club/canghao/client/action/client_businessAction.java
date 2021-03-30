package club.canghao.client.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import club.canghao.client.model.client_business;
import club.canghao.client.service.client_businessService;
import club.canghao.client.utils.jsonUtils;

public class client_businessAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	Map<String, Object> result=new HashMap<String,Object>();
	client_businessService cbService = new client_businessService();
	
	public String addClient_Business()throws Exception  {
		jsonUtils jsonUtils = new jsonUtils();
		List<client_business> list = jsonUtils.jsonToClient_Business();
		result.clear();
		int i=cbService.add(list);
		if(i>0) {
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
}
