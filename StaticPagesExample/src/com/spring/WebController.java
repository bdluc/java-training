package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {
   @GetMapping("/index")
   public String index() {
      return "index";
   }
   @GetMapping("/staticPage")
   public String redirect() {
      return "redirect:/pages/final.htm";
   }
}