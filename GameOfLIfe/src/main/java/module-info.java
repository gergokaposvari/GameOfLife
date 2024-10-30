module hf.gol {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens hf.gol to javafx.fxml;
    exports hf.gol;
}