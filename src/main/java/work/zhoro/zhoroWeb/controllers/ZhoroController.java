package work.zhoro.zhoroWeb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ZhoroController {
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcomeMessage() {
		return "Welcome to zhoro";
	}

}
