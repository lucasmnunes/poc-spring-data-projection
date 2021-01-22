package poc.springdataprojection.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import poc.springdataprojection.model.User;
import poc.springdataprojection.model.projection.UserProjection;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<UserProjection> findByActiveIsTrue();

}
