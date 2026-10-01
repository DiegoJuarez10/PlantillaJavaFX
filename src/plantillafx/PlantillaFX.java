/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package plantillafx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundSize;
import java.io.File;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
/**
 *
 * @author DIEGO JUAREZ
 */
public class PlantillaFX extends Application{

    public void start(Stage primaryStage){
        
        Label label = new Label("JavaFX plantilla");
        Button btn = new Button("Imprimir un Hola Mundo");
        Label label2 = new Label("Diego Juarez - Ariel Fuentes - Jorge Avila");
        label.setFont(new Font("Century Gothic", 30)); 
        label.setTextFill(Color.WHITE); 
        
        label2.setFont(new Font("Rockwell", 15)); 
        label2.setTextFill(Color.WHITE); 
        
        btn.setFont(new Font("Century Gothic", 15));
        
        btn.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event){
                System.out.println("Hola Mundo");
            }
        });
        VBox root = new VBox(30);
        root.setAlignment(Pos.CENTER);
        
File archivo = new File("src/plantillafx/fondoplantillajfx.jpg");
Image imagen = new Image(archivo.toURI().toString());

        BackgroundImage fondo = new BackgroundImage(
            imagen,
            BackgroundRepeat.NO_REPEAT,
            BackgroundRepeat.NO_REPEAT,
            BackgroundPosition.CENTER,
            new BackgroundSize(100, 100, true, true, false, true)
        );

        root.setBackground(new Background(fondo));

        root.getChildren().addAll(label, btn, label2);
    
        Scene scene = new Scene(root, 400, 350);
        
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
