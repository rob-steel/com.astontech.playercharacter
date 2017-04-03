package com.astontech.playercharacter.repositories;

import com.astontech.playercharacter.domain.PlayerCharacter;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by aarothie1 on 3/30/2017.
 */
public interface PlayerCharacterRepository extends CrudRepository<PlayerCharacter, Integer> {
}
