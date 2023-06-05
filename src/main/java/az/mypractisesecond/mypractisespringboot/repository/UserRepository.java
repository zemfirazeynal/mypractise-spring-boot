package az.mypractisesecond.mypractisespringboot.repository;

import az.mypractisesecond.mypractisespringboot.model.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<MyUser, Long> {

}
