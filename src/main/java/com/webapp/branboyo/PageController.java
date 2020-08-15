package com.webapp.branboyo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Used ThymeLeaf in order to use the controller class and allow RequestMappings to other HTML pages
@Controller
public class PageController {

	@RequestMapping("/resume")
	String resume() {
		return "Resume";
	}

}
