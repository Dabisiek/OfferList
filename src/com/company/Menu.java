package com.company;

import java.util.Scanner;

public class Menu {

    private final Scanner input = new Scanner(System.in);
    private final OfferList offerList = new OfferList();

    public void run() {
        boolean exit = true;
        System.out.println("Program - Lista ofert wynajęcia mieszkań");
        while (exit) {
            System.out.println("1: Pokaż wszystkie oferty");
            System.out.println("2: Wyszukiwanie konkretnej oferty");
            System.out.println("3: Dodaj ofertę");
            System.out.println("4: Usuń ofertę");
            System.out.println("5: Wyjdz z programu");

            switch (input.nextInt()) {
                case 1 -> offerList.showOffers();
                case 2 -> System.out.println(offerList.search());
                case 3 -> createOffer();
                case 4 -> {
                    System.out.println("Podaj numer oferty, którą chcesz usunąć");
                    deleteOffer(input.nextInt());
                }
                case 5 -> exit = false;
            }
        }
    }

    public void createOffer() {
        System.out.println("Podaj lokalizację, następnie liczbe pokoi oraz cenę najmu");
        String localization = input.next();
        int numbersOfRooms = input.nextInt();
        double rentalPrice = input.nextDouble();
        Offer offer = new Offer(localization, numbersOfRooms, rentalPrice);
        offerList.addOffer(offer);
    }

    public void deleteOffer(int which) {
        offerList.delOffer(which - 1);
    }
}
