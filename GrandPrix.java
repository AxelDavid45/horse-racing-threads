public class GrandPrix {
    public Horse winner;
    public Horse competitors[];

    public GrandPrix(Horse competitors[]) {
        if (competitors.length == 2)
            this.competitors = competitors;
        else
            throw new IllegalArgumentException();
    }

    public void startRace() {
        for (Horse competitor : competitors) {
            competitor.setActionToPerformed("preparing");
        }
        Thread horse1 = new Thread(competitors[0]);
        Thread horse2 = new Thread(competitors[1]);
        
        horse1.start();
        horse1.setPriority(2);
        horse2.start();
        horse2.setPriority(10);

        if (horse1.isAlive())
            winner = competitors[1];
        else
            winner = competitors[0];

    }

}
