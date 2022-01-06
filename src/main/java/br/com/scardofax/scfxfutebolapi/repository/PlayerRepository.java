package br.com.scardofax.scfxfutebolapi.repository;

import br.com.scardofax.scfxfutebolapi.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
