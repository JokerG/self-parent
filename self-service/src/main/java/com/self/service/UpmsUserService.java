package com.self.service;

import java.util.List;

import com.self.base.entity.UpmsUser;

public interface UpmsUserService {
	List<UpmsUser> queryUserList();

	int queryUserCount();

	/**
	 * 根据登录账号查询用户信息
	 * 
	 * @param loginId
	 * @return
	 */
	UpmsUser queryUserInfoByLoginId(String loginId);

}
