package sandrojunior.matchdiary.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import javax.naming.Name;

@Table(Name = "team")
@Entity(Name = "team")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Match {
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @Column(name = "date")
  private Data date;
  @Column(name = "score_team_one")
  private Integer scoreTeamOne;
  @Column(name = "score_team_two")
  private Integer scoreTeamTwo;

  @ManyToMany
  @JsonManagedReference
  @JoinColumn(name = "team_one_id")
  private Team teamOne;

  @ManyToMany
  @JsonManagedReference
  @JoinColumn(name = "team_two_id")
  private Team teamTwo;

  @ManyToMany
  @JsonManagedReference
  @JoinColumn(name = "team_supportedTeam_id")
  private Team supportedTeam;
}
