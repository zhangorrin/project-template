package com.xxx.template.user.service;

import com.xxx.template.user.model.UserModel;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/11 17:14
 * @version: V1.0.0
 * @Description:
 **/
public interface UserService {
	UserModel getUserModelByLoginName(String loginName);

	int addUserModel(UserModel userModel);
}
