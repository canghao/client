package club.canghao.client.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;

import club.canghao.client.model.admin;
import club.canghao.client.model.business;
import club.canghao.client.model.client;
import club.canghao.client.model.client_business;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class jsonUtils {

	public String getStrResponse(){
		ActionContext ctx = ActionContext.getContext();
		HttpServletRequest request = (HttpServletRequest)ctx.get(ServletActionContext.HTTP_REQUEST);   
		InputStream inputStream;
		String strResponse = "";
		try {
		inputStream = request.getInputStream();
		String strMessage = "";
		BufferedReader reader;
		reader = new BufferedReader(new InputStreamReader(inputStream,"utf-8"));
		while ((strMessage = reader.readLine()) != null) {
		strResponse += strMessage;
		}
		reader.close();
		inputStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return strResponse;
	}
	public  client jsonToClient(){
		//创建client对象
		client client = new client();
		//获取请求体中内容，转换为json
		JSONObject jsonRequest = JSONObject.fromObject(this.getStrResponse());
		//获取json中参数
		JSONObject data = jsonRequest.getJSONObject("client");
		System.out.println(jsonRequest);
		client.setClientName(data.getString("clientName"));
		client.setClientId(Integer.parseInt(data.getString("clientId")));
		client.setClientSex(data.getString("clientSex"));
		client.setClientAge(data.getString("clientAge"));
		client.setClientImageUrl(data.getString("clientImageUrl"));
		client.setClientMore(data.getString("clientMore"));
		client.setClientPhone(data.getString("clientPhone"));
		client.setClientEmail(data.getString("clientEmail"));
		client.setJoinNumber(data.getString("joinNumber"));
		return client;
  }
	public  business jsonToBusiness(){
		//创建business对象
		business business = new business();
		//获取请求体中内容，转换为json
		JSONObject jsonRequest = JSONObject.fromObject(this.getStrResponse());
		//获取json中参数
		JSONObject data = jsonRequest.getJSONObject("business");
		System.out.println(jsonRequest);
		business.setBusinessId(Integer.parseInt(data.getString("businessId")));
		business.setBusinessName(data.getString("businessName"));
		business.setBusinessDescription(data.getString("businessDescription"));
		business.setJoinNumber(data.getString("joinNumber"));
		return business;
  }
	public  admin jsonToAdmin(){
		//创建admin对象
		admin admin = new admin();
		//获取请求体中内容，转换为json
		JSONObject jsonRequest = JSONObject.fromObject(this.getStrResponse());
		//获取json中参数
		JSONObject data = jsonRequest.getJSONObject("admin");
		System.out.println(jsonRequest);
		admin.setPassword(data.getString("password"));
		admin.setUsername(data.getString("username"));
		return admin;
  }
	public  List<client_business> jsonToClient_Business(){	
		//获取请求体中内容，转换为json
		JSONObject jsonRequest = JSONObject.fromObject(this.getStrResponse());
		//获取json中参数
		System.out.println(jsonRequest);
		JSONArray array = jsonRequest.getJSONArray("business");
		int clientId = Integer.parseInt(jsonRequest.getString("clientId"));
		List<client_business> list = new ArrayList<client_business>();
		for (int i = 0; i < array.size(); i++)
		{
			client_business cb = new client_business();
			cb.setClientId(clientId);
			cb.setBusinessId(array.getInt(i));
			list.add(cb);
		}
		System.out.println(list.get(0).getClientId());
		return list;
  }
}