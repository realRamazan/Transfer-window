package oneLab.Transferwindow.service;

import oneLab.Transferwindow.dto.ClubDTO;
import oneLab.Transferwindow.entity.Club;
import oneLab.Transferwindow.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ClubService {
    @Autowired
    ClubRepository clubRepository;

    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    public void createClub(ClubDTO clubDTO) {
        Club club = new Club();
        club.setName(clubDTO.getName());
        club.setCountry(clubDTO.getCountry());
        club.setNumberOfPlayers(clubDTO.getNumberOfPlayers());
        clubRepository.save(club);
    }

    public void updateClub(ClubDTO clubDTO) {
        Club club = clubRepository.findById(clubDTO.getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        if(clubDTO.getName() != null){
            club.setName(clubDTO.getName());
        }
        if(clubDTO.getCountry() != null){
            club.setCountry(clubDTO.getCountry());
        }
        if(clubDTO.getNumberOfPlayers() != 0){
            club.setNumberOfPlayers(clubDTO.getNumberOfPlayers());
        }
        clubRepository.save(club);
    }

    public void deleteClub(int id) {
        Optional<Club> optionalClub = clubRepository.findById(id);
        if(optionalClub.isPresent()){
            Club club = optionalClub.get();
            clubRepository.delete(club);
        }
        else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
}
