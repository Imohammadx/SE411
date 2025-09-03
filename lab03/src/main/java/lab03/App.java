package lab03;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import lab03.dialog.Dialogs;

public class App extends Application {

    private static final String TITLE = "Welcome App";

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle(TITLE);

        VBox layout = new VBox(10);  // 10 px spacing
        Scene scene = new Scene(layout, 400, 400);
        primaryStage.setScene(scene);

        // Step 2: Add controls to the layout
        Label nameLabel = new Label("Enter your name:");
        TextField nameInput = new TextField();

        Button greetButton = new Button("Greet Me");

        // When button is clicked, show dialog
        greetButton.setOnAction(e -> {
            String name = nameInput.getText().trim();
            if (name.isEmpty()) {
                // Show alert dialog for empty username
                Dialogs.showWarning("Name is required!", "Please enter your name.");
            } else {
                // Show welcome dialog with the name
                Dialogs.showWelcome("Welcome, " + name + "!");
            }
        });

        layout.getChildren().addAll(nameLabel, nameInput, greetButton);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
