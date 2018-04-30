package com.mkyong.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

import static java.lang.System.out;

import com.mkyong.model.SimpleUser;
import com.mkyong.service.UserService;

@Controller
public class SecondController{
	
	private static final String SECOND_VIEW_INDEX = "SecondIndex";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(SecondController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/second/index", method = RequestMethod.GET)
	public String secondIndex(ModelMap model) 
	{
		Map<String, String> map1 = new HashMap<>();
		map1.put("100", "haha");
		map1.put("200", "hoho");
		
		for(Entry<String, String> entry : map1.entrySet())
		{
			out.println(entry.getKey() + entry.getValue());
		}
		
		map1.forEach((key, value)->{
			out.println(key + value);
		});
		
		Set<Entry<String, String>> set1= map1.entrySet();
		Iterator iterator1 = set1.iterator();
		while(iterator1.hasNext())
		{
			out.println(iterator1.next().toString());
		}
		model.addAttribute("map1", map1);
		
		SimpleUser simpleUser = new SimpleUser();
		simpleUser.setId();
		simpleUser.setUsername("mk");
		simpleUser.setPassword("pass");
		
		List<SimpleUser> userList = new ArrayList<SimpleUser>();
		userList.add(simpleUser);
		
		model.addAttribute("userList", userList);
		
		logger.error("second index");
		logger.debug("userList created");
		logger.debug(simpleUser.toString());
		return SecondController.SECOND_VIEW_INDEX;
	}
}
