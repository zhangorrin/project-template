package com.xxx.template.user.service.impl;

import com.xxx.template.user.model.UserModel;
import com.xxx.template.user.service.UserManagerService;
import com.xxx.template.user.service.UserRegisterService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/11 15:50
 * @version: V1.0.0
 * @Description:
 **/
@com.alibaba.dubbo.config.annotation.Service(version = "1.0.1")
public class UserRegisterServiceImpl implements UserRegisterService {

	@Autowired
	private UserManagerService userManagerService;

	@Override
	public int addUser(UserModel userModel) {
		return userManagerService.addUserModel(userModel);
	}
}
