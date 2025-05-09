package Interface;

public class House implements Interf {
    int id = 0;
    String address;
    int floors;

    public House(String address, int floors) {
        this.id = this.id + 1;
        this.address = address;
        this.floors = floors;
    }

    public void showLocation() {
        System.out.printf("Location: %s", this.address);
    }

    @Override
    public void printInfo() {
        System.out.println("\n" + "Numbers of house = " + this.id);
    }
}
