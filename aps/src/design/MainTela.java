package design;

import java.io.IOException;

import dados.ConexaoBanco;
import dados.PreencheDados;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
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
			ConexaoBanco con = new ConexaoBanco();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainTela.class.getResource("/design/Aps2021.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
    
            rootLayout.setCenter(personOverview);
            Aps2021Controller controller = loader.getController();
            PreencheDados pd=new PreencheDados();
            controller.setPreencheDados(pd);
            controller.mostraCalculo();
            controller.setBarra(pd);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	public void showLineChart() {
		try {
      
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainTela.class.getResource("/design/GraficoLinha.fxml"));
            AnchorPane page =(AnchorPane) loader.load();
            Stage dialogStage = new Stage();
            dialogStage.setTitle("Curva de Gauss casos de Dengue");
            dialogStage.initModality(Modality.WINDOW_MODAL);
            dialogStage.initOwner(primaryStage);
            Scene scene = new Scene(page);
            dialogStage.setScene(scene);
            
            PreencheDados pdLine = new PreencheDados();
            
            GraficoLinhaController linhaController = loader.getController();
            linhaController.setLine(pdLine);
            dialogStage.show();
            
            
            
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
