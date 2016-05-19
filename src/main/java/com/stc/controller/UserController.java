package com.stc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.stc.dao.EmployeeDAO;
import com.stc.dao.UserDao;
import com.stc.domain.User;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private EmployeeDAO empDao;
	
	@RequestMapping
    public ModelAndView save(ModelAndView  modelAndView) {
		modelAndView.setViewName("userForm");
		return modelAndView;
    }
    @RequestMapping(value = "/save", method=RequestMethod.POST)
    public ModelAndView  save(@RequestParam(value="userName") String userName,
		   @RequestParam(value="age") int age, ModelAndView  modelAndView ) {
    	User user = new User();
    	user.setName(userName);
    	user.setAge(age);
    	userDao.saveUserDetail(user);
    	modelAndView.addObject("userName", userName);
    	modelAndView.setViewName("success");
	    return modelAndView;
    }
    
    @RequestMapping(value="/hello")
    public ModelAndView message(ModelAndView  modelAndView) {
    	System.out.println("Hello");
    	System.out.println(empDao.getEmpNames());
		modelAndView.setViewName("userForm");
		return modelAndView;
    }
}
