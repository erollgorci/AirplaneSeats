public class AirplaneSeats {
   public static void main(String[] args){
      int nr_ulseve = 40;
      int nr_kolonave = 4;
      int tabela[][] = new int[nr_kolonave][nr_ulseve/nr_kolonave];
      Hyrjet h = new Hyrjet(nr_ulseve);
      Sortuesi s = new Sortuesi();
      Dalja d = new Dalja();
      String matrica[][] = new String[nr_kolonave][nr_ulseve/nr_kolonave];
      boolean vazhdo = true;
      while(vazhdo){
         String emri = h.emri();
         String mbiemri = h.mbiemri();
         int ulset_e_kerkuara = h.nr_ulseve();
         char klasa = h.klasa();
         char vendi = h.vendi();
         s.Sortuesi(h, nr_kolonave, nr_ulseve/nr_kolonave, ulset_e_kerkuara, klasa, vendi,tabela);
         vazhdo = d.Dalja(h, s, nr_kolonave, nr_ulseve/nr_kolonave,emri,mbiemri,matrica);
     
      } 
    }
}