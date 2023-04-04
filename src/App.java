/*
* File: App.java
* Author: Molnár Csenge Anna
* Copyright: 2023, Molnár Csenge Anna
* Group: Szoft I-1-N
* Date: 2023-04-04
* Github: https://github.com/Verfarkas02/s1n_lapatlofx.git
* Licenc: GUI
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application{
    TextField asideField;
    TextField areaField;
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        StackPane stackPane = new StackPane();
        VBox vBox1 =new VBox();
        HBox titleHbox = new HBox();
        HBox asideHbox = new HBox(); 
        HBox buttonHbox = new HBox();
        HBox aboutHbox = new HBox();
        HBox areaHbox = new HBox();

        //Kocka lapátlóját területen
        Label titLabel =new Label("egy kocka lapátlóját területen");
        titleHbox.getChildren().add(titLabel);
        titleHbox.setPadding(new Insets(10, 10, 10, 10));
        titleHbox.setAlignment(Pos.CENTER);

        //A oldal
        Label asideLabel =new Label("a oldal");
        asideField =new TextField();
        asideHbox.getChildren().addAll(asideLabel, asideField);
        asideHbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(asideLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(asideField, new Insets(0, 10, 0, 10));
        asideLabel.setMinWidth(100);
        asideLabel.setAlignment(Pos.CENTER_RIGHT);

        
        //calcButton
        Button calcButton = new Button("Számít");
        buttonHbox.getChildren().add(calcButton);
        buttonHbox.setAlignment(Pos.CENTER);
        buttonHbox.setPadding(new Insets(10, 10, 10, 10));
        calcButton.setOnAction(e -> {
            sartCalcArea();
        });

        //Eredmény Lapátló
        Label areaLabel =new Label("a oldal");
        areaField =new TextField();
        areaHbox.getChildren().addAll(areaLabel, areaField);
        areaHbox.setPadding(new Insets(10, 10, 10, 10));
        HBox.setMargin(asideLabel, new Insets(0, 10, 0, 10));
        HBox.setMargin(asideField, new Insets(0, 10, 0, 10));
        areaLabel.setMinWidth(100);
        areaLabel.setAlignment(Pos.CENTER_RIGHT);

        

        //Névjegy
        Label aboutlabel =new Label("Molnár Csenge Anna, Szoft I-1-N, 2023-04-04");
        aboutHbox.getChildren().add(aboutlabel);
        aboutHbox.setPadding(new Insets(10, 10, 10, 10));
        aboutHbox.setAlignment(Pos.CENTER);

       
        vBox1.getChildren().add(titleHbox);
        vBox1.getChildren().add(asideHbox);
        vBox1.getChildren().add(buttonHbox);
        vBox1.getChildren().add(areaHbox);
        vBox1.getChildren().add(aboutHbox);


        Scene scene = new Scene(vBox1);
        stage.setScene(scene);
        stage.show();
    }
    private void sartCalcArea(){
        String asideStr = asideField.getText();
        double aside =Double.parseDouble(asideStr);

        Double area =calcArea(aside);
        areaField.setText(area.toString());
        
    }
    private double calcArea(double aside){
        double area = Math.pow(aside, 3)/ Math.sqrt(8);
        return area;
    }
}
