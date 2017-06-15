package com.choa.t1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/notice/")
public class Test2Controller {
	@RequestMapping(value="noticeWrite", method=RequestMethod.POST)
	public ModelAndView t3(/*NoticeDTO noticeDTO, String title2, @RequestParam(value="writer") String writer2*/@RequestParam(defaultValue="0") int age, String writer2, Model model){
		System.out.println("noticeProcess");
		System.out.println(writer2);
		System.out.println(age);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("notice/noticeView");
		mv.addObject("message","choa");
		
		
		/*model.addAttribute("message", "notice")
		.addAttribute("name",writer2);*/
		/*System.out.println(writer2);
		System.out.println(noticeDTO.getWriter());
		System.out.println(noticeDTO.getTitle());
		System.out.println(noticeDTO.getAge());*/
		
		/*System.out.println(title2);
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setWriter("writer");*/
		/*return "home";	//forward방식을 깔고간다.
		//redirect방식으로 보내주고 싶을 경우*/
		/*return "redirect:/";*/
		return mv;
	}
	@RequestMapping(value="noticeWrite", method=RequestMethod.GET)
	public void t2(){
		//반환값이 void라면
		//요청주소값이 view의 경로명이 된다.
	}
}
