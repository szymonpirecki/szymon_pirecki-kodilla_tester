package interfaces.homework;

public class Opel implements Car{
    private int Speed;

    public Opel(int Speed){
        this.Speed = Speed;
    }
    @Override
    public int getSpeed() {
        return Speed;
    }

    @Override
    public void increaseSpeed() {
        Speed = Speed + 25;

    }

    @Override
    public void decreaseSpeed() {
        Speed = Speed - 10;

    }
}
