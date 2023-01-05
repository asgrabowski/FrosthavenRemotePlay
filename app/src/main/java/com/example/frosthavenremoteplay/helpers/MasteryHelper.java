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
        return retVal;
    }

    private List<Mastery> LoadAllBlinkBladeMasteries() {
        List<Mastery> retVal = new ArrayList<>();
        int classId = _dbHelper.getClassIdByName("Blink Blade");
        retVal.add(new Mastery(classId, "Declare Fast for seven consecutive rounds"));
        retVal.add(new Mastery(classId, "Never be targeted by an attack"));
        return retVal;
    }
}
