module JavaFX.Chat {
    requires javafx.fxml;
    requires javafx.controls;

    opens com.chat.client;
    opens com.chat.server;
}