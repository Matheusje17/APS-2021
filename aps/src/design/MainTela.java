package design;

import java.io.IOException;

import dados.PreencheDados;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainTela extends Application {
	
	private Stage primaryStage;
	private BorderPane rootLayout;

	@Override
	public void start(Stage primaryStage) {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Casos de Dengue Baixada Santista");
		
		initRootLayout();
		showPersonOverview();
		
	}
	
	public void initRootLayout() {
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(MainTela.class.getResource("/design/RootLayout.fxml"));
			rootLayout = (BorderPane) loader.load();
			
			
			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void showPersonOverview() {
		try {
            // Carrega o person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainTela.class.getResource("/design/Aps2021.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            
            // Define o person overview dentro do root layout.
            rootLayout.setCenter(personOverview);
            Aps2021Controller controller = loader.getController();
            controller.setPreencheDados(new PreencheDados());
            controller.mostraCalculo();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	public Stage getPrimaryStage() {
		return primaryStage;
	}
	

	public static void main(String[] args) {
		launch(args);
	}
}
