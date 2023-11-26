package Computer.Components;
import java.util.Scanner;

public class DVD {
    private final Scanner input = new Scanner(System.in);
    private double Perf;

    public DVD (double Perf ){
        this.Perf = Perf;
    }
    public DVD (){
        this.Perf = 0;
    }
    @Override
    public boolean equals(Object obj) {
        if ( this == obj) return true;
        if( getClass() == obj.getClass()){
            DVD temp = (DVD) obj;
            return Perf == temp.Perf;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return  Double.hashCode(Perf);
    }
    @Override
    public String toString() {
        return "\n" + getClass().getName() + " @Perfomance: " + Perf + " MB/s";
    }
    public double getPerf(){
        return  Perf;
    }

    public void setPerf()
    {
        System.out.print("Enter DVD Performance (MB/s): ");
        while (!input.hasNextDouble())
        {
            input.nextLine();
            System.out.print("Incorrect type of data ! \n Enter DVD Performance (MB/s): ");
        }
        Perf= input.nextDouble();
    }

}
