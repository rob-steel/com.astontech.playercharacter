package com.astontech.playercharacter.services;

import com.astontech.playercharacter.domain.PlayerCharacter;

/**
 * Created by aarothie1 on 3/30/2017.
 */
public interface PlayerCharacterService {

    PlayerCharacter getPlayerCharacterById(Integer id);

    Iterable<PlayerCharacter> getAllPlayerCharacters();

    PlayerCharacter savePlayerCharacter(PlayerCharacter playerCharacter);

    void deletePlayerCharacter(Integer id);
}
