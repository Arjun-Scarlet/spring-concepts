package springBaseMVC.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/home")
	public String home() {
		System.out.println("HomeController is triggered!");
		return "home";//it must match with jsp filename
	}
}
