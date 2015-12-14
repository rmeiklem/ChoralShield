import javax.swing.JOptionPane;
import java.io.*;
public class Order
{

    private Concert OrderList[];

    int noOfOrders;
    FILEREADCSV Concertfile;
    public Order()
    {
        Concertfile = new FILEREADCSV();

    }

    public void processMembers() throws IOException
    {
        setUpMemberList();
        countOrders();
    }

    public void setUpMemberList() throws IOException
    {
        System.out.println("Order details: Concert Order Update");
        System.out.println("** Preparing to read data file.");
       
        OrderList = new Concert[noOfOrders];
        
        for  (int i = 0; i < noOfOrders; i++) {
           OrderList[i] = new Concert();
            
           OrderList[i].readOrderDetails(dataRows[i+1]);
        }
    }

    public void countOrders() throws IOException
    {
        String[] dataRows = Concertfile.readCSVtable();

        noOfOrders = dataRows.length ;

        
        System.out.println("** " + noOfOrders + " rows read.\n\n");

    }
}
