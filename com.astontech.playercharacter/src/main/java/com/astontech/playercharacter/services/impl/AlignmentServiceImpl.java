package com.astontech.playercharacter.services.impl;

import com.astontech.playercharacter.domain.Alignment;
import com.astontech.playercharacter.repositories.AlignmentRepository;
import com.astontech.playercharacter.services.AlignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aarothie1 on 4/3/2017.
 */

@Service
public class AlignmentServiceImpl implements AlignmentService {

    @Autowired
    public AlignmentRepository alignmentRepository;

    @Override
    public Iterable listAllAlignments() {
        return alignmentRepository.findAll();
    }

    @Override
    public Alignment getAlignmentById(Integer Id) {
        return alignmentRepository.findOne(Id);
    }

    @Override
    public Alignment saveAlignment(Alignment alignment) {
        return alignmentRepository.save(alignment);
    }
}
