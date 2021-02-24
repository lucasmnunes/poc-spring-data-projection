package poc.springdataprojection.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import poc.springdataprojection.model.projection.UserProjection;
import poc.springdataprojection.repository.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private UserRepository userRepository;

    public List<UserProjection> findAllActives() {
        return userRepository.findByActiveIsTrue();
    }

}
