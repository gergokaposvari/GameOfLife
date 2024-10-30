module kotlin.hf.gol {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens kotlin.hf.gol to javafx.fxml;
    exports kotlin.hf.gol;
}