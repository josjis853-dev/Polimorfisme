/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfisme;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        Pegawai p = new Pegawai();
        p = new Progammer();
        p = new Manager();
        
        Manager m = new Manager();
        m.gajiPokok = 10000;
        m.nama = "Mamat";
        m.tunjangan = 50000;
        p = m;
        p.tampilData();
        
        m.tampilData();
        
        Pegawai[] arrPeg = new Pegawai[3];
        Progammer pr = new Progammer();
        pr.nama = "Eko"; pr.gajiPokok = 100000; pr.bonus = 12000;
        arrPeg[0] = p;
        arrPeg[1] = m;
        arrPeg[2] = new Progammer();
        arrPeg[0].tampilData();
        arrPeg[1].tampilData();
        
        hitungGajiTotal(m);
        hitungGajiTotal(pr);       
    }
    public static void hitungGajiTotal(Pegawai p){
        
        if(p instanceof Progammer){
            Progammer prog = (Progammer) p;
            int gajiTot = prog.bonus+prog.gajiPokok;
            System.out.println("Gaji Total Progammer ="+gajiTot);
        }
        else if(p instanceof Manager){
            Manager man = (Manager) p;
            int gajiTot = man.tunjangan+man.gajiPokok;
            System.out.println("Gaji Total Manager ="+gajiTot);
        }
    }
    
}
