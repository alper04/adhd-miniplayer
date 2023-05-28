module com.example.adhdminiplayer {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
            
                            
    opens com.example.adhdminiplayer to javafx.fxml;
    exports com.example.adhdminiplayer;
}