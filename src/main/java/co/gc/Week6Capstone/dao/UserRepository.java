package co.gc.Week6Capstone.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.gc.Week6Capstone.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query("SELECT u FROM User u WHERE u.email=?1 AND u.password=?2")
	User findByEmail(String email, String password);
	
}
