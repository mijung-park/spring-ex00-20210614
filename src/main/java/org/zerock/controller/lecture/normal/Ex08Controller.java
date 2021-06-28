package org.zerock.controller.lecture.normal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.zerock.controller.lecture.domain.User;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex08/*")
@Log4j
public class Ex08Controller {

	@RequestMapping("/sub01")
	public void mehtod01(Model model) {
		log.info("ex08, sub01 method");
		
		model.addAttribute("name", "May");
		model.addAttribute("age", 32);
		
		// model에 attribute 이름, 값으로 저장해서 전달가능.
	}
	
	@RequestMapping("/sub02")
	public void method02(Model model) {
		log.info("ex08, sub02 methdo");
		
		User user = new User();
		user.setId("bts");
		user.setAge(22);
		
		model.addAttribute("user", user);
		
		// model에 객체명, 객체로도 전달 가능.
	}
	
	
	@RequestMapping("/sub03")
	public String method03(Model model) {
		log.info("ex08, sub03 method");
		
		User user = new User();
		user.setId("Korea");
		user.setAge(5000);
		
//		model.addAttribute("user", user);
		model.addAttribute(user);
		// Attribute명을 생략하면 클래스명이 Attribute명으로 사용
		
		return "ex08/sub02";
	}
	
	@RequestMapping("/sub04")
	public String method04(User user, Model model) {
		log.info("ex08, sub04 method");
		
		model.addAttribute("user", user);
		
		return "ex08/sub02";
	}
	
	@RequestMapping("/sub05")
	public String method05(@ModelAttribute("user") User user, Model model) {
		log.info("ex08, sub05 method");
		
		return "ex08/sub02";
	}
	
	@RequestMapping("/sub06")
	public String method06(User user) {
		log.info("ex08, sub05 method");
		
		return "ex08/sub02";
		// modelAttribue annotation과 parameter를 생략해도 가능!!!
	}
	
	@RequestMapping("/sub07")
	public String method07(User user, Model model) {
		log.info("ex08, sub05 method");
		
		model.addAttribute("hello world");
		
		return "ex08/sub02";
	}
	
	@RequestMapping("/sub08")
	public String method08(User user) {
		log.info("ex08, sub08 method");
		
		return "ex08/sub02";
	}
	
	@RequestMapping("/sub09")
	//public void method09(@RequestParam int age, @RequestParam String name)
	public void method09(@ModelAttribute("age") int age, 
			@ModelAttribute("name") String name) {
		log.info("ex08, sub09 method");
		
		log.info(age);
		log.info(name);
		
		// RequestParam 생략가능. 
		// model 타입으로 쓰고싶으면 modelAttribute annotation필요 함!
	}
}
