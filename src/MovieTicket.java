public class MovieTicket
{
    private String movieName;
    private int theatreNumber;
    private double ticketPrice;

    //constructor
    public MovieTicket(String movieName,int theatreNumber, double ticketPrice){
        //this.movieName=movieName;

        //this.theatreNumber=theatreNumber;
        //this.ticketPrice=ticketPrice;
        setMovieName(movieName);
        setTheatreNumber(theatreNumber);
        setTicketPrice(ticketPrice);


    }
    public String getMovieName(){
        return movieName;}
    //setters
    public void setMovieName(String movieName) {
        if(movieName.isBlank()){
            throw new IllegalArgumentException ("Movie name cannot be empty");
        }
        else{
            this.movieName = movieName;
        }
    }
    public int getTheatreNumber(){
        return theatreNumber;}

        public void setTheatreNumber(int theatreNumber) {
        if(theatreNumber>0 && theatreNumber<20){
            this.theatreNumber =getTheatreNumber();
        }
        else{
            throw new IllegalArgumentException ("Theatre number cannot be empty");
        }
    }
    public Double getTicketPrice()
    {
        return ticketPrice;}

        public void setTicketPrice(Double ticketPrice){
        if(ticketPrice > 0 && ticketPrice<50 ){
            this.ticketPrice = ticketPrice;
        }
        else{
            throw new IllegalArgumentException ("Ticket price can only be 0-50");
        }
    }
    public String toString()
    {
        return String.format("%s is in Theatre Number %d and its Ticket price is $ %.1f",movieName,theatreNumber,ticketPrice);
    }
}
