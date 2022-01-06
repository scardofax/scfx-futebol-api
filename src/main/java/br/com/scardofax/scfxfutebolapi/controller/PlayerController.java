package br.com.scardofax.scfxfutebolapi.controller;

import br.com.scardofax.scfxfutebolapi.model.Player;
import br.com.scardofax.scfxfutebolapi.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
public class PlayerController {

    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping
    public List<Player> listPlayers(){
        return playerRepository.findAll();
    }

    @PostMapping
    public Player savePlayer(@RequestBody Player player){
        return playerRepository.save(player);
    }

    @PutMapping
    public Player changePlayer(@RequestBody Player player){
        return playerRepository.save(player);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        playerRepository.deleteById(id);
    }

}
