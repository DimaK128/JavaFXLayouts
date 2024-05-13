package com.example.javafxlayouts;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        HBox hbox = new HBox();
        GridPane gridPane = new GridPane();

        Circle circle = new Circle(50, Color.BLUE);
        Rectangle rectangle = new Rectangle(100, 100, Color.RED);
        Ellipse ellipse = new Ellipse(50, 30);
        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(50.0, 0.0, 0.0, 100.0, 100.0, 100.0);
        triangle.setFill(Color.PURPLE);
        Line line = new Line(0, 0, 100, 100);
        Polyline polyline = new Polyline(0, 0, 50, 50, 100, 0);
        Text text = new Text("Hello World!");

        circle.setFill(Color.BLUE);
        circle.setStroke(Color.BLACK);
        circle.setStrokeWidth(2);
        ellipse.setFill(Color.GREEN);
        text.setFont(Font.font(20));

        text.setTranslateY(10);

        HBox.setMargin(circle, new Insets(0, 40, 0, 0));

        hbox.getChildren().addAll(circle, rectangle);
        gridPane.add(ellipse, 0, 0);
        gridPane.add(triangle, 1, 0);
        gridPane.add(line, 2, 0);
        gridPane.add(polyline, 3, 0);
        gridPane.add(text, 2, 2, 3, 3);

        hbox.setAlignment(Pos.CENTER);
        hbox.setPadding(new Insets(10));
        hbox.setBackground(new Background(new BackgroundFill(Color.LIGHTGRAY, CornerRadii.EMPTY, Insets.EMPTY)));

        root.getChildren().addAll(hbox, gridPane);

        Scene scene = new Scene(root, 420, 280);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Layout");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
