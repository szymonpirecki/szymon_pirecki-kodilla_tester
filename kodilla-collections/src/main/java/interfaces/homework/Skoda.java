package interfaces.homework;

public class Skoda implements Car{
    private int Speed;

    public Skoda(int Speed){
        this.Speed = Speed;
    }
    @Override
    public int getSpeed() {
        return Speed;
    }

    @Override
    public void increaseSpeed() {
        Speed = Speed + 20;

    }

    @Override
    public void decreaseSpeed() {
        Speed = Speed - 10;

    }
}
