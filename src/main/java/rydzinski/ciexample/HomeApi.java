package rydzinski.ciexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeApi {

    @Autowired
    private DogRepo dogRepo;

    @GetMapping
    public String home() {
        return "Home Page!";
    }

    @PostMapping
    public Dog addDog() {
        return dogRepo.save(new Dog("Dog1"));
    }

    @GetMapping("/getAll")
    public Iterable<Dog> getAll() {return dogRepo.findAll();}
}
