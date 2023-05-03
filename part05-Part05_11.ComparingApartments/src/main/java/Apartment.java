
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;
    private int price;
    private int difference;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public void getSquares() {
        this.squares = squares;
    }
    
    public int getPrice() {
        this.price = this.squares * this.princePerSquare;
        return this.price;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        this.difference = this.getPrice() - compared.getPrice();
        if (this.difference < 0) {
            this.difference = this.difference * -1;
            return this.difference;
        }
        return this.difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if (this.getPrice() > compared.getPrice()) {
            return true;
        }
        return false;
    }

}
