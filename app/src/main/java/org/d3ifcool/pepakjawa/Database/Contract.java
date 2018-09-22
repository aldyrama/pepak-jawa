package org.d3ifcool.pepakjawa.Database;

import android.content.ContentResolver;
import android.net.Uri;
import android.provider.BaseColumns;

public class Contract {

    public Contract() {}

    public static final String CONTENT_AUTHORITY = "org.d3ifcool.pepakjawa";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_PARAMASASTRA = "paramasastra";
    public static final String PATH_RUPA_KAWRUH = "rupakawruh";
    public static final String PATH_KAWRUH_BASA = "kawruhbasa";
    public static final String PATH_KESUSASTRAAN = "kesusastraan";
    public static final String PATH_AKSARA_JAWA = "aksarajawa";
    public static final String PATH_WAYANG_PURWA = "wayangpurwa";

    public static final class ParamasastraEntry implements BaseColumns{
        public static final Uri CONTENT_PARAMASASTRA_URI =
                Uri.withAppendedPath(BASE_CONTENT_URI, PATH_PARAMASASTRA);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PARAMASASTRA;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_PARAMASASTRA;

        public final static String TABLE_NAME = "paramasastra";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_JAWA = "jawa";
        public final static String COLUMN_TRANSLATE = "translate";

    }

    public static final class RupaKawruhEntry implements BaseColumns{
        public static final Uri CONTENT_RUPAKAWRUH_URI =
                Uri.withAppendedPath(BASE_CONTENT_URI, PATH_RUPA_KAWRUH);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_RUPA_KAWRUH;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_RUPA_KAWRUH;

        public final static String TABLE_NAME = "rupakawruh";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_JAWA = "jawa";
        public final static String COLUMN_TRANSLATE = "translate";
    }

    public static final class KawruhBasaEntry implements BaseColumns{
        public static final Uri CONTENT_KAWRUHBASA_URI =
                Uri.withAppendedPath(BASE_CONTENT_URI, PATH_KAWRUH_BASA);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_KAWRUH_BASA;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_KAWRUH_BASA;

        public final static String TABLE_NAME = "kawruhbasa";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_JAWA = "jawa";
        public final static String COLUMN_TRANSLATE = "translate";
    }

    public static final class KesusastraanEntry implements BaseColumns{
        public static final Uri CONTENT_KESUSASTRAAN_URI =
                Uri.withAppendedPath(BASE_CONTENT_URI, PATH_KESUSASTRAAN);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_KESUSASTRAAN;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_KESUSASTRAAN;

        public final static String TABLE_NAME = "kesusastraan";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_JAWA = "jawa";
        public final static String COLUMN_TRANSLATE = "translate";
    }

    public static final class AksaraJawaEntry implements BaseColumns{
        public static final Uri CONTENT_AKSARAJAWA_URI =
                Uri.withAppendedPath(BASE_CONTENT_URI, PATH_AKSARA_JAWA);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_AKSARA_JAWA;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_AKSARA_JAWA;

        public final static String TABLE_NAME = "aksarajawa";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_JAWA = "jawa";
        public final static String COLUMN_TRANSLATE = "translate";
    }

    public static final class WayangPurwaEntry implements BaseColumns{
        public static final Uri CONTENT_WAYANGPURWA_URI =
                Uri.withAppendedPath(BASE_CONTENT_URI, PATH_WAYANG_PURWA);

        public static final String CONTENT_LIST_TYPE =
                ContentResolver.CURSOR_DIR_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_WAYANG_PURWA;

        public static final String CONTENT_ITEM_TYPE =
                ContentResolver.CURSOR_ITEM_BASE_TYPE + "/" + CONTENT_AUTHORITY + "/" + PATH_WAYANG_PURWA;

        public final static String TABLE_NAME = "wayangpurwa";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_JAWA = "jawa";
        public final static String COLUMN_TRANSLATE = "translate";
    }
}