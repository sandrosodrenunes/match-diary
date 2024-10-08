package sandrojunior.matchdiary.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sandrojunior.matchdiary.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

}
