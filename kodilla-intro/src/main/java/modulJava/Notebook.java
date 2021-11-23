package modulJava;

public class Notebook {
    private int weight;
    private int price;
    private String brand;
    private int year;

    public Notebook(int weight, int price, String brand, int year) {
        this.weight = weight;
        this.price = price;
        this.brand = brand;
        this.year = year;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice(){
        return price;
    }

    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This " + this.brand + " notebook is very cheap.");
        } else if (600 < this.price && this.price < 1000) {
            System.out.println("This " + this.brand + " notebook is in a good price.");
        } else {
            System.out.println("This " + this.brand + " notebook is expensive");
        }
    }

    public void checkYearAndPrice() {
        if (this.year <= 2016 && this.price < 1000) {
            System.out.println("This " + this.brand +  " notebook is old but low cost.");
        }
        else if(this.year <= 2016 && this.price >= 1000 && this.price <= 2000) {
            System.out.println("This " + this.brand + " notebook is old and its price is decent.");
        }
        else if(this.year <= 2016 && this.price > 2000) {
            System.out.println("This " + this.brand + " notebook is old and it is too expensive.");
        }
        else if(this.year > 2016 && this.price < 1000) {
            System.out.println("This " + this.brand + " notebook is not old and low cost");
        }
        else if(this.year > 2016 && this.price >= 1000 && this.price <= 2000){
            System.out.println("This " + this.brand + " notebook is not old and its price is decent.");
        }
        else if(this.year > 2016 && this.price > 2000){
            System.out.println("This " + this.brand + " notebook is old and it is expensive.");
        }
    }
    public void checkWeight(){
        if(this.weight < 1000){
            System.out.println("This " + this.brand + " notebook is very light.");
        }
        else if(this.weight >= 1000 && this.weight <= 2000){
            System.out.println("This " + this.brand + " notebook is standard weight.");
        }
        else if(this.weight > 2000){
            System.out.println("This " + this.brand + " notebook is heavy.");
        }
    }
}



