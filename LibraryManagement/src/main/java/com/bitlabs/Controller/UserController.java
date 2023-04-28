package com.bitlabs.Controller;

import java.util.List;
import com.bitlabs.Entity.*;
import com.bitlabs.Service.UserService;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@GetMapping("/loginForm")
    public String loginForm() {
    	
       
        return "login";
    }
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
	    
	    request.getSession().invalidate();
	    
	    return "redirect:/loginForm";
	}
    
   
    
    @PostMapping("/logIntoSystem")
    public String logIntoSystem(@RequestParam("uname") String uname, @RequestParam("psw") String pass,Model modal) {
    	
    	List<com.bitlabs.Entity.User> users=userService.getAllUsers();
    	
    	for(com.bitlabs.Entity.User u: users) {
    		
    		if(u.getUserName().equalsIgnoreCase(uname) && u.getPassword().equalsIgnoreCase(pass)) {
    			return "homePage";
    		}
    	}
    	
    	modal.addAttribute("Status","Invalid user name and password");
    	return "login";
    }
    
    
    @GetMapping("/home")
    public String home() {
    	System.out.println("Home method called");
       
        return "index";
    }
}


