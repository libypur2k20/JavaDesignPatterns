package com.company.behavioral.patterns.mediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Client extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        UIMediator mediator = new UIMediator();
        TextBox textBox = new TextBox(mediator);
        Label label = new Label(mediator);
        Slider slider = new Slider(mediator);

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setVgap(20);
        gridPane.setPadding(new Insets(25,25,25,25));
        gridPane.add(label,0,0);
        gridPane.add(slider,0,1);
        gridPane.add(textBox,0,2);

        Scene scene = new Scene(gridPane,500,500);
        stage.setTitle("Mediator Pattern");
        stage.setScene(scene);
        stage.show();

    }

}
