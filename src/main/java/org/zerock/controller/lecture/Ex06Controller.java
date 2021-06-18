package org.zerock.controller.lecture;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex06/*")
@Log4j
public class Ex06Controller {
	
	@RequestMapping("/sub01")
	public String method01() {
		log.info("ex06 sub01 method");
		
		return "ex06/sub01";
		// /WEB-INF/view/ex06/sub01.jsp
		// String타입을 return해서 jsp파일로 포워딩 할 수 있음!
	}
	
	@RequestMapping("/sub02")
	public void method2() {
		log.info("ex06, sub02 method");
		
		// void 타입은 mapping 이름의 jsp로 자동 요청.
	}
	
	@RequestMapping("/sub03")
	public String method03() {
		log.info("ex06, sub03 method");
		
		return "forward:/ex06/sub02";
		// forward: 를 붙여서 원하는 곳으로 forward 시킬 수 있음.
		// forward는 하나의 요청만 처리(주소창의 주소가 변하지 않음)
	}
	
	@RequestMapping("/sub04")
	public String method04() {
		log.info("ex06, sub04 method");
		
		// response.sendRedirect(request.getContextPath() + "ex06/sub02");
		
		return "redirect:/ex06/sub02";
		// redirect: 를 붙여서 원하는 곳으로 redirect 시킬 수 있음
		// redirect는 모든 요청을 처리(주소창의 주소가 redirect되어 변함)
	}
}
