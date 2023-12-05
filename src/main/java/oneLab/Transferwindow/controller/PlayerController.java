package oneLab.Transferwindow.controller;

import oneLab.Transferwindow.dto.PlayerDTO;
import oneLab.Transferwindow.entity.Player;
import oneLab.Transferwindow.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class PlayerController {
    @Autowired
    private final PlayerService playerService;

    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("/players")
    public List<Player> getPlayers(){
        return playerService.getAllPlayers();
    }

    @PostMapping("/createPlayer")
    public void createPlayer(@RequestBody PlayerDTO playerDTO){
        playerService.createPlayer(playerDTO);
    }

    @PostMapping("/updatePlayer")
    public void updatePlayer(@RequestBody PlayerDTO playerDTO){
        playerService.updatePlayer(playerDTO);
    }

    public void deletePlayer(@RequestParam("id") int id){
        playerService.deletePlayer(id);
    }

}
