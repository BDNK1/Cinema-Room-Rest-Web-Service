package task;

import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @PostMapping("/api/products")
    public Product getproducts(@RequestBody Product param){
        return param;
    }
}
