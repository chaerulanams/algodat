
package arraylinierlist;

public class Tampilan {
       public static void main(String [] args){
        Tugas  tampil = new Tugas_B();
        tampil.add(0,"A");tampil.add(1,"B");
        tampil.add(2,"C");tampil.add(3,"D");
        tampil.add(4,"E");
        
        for (int j = 0; j < tampil.size(); j++) {
        System.out.println(tampil.element[j]);
        }
        System.out.println("PANJANG ARRAY = "+tampil.size());
        System.out.println("---ARRAY YG BELUM DI TRIM--- = "+tampil.capacity);
        tampil.trimToSize();
        System.out.println("---ARRAY SETELAH DI TRIM--- = "+tampil.capacity);
        tampil.setSize(8);
        System.out.println("ELEMEN DI SET MENJADI = " +tampil.element2.length);
        tampil.remove(1);
        System.out.println("SETELAH 1 INDEX DI HAPUS :");
        for (int i = 0; i < tampil.size(); i++) {
            System.out.print(tampil.element[i]);
            System.out.println("");
        }
    } 
}
