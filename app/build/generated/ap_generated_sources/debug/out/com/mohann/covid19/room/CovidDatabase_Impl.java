package com.mohann.covid19.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CovidDatabase_Impl extends CovidDatabase {
  private volatile CovidDao _covidDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(4) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `districtwise` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `stateName` TEXT, `stateCode` TEXT, `districtName` TEXT, `active` INTEGER NOT NULL, `confirmed` INTEGER NOT NULL, `deceased` INTEGER NOT NULL, `recovered` INTEGER NOT NULL, `deltaConfirmed` INTEGER NOT NULL, `deltaDeceased` INTEGER NOT NULL, `deltaRecovered` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `register` (`firstName` TEXT, `lastName` TEXT, `password` TEXT, `emailId` TEXT NOT NULL, `phoneNo` TEXT, PRIMARY KEY(`emailId`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `casestimeseries` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dailyconfirmed` TEXT, `dailydeceased` TEXT, `dailyrecovered` TEXT, `date` TEXT, `totalconfirmed` TEXT, `totaldeceased` TEXT, `totalrecovered` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `statewise` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `active` TEXT, `confirmed` TEXT, `deaths` TEXT, `deltaconfirmed` TEXT, `deltadeaths` TEXT, `deltarecovered` TEXT, `lastupdatedtime` TEXT, `migratedother` TEXT, `recovered` TEXT, `state` TEXT, `statecode` TEXT, `statenotes` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `tested` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `individualstestedperconfirmedcase` TEXT, `positivecasesfromsamplesreported` TEXT, `samplereportedtoday` TEXT, `source` TEXT, `testpositivityrate` TEXT, `testsconductedbyprivatelabs` TEXT, `testsperconfirmedcase` TEXT, `testspermillion` TEXT, `totalindividualstested` TEXT, `totalpositivecases` TEXT, `totalsamplestested` TEXT, `updatetimestamp` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'ce53b46448d72626c9015b36f5417b99')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `districtwise`");
        _db.execSQL("DROP TABLE IF EXISTS `register`");
        _db.execSQL("DROP TABLE IF EXISTS `casestimeseries`");
        _db.execSQL("DROP TABLE IF EXISTS `statewise`");
        _db.execSQL("DROP TABLE IF EXISTS `tested`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsDistrictwise = new HashMap<String, TableInfo.Column>(11);
        _columnsDistrictwise.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("stateName", new TableInfo.Column("stateName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("stateCode", new TableInfo.Column("stateCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("districtName", new TableInfo.Column("districtName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("active", new TableInfo.Column("active", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("confirmed", new TableInfo.Column("confirmed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("deceased", new TableInfo.Column("deceased", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("recovered", new TableInfo.Column("recovered", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("deltaConfirmed", new TableInfo.Column("deltaConfirmed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("deltaDeceased", new TableInfo.Column("deltaDeceased", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsDistrictwise.put("deltaRecovered", new TableInfo.Column("deltaRecovered", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysDistrictwise = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesDistrictwise = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoDistrictwise = new TableInfo("districtwise", _columnsDistrictwise, _foreignKeysDistrictwise, _indicesDistrictwise);
        final TableInfo _existingDistrictwise = TableInfo.read(_db, "districtwise");
        if (! _infoDistrictwise.equals(_existingDistrictwise)) {
          return new RoomOpenHelper.ValidationResult(false, "districtwise(com.mohann.covid19.room.model.DistrictWiseModel).\n"
                  + " Expected:\n" + _infoDistrictwise + "\n"
                  + " Found:\n" + _existingDistrictwise);
        }
        final HashMap<String, TableInfo.Column> _columnsRegister = new HashMap<String, TableInfo.Column>(5);
        _columnsRegister.put("firstName", new TableInfo.Column("firstName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegister.put("lastName", new TableInfo.Column("lastName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegister.put("password", new TableInfo.Column("password", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegister.put("emailId", new TableInfo.Column("emailId", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRegister.put("phoneNo", new TableInfo.Column("phoneNo", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRegister = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRegister = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRegister = new TableInfo("register", _columnsRegister, _foreignKeysRegister, _indicesRegister);
        final TableInfo _existingRegister = TableInfo.read(_db, "register");
        if (! _infoRegister.equals(_existingRegister)) {
          return new RoomOpenHelper.ValidationResult(false, "register(com.mohann.covid19.room.model.RegisterUserModel).\n"
                  + " Expected:\n" + _infoRegister + "\n"
                  + " Found:\n" + _existingRegister);
        }
        final HashMap<String, TableInfo.Column> _columnsCasestimeseries = new HashMap<String, TableInfo.Column>(8);
        _columnsCasestimeseries.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasestimeseries.put("dailyconfirmed", new TableInfo.Column("dailyconfirmed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasestimeseries.put("dailydeceased", new TableInfo.Column("dailydeceased", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasestimeseries.put("dailyrecovered", new TableInfo.Column("dailyrecovered", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasestimeseries.put("date", new TableInfo.Column("date", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasestimeseries.put("totalconfirmed", new TableInfo.Column("totalconfirmed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasestimeseries.put("totaldeceased", new TableInfo.Column("totaldeceased", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCasestimeseries.put("totalrecovered", new TableInfo.Column("totalrecovered", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCasestimeseries = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCasestimeseries = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCasestimeseries = new TableInfo("casestimeseries", _columnsCasestimeseries, _foreignKeysCasestimeseries, _indicesCasestimeseries);
        final TableInfo _existingCasestimeseries = TableInfo.read(_db, "casestimeseries");
        if (! _infoCasestimeseries.equals(_existingCasestimeseries)) {
          return new RoomOpenHelper.ValidationResult(false, "casestimeseries(com.mohann.covid19.room.model.CasesTimeSeriesModel).\n"
                  + " Expected:\n" + _infoCasestimeseries + "\n"
                  + " Found:\n" + _existingCasestimeseries);
        }
        final HashMap<String, TableInfo.Column> _columnsStatewise = new HashMap<String, TableInfo.Column>(13);
        _columnsStatewise.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("active", new TableInfo.Column("active", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("confirmed", new TableInfo.Column("confirmed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("deaths", new TableInfo.Column("deaths", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("deltaconfirmed", new TableInfo.Column("deltaconfirmed", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("deltadeaths", new TableInfo.Column("deltadeaths", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("deltarecovered", new TableInfo.Column("deltarecovered", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("lastupdatedtime", new TableInfo.Column("lastupdatedtime", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("migratedother", new TableInfo.Column("migratedother", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("recovered", new TableInfo.Column("recovered", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("state", new TableInfo.Column("state", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("statecode", new TableInfo.Column("statecode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsStatewise.put("statenotes", new TableInfo.Column("statenotes", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysStatewise = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesStatewise = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoStatewise = new TableInfo("statewise", _columnsStatewise, _foreignKeysStatewise, _indicesStatewise);
        final TableInfo _existingStatewise = TableInfo.read(_db, "statewise");
        if (! _infoStatewise.equals(_existingStatewise)) {
          return new RoomOpenHelper.ValidationResult(false, "statewise(com.mohann.covid19.room.model.StateWiseModel).\n"
                  + " Expected:\n" + _infoStatewise + "\n"
                  + " Found:\n" + _existingStatewise);
        }
        final HashMap<String, TableInfo.Column> _columnsTested = new HashMap<String, TableInfo.Column>(13);
        _columnsTested.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("individualstestedperconfirmedcase", new TableInfo.Column("individualstestedperconfirmedcase", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("positivecasesfromsamplesreported", new TableInfo.Column("positivecasesfromsamplesreported", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("samplereportedtoday", new TableInfo.Column("samplereportedtoday", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("source", new TableInfo.Column("source", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("testpositivityrate", new TableInfo.Column("testpositivityrate", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("testsconductedbyprivatelabs", new TableInfo.Column("testsconductedbyprivatelabs", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("testsperconfirmedcase", new TableInfo.Column("testsperconfirmedcase", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("testspermillion", new TableInfo.Column("testspermillion", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("totalindividualstested", new TableInfo.Column("totalindividualstested", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("totalpositivecases", new TableInfo.Column("totalpositivecases", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("totalsamplestested", new TableInfo.Column("totalsamplestested", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsTested.put("updatetimestamp", new TableInfo.Column("updatetimestamp", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTested = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTested = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTested = new TableInfo("tested", _columnsTested, _foreignKeysTested, _indicesTested);
        final TableInfo _existingTested = TableInfo.read(_db, "tested");
        if (! _infoTested.equals(_existingTested)) {
          return new RoomOpenHelper.ValidationResult(false, "tested(com.mohann.covid19.room.model.TestedModel).\n"
                  + " Expected:\n" + _infoTested + "\n"
                  + " Found:\n" + _existingTested);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "ce53b46448d72626c9015b36f5417b99", "4fdac45e81f523ef1e536262669a823a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "districtwise","register","casestimeseries","statewise","tested");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `districtwise`");
      _db.execSQL("DELETE FROM `register`");
      _db.execSQL("DELETE FROM `casestimeseries`");
      _db.execSQL("DELETE FROM `statewise`");
      _db.execSQL("DELETE FROM `tested`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CovidDao covidDao() {
    if (_covidDao != null) {
      return _covidDao;
    } else {
      synchronized(this) {
        if(_covidDao == null) {
          _covidDao = new CovidDao_Impl(this);
        }
        return _covidDao;
      }
    }
  }
}
