import com.sun.glass.ui.Application;
import com.sun.javafx.tk.TKScenePaintListener;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;


import java.util.Scanner;
public class MovieTicketTestHarness extends Application {
    public static void main(String[] args) {



//
    }
    @Override
    public void start(Stage stage) throws Exception
    {Parent root  = FXMLLoader.load(getClass().getResource("MovieTicket"));
    Scene scene = new Scene(root);
    strage.setScene(scene);
    stage.setTitle("Movie Ticket Shower");
    stage.show();
    }

}
// MovieTicket movie1= new MovieTicket("Averger",1,34.1);
//    MovieTicket movie2= new MovieTicket("Inception",18,49.7);
//
//
//
//        System.out.printf("Movie 1: %s%n" , movie1);
//        System.out.printf("Movie 2: %s%n" , movie2);