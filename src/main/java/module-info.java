module com.example.adhdminiplayer {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.adhdminiplayer to javafx.fxml;
    exports com.example.adhdminiplayer;
}