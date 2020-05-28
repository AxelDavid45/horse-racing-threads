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
        System.out.println("Preparing...");
    }

    public void ready() {
        System.out.println("Ready!");
    }


    @Override
    public void run() {
        if (this.performing == "preparing")
            this.prepare();
        else if(this.performing == "ready")
            this.ready();
        else
            System.out.println("Running!!!!");
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
}
