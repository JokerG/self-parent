package com.self.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.self.base.entity.UpmsUser;
import com.self.base.entity.UpmsUserExample;
import com.self.dao.base.mapper.UpmsUserMapper;
import com.self.service.UpmsUserService;

@Service("upmsUserService")
public class UpmsUserServiceImpl implements UpmsUserService {
	@Autowired
	private UpmsUserMapper upmsUserMapper;

	@Override
	public List<UpmsUser> queryUserList() {
		return upmsUserMapper.selectByExample(new UpmsUserExample());
	}

	@Override
	public int queryUserCount() {
		return (int) upmsUserMapper.countByExample(new UpmsUserExample());
	}

	@Override
	public UpmsUser queryUserInfoByLoginId(String loginId) {
		UpmsUserExample example = new UpmsUserExample();
		example.createCriteria().andLoginIdEqualTo(loginId);
		List<UpmsUser> list = upmsUserMapper.selectByExample(example);

		return CollectionUtils.isEmpty(list) ? null : list.get(0);
	}
}
