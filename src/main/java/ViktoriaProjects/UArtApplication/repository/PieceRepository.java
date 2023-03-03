package ViktoriaProjects.UArtApplication.repository;

import ViktoriaProjects.UArtApplication.model.Piece;
import ViktoriaProjects.UArtApplication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PieceRepository extends JpaRepository<Piece, Long> {
    @Query(value = "select * from pieces where piece_id = ?1", nativeQuery = true)
    List<Piece> getByTodoId(long todoId);
}
