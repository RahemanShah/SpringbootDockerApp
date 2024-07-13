package in.java.Rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class Employee {

	@GetMapping("/docker")
	public String DockerMethods(){
		return "Calling Docker File SuccessFully..!";
	}
}
