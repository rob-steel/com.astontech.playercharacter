package com.astontech.playercharacter.domain;

import javax.persistence.*;

/**
 * Created by aarothie1 on 4/3/2017.
 */
@Entity
public class Alignment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "alignmentId")
    private int Id;

    private String alignmentName;

    public Alignment () {}

    public Alignment(String alignmentName) {
        this.setAlignmentName(alignmentName);
    }


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getAlignmentName() {
        return alignmentName;
    }

    public void setAlignmentName(String alignmentName) {
        this.alignmentName = alignmentName;
    }
}
