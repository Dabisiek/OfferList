package com.company;

public class Offer {
    private String localization;
    private int numbersOfRooms;
    private double rentalPrice;

    public Offer(String localization, int numbersOfRooms, double rentalPrice) {
        this.localization = localization;
        this.numbersOfRooms = numbersOfRooms;
        this.rentalPrice = rentalPrice;
    }

    @Override
    public String toString() {
        return "Oferta\n" +
                "lokalizacja: " + localization + "\n" +
                "liczba pokoi: " + numbersOfRooms + "\n" +
                "cena najmu: " + rentalPrice + " tyś." + "\n\n";
    }


    public String getLocalization() {
        return localization;
    }

    public void setLocalization(String localization) {
        this.localization = localization;
    }

    public int getNumbersOfRooms() {
        return numbersOfRooms;
    }

    public void setNumbersOfRooms(int numbersOfRooms) {
        this.numbersOfRooms = numbersOfRooms;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
}
