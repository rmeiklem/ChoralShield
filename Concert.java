
public class Concert
{
    private String customerid;
    private String ticketid;
    private int numberoftickets;
    private char methodofpurchase;
    
    public Concert()
    {
        customerid = "";
        ticketid = "";
        numberoftickets = 0;
        methodofpurchase = 0;
        

    }

    public void readConcertDetails(String dataItems)
    {

        String[] rowItems = dataItems.split(",");
       
        customerid = rowItems[0];
        ticketid = rowItems[1];
        numberoftickets = Integer.parseInt(rowItems[2]);
        methodofpurchase = (rowItems[3]).charAt(0);
        

    }
    
    public String getticketid(){
        return ticketid;
    }
    
    public int getnumberoftickets(){
        return numberoftickets;
    }
    
    public char getmethodofpurchase(){
        return methodofpurchase;
    }
   
    
    public String writeConcertDetails()
    {
      
        String ConcertData = "";
        ConcertData = ConcertData.concat(customerid);
        ConcertData = ConcertData.concat(",");
        ConcertData = ConcertData.concat(ticketid);
        ConcertData = ConcertData.concat(",");
        ConcertData = ConcertData.concat(Integer.toString(numberoftickets));
        ConcertData = ConcertData.concat(",");
        ConcertData = ConcertData.concat(Character.toString(methodofpurchase));
       
       return  ConcertData;

    }
    
    
}