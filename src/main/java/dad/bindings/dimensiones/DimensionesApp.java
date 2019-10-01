package dad.bindings.dimensiones;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DimensionesApp extends Application {

	private Label textX;
	private Label textY;
	private Label textArea;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		textX = new Label();
		textY = new Label();
		textArea = new Label();
		
		
		VBox root = new VBox(5, textX, textY, textArea);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		textX.textProperty().bind(Bindings.concat("Ancho: ", scene.widthProperty()));
		textY.textProperty().bind(Bindings.concat("Ancho: ", scene.heightProperty()));
		textArea.textProperty().bind(Bindings.concat("Ancho: ", scene.widthProperty().multiply(scene.heightProperty())));

		
		primaryStage.setTitle("Dimensiones con JavaFX");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {

		launch(args);
		
	}

}
