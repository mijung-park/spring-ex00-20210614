package org.zerock.controller.lecture.normal;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/ex04/*")
@Log4j
public class Ex04Controller {

	@RequestMapping("/sub01")
	public void method01(@RequestParam String date) {
		log.info("ex04 sub01 method");
		
		log.info(date);
	}
	
	@RequestMapping("/sub02") 
	public void method02(@RequestParam Date date) {
		log.info("ex04 sub02 methd");
		log.info(date);
	} // Date 자동형변환 X 
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		log.info("init biner");
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format, false));
		//true, false로 필수 여부를 넣어줌 (이경우에는 false이므로 필수X)
	} // Init은 RequestMapping method 실행 전에 실행
}
