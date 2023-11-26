import Computer.Components.CPU;
import Computer.Components.DVD;
import Computer.Components.HardDrive;
import Computer.Components.RAM;
import Computer.Computer;



public class Main {
   public static  void main(String[] args){
       RAM r= new RAM(3600,16);
       CPU c = new CPU(3900, 6,12);
       DVD d = new DVD(200);
       HardDrive  h = new HardDrive(3400, 1024);
     Computer A = new Computer(c,r,d,h);
     //A.ConfiguratePC();
     System.out.print(A);
     A.TurnOn();
     A.Infect();
     System.out.print( " Is PC infected ? : " + A.isInfect() + "  Status (true = on , false = off): " + A.isStatus());
   }
}
