package org.example.hellodb.hsqldb;

import org.example.hellodb.main.HelloDB;

public class HelloHsqldb {
    public static void main(String[] args) {
        HelloDB.main(new String[] {
                "--url=jdbc:hsqldb:mem:test",
                "--user=SA"
        });
    }
}
