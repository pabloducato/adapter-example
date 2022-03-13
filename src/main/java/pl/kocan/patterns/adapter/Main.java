package pl.kocan.patterns.adapter;

public class Main {

    public static void main(String[] args) {


        ContinentalDevice radio = () -> System.out.println("Gra muzyczka");

        ContinentalSocket continentalSocket = new ContinentalSocket();

        continentalSocket.plugIn(radio);

        UKDevice ukRadio = () -> System.out.println("Gra angielska muzyka");

        UKSocket ukSocket = new UKSocket();

        ukSocket.plugIn(ukRadio);

    }
}
