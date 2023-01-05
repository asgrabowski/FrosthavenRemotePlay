package com.example.frosthavenremoteplay.helpers;

import com.example.frosthavenremoteplay.classes.ModifierCard;
import com.example.frosthavenremoteplay.helpers.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class ModifierHelper {

    private DatabaseHelper _dbHelper;

    public ModifierHelper(DatabaseHelper databaseHelper) {
        _dbHelper = databaseHelper;
    }

    public List<ModifierCard> GenerateAllModifierCards() {
        List<ModifierCard> retVal = new ArrayList<>();
        retVal.addAll(LoadBaseModifiers());
        return retVal;
    }

    private List<ModifierCard> LoadBaseModifiers() {
        List<ModifierCard> retVal = new ArrayList<>();
        retVal.add(new ModifierCard("Plus Zero", 0));
        retVal.add(new ModifierCard("Plus One", 0));
        retVal.add(new ModifierCard("Plus Two", 0));
        retVal.add(new ModifierCard("Minus One", 0));
        retVal.add(new ModifierCard("Minus Two", 0));
        retVal.add(new ModifierCard("Miss", 0));
        retVal.add(new ModifierCard("Crit", 0));
        return retVal;
    }
}
