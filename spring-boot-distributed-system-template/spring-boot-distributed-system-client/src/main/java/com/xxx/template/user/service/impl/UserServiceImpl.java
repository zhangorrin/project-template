package com.xxx.template.user.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xxx.template.user.model.UserModel;
import com.xxx.template.user.service.UserInfoService;
import com.xxx.template.user.service.UserRegisterService;
import com.xxx.template.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/11 17:14
 * @version: V1.0.0
 * @Description:
 **/
@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserInfoService userInfoService;

	@Reference(version = "1.0.1")
	private UserRegisterService userRegisterService;

	@Override
	public UserModel getUserModelByLoginName(String loginName) {
		return userInfoService.getUserModelByLoginName(loginName);
	}

	@Override
	public int addUserModel(UserModel userModel) {
		return userRegisterService.addUser(userModel);
	}
}
