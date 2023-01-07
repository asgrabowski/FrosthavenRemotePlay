package com.example.frosthavenremoteplay.helpers;

import com.example.frosthavenremoteplay.classes.ActionCard;
import com.example.frosthavenremoteplay.helpers.DatabaseHelper;

import java.util.ArrayList;
import java.util.List;

public class ActionCardHelper {

    private DatabaseHelper _dbHelper;

    public ActionCardHelper(DatabaseHelper dbHelper){
        _dbHelper = dbHelper;
    }

    public List<ActionCard> GenerateAllCards(){
        List<ActionCard> retVal = new ArrayList<>();
        retVal.addAll(LoadBlinkBladeCards());
        retVal.addAll(LoadBannerSpearCards());
        return retVal;
    }

    public List<ActionCard> LoadBlinkBladeCards(){
        List<ActionCard> retVal = new ArrayList<>();
        int classId = _dbHelper.getClassIdByName(ClassHelper.BLINK_BLADE);
        retVal.add(new ActionCard("Blurry Jab", classId, 1));
        retVal.add(new ActionCard("Borrowed Time", classId, 1));
        retVal.add(new ActionCard("Cascading Reaction", classId, 1));
        retVal.add(new ActionCard("Drive Recharge", classId, 1));
        retVal.add(new ActionCard("Experimental Adjustment", classId, 1));
        retVal.add(new ActionCard("Hit And Run", classId, 1));
        retVal.add(new ActionCard("Kinetic Transfer", classId, 1));
        retVal.add(new ActionCard("Overdrive", classId, 1));
        retVal.add(new ActionCard("Power Leak", classId, 1));
        retVal.add(new ActionCard("Sand in the Hourglass", classId, 1));
        retVal.add(new ActionCard("Sap Speed", classId, 1));
        retVal.add(new ActionCard("Temporal Displacement", classId, 1));
        retVal.add(new ActionCard("Twin Strike", classId, 1));
        retVal.add(new ActionCard("Reckless Augmentation", classId, 2));
        retVal.add(new ActionCard("Systems Reboot", classId, 2));
        retVal.add(new ActionCard("Double Time", classId, 3));
        retVal.add(new ActionCard("Make it Count", classId, 3));
        retVal.add(new ActionCard("Potential Energy", classId, 4));
        retVal.add(new ActionCard("Precision Timing", classId, 4));
        retVal.add(new ActionCard("Breakneck Speed", classId, 5));
        retVal.add(new ActionCard("Flashing Flurry", classId, 5));
        retVal.add(new ActionCard("Stab Them All", classId, 6));
        retVal.add(new ActionCard("The Knifes Edge", classId, 6));
        retVal.add(new ActionCard("Phasing Blades", classId, 7));
        retVal.add(new ActionCard("Rushed To The End", classId, 7));
        retVal.add(new ActionCard("Fastest Alive", classId, 8));
        retVal.add(new ActionCard("Quantum Uncertainty", classId, 8));
        retVal.add(new ActionCard("Fractured Timeline", classId, 9));
        retVal.add(new ActionCard("Reverse The Flow", classId, 9));
        return retVal;
    }

    public List<ActionCard> LoadBannerSpearCards(){
        List<ActionCard> retVal = new ArrayList<>();
        int classId = _dbHelper.getClassIdByName(ClassHelper.BANNER_SPEAR);
        retVal.add(new ActionCard("At All Costs", classId, 1));
        retVal.add(new ActionCard("Combined Effort", classId, 1));
        retVal.add(new ActionCard("Deflecting Maneuver", classId, 1));
        retVal.add(new ActionCard("Driving Inspiration", classId, 1));
        retVal.add(new ActionCard("Incendiary Throw", classId, 1));
        retVal.add(new ActionCard("Javelin", classId, 1));
        retVal.add(new ActionCard("Pincer Movement", classId, 1));
        retVal.add(new ActionCard("Rallying Cry", classId, 1));
        retVal.add(new ActionCard("Regroup", classId, 1));
        retVal.add(new ActionCard("Resolved Courage", classId, 1));
        retVal.add(new ActionCard("Set for the Charge", classId, 1));
        retVal.add(new ActionCard("Tip of the Spear", classId, 1));
        retVal.add(new ActionCard("Unbreakable Wall", classId, 1));
        retVal.add(new ActionCard("Meat Grinder", classId, 2));
        retVal.add(new ActionCard("Pinning Charge", classId, 2));
        retVal.add(new ActionCard("Head of the Hammer", classId, 3));
        retVal.add(new ActionCard("Let Them Come", classId, 3));
        retVal.add(new ActionCard("Air Support", classId, 4));
        retVal.add(new ActionCard("Boldening Blow", classId, 4));
        retVal.add(new ActionCard("Explosive Epicenter", classId, 5));
        retVal.add(new ActionCard("Hold the Line", classId, 5));
        retVal.add(new ActionCard("Barricade", classId, 6));
        retVal.add(new ActionCard("Bolstering Shout", classId, 6));
        retVal.add(new ActionCard("Lead From Afar", classId, 7));
        retVal.add(new ActionCard("Tri-Thrust", classId, 7));
        retVal.add(new ActionCard("Sweeping Aid", classId, 8));
        retVal.add(new ActionCard("Taunting Howl", classId, 8));
        retVal.add(new ActionCard("Hail of Spears", classId, 9));
        retVal.add(new ActionCard("Take No Prisoners", classId, 9));
        return retVal;
    }

}
