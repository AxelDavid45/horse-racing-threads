public class GrandPrix {
    public Horse winner;
    public Horse competitors[];

    public GrandPrix(Horse competitors[]) {
        this.competitors = competitors;
    }

    public void prepareHorses() {
        for(Horse competitor : competitors) {
            competitor.setActionToPerformed("preparing");
            (new Thread(competitor)).start();
        }
    }
}
