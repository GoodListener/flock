package flock.controller.main;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("MainController")
@RequestMapping("/*")
public class MainController {
  
  
  /**
   * 메인
   */
  @RequestMapping("main")
  public Object main() throws Exception{
    return "main";
  }
}
