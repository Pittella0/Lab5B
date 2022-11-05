module tonypittella.lab_5b {
    requires javafx.controls;
    requires javafx.fxml;
    //had issue with logging not being visible
    requires java.logging;
    
    opens tonypittella.lab_5b to javafx.fxml;
    exports tonypittella.lab_5b;
}
