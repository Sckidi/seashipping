package by.grsu.knyazeva.seashiping.config;

import by.grsu.knyazeva.seashiping.model.User;
import by.grsu.knyazeva.seashiping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class InitDataLoader implements ApplicationRunner {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        User user = new User();
        user.setUsername("knyazeva");
        user.setPassword(passwordEncoder.encode("qwerty"));
        user.setOrganization("EPAM");
        userRepository.save(user);
    }
}
