package com.example.frosthavenremoteplay.classes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Locale;

@DatabaseTable(tableName = "ModifierCards")
public class ModifierCard {
    @DatabaseField(columnName = "ModifierCardId", generatedId = true, allowGeneratedIdInsert = true)
    private int ModifierCardId;
    @DatabaseField(columnName = "Name")
    private String Name;
    @DatabaseField(columnName = "ImagePath")
    private String ImagePath;
    @DatabaseField(columnName = "PerkId")
    private int PerkId; //Any modifiers with a PerkId will be added to the deck if that perk is selected
    @DatabaseField(columnName = "ShuffleAtEndOfTurn")
    private boolean ShuffleAtEndOfTurn;

    public ModifierCard(String name, int perkId){
        Name = name;
        PerkId = perkId;
        ImagePath = name.toLowerCase(Locale.ROOT).replace(" ", "");
        ShuffleAtEndOfTurn = name.equals("Miss") || name.equals("Crit");
    }

    public int getModifierCardId() {
        return ModifierCardId;
    }

    public void setModifierCardId(int modifierCardId) {
        ModifierCardId = modifierCardId;
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

    public int getPerkId() {
        return PerkId;
    }

    public void setPerkId(int perkId) {
        PerkId = perkId;
    }
}
