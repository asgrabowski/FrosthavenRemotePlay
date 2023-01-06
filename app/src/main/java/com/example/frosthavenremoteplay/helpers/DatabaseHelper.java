package com.example.frosthavenremoteplay.helpers;


import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.example.frosthavenremoteplay.classes.ActionCard;
import com.example.frosthavenremoteplay.classes.Character;
import com.example.frosthavenremoteplay.classes.Class;
import com.example.frosthavenremoteplay.classes.Item;
import com.example.frosthavenremoteplay.classes.ItemType;
import com.example.frosthavenremoteplay.classes.Mastery;
import com.example.frosthavenremoteplay.classes.ModifierCard;
import com.example.frosthavenremoteplay.classes.Perk;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

    private Context _context;
    private Dao<ActionCard, Integer> _actionCardDao = null;
    private Dao<Character, Integer> _characterDao = null;
    private Dao<Class, Integer> _classDao = null;
    private Dao<Item, Integer> _itemDao = null;
    private Dao<ItemType, Integer> _itemTypeDao = null;
    private Dao<ModifierCard, Integer> _modifierCardDao = null;
    private Dao<Perk, Integer> _perkDao = null;
    private Dao<Mastery, Integer> _masteryDao = null;
    private ConnectionSource _connectionSource;

    public DatabaseHelper(Context context) {
        super(context, "frosthaven.db", null, 1);
        _context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase database, ConnectionSource connectionSource) {
        createDatabases(connectionSource);
        _connectionSource = connectionSource;
    }

    @Override
    public void onUpgrade(SQLiteDatabase database, ConnectionSource connectionSource, int oldVersion, int newVersion) {
        createDatabases(connectionSource);
        _connectionSource = connectionSource;
    }

    @Override
    public void close() {
        _actionCardDao = null;
        _characterDao = null;
        _classDao = null;
        _itemDao = null;
        _itemTypeDao = null;
        _modifierCardDao = null;
        _perkDao = null;
        _masteryDao = null;
        DaoManager.clearCache();
        super.close();
    }

    private void createDatabases(ConnectionSource connectionSource) {
        try {
            TableUtils.createTableIfNotExists(connectionSource, ActionCard.class);
            TableUtils.createTableIfNotExists(connectionSource, Character.class);
            TableUtils.createTableIfNotExists(connectionSource, Class.class);
            TableUtils.createTableIfNotExists(connectionSource, Item.class);
            TableUtils.createTableIfNotExists(connectionSource, ItemType.class);
            TableUtils.createTableIfNotExists(connectionSource, ModifierCard.class);
            TableUtils.createTableIfNotExists(connectionSource, Perk.class);
            TableUtils.createTableIfNotExists(connectionSource, Mastery.class);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void populateDatabases() throws SQLException {
        addAllClasses();
        addAllItemTypes();
        addAllItems();
        addAllActionCards();
        addAllMasteries();
        addAllPerks();
        addAllModifierCards();
    }

    public Dao<ActionCard, Integer> getActionCardDao() throws SQLException{
        if (_actionCardDao == null) {
            _actionCardDao = getDao(ActionCard.class);
        }
        return _actionCardDao;
    }

    public Dao<Character, Integer> getCharacterDao() throws SQLException{
        if (_characterDao == null) {
            _characterDao = getDao(Character.class);
        }
        return _characterDao;
    }
    public Dao<Class, Integer> getClassDao() throws SQLException{
        if (_classDao == null) {
            _classDao = getDao(Class.class);
        }
        return _classDao;
    }
    public Dao<Item, Integer> getItemDao() throws SQLException{
        if (_itemDao == null) {
            _itemDao = getDao(Item.class);
        }
        return _itemDao;
    }
    public Dao<ItemType, Integer> getItemTypeDao() throws SQLException{
        if (_itemTypeDao == null) {
            _itemTypeDao = getDao(ItemType.class);
        }
        return _itemTypeDao;
    }
    public Dao<ModifierCard, Integer> getModifierCardDao() throws SQLException{
        if (_modifierCardDao == null) {
            _modifierCardDao = getDao(ModifierCard.class);
        }
        return _modifierCardDao;
    }
    public Dao<Perk, Integer> getPerkDao() throws SQLException{
        if (_perkDao == null) {
            _perkDao = getDao(Perk.class);
        }
        return _perkDao;
    }
    public Dao<Mastery, Integer> getMasteryDao() throws SQLException{
        if (_masteryDao == null) {
            _masteryDao = getDao(Mastery.class);
        }
        return _masteryDao;
    }
    public List<Class> getAllClasses(){
        List<Class> retVal = null;
        try {
            Dao<Class, Integer> classDao = getClassDao();
            retVal = classDao.queryForAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retVal;
    }


    public boolean addClasses(List<Class> newClass){
        boolean retVal = false;
        try{
            if(newClass != null){
                Dao<Class, Integer> patientDao = getClassDao();
                patientDao.create(newClass);
                retVal = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
        return retVal;
    }

    public boolean addCharacter(Character character){
        boolean retVal = false;
        try{
            if(character != null){
                Dao<Character, Integer> characterDao = getCharacterDao();
                characterDao.create(character);
                retVal = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
        return retVal;
    }

    public boolean addActionCards(List<ActionCard> actionCards){
        boolean retVal = false;
        try{
            if(actionCards != null){
                Dao<ActionCard, Integer> actionCardDao = getActionCardDao();
                actionCardDao.create(actionCards);
                retVal = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
        return retVal;
    }

    public boolean addItems(List<Item> items){
        boolean retVal = false;
        try{
            if(items != null){
                Dao<Item, Integer> itemDao = getItemDao();
                itemDao.create(items);
                retVal = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
        return retVal;
    }

    public boolean addItemTypes(List<ItemType> itemTypes){
        boolean retVal = false;
        try{
            if(itemTypes != null){
                Dao<ItemType, Integer> itemTypeDao = getItemTypeDao();
                itemTypeDao.create(itemTypes);
                retVal = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
        return retVal;
    }

    public boolean addModifierCards(List<ModifierCard> modifierCards){
        boolean retVal = false;
        try{
            if(modifierCards != null){
                Dao<ModifierCard, Integer> modifierCardDao = getModifierCardDao();
                modifierCardDao.create(modifierCards);
                retVal = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
        return retVal;
    }

    public boolean addMasteries(List<Mastery> masteries){
        boolean retVal = false;
        try{
            if(masteries != null){
                Dao<Mastery, Integer> masteryDao = getMasteryDao();
                masteryDao.create(masteries);
                retVal = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
        return retVal;
    }

    public boolean addPerks(List<Perk> perks){
        boolean retVal = false;
        try{
            if(perks != null){
                Dao<Perk, Integer> perkDao = getPerkDao();
                perkDao.create(perks);
                retVal = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
        return retVal;
    }

    public void addAllClasses() throws SQLException {
        TableUtils.clearTable(_connectionSource, Class.class);
        List<Class> classes = new ArrayList<>();
        classes.add(new Class("Blink Blade", 8, 9, 11, 12, 14, 15, 17, 18, 20, 10, false, null, "bb_unlocked"));
        addClasses(classes);
    }
    public void addAllActionCards() throws SQLException {
        TableUtils.clearTable(_connectionSource, ActionCard.class);
        List<ActionCard> actionCards;
        ActionCardHelper helper = new ActionCardHelper(this);
        actionCards = helper.GenerateAllCards();
        addActionCards(actionCards);
    }

    public void addAllItems() throws SQLException {
        TableUtils.clearTable(_connectionSource, Item.class);
        List<Item> items = new ArrayList<>();
        //make all items
        addItems(items);
    }

    public void addAllItemTypes() throws SQLException {
        TableUtils.clearTable(_connectionSource, ItemType.class);
        List<ItemType> itemTypes = new ArrayList<>();
        itemTypes.add(new ItemType("Head"));
        itemTypes.add(new ItemType("Body"));
        itemTypes.add(new ItemType("Feet"));
        itemTypes.add(new ItemType("Small"));
        itemTypes.add(new ItemType("One-Hand"));
        itemTypes.add(new ItemType("Two-Hand"));
        addItemTypes(itemTypes);
    }

    public void addAllModifierCards() throws SQLException {
        TableUtils.clearTable(_connectionSource, ModifierCard.class);
        List<ModifierCard> modifierCards = new ArrayList<>();
        ModifierHelper helper = new ModifierHelper(this);
        modifierCards = helper.GenerateAllModifierCards();
        addModifierCards(modifierCards);
    }

    public List<ModifierCard> GetBaseModifierDeck(){
        List<ModifierCard> retVal = new ArrayList<>();
        try {
            ModifierCard queriedCard;
            Dao<ModifierCard, Integer> modifierCardDao = getModifierCardDao();
            QueryBuilder<ModifierCard, Integer> qb = modifierCardDao.queryBuilder();
            qb.where().eq("Name", "Plus Zero");
            queriedCard = qb.queryForFirst();
            retVal.add(queriedCard); //six 0's
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            qb = modifierCardDao.queryBuilder();
            qb.where().eq("Name", "Plus One");
            queriedCard = qb.queryForFirst();
            retVal.add(queriedCard); //five 1's
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            qb.where().eq("Name", "Plus Two");
            queriedCard = qb.queryForFirst();
            retVal.add(queriedCard); //One +2
            qb.where().eq("Name", "Minus One");
            queriedCard = qb.queryForFirst();
            retVal.add(queriedCard); //five -1's
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            retVal.add(queriedCard);
            qb.where().eq("Name", "Minus Two");
            queriedCard = qb.queryForFirst();
            retVal.add(queriedCard); //one -2
            qb.where().eq("Name", "Miss");
            queriedCard = qb.queryForFirst();
            retVal.add(queriedCard); //one miss
            qb.where().eq("Name", "Crit");
            queriedCard = qb.queryForFirst();
            retVal.add(queriedCard); //one crit
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retVal;
    }
    public List<ModifierCard> GetModifierCardsByPerkId(int perkId){
        List<ModifierCard> retVal = new ArrayList<>();
        try {
            Dao<ModifierCard, Integer> modifierCardDao = getModifierCardDao();
            QueryBuilder<ModifierCard, Integer> qb = modifierCardDao.queryBuilder();
            qb.where().eq("PerkId", perkId);
            retVal = qb.query();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retVal;
    }


    public void addAllPerks() throws SQLException {
        TableUtils.clearTable(_connectionSource, Perk.class);
        List<Perk> perks;
        PerkHelper helper = new PerkHelper(this);
        perks = helper.GenerateAllPerks();
        addPerks(perks);
    }

    public void addAllMasteries() throws SQLException {
        TableUtils.clearTable(_connectionSource, Mastery.class);
        List<Mastery> masteries;
        MasteryHelper helper = new MasteryHelper(this);
        masteries = helper.GenerateAllMasteries();
        addMasteries(masteries);
    }


    private void clearORM(DatabaseHelper dbHelper) {
        clearDaoCache();
        if(dbHelper != null) dbHelper.close();
    }

    private void clearDaoCache() {
        DaoManager.clearCache();
    }

    public void deleteCharacter(Character character) {
        try{
            if(character != null){
                Dao<Character, Integer> characterDao = getCharacterDao();
                characterDao.delete(character);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            clearORM(this);
        }
    }

    public int getClassIdByName(String className) {
        int retVal = 0;
        try {
            Dao<Class, Integer> classDao = getClassDao();
            QueryBuilder<Class, Integer> qb = classDao.queryBuilder();
            qb.where().eq("ClassName", className);
            retVal = qb.queryForFirst().getClassId();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retVal;
    }
}