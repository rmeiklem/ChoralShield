import javax.swing.JOptionPane;
import java.io.*;
import java.util.Calandar;
public class School
{

    private Concert ConcertList[];

    FILEREADCSV Concertreadfile;
    FILEWRITECSV Concertresultfile;
    private int noOfConcerts;
    private int year;
    private int FridayNumber;
    private int FridaySales;
    private int WedThurNumber;
    private int WedthurSales;
    private int Total;
    private int Websitesales;
    private int Schoolsales;
    private string Mostpopularmethod;

    public School()
    {
        Concertreadfile = new FILEREADCSV();
        Concertresultfile = new FILEWRITECSV();
    }

    public void processConcerts() throws IOException
    {
        setupConcertList();

        getdate();
        calculation();
        Money();

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
            if (ConcertList[i].getticketid().equals ("F1") || Concertlist[i].getticketid().equals ("F2") || Concertlist[i].getticketid().equals ("F3"))
            {  
              FridayNumber = FridayNumber + 1;
            }
            else {
                WedThurNumber = WedThurNumber + 1;
            }
        }
    }
    
    public void displayConcerts(){
        System.out.println("Essell Academy Choral Shield" + " " + year);
        
    }
}
