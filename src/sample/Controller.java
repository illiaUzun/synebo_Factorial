package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class Controller {
    Factorial factorial;

    @FXML
    private TextField factorialTextField;

    @FXML
    private TextField resultField;

    @FXML
    void onEnter(ActionEvent event) {
        resultField.clear();

        int num = Integer.parseInt(factorialTextField.getText());

        if (factorial.validation(num)) {
            if(factorial.factorial(num) > 0){
                resultField.appendText(String.valueOf(factorial.factorial(num)));
            }
            else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error!");
                alert.setHeaderText(null);
                alert.setContentText("Such factional don't exist");
                alert.showAndWait();
            }
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error!");
            alert.setHeaderText(null);
            alert.setContentText("Entered number can not be less then zero");
            alert.showAndWait();
        }
    }

    @FXML
    void initialize() {
        factorial = new Factorial();

        resultField.setEditable(false);
        resultField.setMouseTransparent(true);
        resultField.setFocusTraversable(false);
    }
}
