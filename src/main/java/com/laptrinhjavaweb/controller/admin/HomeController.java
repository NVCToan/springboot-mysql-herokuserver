package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.service.HomeService;

@Controller(value="homeControllerOfAdmin")
public class HomeController {
	
	
	
	@RequestMapping(value = "/quan-tri/trang-chu", method = RequestMethod.GET)
	public ModelAndView homePage() {
		ModelAndView mav = new ModelAndView("admin/home");
		return mav;
	}
	@RequestMapping(value = "/quan-tri/list", method = RequestMethod.GET)
	public ModelAndView paging() {
		ModelAndView mav = new ModelAndView("admin/new/list");
		return mav;
	}
	
	
	
}
