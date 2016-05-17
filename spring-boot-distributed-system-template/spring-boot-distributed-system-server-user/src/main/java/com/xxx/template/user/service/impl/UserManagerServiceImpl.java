package com.xxx.template.user.service.impl;

import com.xxx.template.user.mapper.UserManagerMapper;
import com.xxx.template.user.model.UserModel;
import com.xxx.template.user.service.UserManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/11 10:29
 * @version: V1.0.0
 * @Description:
 **/
@Service("userManagerService")
public class UserManagerServiceImpl implements UserManagerService {

	@Autowired
	private UserManagerMapper userManagerMapper;

	@Override
	@Transactional(readOnly = true)
	public UserModel getUserModelByLoginName(String loginName) {
		return userManagerMapper.getUserModelByLoginName(loginName);
	}

	@Override
	@Transactional(rollbackFor = {java.lang.Exception.class,java.lang.RuntimeException.class})
	public int addUserModel(UserModel userModel) {
		return userManagerMapper.addUserModel(userModel);
	}


}
