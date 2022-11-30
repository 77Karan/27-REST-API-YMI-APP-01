package in.ashokit.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController
{
	@Value("${myapp.welcomeMsg}")
	private String welcomeMsg;

	@GetMapping("/welcome")
	public String getWelcomeMsg()
	{
		return welcomeMsg;
	}
	
}
