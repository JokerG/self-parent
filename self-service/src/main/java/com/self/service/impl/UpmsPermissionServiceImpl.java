package com.self.service.impl;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSONArray;
import com.self.base.entity.UpmsPermission;
import com.self.common.enums.PermissionTypeEnum;
import com.self.dao.biz.mapper.UpmsPermissionBizMapper;
import com.self.service.UpmsPermissionService;
import com.self.service.VO.UpmsPermissionVO;

@Service("upmsPermissionService")
public class UpmsPermissionServiceImpl implements UpmsPermissionService {
	@Autowired
	private UpmsPermissionBizMapper upmsPermissionBizMapper;

	@Override
	public JSONArray queryUserMenusByLoginId(String loginId) {
		List<UpmsPermission> list = upmsPermissionBizMapper
				.queryUserMenusByLoginId(loginId);
		if (CollectionUtils.isEmpty(list)) {
			return null;
		}
		Map<Integer, JSONArray> directoryArrayMap = new LinkedHashMap<Integer, JSONArray>();
		Map<Integer, UpmsPermissionVO> directoryMap = new LinkedHashMap<Integer, UpmsPermissionVO>();
		for (UpmsPermission up : list) {
			// 目录
			if (PermissionTypeEnum.TYPE_1.getCode().equals(
					up.getType().toString())) {
				UpmsPermissionVO upmsPermissionVO = new UpmsPermissionVO();
				BeanUtils.copyProperties(up, upmsPermissionVO);
				directoryMap.put(up.getPermissionId(), upmsPermissionVO);
				continue;
			}
			// 菜单
			if (PermissionTypeEnum.TYPE_2.getCode().equals(
					up.getType().toString())) {
				JSONArray menuTempArray = directoryArrayMap.get(up.getPid());
				if (null == menuTempArray) {
					menuTempArray = new JSONArray();
				}
				menuTempArray.add(up);
				directoryArrayMap.put(up.getPid(), menuTempArray);
			}
		}

		JSONArray directoryArray = new JSONArray();
		Set<Map.Entry<Integer, UpmsPermissionVO>> entrys = directoryMap
				.entrySet();
		UpmsPermissionVO up = null;
		for (Map.Entry<Integer, UpmsPermissionVO> entry : entrys) {
			up = entry.getValue();
			up.setPermissions(directoryArrayMap.get(entry.getKey()));
			directoryArray.add(up);
		}
		return directoryArray;
	}
}
