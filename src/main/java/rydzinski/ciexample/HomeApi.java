package rydzinski.ciexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApi {

    @GetMapping
    public String home() {
        return "Home Page!";
    }
}
