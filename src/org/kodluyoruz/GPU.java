package org.kodluyoruz;

/**
 * Bu sınıf bir ekran kartını temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her ekran kartının Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 4 GB, 8 GB vs.
 *      - Renk skalası (bits) (int türünde) Örnek: 128 bits, 256 bits vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class GPU extends Hardware
{

    private int memory; //Hafıza boyutu.
    private int bits; //Renk skalası.

    public int getMemory() {

        return memory;
    }

    public void setMemory(int memory) {

        this.memory = memory;
    }

    public int getBits() {

        return bits;
    }

    public void setBits(int bits) {

        this.bits = bits;
    }

    /*
     * Eğer ekran kartının hafızası 8 GB'tan fazlaysa, her 2 GB için fiyatı 250 TL artar.
     * Eğer ekran kartının renk skalası 128 bits'ten fazlaysa, her 64 bits için fiyatı 400 TL artar.
     * TODO buna göre Hardware sınıfındaki fiyat hesaplayan metodu bu sınıfta yeniden yazın
     */

    @Override
    public String getBrand() {

        return brand;
    }

    @Override
    public void setBrand(String brand) {

        this.brand = brand;
    }

    @Override
    public double getPrice() {

        if ( memory > 8) {

            memory -= 8;
            memory /= 2;
            price += memory*250;
        }
        if ( bits > 128 ) {

            bits -= 128;
            bits /= 64;
            price += bits*400;
        }
        return price;
    }

    @Override
    public void setPrice(double price) {

        this.price = price;
        System.out.println(this.price);
    }

    @Override
    public int getPower() {

        return power;
    }

    @Override
    public void setPower(int power) {

        this.power = power;
    }
}
