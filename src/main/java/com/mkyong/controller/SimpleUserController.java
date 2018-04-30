package com.mkyong.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;

import static java.lang.System.out;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import com.mkyong.model.SimpleUser;
import com.mkyong.service.UserService;

@Controller("simpleUserController")
@EnableWebMvc
public class SimpleUserController {
	
	@Autowired
	@Qualifier("UserService")
	private UserService userService;
	
	@RequestMapping(value="/api/simple/user/list.json", 
			headers = {"Accept=text/xml,text/html,application/json"},
			method=RequestMethod.GET,
			produces="application/json")
	public @ResponseBody List<SimpleUser> simpleUserList()
	{
		List<SimpleUser> simpleUserList = userService.getSimpleUserList();
		
		return simpleUserList;
	}
	
	@RequestMapping(
			value="/api/simple/user/add", 
			method={RequestMethod.POST,RequestMethod.GET},
			produces={"application/json","application/xml"}
			)
	@ResponseBody
	public String addSimpleUserToList(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		SimpleUser simpleUser = new SimpleUser();
		simpleUser.setId();
		simpleUser.setUsername(username);
		simpleUser.setPassword(password);
		
		userService.addSimpleUserToList(simpleUser);
		return simpleUser.toString();
	}
	
}
