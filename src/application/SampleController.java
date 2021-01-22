package application;
//@17:00
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SampleController implements Initializable {

    @FXML
    private TextField txtDate;

    @FXML
    private CheckBox chkoui;

    @FXML
    private ComboBox<String> cboChoix;

    @FXML
    private RadioButton rdoNon;

    @FXML
    private TextField txtChoix;

    @FXML
    private Button btnValider;

    @FXML
    private Label lblNom;

    @FXML
    private DatePicker dte;

    @FXML
    private RadioButton rdoOui;

    @FXML
    private CheckBox chknon;

    @FXML
    private RadioButton rdoPeut;

    @FXML
    private ToggleGroup choix;

    @FXML
    private Label lblCheck;
    
    @FXML
    private Label lblRadio;
    

    @FXML
    private TextField txtNom;

    public ObservableList<String> list = FXCollections.observableArrayList("Rouge","Jaune","Vert","Blanc");
    
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		cboChoix.setItems(list);
		
	}
	//Ceci est pour le combobox. (list of colors)
	public void comboBoxChanged(ActionEvent e) {
		txtChoix.setText(cboChoix.getValue());
	}
	
	//Ceci est pour le checkbox. It proogreams thee action that happens when there is an interaction
	public void checkSelect(ActionEvent e) {
		 String rep = "";
		 if(chkoui.isSelected()) rep="oui";
		 else rep="non";
		 lblCheck.setText(rep);
	}
	
	//Ceci est pour le radiobutton
	public void radioSelect(ActionEvent e) {
		String rep = "";
		if(rdoOui.isSelected()) {
			rep="oui";
		}else if(rdoNon.isSelected()) {
			rep="non";
		}else {
			rep="peut-etre";
		}
		lblRadio.setText(rep);
		
	}
	
	//Ceci est pour le textField pour le nom
	public void txtNomAffiche(ActionEvent e) {
		lblNom.setText(txtNom.getText());
	}
	
	//Ceci est pour le Date Picker
	public void choixDate(ActionEvent e) {
		txtDate.setText(dte.getValue().toString());
	}

}
