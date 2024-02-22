module org.pocketpassword1.rockpaperscissor {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.rockpaperscissor to javafx.fxml;
    exports org.rockpaperscissor;
    exports org.rockpaperscissor.Controller;
    opens org.rockpaperscissor.Controller to javafx.fxml;
}