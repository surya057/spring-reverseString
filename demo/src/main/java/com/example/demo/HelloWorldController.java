package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;  

@Controller
public class HelloWorldController {

	@GetMapping("/reverseString")
    public String sendForm(User user) {
        return "reverseString";
    }

    @PostMapping("/reverseString")
    public String processForm(User user) {
    	reverseString(user);
        return "showMessage";
    }

	private void reverseString(User user) {
		String stringToreverse = user.getReverseMe();
    	StringBuilder sb=new StringBuilder(stringToreverse);  
        sb.reverse();
    	user.setReverseMe(sb.toString());
	}
}
