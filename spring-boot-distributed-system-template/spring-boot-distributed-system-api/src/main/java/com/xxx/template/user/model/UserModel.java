package com.xxx.template.user.model;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/10 17:08
 * @version: V1.0.0
 * @Description:
 **/
public class UserModel implements Serializable {
	private static final long serialVersionUID = 1L;

	private String loginName;

	private String userName;
	private String password;

	private int age;

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString(){
		return "loginName:"+loginName + "	,userName:"+userName + "	,age:"+age;
	}
}
