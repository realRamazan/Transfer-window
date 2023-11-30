package oneLab.Transferwindow.controller;


import oneLab.Transferwindow.dto.ClubDTO;
import oneLab.Transferwindow.entity.Club;
import oneLab.Transferwindow.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    ClubService clubService;


    @GetMapping("/clubs")
    public List<Club> getAllClubs(){
        return clubService.getAllClubs();
    }

    @PostMapping("/create")
    public void createClub(@RequestBody ClubDTO clubDTO){
        clubService.createClub(clubDTO);
    }

    @PostMapping("/update")
    public void updateClub(@RequestBody ClubDTO clubDTO){
        clubService.updateClub(clubDTO);
    }

    @DeleteMapping("/delete")
    public void deleteClub(@RequestParam("id") int id){
        clubService.deleteClub(id);
    }
}
