package br.com.etec.aula20240906.model.database;

public class DatabaseFactory {

    public static Database getDatabase (String nome ){
        if (nome.equals("postgreesql")){
            return new DatabasePostgreesql();
        }else{
            return new DatabaseMySQL();s
        }
    }


}
