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
        return retVal;
    }

    private List<Perk> LoadAllBlinkBladePerks() {
        List<Perk> retVal = new ArrayList<>();
        int classId = _dbHelper.getClassIdByName("Blink Blade");
        retVal.add(new Perk(classId, "Remove one -2 card", -1, 0, 0, 0, 0, 1, 1));
        retVal.add(new Perk(classId, "Replace one -1 card with one +1 card", 0, -1, 0, 1, 0, 1, 2));
        retVal.add(new Perk(classId, "Replace one -1 card with one +0 Wound card", 0, -1, 0, 0, 0, 1, 2));
        retVal.add(new Perk(classId, "Replace one +0 card with one +1 Immobilize card", 0, 0, -1, 0, 0, 1, 2));
        retVal.add(new Perk(classId, "Replace one +0 card with one 'Place this card in your active area. On your next attack, discard this card to add +2 damage' rolling modifier card", 0, 0, -1, 0, 0, 1, 3));
        retVal.add(new Perk(classId, "Replace two +1 cards with two +2 cards", 0, 0, 0, -2, 2, 1, 1));
        retVal.add(new Perk(classId, "Add one -1 Gain 1 Time Token Card", 0, 0, 0, 0, 0, 1, 2));
        retVal.add(new Perk(classId, "Add one +2 Regenerate Self rolling modifier card", 0, 0, 0, 0, 0, 1, 2));
        retVal.add(new Perk(classId, "Whenever you short rest, you may spend one unspent refreshable item for no effect to refresh a different spent refreshable item", 0, 0, 0, 0, 0, 1, 1));
        retVal.add(new Perk(classId, "At the start of your first turn each scenario, you may perform move 3", 0, 0, 0, 0, 0, 1, 1));
        retVal.add(new Perk(classId, "Whenever you would gain immobilize, prevent the condition", 0, 0, 0, 0, 0, 1, 1));
        return retVal;
    }
}
