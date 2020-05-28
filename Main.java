public class Main {
    public static void main(String[] args) {
        Horse horse1 = new Horse("McQueen", 95);
        Horse horse2 = new Horse("Chick Hicks", 86);

        Horse competitors[] = {horse1, horse2};

        GrandPrix race = new GrandPrix(competitors);
        race.prepareHorses();
    }
}
