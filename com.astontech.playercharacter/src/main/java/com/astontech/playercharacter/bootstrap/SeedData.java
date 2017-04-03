package com.astontech.playercharacter.bootstrap;

import com.astontech.playercharacter.domain.Alignment;
import com.astontech.playercharacter.domain.CharacterClass;
import com.astontech.playercharacter.domain.PlayerCharacter;
import com.astontech.playercharacter.domain.SubRace;
import com.astontech.playercharacter.services.AlignmentService;
import com.astontech.playercharacter.services.CharacterClassService;
import com.astontech.playercharacter.services.PlayerCharacterService;
import com.astontech.playercharacter.services.SubRaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by aarothie1 on 3/31/2017.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private PlayerCharacterService playerCharacterService;

    @Autowired
    private CharacterClassService characterClassService;

    @Autowired
    private SubRaceService subRaceService;

    @Autowired
    private AlignmentService alignmentService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        generateAssetsAndSamples();
    }

    private void generateAssetsAndSamples() {

        //region subraces

            //region humans

            SubRace raceHuman = new SubRace("Human");
            subRaceService.saveSubRace(raceHuman);

            //endregion

            //region demihumans

            SubRace raceHalfElf = new SubRace("Half-Elf");
            subRaceService.saveSubRace(raceHalfElf);

            SubRace raceHalfOrc = new SubRace("Half-Orc");
            subRaceService.saveSubRace(raceHalfOrc);

            SubRace raceDragonBorn = new SubRace("Dragonborn");
            subRaceService.saveSubRace(raceDragonBorn);

            SubRace raceTiefling = new SubRace("Tiefling");
            subRaceService.saveSubRace(raceTiefling);

            //endregion

            //region dwarves

            SubRace raceMountainDwarf = new SubRace("Mountain Dwarf");
            subRaceService.saveSubRace(raceMountainDwarf);

            SubRace raceHillDwarf = new SubRace("Hill Dwarf");
            subRaceService.saveSubRace(raceHillDwarf);

            SubRace raceDuergar = new SubRace("Duergar");
            subRaceService.saveSubRace(raceDuergar);

            //endregion

            //region elves

            SubRace raceHighElves = new SubRace("High Elf");
            subRaceService.saveSubRace(raceHighElves);

            SubRace raceWoodElves = new SubRace("Wood Elf");
            subRaceService.saveSubRace(raceWoodElves);

            SubRace raceDrow = new SubRace("Drow");
            subRaceService.saveSubRace(raceDrow);

            //endregion

            //region halflings

            SubRace raceStoutHalfling = new SubRace("Stout Halfling");
            subRaceService.saveSubRace(raceStoutHalfling);

            SubRace raceLightFootHalfling = new SubRace("Lightfoot Halfling");
            subRaceService.saveSubRace(raceLightFootHalfling);

            //endregion



        //endregion

        //region character classes

        CharacterClass classBarbarian = new CharacterClass();
        classBarbarian.setCharacterClassName("Barbarian");
        characterClassService.saveCharacterClass(classBarbarian);

        CharacterClass classBard = new CharacterClass();
        classBard.setCharacterClassName("Bard");
        characterClassService.saveCharacterClass(classBard);

        CharacterClass classCleric = new CharacterClass();
        classCleric.setCharacterClassName("Cleric");
        characterClassService.saveCharacterClass(classCleric);

        CharacterClass classDruid = new CharacterClass();
        classDruid.setCharacterClassName("Druid");
        characterClassService.saveCharacterClass(classDruid);

        CharacterClass classFighter = new CharacterClass();
        classFighter.setCharacterClassName("Fighter");
        characterClassService.saveCharacterClass(classFighter);

        CharacterClass classMonk = new CharacterClass();
        classMonk.setCharacterClassName("Monk");
        characterClassService.saveCharacterClass(classMonk);

        CharacterClass classPaladin = new CharacterClass();
        classPaladin.setCharacterClassName("Paladin");
        characterClassService.saveCharacterClass(classPaladin);

        CharacterClass classSorcerer = new CharacterClass();
        classSorcerer.setCharacterClassName("Sorcerer");
        characterClassService.saveCharacterClass(classSorcerer);

        CharacterClass classWarlock = new CharacterClass();
        classWarlock.setCharacterClassName("Warlock");
        characterClassService.saveCharacterClass(classWarlock);

        CharacterClass classWizard = new CharacterClass();
        classWizard.setCharacterClassName("Wizard");
        characterClassService.saveCharacterClass(classWizard);

        //endregion

        //region alignments

        Alignment alignmentLG = new Alignment("Lawful Good");
        alignmentService.saveAlignment(alignmentLG);

        Alignment alignmentNG = new Alignment("Neutral Good");
        alignmentService.saveAlignment(alignmentNG);

        Alignment alignmentCG = new Alignment("Chaotic Good");
        alignmentService.saveAlignment(alignmentCG);

        Alignment alignmentLN = new Alignment("Lawful Neutral");
        alignmentService.saveAlignment(alignmentLN);

        Alignment alignmentN = new Alignment("Neutral");
        alignmentService.saveAlignment(alignmentN);

        Alignment alignmentCN = new Alignment("Chaotic Neutral");
        alignmentService.saveAlignment(alignmentCN);

        Alignment alignmentLE = new Alignment("Lawful Evil");
        alignmentService.saveAlignment(alignmentLE);

        Alignment alignmentNE = new Alignment("Neutral Evil");
        alignmentService.saveAlignment(alignmentNE);

        Alignment alignmentCE = new Alignment("Chaotic Evil");
        alignmentService.saveAlignment(alignmentCE);

        //endregion

        //region sample characters

        PlayerCharacter sample1 = new PlayerCharacter(17, 11, 18, 9, 12, 11);
        sample1.setCharacterName("Astrid JadeHand");
        sample1.setCharacterLevel(1);
        sample1.setCharacterClass(classBarbarian);
        sample1.setSubRace(raceMountainDwarf);
        sample1.setAlignment(alignmentCN);
        sample1.abScoreHelper();
        playerCharacterService.savePlayerCharacter(sample1);

        PlayerCharacter sample2 = new PlayerCharacter(11, 14, 12, 10, 18, 12);
        sample2.setCharacterName("Rolen Nightbreeze");
        sample2.setCharacterLevel(1);
        sample2.setCharacterClass(classDruid);
        sample2.setSubRace(raceWoodElves);
        sample2.setAlignment(alignmentLN);
        sample2.abScoreHelper();
        playerCharacterService.savePlayerCharacter(sample2);

        PlayerCharacter sample3 = new PlayerCharacter(14, 18, 14, 8, 16, 11);
        sample3.setCharacterName("Jessica Ironfist");
        sample3.setCharacterLevel(1);
        sample3.setCharacterClass(classMonk);
        sample3.setSubRace(raceHuman);
        sample3.setAlignment(alignmentLN);
        sample3.abScoreHelper();
        playerCharacterService.savePlayerCharacter(sample3);

        PlayerCharacter sample4 = new PlayerCharacter(7, 16, 12, 8, 6, 19);
        sample4.setCharacterName("Tommy Two-Toes");
        sample4.setCharacterLevel(1);
        sample4.setCharacterClass(classBard);
        sample4.setSubRace(raceLightFootHalfling);
        sample4.setAlignment(alignmentNE);
        sample4.abScoreHelper();
        playerCharacterService.savePlayerCharacter(sample4);

        PlayerCharacter sample5 = new PlayerCharacter(18, 12, 16, 10, 10, 14);
        sample5.setCharacterName("Lysandor, Sealer of Darkness");
        sample5.setCharacterLevel(1);
        sample5.setCharacterClass(classPaladin);
        sample5.setSubRace(raceDragonBorn);
        sample5.setAlignment(alignmentLG);
        sample5.abScoreHelper();
        playerCharacterService.savePlayerCharacter(sample5);

        PlayerCharacter sample6 = new PlayerCharacter("Sir Adran", raceHuman, 14, classFighter, alignmentLN, 18, 14, 16, 11, 12, 14);
        sample6.abScoreHelper();
        playerCharacterService.savePlayerCharacter(sample6);

        //endregion

    }
}
