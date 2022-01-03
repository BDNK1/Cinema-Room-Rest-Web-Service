package task;

import org.springframework.scheduling.config.Task;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.*;
@RestController
public class Controller {
    Queue<String> NamesList = new ConcurrentLinkedQueue<>();

    @PostMapping("/users")
    public void post(@RequestParam String name){
        NamesList.add(name);
    }

    @GetMapping("/users")
    public Queue<String> getUsers(){
        return NamesList;
    }
}
