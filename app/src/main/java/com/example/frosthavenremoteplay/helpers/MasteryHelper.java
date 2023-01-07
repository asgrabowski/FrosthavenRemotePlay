package com.example.frosthavenremoteplay.helpers;

import com.example.frosthavenremoteplay.classes.Mastery;
import com.example.frosthavenremoteplay.helpers.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class MasteryHelper {

    private DatabaseHelper _dbHelper;

    public MasteryHelper(DatabaseHelper databaseHelper) {
        _dbHelper = databaseHelper;
    }

    public List<Mastery> GenerateAllMasteries() {
        List<Mastery> retVal = new ArrayList<>();
        retVal.addAll(LoadAllBlinkBladeMasteries());
        retVal.addAll(LoadAllBannerSpeakMasteries());
        return retVal;
    }

    private List<Mastery> LoadAllBlinkBladeMasteries() {
        List<Mastery> retVal = new ArrayList<>();
        int classId = _dbHelper.getClassIdByName(ClassHelper.BLINK_BLADE);
        retVal.add(new Mastery(classId, "Declare Fast for seven consecutive rounds"));
        retVal.add(new Mastery(classId, "Never be targeted by an attack"));
        return retVal;
    }

    private List<Mastery> LoadAllBannerSpeakMasteries() {
        List<Mastery> retVal = new ArrayList<>();
        int classId = _dbHelper.getClassIdByName(ClassHelper.BANNER_SPEAR);
        retVal.add(new Mastery(classId, "Attack at least three enemies with each of three different area of effect attack abilities"));
        retVal.add(new Mastery(classId, "Perform a Banner summon ability on your first turn, keep the banner alive and within range 3 of you for the entire scenario"));
        return retVal;
    }
}
