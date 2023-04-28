package com.bitlabs.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bitlabs.Entity.*;
import com.bitlabs.Service.BookService;

@Controller
public class BookController {
    
	@Autowired
	private  BookService bookService;
	
	@RequestMapping("/childrenBook")
	
	@ResponseBody
	public ModelAndView getAllChildren(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<ChildrenBook> book = bookService.getAllChildBook();
        modelAndView.addObject("book", book);
        modelAndView.setViewName("ChildrenBook");
        return modelAndView;
				
				
	}
	@RequestMapping("/fictionBook")
	@ResponseBody
	public ModelAndView getAllFiction(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<FictionBook> book = bookService.getAllFictionBook();
        modelAndView.addObject("book", book);
        modelAndView.setViewName("FictionBook");
        return modelAndView;
				
				
	}
	@RequestMapping("/NonFictionBook")
	@ResponseBody
	public ModelAndView getAllNonFiction(){
		
		ModelAndView modelAndView = new ModelAndView();
        List<NonFictionBook> book = bookService.getAllNonFictionBook();
        modelAndView.addObject("book", book);
        modelAndView.setViewName("NonFictionBook");
        return modelAndView;
				
				
	}
	
	@RequestMapping("/YouthBook")
	@ResponseBody
	public ModelAndView getAllYouth() {
        ModelAndView modelAndView = new ModelAndView();
        List<YouthBook> book = bookService.getAllYouthBook();
        modelAndView.addObject("book", book);
        modelAndView.setViewName("YouthBook");
        return modelAndView;
    }
    
    
}

