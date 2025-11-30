public class student {
    private String name;
    private int midtermScore;
    private int finalScore;

    public student(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public double calculareAverage() {
       return (midtermScore + finalScore) / 2.0;
    }

    public void displaySummary() {
        double average = calculareAverage();
        String status;
    
        if (average > 50.0) {
            status = "Pass";
        } else {
            status = "Fail";
          }

        System.out.println("Name : " + this.name);
        System.out.println("Averge score : " + average);
        System.out.println("Status : " + status);
    }

}
