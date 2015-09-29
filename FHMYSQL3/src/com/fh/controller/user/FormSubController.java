package com.fh.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fh.controller.administrator.base.BaseController;
import com.fh.util.PageData;

@Controller
@RequestMapping(value="/users/bdtj")
public class FormSubController extends BaseController {
	@RequestMapping(value="/goEditU")
	public ModelAndView goEditU() throws Exception{
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		ModelAndView mv = this.getModelAndView();
		PageData pd = new PageData();
		pd = this.getPageData();
		System.out.println(pd.get("xm")+";;"+pd.get("nl"));
		mv.addObject("message", "成功");
		mv.setViewName("user/success");
		return mv;
	}
}
