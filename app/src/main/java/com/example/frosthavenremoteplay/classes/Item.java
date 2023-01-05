package com.example.frosthavenremoteplay.classes;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Items")
public class Item {
    @DatabaseField(columnName = "ItemId", generatedId = true, allowGeneratedIdInsert = true)
    private int ItemId;
    @DatabaseField (columnName = "Name")
    private String Name;
    @DatabaseField (columnName = "ImagePath")
    private String ImagePath;
    @DatabaseField (columnName = "IsRefreshable")
    private boolean IsRefreshable;
    @DatabaseField (columnName = "NumberOfUses")
    private int NumberOfUses;
    @DatabaseField (columnName = "ItemTypeId")
    private int ItemTypeId;

    public String getImagePath() {
        return ImagePath;
    }

    public void setImagePath(String imagePath) {
        ImagePath = imagePath;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getItemId() {
        return ItemId;
    }

    public void setItemId(int itemId) {
        ItemId = itemId;
    }

    public boolean isRefreshable() {
        return IsRefreshable;
    }

    public void setRefreshable(boolean refreshable) {
        IsRefreshable = refreshable;
    }

    public int getNumberOfUses() {
        return NumberOfUses;
    }

    public void setNumberOfUses(int numberOfUses) {
        NumberOfUses = numberOfUses;
    }

    public int getItemTypeId() {
        return ItemTypeId;
    }

    public void setItemTypeId(int itemTypeId) {
        ItemTypeId = itemTypeId;
    }
}
