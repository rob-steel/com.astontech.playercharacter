package com.astontech.playercharacter.services.impl;

import com.astontech.playercharacter.domain.SubRace;
import com.astontech.playercharacter.repositories.SubRaceRepository;
import com.astontech.playercharacter.services.SubRaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aarothie1 on 3/31/2017.
 */
@Service
public class SubRaceServiceImpl implements SubRaceService{

    @Autowired
    private SubRaceRepository subRaceRepository;

    @Override
    public Iterable<SubRace> listAllSubRaces() {
        return subRaceRepository.findAll();
    }

    @Override
    public SubRace getSubRaceById(Integer id) {
        return subRaceRepository.findOne(id);
    }

    @Override
    public SubRace saveSubRace(SubRace subRace) {
        return subRaceRepository.save(subRace);
    }
}
