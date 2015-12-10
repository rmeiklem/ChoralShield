
public class Concert
{
    private String customerid;
    private int numberoftickets;
    private char ticketid;
    private char methodofpurchase;
    private int seat;

    public Concert()
    {
        customerid = "";
        numberoftickets = 0;
        ticketid = 0;
        methodofpurchase = 0;
        seat = 0;

    }

    public void readMemberDetails(String dataItems)
    {

        
        String[] rowItems = dataItems.split(",");

       
        Customerid = rowItems[0];
        numberoftickets = integer.parseint(rowItems[1]);
        ticketid = Float.parseFloat(rowItems[3]);
        memberID = rowItems[4];
        category = (rowItems[5]).charAt(0);

        bmi = weight/(height*height/10000);
    }

    
}
