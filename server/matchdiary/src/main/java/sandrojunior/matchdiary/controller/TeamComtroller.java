package sandrojunior.matchdiary.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sandrojunior.matchdiary.dto.team.TeamResponseDTO;
import sandrojunior.matchdiary.model.Team;
import sandrojunior.matchdiary.service.TeamService;

import java.util.Optional;

@RestController
@RequestMapping("/api/team")
public class TeamComtroller {

  @Autowired
  private TeamService teamService;

  @GetMapping("all")
  public String getAllTeams() {
    return "All teams";
  }

  @GetMapping("{id}")
  public ResponseEntity<TeamResponseDTO> getTeamById(@PathVariable("id") Long id) {
    // TeamResponseDTO reponse = teamService.getTeamById(id);
    return ResponseEntity.ok(teamService.getTeamById(id));
  }

  @PostMapping
  public String addTeam(@RequestBody Team team) {
    return "";
  }

  @PutMapping
  public String updateTeam(@RequestBody Team team) {
    return "";
  }

  @DeleteMapping("{id}")
  public String deleteTeam(@RequestParam("id") Long id) {
    return "";
  }

}
