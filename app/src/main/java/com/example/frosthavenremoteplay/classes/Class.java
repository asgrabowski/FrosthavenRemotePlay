package com.example.frosthavenremoteplay.classes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Dictionary;
import java.util.List;

@DatabaseTable(tableName = "Classes")
public class Class {
    @DatabaseField(columnName = "ClassId", generatedId = true, allowGeneratedIdInsert = true)
    private int ClassId;
    @DatabaseField (columnName = "ClassName")
    private String ClassName;
    @DatabaseField (columnName = "LevelOneHitPoints")
    private int LevelOneHitPoints;
    @DatabaseField (columnName = "LevelTwoHitPoints")
    private int LevelTwoHitPoints;
    @DatabaseField (columnName = "LevelThreeHitPoints")
    private int LevelThreeHitPoints;
    @DatabaseField (columnName = "LevelFourHitPoints")
    private int LevelFourHitPoints;
    @DatabaseField (columnName = "LevelFiveHitPoints")
    private int LevelFiveHitPoints;
    @DatabaseField (columnName = "LevelSixHitPoints")
    private int LevelSixHitPoints;
    @DatabaseField (columnName = "LevelSevenHitPoints")
    private int LevelSevenHitPoints;
    @DatabaseField (columnName = "LevelEightHitPoints")
    private int LevelEightHitPoints;
    @DatabaseField (columnName = "LevelNineHitPoints")
    private int LevelNineHitPoints;
    @DatabaseField (columnName = "HandSize")
    private int HandSize;
    private List<Mastery> Masteries;
    private List<Integer> AvailablePerks;
    @DatabaseField (columnName = "IsLocked")
    private boolean IsLocked;
    @DatabaseField (columnName = "LockedArt")
    private String LockedArt;
    @DatabaseField (columnName = "UnlockedArt")
    private String UnlockedArt;

    public Class(String className, int levelOneHitPoints, int levelTwoHitPoints, int levelThreeHitPoints, int levelFourHitPoints, int levelFiveHitPoints, int levelSixHitPoints,
                 int levelSevenHitPoints, int levelEightHitPoints, int levelNineHitPoints, int handSize, boolean isLocked, String lockedArt, String unlockedArt){
        ClassName = className;
        LevelOneHitPoints = levelOneHitPoints;
        LevelTwoHitPoints = levelTwoHitPoints;
        LevelThreeHitPoints = levelThreeHitPoints;
        LevelFourHitPoints = levelFourHitPoints;
        LevelFiveHitPoints = levelFiveHitPoints;
        LevelSixHitPoints = levelSixHitPoints;
        LevelSevenHitPoints = levelSevenHitPoints;
        LevelEightHitPoints = levelEightHitPoints;
        LevelNineHitPoints = levelNineHitPoints;
        HandSize = handSize;
        IsLocked = isLocked;
        LockedArt = lockedArt;
        UnlockedArt = unlockedArt;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getLevelOneHitPoints() {
        return LevelOneHitPoints;
    }

    public void setLevelOneHitPoints(int levelOneHitPoints) {
        LevelOneHitPoints = levelOneHitPoints;
    }

    public int getLevelTwoHitPoints() {
        return LevelTwoHitPoints;
    }

    public void setLevelTwoHitPoints(int levelTwoHitPoints) {
        LevelTwoHitPoints = levelTwoHitPoints;
    }

    public int getLevelThreeHitPoints() {
        return LevelThreeHitPoints;
    }

    public void setLevelThreeHitPoints(int levelThreeHitPoints) {
        LevelThreeHitPoints = levelThreeHitPoints;
    }

    public int getLevelFourHitPoints() {
        return LevelFourHitPoints;
    }

    public void setLevelFourHitPoints(int levelFourHitPoints) {
        LevelFourHitPoints = levelFourHitPoints;
    }

    public int getLevelFiveHitPoints() {
        return LevelFiveHitPoints;
    }

    public void setLevelFiveHitPoints(int levelFiveHitPoints) {
        LevelFiveHitPoints = levelFiveHitPoints;
    }

    public int getLevelSixHitPoints() {
        return LevelSixHitPoints;
    }

    public void setLevelSixHitPoints(int levelSixHitPoints) {
        LevelSixHitPoints = levelSixHitPoints;
    }

    public int getLevelSevenHitPoints() {
        return LevelSevenHitPoints;
    }

    public void setLevelSevenHitPoints(int levelSevenHitPoints) {
        LevelSevenHitPoints = levelSevenHitPoints;
    }

    public int getLevelEightHitPoints() {
        return LevelEightHitPoints;
    }

    public void setLevelEightHitPoints(int levelEightHitPoints) {
        LevelEightHitPoints = levelEightHitPoints;
    }

    public int getLevelNineHitPoints() {
        return LevelNineHitPoints;
    }

    public void setLevelNineHitPoints(int levelNineHitPoints) {
        LevelNineHitPoints = levelNineHitPoints;
    }

    public int getHandSize() {
        return HandSize;
    }

    public void setHandSize(int handSize) {
        HandSize = handSize;
    }

    public List<Integer> getAvailablePerks() {
        return AvailablePerks;
    }

    public void setAvailablePerks(List<Integer> availablePerks) {
        AvailablePerks = availablePerks;
    }

    public List<Mastery> getMasteries() {
        return Masteries;
    }

    public void setMasteries(List<Mastery> masteries) {
        Masteries = masteries;
    }

    public boolean isLocked() {
        return IsLocked;
    }

    public void setLocked(boolean locked) {
        IsLocked = locked;
    }

    public String getLockedArt() {
        return LockedArt;
    }

    public void setLockedArt(String lockedArt) {
        LockedArt = lockedArt;
    }

    public String getUnlockedArt() {
        return UnlockedArt;
    }

    public void setUnlockedArt(String unlockedArt) {
        UnlockedArt = unlockedArt;
    }
}
