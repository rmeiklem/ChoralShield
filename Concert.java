
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

    public void readTicketDetails(String dataItems)
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
    
    public char getmethodofpurchase(){
        return methodofpurchase;
    }
    
    public String writeTicketDetails()
    {
      
        String TicketData = "";
        TicketData = TicketData.concat(customerid);
        TicketData = TicketData.concat(",");
        TicketData = TicketData.concat(ticketid);
        TicketData = TicketData.concat(",");
        TicketData = TicketData.concat(Integer.toString(numberoftickets));
        TicketData = TicketData.concat(",");
        TicketData = TicketData.concat(Character.toString(methodofpurchase));
       
       return  TicketData;

    }
}