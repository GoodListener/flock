package flock.controller.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("BoardController")
@RequestMapping("/*")
public class BoardController {
  
  
  /**
   * 메인
   */
  @RequestMapping("board")
  public Object board() throws Exception{
    return "board/boardList";
  }
}
