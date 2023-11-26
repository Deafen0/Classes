package Computer;

import Computer.Components.RAM;
import Computer.Components.CPU;
import Computer.Components.DVD;
import Computer.Components.HardDrive;
import java.util.Scanner;
public class Computer {
    private  RAM ram;
    private  CPU cpu;
    private  DVD dvd;
    private  HardDrive hardDrive;
    private  boolean status;
    private boolean Virus;
    private final Scanner input = new Scanner(System.in);
    public  Computer()
    {
        ram = new RAM();
        cpu = new CPU();
        dvd = new DVD();
        hardDrive = new HardDrive();
        status = false;
        Virus = false;
    }

    public  Computer(CPU c, RAM r , DVD d, HardDrive h )
    {
        ram = r;
        cpu = c;
        dvd = d;
        hardDrive = h;
        status = false;
        Virus = false;
    }
    public void ConfiguratePC() {
        cpu.setCores();
        cpu.setThreads();
        cpu.setCoreSpeed();
        System.out.print("Enter RAM speed (MHz): ");
        while(!input.hasNextDouble()) {
            input.nextLine();
            System.out.print("Incorrect!\nEnter RAM speed (MHz): ");
        }
        ram.setSpeed(input.nextDouble());
        System.out.print("Enter RAM storage (GB): ");
        while(!input.hasNextInt()) {
            input.nextLine();
            System.out.print("Incorrect!\nEnter RAM storage (GB): ");
        }
        ram.setStorage(input.nextInt());
        System.out.print("Enter Hard Drive storage (GB): ");
        while(!input.hasNextDouble()) {
            input.nextLine();
            System.out.print("Incorrect!\nEnter Hard Drive storage (GB): ");
        }
        hardDrive.setStorage(input.nextDouble());
        System.out.print("Enter Hard Drive speed (MB/s): ");
        while(!input.hasNextDouble()) {
            input.nextLine();
            System.out.print("Incorrect!\nEnter Hard Drive speed (MB/s): ");
        }
        hardDrive.setSpeed(input.nextDouble());
        dvd.setPerf();

    }
    public void TurnOn(){
        status = true;
    }
    public void TurnOff(){
        status = false;
    }
    public void Heal(){
        Virus = true;
    }
    public void Infect(){
        Virus = true;
    }
    public boolean isInfect() {
        return Virus;
    }

    public boolean isStatus() {
        return status;
    }

    @Override
    public boolean equals(Object obj) {
        if( this == obj) return  true;
        if( getClass() == obj.getClass()){
        return ram.equals(((Computer) obj).ram) && cpu.equals(((Computer) obj).cpu) && dvd.equals(((Computer) obj).dvd) && hardDrive.equals(((Computer) obj).hardDrive);
        }
        return false;
    }

    @Override
    public int hashCode(){
        return  ram.hashCode() + cpu.hashCode() + dvd.hashCode() +hardDrive.hashCode();
    }

    @Override
    public String toString() {
        return  "=============================" +
                getClass().getName() + ram.toString() + cpu.toString() + dvd.toString() + hardDrive.toString() +
                "\n =============================";
    }
}
