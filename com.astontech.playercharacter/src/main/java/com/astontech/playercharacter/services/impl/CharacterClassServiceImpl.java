package com.astontech.playercharacter.services.impl;

import com.astontech.playercharacter.domain.CharacterClass;
import com.astontech.playercharacter.repositories.CharacterClassRepository;
import com.astontech.playercharacter.services.CharacterClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aarothie1 on 3/31/2017.
 */
@Service
public class CharacterClassServiceImpl implements CharacterClassService{

    @Autowired
    private CharacterClassRepository characterClassRepository;


    @Override
    public CharacterClass saveCharacterClass(CharacterClass characterClass) {
        return characterClassRepository.save(characterClass);
    }

    @Override
    public Iterable<CharacterClass> listAllCharacterClasses() {
        return characterClassRepository.findAll();
    }

    @Override
    public CharacterClass getCharacterClassById(Integer id) {
        return characterClassRepository.findOne(id);
    }
}
