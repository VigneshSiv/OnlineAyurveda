package com.cg.oam.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdminController {

		@RequestMapping(value="/Hi")
		public String sayHello() {
			System.out.println("Hello");
			return "How can i Help you?";
		}
}
