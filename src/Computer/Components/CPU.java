package Computer.Components;
import java.util.Scanner;
public class CPU {
    private double CoreSpeed;
    private final Scanner input = new Scanner(System.in);
    private int Cores , Threads;

    public CPU( double CoreSpeed , int Cores , int Threads){
        this.Threads = Threads;
        this.CoreSpeed = CoreSpeed;
        this.Cores = Cores;
    }
    public CPU (){
        CoreSpeed = 0;
        Cores =0;
        Threads = 0;
    }
    @Override
    public boolean equals(Object obj) {
        if ( this == obj) return true;
        if( getClass() == obj.getClass()){
            CPU temp = (CPU) obj;
            return CoreSpeed == temp.CoreSpeed && Cores == temp.Cores && Threads == temp.Threads;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Integer.hashCode(Cores) + Integer.hashCode(Threads) + Double.hashCode(CoreSpeed);
    }

    @Override
    public String toString() {
        return "\n" + getClass().getName() + " @Core Speed: " + CoreSpeed + " MHz \n Cores: " + Cores+ " Threads: " + Threads;
    }
    public double getCoreSpeed()
    {
        return CoreSpeed;
    }
    public int getCores()
    {
        return Cores;
    }
    public  int getThreads()
    {
        return Threads;
    }

    public void setCores(int cores) {
        Cores = cores;
    }

    public void setCoreSpeed(double coreSpeed) {
        CoreSpeed = coreSpeed;
    }

    public void setThreads(int threads) {
        Threads = threads;
    }

    public void setCoreSpeed()
{
    System.out.print("Enter number of Core Speed (MHz): ");
    while (!input.hasNextDouble())
    {
        input.nextLine();
        System.out.print("Incorrect type of data ! \n Enter number of Core Speed(MHz): ");
    }
    CoreSpeed = input.nextDouble();
}
    public void setCores()
    {

        System.out.print("Enter number of Cores: ");
        while (!input.hasNextInt())
        {
            input.nextLine();
            System.out.print("Incorrect type of data ! \n Enter number of Cores: ");
        }
        Cores = input.nextInt();
    }
    public void setThreads()
    {
        System.out.print("Enter number of Threads: ");
        while (!input.hasNextInt())
        {
            input.nextLine();
            System.out.print("Incorrect type of data ! \n Enter number of Threads: ");
        }
        Threads = input.nextInt();
    }
}
