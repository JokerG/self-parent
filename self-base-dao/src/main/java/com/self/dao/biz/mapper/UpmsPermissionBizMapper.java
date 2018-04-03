package com.self.dao.biz.mapper;

import java.util.List;

import com.self.base.entity.UpmsPermission;

public interface UpmsPermissionBizMapper {
	/**
	 * 根据登录账号查询用户权限,不包含按钮
	 * 
	 * @param loginId
	 * @return
	 */
	List<UpmsPermission> queryUserMenusByLoginId(String loginId);
}
