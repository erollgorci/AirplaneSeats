import javax.swing.*;
public class Dalja {

   public boolean Dalja(Hyrjet h ,Sortuesi s ,int kolonat ,int rreshtat ,String emri ,String mbiemri,String[][] tabela){
      String in = emri.charAt(0)+""+mbiemri.charAt(0);
      in = in.toUpperCase();
      int shablloni[][] = s.vendet();
      for(int count_rreshtat = 0 ; count_rreshtat < rreshtat ; count_rreshtat++){
         for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
            if(shablloni[count_kolonat][count_rreshtat] == 1 && tabela[count_kolonat][count_rreshtat] == null){tabela[count_kolonat][count_rreshtat] = "["+in+"]";} 
         }
   }
      System.out.println("    A   B      C   D");
      for(int count_rreshtat = 0 ; count_rreshtat < rreshtat ; count_rreshtat++){
      if(count_rreshtat != 9){System.out.print((count_rreshtat+1)+"  ");}
         else{System.out.print((count_rreshtat+1)+" ");}
         for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
               if(tabela[count_kolonat][count_rreshtat] == null){System.out.print("[  ]");}
                  else{System.out.print(tabela[count_kolonat][count_rreshtat]);}
               if(count_kolonat == 1){System.out.print("   ");}
         }
         System.out.println("");
   }
   JOptionPane.showMessageDialog(null,emri+" rezervimi është kryer me sukses !");
   boolean vazhdo;
   char p = h.pyetjaShtes("A deshironi të bëni rezervim tjetër ?(Y/N)");
   if(p == 'Y'){vazhdo = true;}
     else {JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");vazhdo = false;}
   return vazhdo;
 }

   /*public static void main(String[] args){
      Hyrjet h = new Hyrjet(40);
      Sortuesi s = new Sortuesi(h,4,10,1,'E','N');
      Dalja d = new Dalja(h,s,4,10);
   }*/
}