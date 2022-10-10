import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TabPane;
public class Main extends Application {

	
	
	public static void main(String[] args) {
		
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		TabPane mainPane = (TabPane) FXMLLoader.load(Main.class.getResource("Scene1.fxml"));
		
		//primaryStage.sizeToScene();
		Scene scene = new Scene(mainPane);
		mainPane.prefHeightProperty().bind(primaryStage.heightProperty());
		mainPane.prefWidthProperty().bind(primaryStage.widthProperty());
		primaryStage.setScene(scene);
		primaryStage.setWidth(700);
		primaryStage.setHeight(600);
		
		
		primaryStage.setTitle("FLEX GYM");
		primaryStage.show();
		
		
	}
	

}
