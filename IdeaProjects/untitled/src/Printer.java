public class Printer {
    private String model;
    private int tonerLevel;
    private int pages;
    private boolean duplex;

    public Printer(String model, int tonerLevel, int pages, boolean duplex) {
        this.model = model;
if (tonerLevel>0 && tonerLevel<=100){
        this.tonerLevel = tonerLevel;}

        this.pages = pages;
        this.duplex = duplex;
    }



    public int pagesPrinted(int pages) {
        while (tonerLevel > 0) {
            if (duplex) {
                tonerLevel -= pages * 0.05;
                return pages / 2 + pages % 2;

            } else {
                tonerLevel -= pages * 0.05;
                return pages;
            }
        }
        System.out.println("No more toner");
        return 0;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }




        }



