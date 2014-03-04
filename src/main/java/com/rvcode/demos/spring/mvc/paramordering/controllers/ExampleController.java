package com.rvcode.demos.spring.mvc.paramordering.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExampleController {
  
  @RequestMapping("/first/{message}")
  @ResponseBody
  public String testFirstOrder(final HttpServletRequest request, final HttpServletResponse response, @PathVariable final String message){
    return message;
  }
  
  @RequestMapping("/second/{message}")
  @ResponseBody
  public String testSecondOrder(@PathVariable final String message, final HttpServletRequest request, final HttpServletResponse response){
    return message;
  }

}
