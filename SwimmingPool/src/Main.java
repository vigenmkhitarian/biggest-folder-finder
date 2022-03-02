public class Main {
    public static void main(String[] args) {
        int volume = 1200; //litres
        int fillingSpeed = 30; //30 litres per minute
        int devastationSpeed = 10; //10 litres per minute

        int filledAmount = 0;
        int timeOfFiiling = 0;

        while (filledAmount < volume) {
            filledAmount = filledAmount + fillingSpeed - devastationSpeed;
            timeOfFiiling = timeOfFiiling + 1;
        }
        System.out.println("Бассейн заполняется за " + timeOfFiiling + " минут");

    }
}
