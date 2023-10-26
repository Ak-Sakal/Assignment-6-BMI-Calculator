import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class BMICalculatorApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("BMI Calculator");

        Label weightLabel = new Label("Weight (kg):");
        TextField weightField = new TextField();
        Label heightLabel = new Label("Height (m):");
        TextField heightField = new TextField();
        Button calculateButton = new Button("Calculate BMI");
        Label resultLabel = new Label("BMI: ");
        Label statusLabel = new Label();

        VBox layout = new VBox(10);
        layout.getChildren().addAll(weightLabel, weightField, heightLabel, heightField, calculateButton, resultLabel, statusLabel);

        calculateButton.setOnAction(e -> {
            });

        Scene scene = new Scene(layout, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
MenuBar menuBar = new MenuBar();
Menu fileMenu = new Menu("File");
MenuItem exitMenuItem = new MenuItem("Exit");
MenuItem clearMenuItem = new MenuItem("Clear");
Menu helpMenu = new Menu("Help");

exitMenuItem.setOnAction(e -> {
    // выход
});

clearMenuItem.setOnAction(e -> {
    // очистить
});

fileMenu.getItems().addAll(exitMenuItem, clearMenuItem);
menuBar.getMenus().addAll(fileMenu, helpMenu);

layout.getChildren().add(menuBar);
