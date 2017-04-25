package florianthieblemont.booking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DatabaseSeeder implements CommandLineRunner {
    private CoursRepository coursRepository;

    @Autowired
    public DatabaseSeeder(CoursRepository coursRepository) {
        this.coursRepository = coursRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        List<Cours> cours = new ArrayList<>();

        cours.add(new Cours(20, "POA", 20));
        cours.add(new Cours(19, "CMOO", 15));
        cours.add(new Cours(21, "Marketing", 30));

        coursRepository.save(cours);
    }
}
