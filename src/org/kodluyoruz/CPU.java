package org.kodluyoruz;

/**
 * Bu sınıf bir işlemciyi temsil eder.
 * TODO Bu sınıfı Hardware sınıfının alt sınıfı haline getirin.
 *
 * Her işlemcinin Hardware sınıfındakilere ek olarak 2 özelliği vardır:
 *      - Çekirdek sayısı (cores) (int türünde)
 *      - Thread sayısı (threads) (int türünde)
 *
 * TODO Bu 2 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public class CPU extends Hardware
{
    private int cores; //Çekirdek sayısı.
    private int threads; //Thread sayısı.

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getThreads() {
        return threads;
    }

    public void setThreads(int threads) {
        this.threads = threads;
    }

    /*
     * Çekirdek sayısı 6 veya daha fazlaysa CPU'nun fiyatı %30 oranında artar.
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

        double tmp = 0;
        if (cores >= 6) {

            price += ((price*30)/100); //%30 fiyatı arttı.
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
            System.out.println("CPU'da güç kullanımı [1-150] arasında olmalı!!");
        }
    }
}
