package com.yesicaz.abogados.model;

public class Constantes {
    public static String NOM_BD= "Abogados";
    public static int VERSION_BD= 1;
    public static final String NOM_TABLA="Abogados";
    public static final String ID="id";
    public static final String NOMBRE="nombre";
    public static final String ESPECIALIDAD="especialidad";
    public static final String TELEFONO="telefono";
    public static final String IMAGEN="avatarUri";
    public static final String BIO="biografia";
    public static final String Tabla = "CREATE TABLE"+ NOM_TABLA+
            " ("+ID+ "INTEGER PRIMARY KEY AUTOINCREMENT,"
            + NOMBRE + " TEXT NOT NULL,"
            + ESPECIALIDAD+ " TEXT NOT NULL,"
            + TELEFONO +" TEXT NOT NULL,"
            + BIO + " TEXT NOT NULL,"
            + IMAGEN + " TEXT)";
}
