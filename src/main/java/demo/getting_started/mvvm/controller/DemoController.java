package demo.getting_started.mvvm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping("/demo")
	public String demoExample() {
		return "demo";
	}
	
	@GetMapping("/mvvm")
	public String mvvmExample() {
		return "mvvm";
	}
}
