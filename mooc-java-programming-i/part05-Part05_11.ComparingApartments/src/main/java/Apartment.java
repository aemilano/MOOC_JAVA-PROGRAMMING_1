
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        return this.squares > compared.squares;
    } 
    
    public boolean moreExpensiveThan(Apartment compared) {
        int thisApartmentPrice = this.princePerSquare * this.squares;
        int comparedApartmentPrice = compared.princePerSquare * compared.squares;

        return thisApartmentPrice > comparedApartmentPrice;
    }  

    public int priceDifference(Apartment compared) {
        int thisApartmentPrice = this.princePerSquare * this.squares;
        int comparedApartmentPrice = compared.princePerSquare * compared.squares;

        return Math.abs(comparedApartmentPrice - thisApartmentPrice);

     
    }
}
