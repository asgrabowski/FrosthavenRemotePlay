package com.example.frosthavenremoteplay.classes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Locale;

@DatabaseTable(tableName = "ActionCards")
public class ActionCard {
    @DatabaseField(columnName = "ActionCardId", generatedId = true, allowGeneratedIdInsert = true)
    private int ActionCardId;
    @DatabaseField (columnName = "Name")
    private String Name;
    @DatabaseField (columnName = "ImagePath")
    private String ImagePath;
    @DatabaseField (columnName = "ClassId")
    private int ClassId;
    @DatabaseField (columnName = "CardLevel")
    private int CardLevel;

    public ActionCard(String name, int classId, int cardLevel){
        Name = name;
        ImagePath = "__"+name.toLowerCase(Locale.ROOT).replace(" ", "")+".png";
        ClassId = classId;
        CardLevel = cardLevel;
    }

    public int getActionCardId() {
        return ActionCardId;
    }

    public void setActionCardId(int actionCardId) {
        ActionCardId = actionCardId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }

    public int getCardLevel() {
        return CardLevel;
    }

    public void setCardLevel(int cardLevel) {
        CardLevel = cardLevel;
    }
}
