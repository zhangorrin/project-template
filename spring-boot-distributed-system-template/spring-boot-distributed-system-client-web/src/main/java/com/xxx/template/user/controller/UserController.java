package com.xxx.template.user.controller;

import com.alibaba.fastjson.JSON;
import com.xxx.template.user.model.UserModel;
import com.xxx.template.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

	private Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/{loginName}")
	public ModelAndView view(@PathVariable String loginName,HttpServletRequest request) {
		ModelAndView result = new ModelAndView("user/user_detail");
		UserModel userModel = userService.getUserModelByLoginName(loginName);
		result.addObject("userModel",userModel);

		HttpSession session=request.getSession();

		Object loginNameOb = session.getAttribute("loginName");
		if(loginNameOb!=null){

			UserModel userInSession = (UserModel)loginNameOb;

			String loginNameInSession = userInSession.getLoginName();
			if(!StringUtils.isEmpty(loginNameInSession) && loginNameInSession.equals(loginName)){
				logger.info("[*]userInSession:"+userInSession.toString());
			}else{
				logger.info("[*]setAttribute:"+userModel);
				session.setAttribute("loginName",userModel);
			}
		}else{
			logger.info("[*]setAttribute:"+userModel);
			session.setAttribute("loginName",userModel);
		}

		return result;
	}

	@RequestMapping(value = "/get/{loginName}")
	@ResponseBody
	public String getLoginInfo(@PathVariable String loginName) {
		UserModel userModel = userService.getUserModelByLoginName(loginName);
		return JSON.toJSONString(userModel);
	}
}
