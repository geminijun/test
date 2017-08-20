package ai.littlelights.littlelights;

import android.provider.BaseColumns;

/**
 * Created by jun on 8/19/17.
 */

public final class QuestionContract {
    private QuestionContract() {};

    public static class QuestionEntry implements BaseColumns {
        public static final String TABLE_NAME = "Questions";
        public static final String COLUMN_NAME_TEXT = "text";
        public static final String COLUMN_NAME_AUDIO_PATH = "audio_path";
    }

    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + QuestionEntry.TABLE_NAME + " (" +
                    QuestionEntry._ID + " INTEGER PRIMARY KEY," +
                    QuestionEntry.COLUMN_NAME_TEXT + " TEXT," +
                    QuestionEntry.COLUMN_NAME_AUDIO_PATH + " TEXT)";

    private static final String SQL_DELETE_ENTRIES =
            "DROP TABLE IF EXISTS " + QuestionEntry.TABLE_NAME;
}
