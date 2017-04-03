package com.astontech.playercharacter.services.impl;

import com.astontech.playercharacter.domain.PlayerCharacter;
import com.astontech.playercharacter.repositories.PlayerCharacterRepository;
import com.astontech.playercharacter.services.PlayerCharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aarothie1 on 3/30/2017.
 */
@Service
public class PlayerCharacterServiceImpl implements PlayerCharacterService {

    @Autowired
    private PlayerCharacterRepository playerCharacterRepository;

    @Override
    public Iterable<PlayerCharacter> getAllPlayerCharacters() {
        return playerCharacterRepository.findAll();
    }

    @Override
    public PlayerCharacter getPlayerCharacterById(Integer id) {
        return playerCharacterRepository.findOne(id);
    }

    @Override
    public PlayerCharacter savePlayerCharacter(PlayerCharacter playerCharacter) {
        return playerCharacterRepository.save(playerCharacter);
    }

    @Override
    public void deletePlayerCharacter(Integer id) {

    }
}
