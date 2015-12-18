import javax.swing.JOptionPane;
import java.io.*;
import java.time.*;
public class School
{

    private Concert ConcertList[];

    FILEREADCSV Concertreadfile;
    FILEWRITECSV Concertresultfile;
    private int noOfConcerts;
    private int year;
    private int Fridaytickets;
    private int FridaySales;
    private int WedThurtickets;
    private int WedThurSales;
    private int Total;
    private int Websitesales;
    private int Schoolsales;

    public School()
    {
        Concertreadfile = new FILEREADCSV();
        Concertresultfile = new FILEWRITECSV();
    }

    public void processConcerts() throws IOException
    {
        setupConcertList();

        calculation();
        Sales();

        Fridaydata();
        displayConcerts();

    }

    public void setupConcertList() throws IOException
    {
        System.out.println("Order details: Concert Order Update");
        System.out.println("** Preparing to read data file.");

        String[] dataRows = Concertreadfile.readCSVtable();
        noOfConcerts = dataRows.length ;

        System.out.println("** " + noOfConcerts + " rows read.\n\n");

        ConcertList = new Concert[noOfConcerts];
        for  (int i = 0; i < noOfConcerts; i++) {
            ConcertList[i] = new Concert();

            ConcertList[i].readConcertDetails(dataRows[i]);
        }
    }

    public void calculation() {
        for (int i=0; i<noOfConcerts; i++)
        {
            if (ConcertList[i].getticketid().equals ("F1") || ConcertList[i].getticketid().equals ("F2") || ConcertList[i].getticketid().equals ("F3"))
            {  
                Fridaytickets = Fridaytickets + ConcertList[i].getnumberoftickets();
            }
            else {
                WedThurtickets = WedThurtickets + ConcertList[i].getnumberoftickets();
            }
        }

        FridaySales = Fridaytickets*10;
        WedThurSales = WedThurtickets*5;
        Total = FridaySales + WedThurSales;
        
        System.out.println("The total sales £" +  Total);
    }

    public void Sales() {
        for (int i=0; i<noOfConcerts; i++)
        {
            if (ConcertList[i].getmethodofpurchase()==('W')) 
            {
                Websitesales = Websitesales + 1;
            }
            else
            {
                Schoolsales = Schoolsales + 1;
            }
        }        
        if (Websitesales>Schoolsales)
        {
            System.out.println("Website");
        }
        else 
        {
            System.out.println("School");
        }

    }

    public void Fridaydata() throws IOException
    {
          String fileContent = "";
        int count = 0;
        for (int i = 0; i < noOfConcerts; i++) 
        {
            if(ConcertList[i].getticketid().equals ("F1") || ConcertList[i].getticketid().equals ("F2") || ConcertList[i].getticketid().equals ("F3"))
            {
                count = count + 1;
                if (count>1) 
                {
                    fileContent = fileContent.concat("\n");
                }
                fileContent = fileContent.concat(ConcertList[i].writeConcertDetails());
            }
        }

        
        System.out.println("Fridays data being written");
        Concertresultfile.writeCSVtable(fileContent);
        System.out.println("** File written and closed.");
        }
    

    public void displayConcerts(){
        System.out.println("Essell Academy Choral Shield" + " " + Year.now().getValue());

     }

}
