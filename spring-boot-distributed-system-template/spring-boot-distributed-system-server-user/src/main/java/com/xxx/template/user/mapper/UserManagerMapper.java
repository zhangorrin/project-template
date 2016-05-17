package com.xxx.template.user.mapper;

import com.xxx.template.user.model.UserModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/11 10:31
 * @version: V1.0.0
 * @Description:
 **/
@Mapper
public interface UserManagerMapper {

	UserModel getUserModelByLoginName(@Param("loginName") String loginName);

	int addUserModel(UserModel userModel);
}
