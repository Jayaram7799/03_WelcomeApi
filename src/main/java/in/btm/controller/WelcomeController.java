package in.btm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	@Autowired
	private Environment env;
	
	@GetMapping("/welcome")
	public String welMsg() {
		String port =env.getProperty("server.port");
		System.out.println("Welcome Service");
		
		
		return "Welcome To Hyderabad"+" ( "+port+ ")";
	}

}
