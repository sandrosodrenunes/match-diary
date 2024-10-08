package sandrojunior.matchdiary.controller;

import org.springframework.web.bind.annotation.*;
import sandrojunior.matchdiary.model.Team;

@RestController
@RequestMapping("/api/match")

public class MatchController {

  @GetMapping("all")
  public String getAllMatch() {
    return "All teams";
  }

  @GetMapping("{id}")
  public String getMatchById(@RequestParam("id") Long id) {
    return "";
  }

  @PostMapping
  public String addMatch(@RequestBody Team team) {
    return "";
  }

  @PutMapping
  public String updateMatch(@RequestBody Team team) {
    return "";
  }

  @DeleteMapping("{id}")
  public String deleteMatch(@RequestParam("id") Long id) {
    return "";
  }

}
