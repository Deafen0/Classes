import Computer.Computer;



public class Main {
   public static  void main(String[] args){
     Computer A = new Computer();
     A.ConfiguratePC();
     System.out.print(A);
     A.TurnOn();
     A.Infect();
     System.out.print( " Is PC infected ? : " + A.isInfect() + "  Status (true = on , false = off): " + A.isStatus());
   }
}
