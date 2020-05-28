public class Horse implements Runnable {
    public String name;
    public int raceNumber;
    protected boolean tired;
    public int timesWon;
    public String performing;

    public Horse(String name, int raceNumber) {
        this.name = name;
        this.tired = false;
        this.raceNumber = raceNumber;
    }

    public void prepare() {
        System.out.println(this.name + " is preparing...");
    }

    public void ready() {
        System.out.println(this.name + " Ready!");
    }


    @Override
    public void run() {
        if (this.performing == "preparing") {
            this.prepare();
            this.ready();
        } else
            System.out.println(this.name + " Running!!!!");
    }

    public void setActionToPerformed(String action) {
        this.performing = action;
    }

    public boolean tired() {
        return tired;
    }

    public void gettingTired(boolean tired) {
        this.tired = tired;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " Race Number: " + raceNumber;
    }
}
