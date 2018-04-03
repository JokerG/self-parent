package com.self.service.VO;

import com.alibaba.fastjson.JSONArray;
import com.self.base.entity.UpmsPermission;

public class UpmsPermissionVO extends UpmsPermission {
	private JSONArray permissions;

	public JSONArray getPermissions() {
		return permissions;
	}

	public void setPermissions(JSONArray permissions) {
		this.permissions = permissions;
	}

}
