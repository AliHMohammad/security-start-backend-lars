package dat3.security_demo.repository;

import dat3.security_demo.entity.SpecialUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface SpecialUserRepository extends JpaRepository<SpecialUser, String>{
}