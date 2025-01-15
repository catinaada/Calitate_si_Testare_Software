package Prototype.concrete;
public class MarketingReport implements Report {

    private String data;
    private String format;
    @Override
    public void setData(String data) {
        this.data=data;
    }

    @Override
    public void setFormat(String format) {
        this.format=format;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating Marketing Report with data: " + data + " and format: " + format);

    }

    @Override
    public Report clone() throws CloneNotSupportedException {
        return (MarketingReport) super.clone();
    }
}
