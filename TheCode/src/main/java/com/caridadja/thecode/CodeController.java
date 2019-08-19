package com.caridadja.thecode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CodeController {
	@RequestMapping("/")
	public String home() {
		return "home.jsp";
	}
	@RequestMapping("/code")
	public String showCode() {
		return "code.jsp";
	}
	@RequestMapping(value="/showCode", method=RequestMethod.POST)
	public String code(@RequestParam(value="code") String input) {
		if(input.equals("Bushido")) {
			return "redirect:/code";
		}
		else {
			return "redirect:/createError";
		}
	}
	@RequestMapping("/createError")
	public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You Must Train Harder!");
        return "redirect:/";
	}
}
