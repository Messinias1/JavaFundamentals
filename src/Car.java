public class Car {
    String make;
    String model;
    int price;
    private String owner;

    public Car(String aMake, String aModel, int aPrice) {
        this.make = aMake;
        this.model = aModel;
        this.price = aPrice;
        this.setOwner(owner);
    }

    public void setOwner(String owner) {
        if(owner.equals("Carl")) {
            this.owner = owner;
        }
    }
    public String getOwner() {
        return owner;
    }
}
