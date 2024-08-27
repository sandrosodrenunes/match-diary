package sandrojunior.matchdiary.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sandrojunior.matchdiary.dto.team.TeamResponseDTO;
import sandrojunior.matchdiary.model.Team;
import sandrojunior.matchdiary.repository.TeamRepository;

import java.util.Optional;

@Service
public class TeamService {

  @Autowired
  private TeamRepository teamRepository;

  public TeamResponseDTO getTeamById(final Long id) {
    Optional<Team> response = teamRepository.findById(id);

    if (response.isPresent()) {
      TeamResponseDTO responseDTO = new TeamResponseDTO(response.get());
      return responseDTO;
    } else {
      TeamResponseDTO responseDTO = new TeamResponseDTO();
      return responseDTO;
    }

  }

}
