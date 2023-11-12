package Computer.Components;

public class RAM {
    private double Speed;
    private int Storage;

    public RAM(){}
    public RAM(double speed ,  int storage){
        Speed = speed;
        Storage = storage;
    }

    @Override
    public boolean equals(Object obj) {
        if ( this == obj) return true;
        if( getClass() == obj.getClass()){
            RAM  temp = (RAM ) obj;
            return Speed == temp.Speed && Storage == temp.Storage;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(Storage)  + Double.hashCode(Speed);
    }

    @Override
    public String toString() {
        return "\n" + getClass().getName() + " @Speed: " + Speed + " MHz \n Storage: " + Storage + "GB ";
    }
    public int getStorage() {
        return Storage;
    }

    public double getSpeed() {
        return Speed;
    }

    public void setSpeed(double speed) {
        Speed = speed;
    }

    public void setStorage(int storage) {
        Storage = storage;
    }
}
