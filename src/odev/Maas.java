package odev;

public class Maas {

    // günlük ücret ödevde belirtilmemiş, kendimce 200 tl olarak hesaplama yaptım

    public int maasHesapla(int gun){
        int prim=0;
        int maas;
        if(gun>25){
            maas = (gun*200)+(gun-25)*1000;
        }
        else{
            maas=gun*200;
        }
        return  maas;
    }

}
