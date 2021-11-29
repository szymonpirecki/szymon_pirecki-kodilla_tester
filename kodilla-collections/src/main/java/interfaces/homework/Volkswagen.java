package interfaces.homework;

public class Volkswagen implements Car {
    private int Speed;

    public Volkswagen(int Speed){
        this.Speed = Speed;
    }


    @Override
    public int getSpeed() {
        return Speed;
    }

    @Override
    public void increaseSpeed() {
        Speed = Speed + 30;

    }

    @Override
    public void decreaseSpeed() {
        Speed = Speed - 15;

    }
}
