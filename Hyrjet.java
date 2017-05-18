import javax.swing.*;
public class Hyrjet{
   public int sa_ulse;
   public Hyrjet(int ulset){
      sa_ulse = ulset;
      JOptionPane.showMessageDialog(null,"Pershendetje, mirë se erdhet ne agjensionin XX !");
   }

   public String emri(){
      String emri = "";
      String e = JOptionPane.showInputDialog("Emri :");
      if(e == null){
         JOptionPane.showMessageDialog(null,"Ju keni kerkuar ta nderpreni aplikacionin!");
         System.exit(0);}
      else if(e.length() != 0){
         e = e.trim();
         emri = e;
         }
      else{
      JOptionPane.showMessageDialog(null,"Jepni nje Emer valid !");
      emri = emri();
 }
 return emri;
}

   public String mbiemri(){
      String mbiemri = "";
      String m = JOptionPane.showInputDialog("Mbiemri :");
      if(m == null){
         JOptionPane.showMessageDialog(null,"Ju keni kerkuar ta nderpreni aplikacionin!");
         System.exit(0);}
      else if(m != null && m.length() != 0){
         m = m.trim();
         mbiemri = m;
         }
      else{
      JOptionPane.showMessageDialog(null,"Jepni nje Mbiemer valid !");
      mbiemri = mbiemri();
 }
 return mbiemri;
}

   public int nr_ulseve(){
      int ulset = 0;
      String u = JOptionPane.showInputDialog("Sa ulse dëshironi ti rezervoni  :");
      if(u == null){
         JOptionPane.showMessageDialog(null,"Ju keni kerkuar ta nderpreni aplikacionin!");
         System.exit(0);}
      u = u.trim();
       try {ulset = Integer.parseInt(u);}
       catch(NumberFormatException e) { 
          JOptionPane.showMessageDialog(null, "Duhet të jepni vlerë të saktë të ulseve");
          ulset = nr_ulseve();
          }
          if( ulset <= 0 ){
          JOptionPane.showMessageDialog(null, "Duhet të jepni vlerë të saktë të ulseve");
          ulset = nr_ulseve();}
          else if(ulset >= sa_ulse){
          JOptionPane.showMessageDialog(null, "Nuk mund te rezervoni me shum ulse se sa ka te disponueshme!");
          ulset = nr_ulseve();}
        return ulset;
}

   public char klasa(){
      char klasa;
      String k = JOptionPane.showInputDialog("Cilën klasë dëshironi të zgjedhni: ekonomike(E),apo klasën e parë(F) ? (E/F)");
      if(k == null){
         JOptionPane.showMessageDialog(null,"Ju keni kerkuar ta nderpreni aplikacionin!");
         System.exit(0);}
      k = k.trim();
      k = k.toUpperCase();
      if(k.length() != 1){
         JOptionPane.showMessageDialog(null, "Duhet të jepni vlerë të saktë të klasës!");
          klasa = klasa();
      }else if(k.charAt(0) != 'E' && k.charAt(0) != 'F'){
         JOptionPane.showMessageDialog(null, "Duhet të jepni vlerë të saktë të klasës!");
          klasa = klasa();
      }else {klasa = k.charAt(0);}
    return klasa;
 }
 
   public char vendi(){
      char vendi;
      String v = JOptionPane.showInputDialog("A dëshironi të uleni afër dritarës:Po(Y) apo Jo(N)? (Y/N)");
      if(v == null){
         JOptionPane.showMessageDialog(null,"Ju keni kerkuar ta nderpreni aplikacionin!");
         System.exit(0);}
      v = v.trim();
      v = v.toUpperCase();
      if(v.length() != 1){
         JOptionPane.showMessageDialog(null, "Duhet të jepni përgjigjeni me Y apo N !");
          vendi = vendi();
      }else if(v.charAt(0) != 'Y' && v.charAt(0) != 'N'){
         JOptionPane.showMessageDialog(null, "Duhet të jepni përgjigjje të saktë !");
          vendi = vendi();
      }else {vendi = v.charAt(0);}
    return vendi;
 }
  public char pyetja(int vendet_e_kerkuara,int vende_te_lira,String klasa_aktuale,String klasa_tjeter){
      char pyetja;
      String a = JOptionPane.showInputDialog(null,"A dëshironi " + vende_te_lira + " vende ti rezervoni në klasën e "+klasa_aktuale+" dhe " + (vendet_e_kerkuara-vende_te_lira) +" vende tjera ti rezervoni në klasën "+klasa_tjeter+": Po(Y) apo Jo(N)? (Y/N)?");
      if(a == null){
         JOptionPane.showMessageDialog(null,"Ju keni kerkuar ta nderpreni aplikacionin!");
         System.exit(0);}
      a = a.trim();
      a = a.toUpperCase();
      if(a.length() != 1){
         JOptionPane.showMessageDialog(null, "Duhet të jepni përgjigjeni me Y apo N !");
          pyetja = pyetja(vendet_e_kerkuara ,vende_te_lira ,klasa_aktuale ,klasa_tjeter);
      }else if(a.charAt(0) != 'Y' && a.charAt(0) != 'N'){
         JOptionPane.showMessageDialog(null, "Duhet të jepni përgjigjje të saktë !");
          pyetja = pyetja(vendet_e_kerkuara ,vende_te_lira ,klasa_aktuale ,klasa_tjeter);
      }else {pyetja = a.charAt(0);}
    return pyetja;
 }
  public char pyetjaShtes(String pyetjaUserit){
      char pyetja;
      String a = JOptionPane.showInputDialog(null,""+pyetjaUserit);
      if(a == null){
         JOptionPane.showMessageDialog(null,"Ju keni kerkuar ta nderpreni aplikacionin!");
         System.exit(0);}
      a = a.trim();
      a = a.toUpperCase();
      if(a.length() != 1){
         JOptionPane.showMessageDialog(null, "Duhet të jepni përgjigjeni me Y apo N !");
          pyetja = pyetjaShtes(pyetjaUserit);
      }else if(a.charAt(0) != 'Y' && a.charAt(0) != 'N'){
         JOptionPane.showMessageDialog(null, "Duhet të jepni përgjigjje të saktë !");
          pyetja = pyetjaShtes(pyetjaUserit);
      }else {pyetja = a.charAt(0);}
    return pyetja;
 }
      
/*public static void main(String[] args){
   Hyrjet h = new Hyrjet(40);
   System.out.println(h.emri());
   System.out.println(h.mbiemri());
   System.out.println(h.nr_ulseve());
   System.out.println(h.klasa());
   System.out.println(h.vendi());   
}*/
}