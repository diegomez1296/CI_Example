package rydzinski.ciexample;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class HomeApiT {

    @Autowired
    private DogRepo dogRepo;

    @Test
    public void name() {
        Dog dog = new Dog("Puszek");
        dogRepo.save(dog);

        Assert.assertEquals(1, dogRepo.findAll().size());
    }
}
