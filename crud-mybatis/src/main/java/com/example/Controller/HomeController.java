package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.Service.StudentServiceImp;

@Controller
public class HomeController {

	@Autowired
	StudentServiceImp studentService;

	@RequestMapping(value = "/")
	public ModelAndView home() {
		return new ModelAndView("home");
	}

	@RequestMapping(value = "list")
	public ModelAndView listStudent() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("listStudent", studentService.GetListStudent());
		return mav;
	}
}
