package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.concurrent.*;


@RestController
public class Controller {
    Map<Integer, String> map = new ConcurrentHashMap<>();
    Random random = new Random();
    @GetMapping("/api/data/{id}")
    public String getData(@PathVariable int id) {
        return map.get(id);
    }

    @PostMapping("/api/data/new")
    public Str generateNew(@RequestBody String data){
        int id = random.nextInt()%1000+1;
        while(map.containsKey(id)){
            id = random.nextInt()%1000+1;
        }
        map.put(id,data);
        Str response = new Str();
        response.setId(id);
        return response;
    }

}
