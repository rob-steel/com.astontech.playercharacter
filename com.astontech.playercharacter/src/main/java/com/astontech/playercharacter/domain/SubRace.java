package com.astontech.playercharacter.domain;

import javax.persistence.*;

/**
 * Created by aarothie1 on 3/30/2017.
 */

@Entity
public class SubRace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subRaceId")
    private Integer id;

    @Version
    private Integer version;

    @Column(name="subRaceName")
    private String subRaceName;

//    @ManyToOne
//    private BaseRace baseRace;


    public SubRace() {}

    public SubRace(String subRaceName) {
        this.subRaceName = subRaceName;
    }



    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getSubRaceName() {
        return subRaceName;
    }

    public void setSubRaceName(String subRaceName) {
        this.subRaceName = subRaceName;
    }

//    public BaseRace getBaseRace() {
//        return baseRace;
//    }
//
//    public void setBaseRace(BaseRace baseRace) {
//        this.baseRace = baseRace;
//    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
