package com.web.model;

import java.util.List;

import org.json.JSONArray;

public class User {
	
	private int id;
	private String userName;
	private String email;
	private String password;
	private String token;
	private boolean isConnected = false;
	
	private List<Category> categorieList;
	public JSONArray categorieListJson;

	public User(){
		
	}
	
	/*********************
	 ** GETTER & SETTER ** 
	 * *******************/
	
	public String getEmail() 					{ return email; }
	public void setEmail(String email) 			{ this.email = email; } 	
	public String getPassword() 				{ return password; }
	public void setPassword(String password) 	{ this.password = password; }
	public int getId() 							{ return id; }
	public void setId(int id) 					{ this.id = id; }
	public String getUserName() 				{ return userName; }
	public void setUserName(String userName) 	{ this.userName = userName; }
	public String getToken() 					{ return token; }
	public void setToken(String token) 			{ this.token = token; }
	public boolean isConnected() 				{ return isConnected; }
	public void setConnected(boolean value) 	{ this.isConnected = value; }
	public List<Category> getCategorieList() 	{ return categorieList; }
	public void setCategorieList(List<Category> categorieList) { this.categorieList = categorieList; }
	public JSONArray getCategorieListJson() {
		return categorieListJson;
	}
	public void setCategorieListJson(JSONArray categorieListJson) {
		this.categorieListJson = categorieListJson;
	}
}
