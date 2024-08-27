package sandrojunior.matchdiary.dto.team;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sandrojunior.matchdiary.model.Team;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeamResponseDTO {
  private Long id;
  private String name;
  private String state;
  private String photourl;

  public TeamResponseDTO(Team team) {
    this(team.getId(), team.getName(), team.getState(), team.getPhotourl());
  }
}
