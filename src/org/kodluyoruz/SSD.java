package org.kodluyoruz;

/**
 * Bu sınıf bir SSD'yi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her SSD'nin Hardware sınıfındakilere ek olarak 1 özelliği vardır:
 *      - Hafıza boyutu, GB cinsinden (memory) (int türünde) Örnek: 500 GB, 750 GB vs.
 *
 * TODO Bu özellik ve metotları için gereken kodları bu sınıfın içine yazın
 */
public class SSD extends Hardware
{
    private int memory; //Hafıza boyutu.

    public int getMemory() {

        return memory;
    }

    public void setMemory(int memory) {

        this.memory = memory;
    }

    /*
     * Eğer SSD'nin hafızası 750 GB'tan fazlaysa, her 250 GB için fiyatı 275 TL artar.
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

        if (memory > 750) {
            memory -= 750;
            memory /= 250;
            price += memory * 275;
        }
        return price;
    }

    @Override
    public void setPrice(double price) {


        this.price = price;
    }

    @Override
    public int getPower() {

        return power;
    }

    @Override
    public void setPower(int power) {

        if (power >= 1 && power <= 150) {
            this.power = power;
        }
        else {

            this.power = power;
            System.out.println("SSD'de güç kullanımı [1-150] arasında olmalı!!");
        }
    }
}
