package src.main.java.hello;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import src.main.java.hello.User;
import src.main.java.hello.UserRepository;


@Controller  //this annotation informs that this is a controller
@RequestMapping(path="/demo") //this says that the urls will start with demo
public class SQLController {

  @Autowired

  private UserRepository userRepository;


  //GetMapping is short for @RequestMapping(method=GET)

  @GetMapping(path="/add") //Maps only GET requests with GetMapping
  public @ResponseBody String addNewUser (@RequestParam String name, @RequestParam String email)
  {
      //the ResponseBody annotation means that the returned String is the response insted of a view object
    //https://stackoverflow.com/questions/28646332/how-does-the-spring-responsebody-annotation-work-in-this-restful-application-ex

    User usr = new User();
    usr.setName(name);
    usr.setEmail(email);
    userRepository.save(usr);
    return "SAVED";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers()
  {
    return userRepository.findAll();
  }

}
