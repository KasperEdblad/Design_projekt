
package addressbook;

import java.awt.*;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AddressBook extends Application {

    static Account account = new Account();

    @Override
    public void start(Stage stage) throws Exception {
        
        ResourceBundle bundle = java.util.ResourceBundle.getBundle("addressbook/resources/AddressBook");
        
        Parent root = FXMLLoader.load(getClass().getResource("imat_app.fxml"), bundle);
        
        Scene scene = new Scene(root, 1440, 1080);

        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        stage.setTitle(bundle.getString("application.name"));
        stage.setScene(scene);

        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
