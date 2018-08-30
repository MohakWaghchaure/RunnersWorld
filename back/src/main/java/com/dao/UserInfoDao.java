package com.dao;

import com.model.UserInfo;

public interface UserInfoDao {

	public boolean insertUserInfo(UserInfo userInfo);
	public boolean deleteUserInfo(UserInfo userInfo);
}
