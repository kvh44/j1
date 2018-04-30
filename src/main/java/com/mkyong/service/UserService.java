package com.mkyong.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

import com.mkyong.model.SimpleUser;

@Service("UserService")
public class UserService {
	private static List<SimpleUser> simpleUserList = new ArrayList<SimpleUser>();
	public List<SimpleUser> getSimpleUserList()
	{
		return simpleUserList;
	}
	
	public void addSimpleUserToList(SimpleUser simpleUser)
	{
		if(simpleUser instanceof SimpleUser)
		{
			simpleUserList.add(simpleUser);
		}
	}
	
}
