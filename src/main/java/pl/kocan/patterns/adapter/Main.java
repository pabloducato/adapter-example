package pl.kocan.patterns.adapter;

public class Main {

    public static void main(String[] args) {

        ContinentalDevice radio = () -> System.out.println("Gra muzyczka");

        ContinentalSocket continentalSocket = new ContinentalSocket();

        continentalSocket.plugIn(radio);

        UKDevice ukRadio = () -> System.out.println("London calling to the faraway towns");

        UKSocket ukSocket = new UKSocket();

        ukSocket.plugIn(ukRadio);

        UKToContinentalAdapter adapter = new UKToContinentalAdapter(ukRadio);

        continentalSocket.plugIn(adapter);

    }
}
