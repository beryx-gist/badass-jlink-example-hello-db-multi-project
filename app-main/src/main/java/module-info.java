module org.example.hellodb.main {
    requires javafx.controls;
    requires java.sql;
    exports org.example.hellodb.main;
    opens org.example.hellodb.main to javafx.graphics;
}
