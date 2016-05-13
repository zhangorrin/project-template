package com.xxx.template.user.service;

import com.xxx.template.user.model.UserModel;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/10 17:06
 * @version: V1.0.0
 * @Description:
 **/
public interface UserManagerService {
	UserModel getUserModelByLoginName(String loginName);

	int addUserModel(UserModel userModel);

}
