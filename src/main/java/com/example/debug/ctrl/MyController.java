package com.example.debug.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/about")
	public String getAbout() {
		String str="Subcribe to learn code with durgesh youtube chhanel";
		str=str.toLowerCase();
		str=str.toUpperCase();
		return str;
		
	}

}
