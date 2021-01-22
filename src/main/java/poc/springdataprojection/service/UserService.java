package poc.springdataprojection.service;

import org.springframework.stereotype.Service;
import poc.springdataprojection.model.projection.UserProjection;
import poc.springdataprojection.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<UserProjection> findAllActives() {
        return userRepository.findByActiveIsTrue();
    }

}
