package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    /*** Variables ***/
    @FXML
    private Label sort_txt;
    @FXML
    private Label err_txt;
    @FXML
    private Spinner<Integer> from_spn;
    @FXML
    private Spinner<Integer> to_spn;
    @FXML
    private Button sort_btn;

    /*** Getters and Setters ***/
    Label getSort_txt() {
        return sort_txt;
    }

    Button getSort_btn() {
        return sort_btn;
    }

    /*** Methods ***/
    @FXML
    private void sortInRange(){
        int from = from_spn.getValue();
        int to = to_spn.getValue();

        if(from < to) {                                                       // Checks for invalid ranges
            err_txt.setVisible(false);
            sort_btn.setDisable(true);

            sort_txt.setStyle("-fx-text-fill: black;");
            SortingThread st = new SortingThread(this, from, to);   // Initialize the sorting sortingThread
            st.start();
        } else {
            sort_txt.setStyle("-fx-text-fill: red;");
            err_txt.setVisible(true);
        }
    }

    /*** Overridings ***/
    @Override
    public void initialize(URL location, ResourceBundle resources) {          // Initialize the spinner components
        SpinnerValueFactory<Integer> from_spnVF = new SpinnerValueFactory.IntegerSpinnerValueFactory(0,9998,0);
        from_spn.setValueFactory(from_spnVF);
        SpinnerValueFactory<Integer> to_spnVF = new SpinnerValueFactory.IntegerSpinnerValueFactory(1,9999,100);
        to_spn.setValueFactory(to_spnVF);
    }

}
