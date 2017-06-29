package comp3350.plantr.business;

import comp3350.plantr.persistence.DatabaseInterface;
import comp3350.plantr.persistence.StubDatabase;

/**
 * 6/6/2017
 * Raman Maan
 * Purpose: This class is the service manager for the Database
 */

public class DatabaseAccess {
	public static final String dbName = "PLANT";
	private static String dbPathName = "database/PLANT";
	private static DatabaseInterface _db = null;

	public static DatabaseInterface open() {
		if (_db == null) {
			_db = new StubDatabase();
		}

		return _db;
	}

	public static void close() {
		if (_db != null) {
			_db.close();
		}

		_db = null;
	}

	public static void setDBPathName(String pathName) {
		System.out.println("Setting DB path to: " + pathName);
		dbPathName = pathName;
	}
}
