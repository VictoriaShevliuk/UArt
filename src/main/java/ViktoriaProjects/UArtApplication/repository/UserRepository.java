package ViktoriaProjects.UArtApplication.repository;

import ViktoriaProjects.UArtApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
