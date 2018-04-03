package com.self.service;

import com.alibaba.fastjson.JSONArray;

public interface UpmsPermissionService {
	/**
	 * 根据登录账号查询用户菜单
	 * 
	 * @param loginId
	 * @return
	 */
	JSONArray queryUserMenusByLoginId(String loginId);
}
