package com.example.frosthavenremoteplay.classes;

import com.j256.ormlite.field.DatabaseField;

public class Mastery {
    @DatabaseField(columnName = "MasteryId", generatedId = true, allowGeneratedIdInsert = true)
    private int MasteryId;
    @DatabaseField (columnName = "ClassId")
    private int ClassId;
    @DatabaseField (columnName = "Description")
    private String Description;

    public Mastery(int classId, String description){
        ClassId = classId;
        Description = description;
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

    public int getMasteryId() {
        return MasteryId;
    }

    public void setMasteryId(int masteryId) {
        MasteryId = masteryId;
    }
}
