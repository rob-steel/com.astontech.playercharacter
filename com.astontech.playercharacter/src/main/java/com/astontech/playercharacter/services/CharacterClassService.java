package com.astontech.playercharacter.services;

import com.astontech.playercharacter.domain.CharacterClass;

/**
 * Created by aarothie1 on 3/30/2017.
 */
public interface CharacterClassService {

    Iterable<CharacterClass> listAllCharacterClasses();

    CharacterClass getCharacterClassById(Integer Id);

    CharacterClass saveCharacterClass(CharacterClass characterClass);
}
