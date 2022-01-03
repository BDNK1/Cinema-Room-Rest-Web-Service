package task;

import org.springframework.web.bind.annotation.*;

import static task.Message.messages;

@RestController
public class Controller {

@GetMapping("/message")
    public String getMessage(){
        return messages.getLast();
    }

@PostMapping("/message")
    public void addMessage(@RequestBody String importantMessage){
        messages.add(importantMessage);
    }
}

