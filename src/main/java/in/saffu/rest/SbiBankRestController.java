package in.saffu.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SbiBankRestController {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to SBI-Bank Application ";
	}

	@GetMapping("/transfer")
	public String transfer() {
		return "Transaction money completed.....";
	}

	@GetMapping("/balance")
	public String balance() {
		return "you have 10000 rs in your account";
	}

	@GetMapping("/about")
	public String AboutUs() {
		return "State Bank of India is an Indian multinational public sector bank";
	}

	@GetMapping("/contact")
	public String contact() {
		return "+1800 1234";
	}

}
