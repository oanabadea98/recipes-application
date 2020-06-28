module com.recipes {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.recipes to javafx.fxml;
    exports com.recipes;
}