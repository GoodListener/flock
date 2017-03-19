package flock.controller.doodle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("DoodleController")
@RequestMapping("/*")
public class DoodleController {
  
  
  /**
   * 메인
   */
  @RequestMapping("doodle")
  public Object doodle() throws Exception{
    
    return "doodle/imageList";
  }
  
  @RequestMapping("newDoodle")
  public Object newDoodle() {
    
    
    
    return "doodle/createImage";
  }
}
