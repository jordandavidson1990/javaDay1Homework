public class Printer {

    private int paper;
    private int toner;

    public Printer(){
        this.paper = 100;
        this.toner = 50;
    }

    public int getNumberOfPaper() {
        return paper;
    }

    public int getNumberOfToner() {
        return toner;
    }

    public void print1Page() {
        paper -= 1;
        toner -= 1;
    }

    public boolean hasEnoughPaper(int i) {
        return this.paper >= i;
    }

    public void refillPaper() {
         paper = 100;
    }


    public void print(int numberOfPages, int numberOfCopies) {
        int total = (numberOfPages*numberOfCopies);
        if(paper >= total){
            paper -= total;
            toner -= total;
        }
    }
}
