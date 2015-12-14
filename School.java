import javax.swing.JOptionPane;
import java.io.*;
public class School
{

    private Concert ConcertList[];
    
    
    int noOfConcerts;
    FILEREADCSV Concertreadfile;
    FILEWRITECSV Concertresultfile;
    public School()

    {
        Concertreadfile = new FILEREADCSV();
        Concertresultfile = new FILEWRITECSV();
    }

    public void processConcerts() throws IOException
    {
        setupConcertList();
        //displaydetails();
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
}


