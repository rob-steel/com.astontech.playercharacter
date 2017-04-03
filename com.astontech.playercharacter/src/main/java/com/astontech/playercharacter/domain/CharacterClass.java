package com.astontech.playercharacter.domain;

import javax.persistence.*;

/**
 * Created by aarothie1 on 3/30/2017.
 */

@Entity
public class CharacterClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "characterClassId")
    private Integer Id;

    @Version
    private Integer version;

    private String characterClassName;

    public CharacterClass(){}

    public CharacterClass(String characterClassName) {
        this.characterClassName = characterClassName;
    }



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

    public String getCharacterClassName() {
        return characterClassName;
    }

    public void setCharacterClassName(String characterClassName) {
        this.characterClassName = characterClassName;
    }
}
