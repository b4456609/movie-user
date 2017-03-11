package ntou.soselab.movie.controller;

import ntou.soselab.movie.model.User;
import ntou.soselab.movie.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public User getUser(@PathVariable("id") String userId){
        return userRepository.findOne(userId);
    }

    @PostMapping("/registration")
    public void registration(@RequestBody User user){
        userRepository.save(user);
    }

}
