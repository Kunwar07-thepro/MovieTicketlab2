import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.paint.Color;


import java.net.URL;
import java.util.ResourceBundle;

public class MovieTicketController implements Initializable {

    @FXML
    private TextField tPriceTextField;
    @FXML
    private DatePicker movieDatePicker;
    @FXML
    private Spinner<Integer> theatreNumberSpinner;
    @FXML
    private Label msgLabel;

    @FXML
    private ComboBox<String> movieNameComboBox;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
             movieNameComboBox.setPromptText("Select your movie");
             movieNameComboBox.getItems().addAll("Avengers","Inception","War","2012","Mission Impossible");

        SpinnerValueFactory<Integer> valueFactory =  new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 20, 1);
        theatreNumberSpinner.setValueFactory(valueFactory);
        theatreNumberSpinner.setEditable(true);
        TextField spinnerEditor = theatreNumberSpinner.getEditor();


        spinnerEditor.textProperty().addListener((observableValue, oldValue, newValue)->
        {
            try {
                Integer.parseInt(newValue);
                msgLabel.setText("");
            } catch (NumberFormatException ex)
            {
                spinnerEditor.setText(oldValue);
                msgLabel.setTextFill(Color.RED);
                msgLabel.setText("Only whole numbers are allowed");
            }
        });

        movieDatePicker.setPromptText("Select movie show date");
    }

    public void createButtonPushed(){
        System.out.printf("The Movie date is : '%s'%n",movieDatePicker.getValue());
        System.out.printf("The Spinner said : '%s'%n",theatreNumberSpinner.getValue());
        System.out.printf("The TextField said : '%s'%n",tPriceTextField.getText());
        System.out.printf("The Combo Box said : '%s'%n", movieNameComboBox.getValue());


            if (allFieldsHaveValues()) {
                try {
                    String priceString = tPriceTextField.getText();

                   MovieTicket newBooking= new MovieTicket(
                           movieNameComboBox.getValue(),
                           theatreNumberSpinner.getValue(),
                           Double.parseDouble(tPriceTextField.getText()),
                           movieDatePicker.getValue());
                    msgLabel.setText(newBooking.toString());
                } catch (Exception ex) {
                    msgLabel.setText(ex.getMessage());
                }
            }
    }


    public boolean allFieldsHaveValues()
    {
        StringBuilder errorMsg = new StringBuilder();
        errorMsg.append("You didn't filled the following field(s): ");
        if (movieNameComboBox.getValue() == null)
            errorMsg.append("Movie");
        if (movieDatePicker.getValue() == null)
            errorMsg.append(errorMsg.length()>42?", Movie date":"Movie date");
        if (tPriceTextField.getText().isBlank())
            errorMsg.append(errorMsg.length()>42?", Ticket price":"Ticket price");

        if (errorMsg.length()>42)
        {
            msgLabel.setTextFill(Color.RED);
            msgLabel.setText(errorMsg.toString());
            return false;
        }
        return true;
    }



    //public void createButtonPushed()

//        System.out.printf("The Expiry Date is: %s ", expiryDatePicker.getValue());
//        System.out.printf("The TextField said: '%s'%n", priceTextField.getText());
//        System.out.printf("The ComboBox said: '%s'%n", brandComboBox.getValue());



}