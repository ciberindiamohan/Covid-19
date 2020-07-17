package com.mohann.covid19.room;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.mohann.covid19.room.model.DistrictWiseModel;
import com.mohann.covid19.room.model.RegisterUserModel;
import com.mohann.covid19.room.model.StateWiseModel;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CovidDao_Impl implements CovidDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RegisterUserModel> __insertionAdapterOfRegisterUserModel;

  private final EntityInsertionAdapter<StateWiseModel> __insertionAdapterOfStateWiseModel;

  private final EntityInsertionAdapter<DistrictWiseModel> __insertionAdapterOfDistrictWiseModel;

  private final SharedSQLiteStatement __preparedStmtOfDeleteStateWiseData;

  private final SharedSQLiteStatement __preparedStmtOfDeleteDistrictWiseData;

  public CovidDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRegisterUserModel = new EntityInsertionAdapter<RegisterUserModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `register` (`firstName`,`lastName`,`password`,`emailId`,`phoneNo`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RegisterUserModel value) {
        if (value.getFirstName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFirstName());
        }
        if (value.getLastName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLastName());
        }
        if (value.getPassword() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPassword());
        }
        if (value.getEmailID() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmailID());
        }
        if (value.getPhoneNo() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getPhoneNo());
        }
      }
    };
    this.__insertionAdapterOfStateWiseModel = new EntityInsertionAdapter<StateWiseModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `statewise` (`id`,`active`,`confirmed`,`deaths`,`deltaconfirmed`,`deltadeaths`,`deltarecovered`,`lastupdatedtime`,`migratedother`,`recovered`,`state`,`statecode`,`statenotes`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, StateWiseModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getActive() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getActive());
        }
        if (value.getConfirmed() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getConfirmed());
        }
        if (value.getDeaths() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDeaths());
        }
        if (value.getDeltaconfirmed() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDeltaconfirmed());
        }
        if (value.getDeltadeaths() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDeltadeaths());
        }
        if (value.getDeltarecovered() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getDeltarecovered());
        }
        if (value.getLastupdatedtime() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLastupdatedtime());
        }
        if (value.getMigratedother() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getMigratedother());
        }
        if (value.getRecovered() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getRecovered());
        }
        if (value.getState() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getState());
        }
        if (value.getStatecode() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getStatecode());
        }
        if (value.getStatenotes() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getStatenotes());
        }
      }
    };
    this.__insertionAdapterOfDistrictWiseModel = new EntityInsertionAdapter<DistrictWiseModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `districtwise` (`id`,`stateName`,`stateCode`,`districtName`,`active`,`confirmed`,`deceased`,`recovered`,`deltaConfirmed`,`deltaDeceased`,`deltaRecovered`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DistrictWiseModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getStateName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getStateName());
        }
        if (value.getStateCode() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getStateCode());
        }
        if (value.getDistrictName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDistrictName());
        }
        stmt.bindLong(5, value.getActive());
        stmt.bindLong(6, value.getConfirmed());
        stmt.bindLong(7, value.getDeceased());
        stmt.bindLong(8, value.getRecovered());
        stmt.bindLong(9, value.getDeltaConfirmed());
        stmt.bindLong(10, value.getDeltaDeceased());
        stmt.bindLong(11, value.getDeltaRecovered());
      }
    };
    this.__preparedStmtOfDeleteStateWiseData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM statewise ";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteDistrictWiseData = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM districtwise ";
        return _query;
      }
    };
  }

  @Override
  public Completable registerUser(final RegisterUserModel registerUserModel) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRegisterUserModel.insert(registerUserModel);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertStateWiseData(final List<StateWiseModel> stateWiseModels) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfStateWiseModel.insert(stateWiseModels);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable insertDistrictWiseData(final List<DistrictWiseModel> stateWiseModels) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDistrictWiseModel.insert(stateWiseModels);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
  }

  @Override
  public Completable deleteStateWiseData() {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteStateWiseData.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteStateWiseData.release(_stmt);
        }
      }
    });
  }

  @Override
  public Completable deleteDistrictWiseData() {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteDistrictWiseData.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteDistrictWiseData.release(_stmt);
        }
      }
    });
  }

  @Override
  public Maybe<List<RegisterUserModel>> getSpecifiedUser(final String emailId) {
    final String _sql = "select * from register where emailId= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (emailId == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, emailId);
    }
    return Maybe.fromCallable(new Callable<List<RegisterUserModel>>() {
      @Override
      public List<RegisterUserModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "firstName");
          final int _cursorIndexOfLastName = CursorUtil.getColumnIndexOrThrow(_cursor, "lastName");
          final int _cursorIndexOfPassword = CursorUtil.getColumnIndexOrThrow(_cursor, "password");
          final int _cursorIndexOfEmailID = CursorUtil.getColumnIndexOrThrow(_cursor, "emailId");
          final int _cursorIndexOfPhoneNo = CursorUtil.getColumnIndexOrThrow(_cursor, "phoneNo");
          final List<RegisterUserModel> _result = new ArrayList<RegisterUserModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RegisterUserModel _item;
            final String _tmpFirstName;
            _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
            final String _tmpLastName;
            _tmpLastName = _cursor.getString(_cursorIndexOfLastName);
            final String _tmpPassword;
            _tmpPassword = _cursor.getString(_cursorIndexOfPassword);
            final String _tmpEmailID;
            _tmpEmailID = _cursor.getString(_cursorIndexOfEmailID);
            final String _tmpPhoneNo;
            _tmpPhoneNo = _cursor.getString(_cursorIndexOfPhoneNo);
            _item = new RegisterUserModel(_tmpFirstName,_tmpLastName,_tmpPassword,_tmpEmailID,_tmpPhoneNo);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Maybe<List<StateWiseModel>> getStateWiseData() {
    final String _sql = "SELECT * FROM statewise";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return Maybe.fromCallable(new Callable<List<StateWiseModel>>() {
      @Override
      public List<StateWiseModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final int _cursorIndexOfConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "confirmed");
          final int _cursorIndexOfDeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "deaths");
          final int _cursorIndexOfDeltaconfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "deltaconfirmed");
          final int _cursorIndexOfDeltadeaths = CursorUtil.getColumnIndexOrThrow(_cursor, "deltadeaths");
          final int _cursorIndexOfDeltarecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "deltarecovered");
          final int _cursorIndexOfLastupdatedtime = CursorUtil.getColumnIndexOrThrow(_cursor, "lastupdatedtime");
          final int _cursorIndexOfMigratedother = CursorUtil.getColumnIndexOrThrow(_cursor, "migratedother");
          final int _cursorIndexOfRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "recovered");
          final int _cursorIndexOfState = CursorUtil.getColumnIndexOrThrow(_cursor, "state");
          final int _cursorIndexOfStatecode = CursorUtil.getColumnIndexOrThrow(_cursor, "statecode");
          final int _cursorIndexOfStatenotes = CursorUtil.getColumnIndexOrThrow(_cursor, "statenotes");
          final List<StateWiseModel> _result = new ArrayList<StateWiseModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final StateWiseModel _item;
            final String _tmpActive;
            _tmpActive = _cursor.getString(_cursorIndexOfActive);
            final String _tmpConfirmed;
            _tmpConfirmed = _cursor.getString(_cursorIndexOfConfirmed);
            final String _tmpDeaths;
            _tmpDeaths = _cursor.getString(_cursorIndexOfDeaths);
            final String _tmpDeltaconfirmed;
            _tmpDeltaconfirmed = _cursor.getString(_cursorIndexOfDeltaconfirmed);
            final String _tmpDeltadeaths;
            _tmpDeltadeaths = _cursor.getString(_cursorIndexOfDeltadeaths);
            final String _tmpDeltarecovered;
            _tmpDeltarecovered = _cursor.getString(_cursorIndexOfDeltarecovered);
            final String _tmpLastupdatedtime;
            _tmpLastupdatedtime = _cursor.getString(_cursorIndexOfLastupdatedtime);
            final String _tmpMigratedother;
            _tmpMigratedother = _cursor.getString(_cursorIndexOfMigratedother);
            final String _tmpRecovered;
            _tmpRecovered = _cursor.getString(_cursorIndexOfRecovered);
            final String _tmpState;
            _tmpState = _cursor.getString(_cursorIndexOfState);
            final String _tmpStatecode;
            _tmpStatecode = _cursor.getString(_cursorIndexOfStatecode);
            final String _tmpStatenotes;
            _tmpStatenotes = _cursor.getString(_cursorIndexOfStatenotes);
            _item = new StateWiseModel(_tmpActive,_tmpConfirmed,_tmpDeaths,_tmpDeltaconfirmed,_tmpDeltadeaths,_tmpDeltarecovered,_tmpLastupdatedtime,_tmpMigratedother,_tmpRecovered,_tmpState,_tmpStatecode,_tmpStatenotes);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Maybe<List<DistrictWiseModel>> getDistrictWiseData(final String stateCode) {
    final String _sql = "SELECT * FROM districtwise where stateCode= ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (stateCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, stateCode);
    }
    return Maybe.fromCallable(new Callable<List<DistrictWiseModel>>() {
      @Override
      public List<DistrictWiseModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfStateName = CursorUtil.getColumnIndexOrThrow(_cursor, "stateName");
          final int _cursorIndexOfStateCode = CursorUtil.getColumnIndexOrThrow(_cursor, "stateCode");
          final int _cursorIndexOfDistrictName = CursorUtil.getColumnIndexOrThrow(_cursor, "districtName");
          final int _cursorIndexOfActive = CursorUtil.getColumnIndexOrThrow(_cursor, "active");
          final int _cursorIndexOfConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "confirmed");
          final int _cursorIndexOfDeceased = CursorUtil.getColumnIndexOrThrow(_cursor, "deceased");
          final int _cursorIndexOfRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "recovered");
          final int _cursorIndexOfDeltaConfirmed = CursorUtil.getColumnIndexOrThrow(_cursor, "deltaConfirmed");
          final int _cursorIndexOfDeltaDeceased = CursorUtil.getColumnIndexOrThrow(_cursor, "deltaDeceased");
          final int _cursorIndexOfDeltaRecovered = CursorUtil.getColumnIndexOrThrow(_cursor, "deltaRecovered");
          final List<DistrictWiseModel> _result = new ArrayList<DistrictWiseModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DistrictWiseModel _item;
            final String _tmpStateName;
            _tmpStateName = _cursor.getString(_cursorIndexOfStateName);
            final String _tmpStateCode;
            _tmpStateCode = _cursor.getString(_cursorIndexOfStateCode);
            final String _tmpDistrictName;
            _tmpDistrictName = _cursor.getString(_cursorIndexOfDistrictName);
            final int _tmpActive;
            _tmpActive = _cursor.getInt(_cursorIndexOfActive);
            final int _tmpConfirmed;
            _tmpConfirmed = _cursor.getInt(_cursorIndexOfConfirmed);
            final int _tmpDeceased;
            _tmpDeceased = _cursor.getInt(_cursorIndexOfDeceased);
            final int _tmpRecovered;
            _tmpRecovered = _cursor.getInt(_cursorIndexOfRecovered);
            final int _tmpDeltaConfirmed;
            _tmpDeltaConfirmed = _cursor.getInt(_cursorIndexOfDeltaConfirmed);
            final int _tmpDeltaDeceased;
            _tmpDeltaDeceased = _cursor.getInt(_cursorIndexOfDeltaDeceased);
            final int _tmpDeltaRecovered;
            _tmpDeltaRecovered = _cursor.getInt(_cursorIndexOfDeltaRecovered);
            _item = new DistrictWiseModel(_tmpStateName,_tmpStateCode,_tmpDistrictName,_tmpActive,_tmpConfirmed,_tmpDeceased,_tmpRecovered,_tmpDeltaConfirmed,_tmpDeltaDeceased,_tmpDeltaRecovered);
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }
}
