package br.com.etec.aula20240906.model.database;

import java.sql.Connection;

public class DatabasePostgreesql implements Database {

    @Override
    public Connection conectar() {
        return null;
    }

    @Override
    public void desconectar() {

    }
}
