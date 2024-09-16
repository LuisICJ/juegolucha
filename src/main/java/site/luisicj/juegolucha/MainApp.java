package site.luisicj.juegolucha;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MainApp extends Application {
	
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenario) {
        escenario.setTitle("Juego de lucha");
        Text mensaje = new Text("Luchador 1\nLuchador 2");
        VBox root = new VBox();
        root.getChildren().add(mensaje);
        Scene escena = new Scene(root, 300, 50);
        escenario.setScene(escena);
        escenario.show();
    }

}
