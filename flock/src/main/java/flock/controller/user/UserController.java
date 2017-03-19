package flock.controller.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import flock.dao.UserDao;
import flock.domain.User;

@Controller("UserController")
@RequestMapping("/*")
public class UserController {
  @Autowired UserDao userDao;

  @RequestMapping("userList")
  public Object list(Model model) throws Exception {
    
    List<User> userList = userDao.selectList();
    
    model.addAttribute("userList", userList);
    
    return "user/userList";
  }
  
}