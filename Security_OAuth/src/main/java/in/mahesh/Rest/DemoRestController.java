package in.mahesh.Rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	
	@GetMapping("/welcome")
	public ResponseEntity<String> msg(){
		return new ResponseEntity<String>("Welcome to my World !", HttpStatus.OK);
	}

}
