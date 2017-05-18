import javax.swing.*;
public class Sortuesi{
   private int kolonat;
   private int rreshtat;
   private Hyrjet h;
   private int shablloni[][];
   public void Sortuesi(Hyrjet hyrjet ,int kolonat ,int rreshtat ,int vendet_e_kerkuara ,char klasa,char afer_dritares,int matrica[][]){;
      h  = hyrjet;
      int tabela[][] = matrica; 
      int vendet_e_lira =0;
      for(int count_rreshtat = 0 ; count_rreshtat < rreshtat ; count_rreshtat++){
         for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
            if(tabela[count_kolonat][count_rreshtat] == 0){vendet_e_lira++;}}}
      if(vendet_e_lira == 0){JOptionPane.showMessageDialog(null,"Të gjitha vendet e disponueshme janë rezervuar !");System.exit(0);}
      if(vendet_e_lira < vendet_e_kerkuara){JOptionPane.showMessageDialog(null,"Gjithsej janë vetem "+vendet_e_lira+" vende te lira");
                                            char p = h.pyetjaShtes("A deshironi të rezervoni me pak ulse ?");
                                            if(p == 'Y'){int vendet_e_kerkuara1 = h.nr_ulseve();
                                                         if(vendet_e_kerkuara1 < vendet_e_kerkuara){vendet_e_kerkuara = vendet_e_kerkuara1;}
                                                         else{JOptionPane.showMessageDialog(null,"Prap nuk ka vend te mjaftueshem sa keni kerkuar na falni !!");System.exit(0);}
                                            }
                                            else {JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}
                                            }
                                            
      if(klasa == 'F'){ 
               kontroll_klasa_e_pare(tabela ,afer_dritares ,vendet_e_kerkuara ,kolonat ,rreshtat);}     
         else{
               kontroll_klasa_e_dyte(tabela ,afer_dritares ,vendet_e_kerkuara ,kolonat ,rreshtat);}
      /*for(int count_rreshtat = 0 ; count_rreshtat < rreshtat ; count_rreshtat++){
         for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
            System.out.print(tabela[count_kolonat][count_rreshtat]+"\t");
         }
         System.out.println("");
      }*/
      shablloni = tabela;
   }
  
 private void kontroll_klasa_e_pare(int tabela[][] ,char dritarja,int vendet_e_kerkuara ,int kolonat ,int rreshtat){
      int vendet_e_lira =0;
      for(int count_rreshtat = 0 ; count_rreshtat < rreshtat/2 ; count_rreshtat++){
         for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
            if(tabela[count_kolonat][count_rreshtat] == 0){vendet_e_lira++;}}}
      if(vendet_e_lira != 0){
         if(vendet_e_lira >= vendet_e_kerkuara){
            if(dritarja == 'Y'){
               int vendi_afer_dritares = 1;
               for(int count_rreshtat = 0 ; count_rreshtat < rreshtat/2 ; count_rreshtat++){
                  for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat = count_kolonat+3){
                     if(tabela[count_kolonat][count_rreshtat] == 0 && vendi_afer_dritares > 0){tabela[count_kolonat][count_rreshtat] = 1; vendet_e_kerkuara--; vendi_afer_dritares--;}}}
               if(vendi_afer_dritares > 0){char p = h.pyetjaShtes("Nuk ka vende afër dritares a dëshironi ti rezervoni ne ulset tjera ? (Y/N)");
                                            if(p != 'Y'){JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}}
          }
          else{
               int vendi_afer_koridorit = 1;
               for(int count_rreshtat = 0 ; count_rreshtat < rreshtat/2 ; count_rreshtat++){
                  for(int count_kolonat = 1 ; count_kolonat < kolonat ; count_kolonat++){
                     if(tabela[count_kolonat][count_rreshtat] == 0 && count_kolonat != 3 && vendi_afer_koridorit > 0){tabela[count_kolonat][count_rreshtat] = 1; vendet_e_kerkuara--; vendi_afer_koridorit--;}}}
               if(vendi_afer_koridorit > 0){char p = h.pyetjaShtes("Nuk ka vende afër koridorit a dëshironi ti rezervoni ne ulset tjera ? (Y/N)");
                                            if(p != 'Y'){JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}}
          }
         }
         else{
               JOptionPane.showMessageDialog(null,"Gjithsej janë vetëm "+vendet_e_lira+" vende të lira në klasë të parë !");
               char a = h.pyetja(vendet_e_kerkuara,vendet_e_lira,"parë","ekonomike");
               if(a == 'Y'){
                     kontroll_klasa_e_dyte(tabela,'N',(vendet_e_kerkuara - vendet_e_lira) ,kolonat ,rreshtat);
                     vendet_e_kerkuara = vendet_e_lira;
               }
               else{JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}
               
        }
        for(int count_rreshtat = 0 ; count_rreshtat < rreshtat/2 ; count_rreshtat++){
                  for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
                     if(tabela[count_kolonat][count_rreshtat] == 0 && vendet_e_kerkuara > 0){tabela[count_kolonat][count_rreshtat] = 1; vendet_e_kerkuara--;}}
                  
         }
       }
        else{
               char a = h.pyetja(vendet_e_kerkuara,vendet_e_lira,"parë","ekonomike");
               if(a == 'Y'){
                    kontroll_klasa_e_dyte(tabela,'N', vendet_e_kerkuara ,kolonat ,rreshtat);
               }
               else{JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}
               
        }
 
 }
 
  private void kontroll_klasa_e_dyte(int tabela[][] ,char dritarja,int vendet_e_kerkuara ,int kolonat ,int rreshtat){
      int vendet_e_lira =0;
      for(int count_rreshtat = rreshtat/2 ; count_rreshtat < rreshtat ; count_rreshtat++){
         for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
            if(tabela[count_kolonat][count_rreshtat] == 0){vendet_e_lira++;}}}
      if(vendet_e_lira != 0){
         if(vendet_e_lira >= vendet_e_kerkuara){
            if(dritarja == 'Y'){
               int vendi_afer_dritares = 1;
               for(int count_rreshtat = rreshtat/2 ; count_rreshtat < rreshtat ; count_rreshtat++){
                  for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat = count_kolonat+3){
                     if(tabela[count_kolonat][count_rreshtat] == 0 && vendi_afer_dritares > 0){tabela[count_kolonat][count_rreshtat] = 1; vendet_e_kerkuara--; vendi_afer_dritares--;}}}
                     if(vendi_afer_dritares > 0){char p = h.pyetjaShtes("Nuk ka vende afër dritares a dëshironi ti rezervoni ne ulset tjera ? (Y/N)");
                                            if(p != 'Y'){JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}}
          }
          else{
               int vendi_afer_koridorit = 1;
               for(int count_rreshtat = rreshtat/2 ; count_rreshtat < rreshtat ; count_rreshtat++){
                  for(int count_kolonat = 1 ; count_kolonat < kolonat ; count_kolonat++){
                     if(tabela[count_kolonat][count_rreshtat] == 0 && count_kolonat != 3 && vendi_afer_koridorit > 0){tabela[count_kolonat][count_rreshtat] = 1; vendet_e_kerkuara--; vendi_afer_koridorit--;}}}
               if(vendi_afer_koridorit > 0){char p = h.pyetjaShtes("Nuk ka vende afër koridorit a dëshironi ti rezervoni ne ulset tjera ? (Y/N)");
                                            if(p != 'Y'){JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}}
          }
         }
         else{
               JOptionPane.showMessageDialog(null,"Gjithsej janë vetëm "+vendet_e_lira+" vende të lira në klasën ekonomike !");
               char a = h.pyetja(vendet_e_kerkuara,vendet_e_lira,"ekonomike","parë");
               if(a == 'Y'){
                     kontroll_klasa_e_pare(tabela,'N',(vendet_e_kerkuara - vendet_e_lira) ,kolonat ,rreshtat);
                     vendet_e_kerkuara = vendet_e_lira;
               }
               else{JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}
               
        }
        for(int count_rreshtat = rreshtat/2 ; count_rreshtat < rreshtat ; count_rreshtat++){
                  for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
                     if(tabela[count_kolonat][count_rreshtat] == 0 && vendet_e_kerkuara > 0){tabela[count_kolonat][count_rreshtat] = 1; vendet_e_kerkuara--;}}
                  
         }
       }
        else{
               char a = h.pyetja(vendet_e_kerkuara,vendet_e_lira,"ekonomike","parë");
               if(a == 'Y'){
                     kontroll_klasa_e_pare(tabela,'N', vendet_e_kerkuara ,kolonat ,rreshtat);
               }
               else{JOptionPane.showMessageDialog(null,"Faleminderit që keni zgjedhur agjencionin tonë!");System.exit(0);}
               
        }
 
 }
 
  public int[][] vendet(){return shablloni;}
  
      
/*public static void main(String[] args){
   Hyrjet h = new Hyrjet(40);
   Sortuesi s = new Sortuesi(h,4,10,1,'E','N');
 }*/
}



/* for(int count_rreshtat = 0 ; count_rreshtat < rreshtat ; count_rreshtat++){
         for(int count_kolonat = 0 ; count_kolonat < kolonat ; count_kolonat++){
            System.out.print(tabela[count_kolonat][count_rreshtat]+"\t");
         }
         System.out.println("");
      }*/