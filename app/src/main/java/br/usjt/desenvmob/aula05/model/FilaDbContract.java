package br.usjt.desenvmob.aula03.model;

import android.provider.BaseColumns;

import java.sql.Blob;

/**
 * Created by roger.oliveira-816117932
 */

public final class FilaDbContract {
    public FilaDbContract(){
    }

    public static abstract class FilaDb implements BaseColumns{
        public static final String TABLE_NAME = "Fila";
        public static final String ID_FILA = "id_fila";
        public static final String NM_FILA = "nm_fila";
        public static final String NM_FIGURA = "nm_figura";
        public static final String IMG_FIGURA = "img_figura";
    }
}
