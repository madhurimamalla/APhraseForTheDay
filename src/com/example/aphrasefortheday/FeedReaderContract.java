package com.example.aphrasefortheday;
import android.provider.BaseColumns;
import android.database.sqlite;


public class FeedReaderContract {
	
	public static abstract class FeedEntry implements BaseColumns {
	public static final String TABLE_NAME = "phrase";
	public static final String COLUMN_NAME_PHRASE_ID = "phraseid";
    public static final String COLUMN_NAME_CATEGORY = "category";
    public static final String COLUMN_NAME_SUBCATEGORY = "subcategory";
    public static final String COLUMN_NAME_TAG1 = "tag1";
    public static final String COLUMN_NAME_TAG2 = "tag2";
    		}
	
	private FeedReaderContract() {}
	
	private static final String TEXT_TYPE = " TEXT";
	private static final String COMMA_SEP = ",";
	private static final String SQL_CREATE_ENTRIES =
	    "CREATE TABLE " + FeedReaderContract.FeedEntry.TABLE_NAME + " (" +
	    FeedReaderContract.FeedEntry._ID + " INTEGER PRIMARY KEY," +
	    FeedReaderContract.FeedEntry.COLUMN_NAME_PHRASE_ID + TEXT_TYPE + COMMA_SEP +
	    FeedReaderContract.FeedEntry.COLUMN_NAME_CATEGORY + TEXT_TYPE + COMMA_SEP +
	    FeedReaderContract.FeedEntry.COLUMN_NAME_SUBCATEGORY + TEXT_TYPE + COMMA_SEP +
	    FeedReaderContract.FeedEntry.COLUMN_NAME_TAG1 + TEXT_TYPE + COMMA_SEP +
	    FeedReaderContract.FeedEntry.COLUMN_NAME_TAG2 + TEXT_TYPE + COMMA_SEP +
	    " )";

	private static final String SQL_DELETE_ENTRIES =
		    "DROP TABLE IF EXISTS " + TABLE_NAME_ENTRIES;
	
	
	
}
