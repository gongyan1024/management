package zl.management.domain;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = -6052120810870941937L;
	private int id;
	private String username;
	private String password;	
	private int type;		//1-系统管理员 
	private String email;	//邮箱
	private String name;	//姓名
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
