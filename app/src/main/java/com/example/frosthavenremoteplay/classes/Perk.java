package com.example.frosthavenremoteplay.classes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Perks")
public class Perk {
    @DatabaseField(columnName = "PerkId", generatedId = true, allowGeneratedIdInsert = true)
    private int PerkId;
    @DatabaseField(columnName = "ClassId")
    private int ClassId;
    @DatabaseField(columnName = "Description")
    private String Description;
    @DatabaseField(columnName = "NegativeTwoChangeCount")
    private int NegativeTwoChangeCount;
    @DatabaseField(columnName = "NegativeOneChangeCount")//Can be negative to denote removal, positive addition
    private int NegativeOneChangeCount;
    @DatabaseField(columnName = "ZeroChangeCount")
    private int ZeroChangeCount;
    @DatabaseField(columnName = "PositiveOneChangeCount")
    private int PositiveOneChangeCount;
    @DatabaseField(columnName = "PositiveTwoChangeCount")
    private int PositiveTwoChangeCount;
    @DatabaseField(columnName = "PerkPointsRequired")
    private int PerkPointsRequired;
    @DatabaseField(columnName = "TimesRepeatable")
    private int TimesRepeatable;
    private int TimesTaken; //Determined by number of times perk id appears in perk string

    public Perk(int classId, String description, int negativeTwoChangeCount, int negativeOneChangeCount, int zeroChangeCount, int positiveOneChangeCount, int positiveTwoChangeCount, int perkPointsRequired, int timesRepeatable){
        ClassId = classId;
        Description = description;
        NegativeOneChangeCount = negativeOneChangeCount;
        NegativeTwoChangeCount = negativeTwoChangeCount;
        ZeroChangeCount = zeroChangeCount;
        PositiveOneChangeCount = positiveOneChangeCount;
        PositiveTwoChangeCount = positiveTwoChangeCount;
        PerkPointsRequired = perkPointsRequired;
        TimesRepeatable = timesRepeatable;
    }

    public int getPerkId() {
        return PerkId;
    }

    public void setPerkId(int perkId) {
        PerkId = perkId;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getNegativeTwoChangeCount() {
        return NegativeTwoChangeCount;
    }

    public void setNegativeTwoChangeCount(int negativeTwoChangeCount) {
        NegativeTwoChangeCount = negativeTwoChangeCount;
    }

    public int getNegativeOneChangeCount() {
        return NegativeOneChangeCount;
    }

    public void setNegativeOneChangeCount(int negativeOneChangeCount) {
        NegativeOneChangeCount = negativeOneChangeCount;
    }

    public int getZeroChangeCount() {
        return ZeroChangeCount;
    }

    public void setZeroChangeCount(int zeroChangeCount) {
        ZeroChangeCount = zeroChangeCount;
    }

    public int getPositiveOneChangeCount() {
        return PositiveOneChangeCount;
    }

    public void setPositiveOneChangeCount(int positiveOneChangeCount) {
        PositiveOneChangeCount = positiveOneChangeCount;
    }

    public int getPositiveTwoChangeCount() {
        return PositiveTwoChangeCount;
    }

    public void setPositiveTwoChangeCount(int positiveTwoChangeCount) {
        PositiveTwoChangeCount = positiveTwoChangeCount;
    }

    public int getPerkPointsRequired() {
        return PerkPointsRequired;
    }

    public void setPerkPointsRequired(int perkPointsRequired) {
        PerkPointsRequired = perkPointsRequired;
    }

    public int getTimesRepeatable() {
        return TimesRepeatable;
    }

    public void setTimesRepeatable(int timesRepeatable) {
        TimesRepeatable = timesRepeatable;
    }

    public int getTimesTaken() {
        return TimesTaken;
    }

    public void setTimesTaken(int timesTaken) {
        TimesTaken = timesTaken;
    }
}
