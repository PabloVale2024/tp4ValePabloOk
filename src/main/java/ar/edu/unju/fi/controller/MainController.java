package ar.edu.unju.fi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class MainController {
	@Controller
	@RequestMapping("/principal")

	public class indexController {
		
	@GetMapping({"/index","/home"})
	public String getIndexPage() {
		return "index";

}
}
}