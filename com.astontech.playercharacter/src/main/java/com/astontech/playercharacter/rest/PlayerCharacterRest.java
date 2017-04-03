package com.astontech.playercharacter.rest;

import com.astontech.playercharacter.domain.PlayerCharacter;
import com.astontech.playercharacter.services.PlayerCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aarothie1 on 3/31/2017.
 */

@RestController
@RequestMapping("/api/playercharacter")
public class PlayerCharacterRest {

    @Autowired
    private PlayerCharacterService playerCharacterService;

    //todo fix this
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public PlayerCharacter getPC(@PathVariable int id){
        return playerCharacterService.getPlayerCharacterById(id);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public Iterable<PlayerCharacter> getAll() {
        return playerCharacterService.getAllPlayerCharacters();
    }
}
