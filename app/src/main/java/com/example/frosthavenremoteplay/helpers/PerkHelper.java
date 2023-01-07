package com.example.frosthavenremoteplay.helpers;


import com.example.frosthavenremoteplay.classes.Perk;
import com.example.frosthavenremoteplay.helpers.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class PerkHelper {
    private DatabaseHelper _dbHelper;

    public PerkHelper(DatabaseHelper dbHelper){
        _dbHelper = dbHelper;
    }

    public List<Perk> GenerateAllPerks(){
        List<Perk> retVal = new ArrayList<>();
        retVal.addAll(LoadAllBlinkBladePerks());
        retVal.addAll(LoadAllBannerSpearPerks());
        return retVal;
    }

    private List<Perk> LoadAllBlinkBladePerks() {
        List<Perk> retVal = new ArrayList<>();
        int classId = _dbHelper.getClassIdByName(ClassHelper.BLINK_BLADE);
        retVal.add(new Perk(classId, "Remove one -2 card", -1, 0, 0, 0, 0, 1, 1, 1));
        retVal.add(new Perk(classId, "Replace one -1 card with one +1 card", 0, -1, 0, 1, 0, 1, 2, 2));
        retVal.add(new Perk(classId, "Replace one -1 card with one '+0 Wound' card", 0, -1, 0, 0, 0, 1, 2, 3));
        retVal.add(new Perk(classId, "Replace one +0 card with one '+1 Immobilize' card", 0, 0, -1, 0, 0, 1, 2, 4));
        retVal.add(new Perk(classId, "Replace one +0 card with one 'Place this card in your active area. On your next attack, discard this card to add +2 damage' rolling modifier card", 0, 0, -1, 0, 0, 1, 3, 5));
        retVal.add(new Perk(classId, "Replace two +1 cards with two +2 cards", 0, 0, 0, -2, 2, 1, 1, 6));
        retVal.add(new Perk(classId, "Add one '-1 Gain 1 Time Token' Card", 0, 0, 0, 0, 0, 1, 2, 7));
        retVal.add(new Perk(classId, "Add one '+2 Regenerate Self' rolling modifier card", 0, 0, 0, 0, 0, 1, 2, 8));
        retVal.add(new Perk(classId, "Whenever you short rest, you may spend one unspent refreshable item for no effect to refresh a different spent refreshable item", 0, 0, 0, 0, 0, 1, 1, 9));
        retVal.add(new Perk(classId, "At the start of your first turn each scenario, you may perform move 3", 0, 0, 0, 0, 0, 1, 1, 10));
        retVal.add(new Perk(classId, "Whenever you would gain immobilize, prevent the condition", 0, 0, 0, 0, 0, 1, 1, 11));
        return retVal;
    }

    private List<Perk> LoadAllBannerSpearPerks(){
        List<Perk> retVal = new ArrayList<>();
        int classId = _dbHelper.getClassIdByName(ClassHelper.BANNER_SPEAR);
        retVal.add(new Perk(classId, "Replace one -1 card with one 'Shield 1 rolling modifier' card", 0, -1, 0, 0, 0, 1, 3, 1));
        retVal.add(new Perk(classId, "Replace one +0 card with one '+1, Add +1 Damage for each ally adjacent to the target' card", 0, 0, -1, 0, 0, 1, 2, 2));
        retVal.add(new Perk(classId, "Add one '+1 Disarm' card", 0, 0, 0, 0, 0, 1, 2, 3));
        retVal.add(new Perk(classId, "Add one '+2, Push 1' card", 0, 0, 0, 0, 0, 1, 2, 4));
        retVal.add(new Perk(classId, "Add two '+1 rolling modifier' cards", 0, 0, 0, 0, 0, 1, 2, 5));
        retVal.add(new Perk(classId, "Add two 'Heal 1, self rolling modifier' cards", 0, 0, 0, 0, 0, 1, 2, 6));
        retVal.add(new Perk(classId, "Ignore item -1 effects and remove one -1 card", 0, -1, 0, 0, 0, 1, 1, 7));
        retVal.add(new Perk(classId, "At the end of each of your long rests, grant one ally within range 3 'Move 2'", 0, 0, 0, 0, 0, 1, 1, 8));
        retVal.add(new Perk(classId, "Whenever you open a door with a move ability, add '+3 Move'", 0, 0, 0, 0, 0, 1, 1, 9));
        retVal.add(new Perk(classId, "Once each scenario, during your turn, gain 'Shield 2' for the round", 0, 0, 0, 0, 0, 2, 1, 10));
        return retVal;
    }
}
