import javax.swing.JOptionPane;
import java.io.*;
public class Order
{

    private Concert memberList[];

    int noOfOrders;
    FILEREADCSV Concertfile;
    public Order()
    {
        Concertfile = new FILEREADCSV();

    }

    public void processMembers() throws IOException
    {
        setUpMemberList();
        countOKbmi();
    }

    public void setUpMemberList() throws IOException
    {
        System.out.println("Order details: Concert Order Update");
        System.out.println("** Preparing to read data file.");

    }

    public void countOKbmi() throws IOException
    {
        String[] dataRows = Concertfile.readCSVtable();
       
        noOfOrders = dataRows.length ;


        
        System.out.println("** " + noOfOrders + " rows read.\n\n");

    }
}
