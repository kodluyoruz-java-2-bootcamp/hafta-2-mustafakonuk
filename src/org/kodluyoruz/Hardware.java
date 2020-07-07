package org.kodluyoruz;

/**
 * Bu sınıf bilgisayar donanımları için hazırlanmış bir üst sınıftır.
 *
 * Her donanım için ortak olan 3 özellik vardır:
 *      - Markası (brand) (String türünde) Örnek: AMD, Intel, Nvidia, Samsung vs.
 *      - Fiyatı (price) (double türünde)
 *      - Çalışırken harcayacağı güç (power) (int türünde) Not: 1 ile 150 arasında bir değer verebilirsiniz.
 *
 * TODO Bu 3 özellik ve bunların metotları için gereken kodları bu sınıfın içine yazın
 */
public abstract class Hardware
{
    protected String brand; //Markası
    protected double price; //Fiyatı
    protected int power; //Harcadığı güç. 1 ile 150 arasında bir değer olmalı.

    public abstract String getBrand();

    public abstract void setBrand(String brand);

    public abstract double getPrice();

    public abstract void setPrice(double price);

    public abstract int getPower();

    public abstract void setPower(int power);
}