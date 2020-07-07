package org.kodluyoruz;

/**
 * Bu sınıf bir RAM'i temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her RAM'in Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Hafıza boyutu (memory) (int türünde) Örnek: 8 GB, 16 GB vs.
 *      - Frekansı (frequency) (int türünde) Örnek: 3200 MHz, 3600 Mhz vs.
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class RAM extends Hardware
{
    private int memory; //Hafıza boyutu.
    private int frequency; //Frekans.

    public int getMemory() {

        return memory;
    }

    public void setMemory(int memory) {

        this.memory = memory;
    }

    public int getFrequency() {

        return frequency;
    }

    public void setFrequency(int frequency) {

        this.frequency = frequency;
    }

    /*
     * Eğer RAM'in hafızası 16 GB'tan fazlaysa, her 4 GB için fiyatı 100 TL artar.
     * Eğer RAM'in frekansı 3600 MHz'den fazlaysa, her 400 MHz için fiyatı 200 TL artar.
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

        if (memory > 16) {

            memory -= 16;
            memory /= 4;
            price += memory * 100;
        }
        if (frequency > 3600) {

            frequency -= 3600;
            frequency /= 400;
            price += frequency * 200;
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
            System.out.println("RAM'de güç kullanımı [1-150] arasında olmalı!!");
        }
    }
}
