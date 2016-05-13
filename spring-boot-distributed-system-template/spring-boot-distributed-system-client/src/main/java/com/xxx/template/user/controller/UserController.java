package com.xxx.template.user.controller;

import com.alibaba.fastjson.JSON;
import com.xxx.template.user.model.UserModel;
import com.xxx.template.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Orrin
 * @date: 2016/5/11 17:38
 * @version: V1.0.0
 * @Description:
 **/
@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{loginName}")
	public ModelAndView view(@PathVariable String loginName) {
		ModelAndView result = new ModelAndView("user/user_detail");
		UserModel userModel = userService.getUserModelByLoginName(loginName);
		result.addObject("userModel",userModel);
		return result;
	}

	@RequestMapping(value = "/get/{loginName}")
	@ResponseBody
	public String getLoginInfo(@PathVariable String loginName) {
		UserModel userModel = userService.getUserModelByLoginName(loginName);
		return JSON.toJSONString(userModel);
	}
}
