package com.example.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.dao;
import com.example.demo.entity.entity;

@Controller
public class control {

	@Autowired
	dao dao;

	@RequestMapping("hello")
	public String hello() {
		return "login";
	}

	@RequestMapping("insert")
	public String hello(entity e) {
		dao.save(e);
		return "login";
	}

	@RequestMapping("view")
	public ModelAndView hello2(@RequestParam Long ID) {
		ModelAndView mm = new ModelAndView("view");
		entity e = dao.findById(ID).orElse(new entity());
		mm.addObject(e);
		return mm;
	}

	@RequestMapping("view1")
	private ModelAndView hello4(@RequestParam Long ID) {

		ModelAndView mm = new ModelAndView("login");

		entity e = dao.findById(ID).orElse(new entity());
		dao.deleteById(ID);
		mm.addObject(e);
		return mm;
	}

	@RequestMapping("hello1")
	public String hello2() {
		return "login";
	}

	@RequestMapping("view2")
	private ModelAndView u(entity ee) {

		ModelAndView m = new ModelAndView("u");
		ee = dao.findById(ee.getID()).orElse(new entity());
		dao.deleteById(ee.getID());
		m.addObject(ee);
		return m;
	}

	@RequestMapping("/all")
	@ResponseBody
	public String hello6() {

		return dao.findAll().toString();

	}

}
