package com.example.frosthavenremoteplay.classes;

import java.util.List;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = "Characters")
public class Character {

    @DatabaseField (columnName = "CharacterId", generatedId = true, allowGeneratedIdInsert = true)
    private int CharacterId;

    @DatabaseField (columnName = "CharacterName")
    private String CharacterName;

    @DatabaseField (columnName = "ClassName")
    private String ClassName;
    @DatabaseField (columnName = "ClassId")
    private int ClassId;
    @DatabaseField (columnName = "Level")
    private int Level;
    @DatabaseField (columnName = "Experience")
    private int Experience;
    @DatabaseField (columnName = "Gold")
    private int Gold;
    @DatabaseField (columnName = "CurrentHitPoints")
    private int CurrentHitPoints;
    @DatabaseField (columnName = "MaximumHitPoints")
    private int MaximumHitPoints;
    @DatabaseField (columnName = "AvailableCardsStr")
    private String AvailableCardsStr;
    private List<ActionCard> AvailableCards;
    private List<ActionCard> CardsForScenario;
    @DatabaseField (columnName = "AvailableItemsStr")
    private String AvailableItemsStr;
    private List<Item> Items;
    private List<Item> ItemsForScenario;
    @DatabaseField (columnName = "PerksStr")
    private String PerksStr;
    private List<Perk> Perks;
    @DatabaseField (columnName = "Checks")
    private int Checks;
    private List<ModifierCard> ModifierCards;
    private List<Mastery> Masteries;
    @DatabaseField (columnName = "CompletedMasteriesStr")
    private String CompletedMasteriesStr;



    public String getCharacterName() {
        return CharacterName;
    }

    public void setCharacterName(String characterName) {
        CharacterName = characterName;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public int getLevel() {
        return Level;
    }

    public void setLevel(int level) {
        Level = level;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public int getGold() {
        return Gold;
    }

    public void setGold(int gold) {
        Gold = gold;
    }

    public int getCurrentHitPoints() {
        return CurrentHitPoints;
    }

    public void setCurrentHitPoints(int currentHitPoints) {
        CurrentHitPoints = currentHitPoints;
    }

    public int getMaximumHitPoints() {
        return MaximumHitPoints;
    }

    public void setMaximumHitPoints(int maximumHitPoints) {
        MaximumHitPoints = maximumHitPoints;
    }

    public int getClassId() {
        return ClassId;
    }

    public void setClassId(int classId) {
        ClassId = classId;
    }

    public int getCharacterId() {
        return CharacterId;
    }

    public void setCharacterId(int characterId) {
        CharacterId = characterId;
    }

    public String getAvailableCardsStr() {
        return AvailableCardsStr;
    }

    public void setAvailableCardsStr(String availableCardsStr) {
        AvailableCardsStr = availableCardsStr;
    }

    public void setItemsStr(String itemsStr) {
        AvailableItemsStr = itemsStr;
    }

    public String getItemsStr() {
        return AvailableItemsStr;
    }

    public List<Item> getItems() {
        return Items;
    }

    public void setItems(List<Item> items) {
        Items = items;
    }

    public List<ActionCard> getAvailableCards() {
        return AvailableCards;
    }

    public void setAvailableCards(List<ActionCard> availableCards) {
        AvailableCards = availableCards;
    }

    public List<ActionCard> getCardsForScenario() {
        return CardsForScenario;
    }

    public void setCardsForScenario(List<ActionCard> cardsForScenario) {
        CardsForScenario = cardsForScenario;
    }

    public List<Item> getItemsForScenario() {
        return ItemsForScenario;
    }

    public void setItemsForScenario(List<Item> itemsForScenario) {
        ItemsForScenario = itemsForScenario;
    }

    public String getPerksStr() {
        return PerksStr;
    }

    public void setPerksStr(String perksStr) {
        PerksStr = perksStr;
    }

    public List<Perk> getPerks() {
        return Perks;
    }

    public void setPerks(List<Perk> perks) {
        Perks = perks;
    }

    public int getChecks() {
        return Checks;
    }

    public void setChecks(int checks) {
        Checks = checks;
    }

    public List<ModifierCard> getModifierCards() {
        return ModifierCards;
    }

    public void setModifierCards(List<ModifierCard> modifierCards) {
        ModifierCards = modifierCards;
    }

    public List<Mastery> getMasteries() {
        return Masteries;
    }

    public void setMasteries(List<Mastery> masteries) {
        Masteries = masteries;
    }

    public String getCompletedMasteriesStr() {
        return CompletedMasteriesStr;
    }

    public void setCompletedMasteriesStr(String completedMasteriesStr) {
        CompletedMasteriesStr = completedMasteriesStr;
    }
}
