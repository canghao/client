package club.canghao.client.action;

import java.util.HashMap;

import java.util.List;
import java.util.Map;


import com.opensymphony.xwork2.ActionSupport;

import club.canghao.client.model.client;
import club.canghao.client.service.clientService;
import club.canghao.client.utils.jsonUtils;


public class clientAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	Map<String, Object> result=new HashMap<String,Object>();
	private List<client> clients;
	private String key;
	private String clientId;
	clientService clientService = new clientService();
	
	public String getAllClient() throws Exception {
		clients=clientService.getAllClient();
		return SUCCESS;
	}
	
	public String getClientByIdOrName()throws Exception  {
		clients=clientService.getClientByIdOrName(key);
		System.out.println(clients);
		return SUCCESS;
	}
	public String addClient()throws Exception  {
		jsonUtils jsonUtils = new jsonUtils();
		client client = jsonUtils.jsonToClient();
		result.clear();
		System.out.println(client);
		int i=clientService.addClient(client);
		if(i==1) {
			result.put("result",true);
			result.put("clientId",client.getClientId());
		}
		else result.put("result",false);
		return SUCCESS;
	}
	
	public String deleteClientById()throws Exception  {
		System.out.println(clientId);
		int id=Integer.parseInt(clientId);
		result.clear();
		int i=clientService.deleteClientById(id);
		if(i==1) {
			result.put("result",true);
		}
		else result.put("result",false);
		return SUCCESS;
	}
	
	public String updateClientById()throws Exception  {
		jsonUtils jsonUtils = new jsonUtils();
		client client = jsonUtils.jsonToClient();
		result.clear();
		int i=clientService.updateClientById(client);
		if(i==1) {
			result.put("result",true);
		}
		else result.put("result",false);
		return SUCCESS;
	}
	
	//setter and getter
	public List<client> getClients() {
		return clients;
	}
	public void setClients(List<client> clients) {
		this.clients = clients;
	}

	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Map<String, Object> getResult() {
		return result;
	}
	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
}
