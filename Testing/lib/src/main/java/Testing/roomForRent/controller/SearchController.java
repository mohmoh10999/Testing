package Testing.roomForRent.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {
	
	
	@GetMapping("/getHouseList")
	public String getRoomList(){
		return "Hello";
	}

}