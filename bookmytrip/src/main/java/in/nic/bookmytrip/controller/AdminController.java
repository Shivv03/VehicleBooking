package in.nic.bookmytrip.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.nic.bookmytrip.test.RiskFormNew;

@RestController
@RequestMapping("/api")
public class AdminController {

	@PostMapping("/test")
	public String test(@RequestBody RiskFormNew form) {

		System.out.println(form);
		return null;
	}
}
