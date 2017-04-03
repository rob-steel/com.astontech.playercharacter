package com.astontech.playercharacter.services;

import com.astontech.playercharacter.domain.SubRace;

/**
 * Created by aarothie1 on 3/31/2017.
 */
public interface SubRaceService {
    Iterable<SubRace> listAllSubRaces();

    SubRace getSubRaceById(Integer id);

    SubRace saveSubRace(SubRace subRace);
}
