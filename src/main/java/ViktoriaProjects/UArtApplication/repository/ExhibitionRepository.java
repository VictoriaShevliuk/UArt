package ViktoriaProjects.UArtApplication.repository;

import ViktoriaProjects.UArtApplication.model.Exhibition;
import ViktoriaProjects.UArtApplication.model.Piece;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExhibitionRepository extends JpaRepository<Exhibition, Long> {

    @Query(value = "select id, title, description, creator from exhibitions where creator = ?1", nativeQuery = true)
    List<Exhibition> getByUserId(long userId);
}
