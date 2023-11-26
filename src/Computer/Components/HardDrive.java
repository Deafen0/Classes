package Computer.Components;

public class HardDrive {
    private double speed, storage;

    public HardDrive(double  speed , double storage)
    {
       this.speed = speed;
       this.storage = storage;
    }
    public HardDrive(){}

    @Override
    public boolean equals(Object obj) {
        if ( this == obj) return true;
        if( getClass() == obj.getClass()){
        HardDrive temp = (HardDrive) obj;
        return speed == temp.speed && storage == temp.storage;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return  Double.hashCode(speed) + Double.hashCode(storage);
    }

    @Override
    public String toString() {
        return "\n" + getClass().getName() + " @Speed: " + speed + " MB/s \n storage: " + storage + "GB";
    }
    public void setStorage(double storage) {
        this.storage = storage;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public double getStorage() {
        return storage;
    }
}
