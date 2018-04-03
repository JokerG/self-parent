package com.self.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.self.base.entity.UpmsUser;
import com.self.service.UpmsPermissionService;
import com.self.service.UpmsUserService;

@Controller
public class LoginController extends BaseController {
	private static Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	@Autowired
	private UpmsUserService upmsUserService;
	@Autowired
	private UpmsPermissionService upmsPermissionService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginModel() {
		// TODO 1.shiro 校验是否登录
		// TODO 2.利用redis 实现单点登录
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView login(HttpServletRequest request,
			RedirectAttributes attr, Map<String, Object> model) {
		String loginId = request.getParameter("loginId");
		String password = request.getParameter("password");
		UpmsUser user = upmsUserService.queryUserInfoByLoginId(loginId);

		if (null == user || !user.getPassword().equals(password)) {
			model.put(MESSAGE, "用户名或密码错误");
			return new ModelAndView("login", model);
		}
		attr.addAttribute("loginId", loginId);
		return new ModelAndView("redirect:index", model);
	}
}
