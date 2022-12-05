package com.example.fx_demo1;

import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;

import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button btn = new Button("click to salute");
        Button btn2 = new Button("Click for leaving");
        Button change = new Button("meow");
        Pane pane = new Pane();
        Scene scene = new Scene(pane, 320, 240);
        pane.getChildren().addAll(btn,btn2, change);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        btn.setOnAction(e -> System.out.println("hello"));
        btn.setLayoutX(0);
        btn.setLayoutY(25);
        btn2.setOnAction(e -> System.out.println("bye bye"));
        change.setOnAction(e -> {
            if (change.getText().equals("meow")) {
                change.setText("3ow");
            } else {
                change.setText("meow");
            }
        });
        change.setLayoutY(50);

    }

    public static void main(String[] args) {
        launch();
    }
}
