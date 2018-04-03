package com.self.web.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSONArray;
import com.self.service.UpmsPermissionService;

@Controller
public class IndexController extends BaseController {
	private static Logger logger = LoggerFactory
			.getLogger(IndexController.class);
	@Autowired
	private UpmsPermissionService upmsPermissionService;

	@RequestMapping(value = "/index")
	public ModelAndView index(HttpServletRequest request,

	Map<String, Object> model) {
		String loginId = request.getParameter("loginId");
		JSONArray menus = upmsPermissionService
				.queryUserMenusByLoginId(loginId);
		model.put("menus", menus);
		return new ModelAndView("index", model);
	}

}
