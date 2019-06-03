package src.main.java.hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageController {


  private static final String template = "Hello %s!";
  private final AtomicLong counter = new AtomicLong();

  //The @RequestMapping annotation ensures that HTTP requests to /greeting are mapped to the greeting() method.

  //value is mapped to the parameter name. a default value is also specified
  @RequestMapping("/message")
  public Message message(@RequestParam(value="name", defaultValue="World") String name) {
    return new Message(counter.incrementAndGet(),
        String.format(template, name));
  }


  @RequestMapping("/time")
  public Message time()
  {
    TimeManager timeManager = new TimeManager();
    return new Message(counter.incrementAndGet(),
        timeManager.getDateTime());

  }

}
