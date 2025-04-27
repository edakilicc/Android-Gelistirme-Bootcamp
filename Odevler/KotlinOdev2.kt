package com.example

// Ödev 2: Fonksiyonlar burada, hepsi ayrı ayrı yapıldı.

/**
 * Girilen dereceyi Fahrenheit'a çeviren metod
 * Kullanılan formül: F = C × 1.8 + 32
 */
fun dereceyiFahrenheitaCevir(derece: Double): Double {
    return derece * 1.8 + 32
}

/**
 * Kenarları verilen dikdörtgenin çevresini hesaplayan metod
 * Çevre = 2 × (uzunluk + genişlik)
 */
fun dikdortgenCevresi(uzunluk: Double, genislik: Double): Double {
    return 2 * (uzunluk + genislik)
}

/**
 * Girilen sayının faktöriyelini hesaplayan metod
 * Örneğin 5 girersek, 5×4×3×2×1 işlemini yapar
 */
fun faktoriyelHesapla(sayi: Int): Long {
    var sonuc: Long = 1
    for (i in 1..sayi) {
        sonuc *= i.toLong()
    }
    return sonuc
}

/**
 * Girilen kelimenin içinde kaç tane 'a' harfi olduğunu bulan metod
 * Büyük küçük harf ayrımı yapmıyoruz
 */
fun aHarfiSayisi(kelime: String): Int {
    var sayac = 0
    for (harf in kelime) {
        if (harf == 'a' || harf == 'A') {
            sayac++
        }
    }
    return sayac
}

/**
 * Kenar sayısına göre çokgenin iç açıları toplamını bulan metod
 * Formül: (kenar sayısı - 2) × 180
 */
fun icAcilarToplami(kenarSayisi: Int): Int {
    return (kenarSayisi - 2) * 180
}

/**
 * Girilen gün sayısına göre maaş hesaplayan metod
 * 1 gün = 8 saat çalışılıyor
 * 160 saatten fazlası mesai olarak sayılıyor
 */
fun maasHesapla(gunSayisi: Int): Int {
    val gunlukSaat = 8
    val normalSaatUcreti = 10
    val mesaiSaatUcreti = 20
    val mesaiBaslangic = 160

    val toplamSaat = gunSayisi * gunlukSaat

    return if (toplamSaat <= mesaiBaslangic) {
        toplamSaat * normalSaatUcreti
    } else {
        val normalUcret = mesaiBaslangic * normalSaatUcreti
        val mesaiSaatleri = toplamSaat - mesaiBaslangic
        val mesaiUcreti = mesaiSaatleri * mesaiSaatUcreti
        normalUcret + mesaiUcreti
    }
}

/**
 * Kota miktarına göre internet ücreti hesaplayan metod
 * 50 GB'a kadar 100 TL, aşım olursa her 1 GB için 4 TL ekleniyor
 */
fun kotaUcretiHesapla(kota: Int): Int {
    val temelKota = 50
    val temelUcret = 100
    val ekstraGbUcreti = 4

    return if (kota <= temelKota) {
        temelUcret
    } else {
        val fazlaGb = kota - temelKota
        temelUcret + (fazlaGb * ekstraGbUcreti)
    }
}
