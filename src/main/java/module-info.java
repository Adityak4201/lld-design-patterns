module com.java.design.patterns {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.java.design.patterns.duck to javafx.fxml;
    exports com.java.design.patterns.duck;
}
