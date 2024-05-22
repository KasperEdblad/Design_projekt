
package addressbook;


import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AddressBookController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML private MenuBar menuBar;

    @FXML private Label account_name_label;
    @FXML private Label account_address_label;
    @FXML private Label account_number_label;

    @FXML private TextField new_account_name;
    @FXML private TextField new_account_address;
    @FXML private TextField new_account_number;

    @FXML private Label save_account_confirmation;



    public void to_account(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("user_page.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
        account_name_label.setText(AddressBook.account.getName());
        account_address_label.setText(AddressBook.account.getAddress());
        account_number_label.setText(AddressBook.account.getPhoneNumber());
    }

    public void to_shopping_cart(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("address_book.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void to_main_page(ActionEvent event) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("imat_app.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void to_payment_page(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("address_book.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public void save_account(ActionEvent event) throws IOException {
        AddressBook.account.setName(new_account_name.getText());
        AddressBook.account.setAddress(new_account_address.getText());
        AddressBook.account.setPhoneNumber(new_account_number.getText());
        save_account_confirmation.setVisible(true);
        account_name_label.setText(AddressBook.account.getName());
        account_address_label.setText(AddressBook.account.getAddress());
        account_number_label.setText(AddressBook.account.getPhoneNumber());
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML 
    protected void openAboutActionPerformed(ActionEvent event) throws IOException{
    
        ResourceBundle bundle = java.util.ResourceBundle.getBundle("addressbook/resources/AddressBook");
        Parent root = FXMLLoader.load(getClass().getResource("address_book_about.fxml"), bundle);
        Stage aboutStage = new Stage();
        aboutStage.setScene(new Scene(root));
        aboutStage.setTitle(bundle.getString("about.title.text"));
        aboutStage.initModality(Modality.APPLICATION_MODAL);
        aboutStage.setResizable(false);
        aboutStage.showAndWait();
    }
    
    @FXML 
    protected void closeApplicationActionPerformed(ActionEvent event) throws IOException{
        
        Stage addressBookStage = (Stage) menuBar.getScene().getWindow();
        addressBookStage.hide();
    }    
}
