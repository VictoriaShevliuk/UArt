package ViktoriaProjects.UArtApplication.repository;

import ViktoriaProjects.UArtApplication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}
