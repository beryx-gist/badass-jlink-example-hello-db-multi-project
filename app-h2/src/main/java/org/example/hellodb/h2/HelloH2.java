package org.example.hellodb.h2;

import org.example.hellodb.main.HelloDB;

public class HelloH2 {
    public static void main(String[] args) {
        HelloDB.main(new String[] {
                "--url=jdbc:h2:mem:test",
                "--user=sa"
        });
    }
}
