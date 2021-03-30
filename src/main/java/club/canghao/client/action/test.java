package club.canghao.client.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import club.canghao.client.model.client;
import club.canghao.client.service.clientService;
import club.canghao.client.utils.jsonUtils;

public class test extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Map<String, Object> result=new HashMap<String,Object>();
	public Map<String, Object> getResult() {
		return result;
	}
	public void setResult(Map<String, Object> result) {
		this.result = result;
	}
	clientService clientService = new clientService();
	public String addClient() throws Exception {
		jsonUtils jsonUtils = new jsonUtils();
		client client = jsonUtils.jsonToClient();
		result.clear();
		System.out.println(client);
		int i=clientService.addClient(client);
		if(i==1) {
			result.put("result",true);
		}
		else result.put("result",false);
		return SUCCESS;
	}
}
