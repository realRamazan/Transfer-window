package oneLab.Transferwindow.service;

import oneLab.Transferwindow.dto.PlayerDTO;
import oneLab.Transferwindow.entity.Player;
import oneLab.Transferwindow.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class PlayerService {
    @Autowired
    PlayerRepository playerRepository;

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    public void createPlayer(PlayerDTO playerDTO) {
        Player player = new Player();
        player.setName(playerDTO.getName());
        player.setSurname(playerDTO.getSurName());
        player.setTeamId(playerDTO.getTeamId());
        playerRepository.save(player);
    }

    public void updatePlayer(PlayerDTO playerDTO) {
        Player player = playerRepository.findById(playerDTO.getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        if (playerDTO.getName() != null) {
            player.setName(playerDTO.getName());
        }
        if (playerDTO.getSurName() != null) {
            player.setSurname((playerDTO.getName()));
        }
        if (playerDTO.getTeamId() != 0) {
            player.setTeamId(playerDTO.getTeamId());
        }
    }

    public void deletePlayer(int id) {
        Optional<Player> optionalPlayer = playerRepository.findById(id);
        if (optionalPlayer.isPresent()) {
            Player player = optionalPlayer.get();
            playerRepository.delete(player);
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
