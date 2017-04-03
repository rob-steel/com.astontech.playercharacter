package com.astontech.playercharacter.rest;

import com.astontech.playercharacter.domain.CharacterClass;
import com.astontech.playercharacter.services.CharacterClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by aarothie1 on 3/31/2017.
 */

@RestController
@RequestMapping("/api/characterclass")
public class CharacterClassRest {

    @Autowired
    private CharacterClassService characterClassService;

    @RequestMapping(value="/", method = RequestMethod.GET)
    public Iterable<CharacterClass> getALL(){
        return characterClassService.listAllCharacterClasses();
    }
}
