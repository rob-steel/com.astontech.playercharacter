package com.astontech.playercharacter.domain;

import javax.persistence.*;

/**
 * Created by aarothie1 on 3/30/2017.
 */

@Entity
public class BaseRace {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="baseRaceId")
    private Integer Id;

    @Version
    private Integer version;

    @Column(name = "baseRaceName")
    private String baseRaceName;

    private BaseRace() {}


    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getBaseRaceName() {
        return baseRaceName;
    }

    public void setBaseRaceName(String baseRaceName) {
        this.baseRaceName = baseRaceName;
    }
}
