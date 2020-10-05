import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import javafx.stage.Stage;

import java.time.LocalDate;

public class MovieTicketTestHarness extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("movieTicketView.fxml")); //the parent is something that gonna hold our fxml and controller and bundle's them all together
        Scene scene = new Scene(root);// fxmlloader loads the fxml file
        stage.setScene(scene);
        stage.setTitle("Movie Ticket Shower");
        stage.show();
    }
}


//import com.sun.glass.ui.Application;
//import com.sun.javafx.tk.TKScenePaintListener;
//import javafx.fxml.FXMLLoader;
//import javafx.stage.Stage;
//import javafx.scene.Parent;
//
//
//import java.util.Scanner;
//public class MovieTicketTestHarness extends Application {
//    public static void main(String[] args) {
//
//
//
////
//    }
//    @Override
//    public void start(Stage stage) throws Exception
//    {Parent root  = FXMLLoader.load(getClass().getResource("MovieTicket"));
//    Scene scene = new Scene(root);
//    stage.setScene(scene);
//    stage.setTitle("Movie Ticket Shower");
//    stage.show();
//    }
//
//}
// MovieTicket movie1= new MovieTicket("Avenger",1,34.1,LocalDate.of(2020/10/20) );
//    MovieTicket movie2= new MovieTicket("Inception",18,49.7,LocalDate.of(2020/10/20));
//
//
//
//        System.out.printf("Movie 1: %s%n" , movie1);
//        System.out.printf("Movie 2: %s%n" , movie2);