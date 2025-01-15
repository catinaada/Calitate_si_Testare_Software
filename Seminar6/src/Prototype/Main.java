package Prototype;
import Prototype.generic.*;
import Prototype.concrete.*;


public class Main {
    public static void main(String[] args) {
        //Prototype

        Client client = new Client();
        Prototype prototypeA = client.create("A");
        Prototype prototypeB = client.create("B");


        ReportGenerator reportGenerator = new ReportGenerator();
        Report salesReport = reportGenerator.generateReport("sales", "Sales data", "PDF");
        Report marketingReport = reportGenerator.generateReport("marketing", "Marketing data", "Excel");

        

    }
}
