package ntou.soselab.movie.controller;

import lombok.extern.slf4j.Slf4j;
import ntou.soselab.movie.controller.dto.ServiceTestDTO;
import ntou.soselab.movie.model.User;
import ntou.soselab.movie.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ServiceTestController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/serviceTest")
    public void serviceTest(@RequestBody ServiceTestDTO serviceTestDTO) {
        log.info("{}", serviceTestDTO);
        if (serviceTestDTO.getState().equals("The user, Ben, is exists")) {
            this.setBen();
        }
    }

    private void setBen() {
        final String userId = "82b9d2a6-6db5-410a-8ec3-f8ac68c9ccad";
        final String name = "Ben";
        final String phone = "0912854015";

        userRepository.save(User.builder()
                .id(userId)
                .name(name)
                .phone(phone)
                .build());
    }
}
