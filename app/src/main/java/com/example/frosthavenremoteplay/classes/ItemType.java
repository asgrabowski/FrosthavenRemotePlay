package com.example.frosthavenremoteplay.classes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "ItemTypes")
public class ItemType {
    @DatabaseField(columnName = "ItemTypeId", generatedId = true, allowGeneratedIdInsert = true)
    private int ItemTypeId;
    @DatabaseField(columnName = "Name")
    private String Name; //head, body, one hand, two hand, etc

    public ItemType (String name){
        Name = name;
    }

    public int getItemTypeId() {
        return ItemTypeId;
    }

    public void setItemTypeId(int itemTypeId) {
        ItemTypeId = itemTypeId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
