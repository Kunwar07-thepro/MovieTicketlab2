import java.util.Scanner;
public class MovieTicketTestHarness{
    public static void main(String[] args){
        MovieTicket movie1= new MovieTicket("Averger",1,34.1);
        MovieTicket movie2= new MovieTicket("Inception",18,49.7);



        System.out.printf("Movie 1: %s%n" , movie1);
        System.out.printf("Movie 2: %s%n" , movie2);


    }
}
