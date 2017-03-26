package ntou.soselab.movie.controller;

import ntou.soselab.movie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UATController {
    private final UserRepository userRepository;

    @Autowired
    public UATController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @DeleteMapping("/reset")
    public void reset(){
        userRepository.deleteAll();
    }
}
