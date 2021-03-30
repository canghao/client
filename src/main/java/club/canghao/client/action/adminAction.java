package club.canghao.client.action;

import java.util.HashMap;
import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

import club.canghao.client.model.admin;
import club.canghao.client.service.adminService;
import club.canghao.client.utils.jsonUtils;



public class adminAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	Map<String, Object> result=new HashMap<String,Object>();
	adminService adminService=new adminService();
	
	public String getAdmin()throws Exception {
		jsonUtils jsonUtils = new jsonUtils();
		admin jsonToAdmin = jsonUtils.jsonToAdmin();
		admin admin;
		result.clear();
		admin = adminService.getAdmin(jsonToAdmin);
		if(admin!=null) {
			result.put("result",true);
		}
		else result.put("result",false);
		return SUCCESS;
	}
	public String updatePassword()throws Exception  {
		jsonUtils jsonUtils = new jsonUtils();
		admin admin = jsonUtils.jsonToAdmin();
		result.clear();
		int i= adminService.updatePassword(admin);
		if(i==1) {
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
