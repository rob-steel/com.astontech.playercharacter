package com.astontech.playercharacter.domain;

import javax.persistence.*;



@Entity
//@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerCharacter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "PlayerCharacterId")
    private Integer Id;

    @Version
    private Integer version;

    @Column(name = "CharacterName")
    private String characterName;

    @Column(name = "CharacterLevel")
    private Integer characterLevel;

    //region ability scores & modifiers

    private int strScore;
    private int strMod;

    private int dexScore;
    private int dexMod;

    private int conScore;
    private int conMod;

    private int intScore;
    private int intMod;

    private int wisScore;
    private int wisMod;

    private int chaScore;
    private int chaMod;

    //endregion


    @ManyToOne
    private SubRace subRace;

    @ManyToOne
    private Alignment alignment;

//    @ManyToOne
//    private Abilities abilities;

    @ManyToOne
    private CharacterClass characterClass;

    //region modifier helper methods

    public void abScoreHelper() {
        if(this.strScore >= 10 || this.strScore % 2 == 0) {
            this.strMod = ((getStrScore() - 10) / 2);
        } else this.strMod = (((getStrScore() - 10) / 2) - 1);

        if(this.dexScore >= 10 || this.dexScore % 2 == 0) {
            this.dexMod = ((getDexScore() - 10) / 2);
        } else this.dexMod = (((getDexScore() - 10) / 2) - 1);

        if(this.conScore >= 10 || this.conScore % 2 == 0) {
            this.conMod = ((getConScore() - 10) / 2);
        } else this.conMod = (((getConScore() - 10) / 2) - 1);

        if(this.intScore >= 10 || this.intScore % 2 == 0) {
            this.intMod = ((getIntScore() - 10) / 2);
        } else this.intMod = (((getIntScore() - 10) / 2) - 1);

        if(this.wisScore >= 10 || this.wisScore % 2 == 0) {
            this.wisMod = ((getWisScore() - 10) / 2);
        } else this.wisMod = (((getWisScore() - 10) / 2) - 1);

        if(this.chaScore >= 10 || this.chaScore % 2 == 0) {
            this.chaMod = ((getChaScore() - 10) / 2);
        } else this.chaMod = (((getChaScore() - 10) / 2) -1);
    }



    //endregion


    public PlayerCharacter() {}

    public PlayerCharacter(CharacterClass characterClass, SubRace subRace, String characterName, Integer characterLevel) {
        this.setCharacterClass(characterClass);
        this.setSubRace(subRace);
        this.setCharacterName(characterName);
        this.setCharacterLevel(characterLevel);
    }

    public PlayerCharacter(int strScore, int dexScore, int conScore, int intScore, int wisScore, int chaScore){
        this.setStrScore(strScore);
        this.setDexScore(dexScore);
        this.setConScore(conScore);
        this.setIntScore(intScore);
        this.setWisScore(wisScore);
        this.setChaScore(chaScore);
    }

    public PlayerCharacter( String characterName, SubRace subRace, Integer characterLevel, CharacterClass characterClass,
                            Alignment alignment, int strScore, int dexScore, int conScore, int intScore, int wisScore, int chaScore
                            ){
        this.setCharacterName(characterName);
        this.setSubRace(subRace);
        this.setCharacterLevel(characterLevel);
        this.setCharacterClass(characterClass);
        this.setAlignment(alignment);
        this.setStrScore(strScore);
        this.setDexScore(dexScore);
        this.setConScore(conScore);
        this.setIntScore(intScore);
        this.setWisScore(wisScore);
        this.setChaScore(chaScore);
    }

    //region getters/setters

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(Integer characterLevel) {
        this.characterLevel = characterLevel;
    }

    public SubRace getSubRace() {
        return subRace;
    }

    public void setSubRace(SubRace subRace) {
        this.subRace = subRace;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }

    public int getStrScore() {
        return strScore;
    }

    public void setStrScore(int strScore) {
        this.strScore = strScore;
    }

    public int getStrMod() {
        return strMod;
    }

    public void setStrMod(int strMod) {
        this.strMod = strMod;
    }

    public int getDexScore() {
        return dexScore;
    }

    public void setDexScore(int dexScore) {
        this.dexScore = dexScore;
    }

    public int getDexMod() {
        return dexMod;
    }

    public void setDexMod(int dexMod) {
        this.dexMod = dexMod;
    }

    public int getConScore() {
        return conScore;
    }

    public void setConScore(int conScore) {
        this.conScore = conScore;
    }

    public int getConMod() {
        return conMod;
    }

    public void setConMod(int conMod) {
        this.conMod = conMod;
    }

    public int getIntScore() {
        return intScore;
    }

    public void setIntScore(int intScore) {
        this.intScore = intScore;
    }

    public int getIntMod() {
        return intMod;
    }

    public void setIntMod(int intMod) {
        this.intMod = intMod;
    }

    public int getWisMod() {
        return wisMod;
    }

    public void setWisMod(int wisMod) {
        this.wisMod = wisMod;
    }


    public int getWisScore() {
        return wisScore;
    }

    public void setWisScore(int wisScore) {
        this.wisScore = wisScore;
    }

    public int getChaScore() {
        return chaScore;
    }

    public void setChaScore(int chaScore) {
        this.chaScore = chaScore;
    }

    public int getChaMod() {
        return chaMod;
    }

    public void setChaMod(int chaMod) {
        this.chaMod = chaMod;
    }

    //endregion
}
