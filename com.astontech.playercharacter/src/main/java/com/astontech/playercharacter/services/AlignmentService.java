package com.astontech.playercharacter.services;

import com.astontech.playercharacter.domain.Alignment;

/**
 * Created by aarothie1 on 4/3/2017.
 */
public interface AlignmentService {

    Iterable listAllAlignments();

    Alignment getAlignmentById(Integer Id);

    Alignment saveAlignment(Alignment alignment);
}
