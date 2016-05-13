package com.xxx.template.user.service.impl;

import com.xxx.template.user.model.UserModel;
import com.xxx.template.user.service.UserInfoService;
import com.xxx.template.user.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/11 15:50
 * @version: V1.0.0
 * @Description:
 **/
@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private UserManagerService userManagerService;


	@Override
	public UserModel getUserModelByLoginName(String loginName) {
		return userManagerService.getUserModelByLoginName(loginName);
	}
}
