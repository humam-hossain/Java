import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage stage) throws Exception {
        // ui elements
        Label val1 = new Label("Enter value 1: ");
        Label val2 = new Label("Enter value 2: ");
        TextField tf1 = new TextField();
        TextField tf2 = new TextField();

        Button add = new Button("+");
        add.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                double val1 = Double.parseDouble(tf1.getText().toString());
                double val2 = Double.parseDouble(tf2.getText().toString());

                Alert a = new Alert(AlertType.CONFIRMATION);
                a.setTitle("Result");
                a.setHeaderText("Subtraction of two values: ");
                a.setContentText(String.valueOf(val1+val2));
                a.show();
            } 
            
        });

        Button sub = new Button("-");
        sub.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                double val1 = Double.parseDouble(tf1.getText().toString());
                double val2 = Double.parseDouble(tf2.getText().toString());

                Alert a = new Alert(AlertType.CONFIRMATION);
                a.setTitle("Result");
                a.setHeaderText("Sum of two values: ");
                a.setContentText(String.valueOf(val1-val2));
                a.show();
            } 
            
        });

        Button mul = new Button("*");
        mul.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                double val1 = Double.parseDouble(tf1.getText().toString());
                double val2 = Double.parseDouble(tf2.getText().toString());

                Alert a = new Alert(AlertType.CONFIRMATION);
                a.setTitle("Result");
                a.setHeaderText("Multiplication of two values: ");
                a.setContentText(String.valueOf(val1*val2));
                a.show();
            } 
            
        });

        Button div = new Button("/");
        div.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                double val1 = Double.parseDouble(tf1.getText().toString());
                double val2 = Double.parseDouble(tf2.getText().toString());

                Alert a = new Alert(AlertType.CONFIRMATION);
                a.setTitle("Result");
                a.setHeaderText("Division of two values: ");
                a.setContentText(String.valueOf(val1/val2));
                a.show();
            } 
            
        });

        // layouts
        HBox hb1 = new HBox(10, val1, tf1);
        HBox hb2 = new HBox(10, val2, tf2);
        HBox hb3 = new HBox(10, add, sub, mul, div);

        hb1.setAlignment(Pos.CENTER);
        hb2.setAlignment(Pos.CENTER);
        hb3.setAlignment(Pos.CENTER);

        VBox vb = new VBox(10, hb1, hb2, hb3);
        vb.setAlignment(Pos.CENTER);
        
        // scene
        Scene scene = new Scene(vb, 500, 500);

        // stage
        stage.setScene(scene);
        stage.setTitle("Calculator");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
