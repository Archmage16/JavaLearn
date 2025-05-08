package classes;

public class Jas {
    public static void main(String[] args) {
        Car c1;
        c1 = new Car("Mercedes", "2025");
        c1.info();
        c1.set_brand("Toyota");
        c1.set_year("2008");
        c1.info();
    }
}
class Car{
    private String brand;
    private String date;

    public Car(String brand, String date){
       this.brand =  brand;
       this.date = date;
    }

    public void set_brand(String brand){
        this.brand = brand;
    }
    public String get_brand() {
        return brand;
    }
    public void set_year(String date){
        this.date = date;
    }
    public String get_year() {
        return date;
    }
    public void info(){
        System.out.println(this.get_brand()+ " " + this.get_year());
    }

}