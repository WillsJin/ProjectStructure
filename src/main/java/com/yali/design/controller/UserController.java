package com.yali.design.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.yali.design.service.IUserService;

@Controller
public class UserController {

	@Resource
	private IUserService userService;

	@RequestMapping("/userPage")
	public ModelAndView userPage() {
		ModelAndView mv = new ModelAndView();

		int userCount = userService.countAll();
		mv.getModel().put("userCount", userCount);
		mv.setViewName("/pages/userPage.html");

		return mv;
	}

}
