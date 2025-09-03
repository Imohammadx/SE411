package lab03.dialog;

	



import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class Dialogs {

    public static void showWarning(String header, String content) {
        Alert alert = new Alert(AlertType.WARNING);
        alert.setTitle("Warning");
        alert.setHeaderText(header);
        alert.setContentText(content);
        alert.showAndWait();
    }

    public static void showWelcome(String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Welcome");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}

