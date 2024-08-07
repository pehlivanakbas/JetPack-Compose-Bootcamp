package com.techcariernet.compose.myapplication.standart_programlama

import java.util.Scanner

fun main() {
    var city: String = "Istanbul"
    println("Sehir Adı: $city")
    println("----------------------------------------------------------------------")

    var country = "Turkiye"
    println("Ülke adı: $country")
    println("----------------------------------------------------------------------")

    var phoneNumber: String = "+90 530 123 45 67"
    println("Telefon numarası: $phoneNumber")
    println("----------------------------------------------------------------------")

    val postCode: Int = 1233456
    println("Posta Kodu: ${postCode}")
    println("----------------------------------------------------------------------")

    val email: String = "pehlivanakbas@icloud.com"
    println("Email Adresiniz: $email")
    println("----------------------------------------------------------------------")

    val profession = "Android Developer"
    println("Mesleğiniz: $profession")
    println("----------------------------------------------------------------------")

    val stockQuantity = 1000
    println("Stok Adedi: $stockQuantity")

    println("----------------------------------------------------------------------")

    val costumer_name = listOf("Ahmet", "Mehmet", "Ayşe", "Fatma")
    val balance = listOf(1000, 3000, 4000, 2000)
    val birthday = listOf(2000, 1993, 1999, 1970)
    val marialStatus = mutableListOf("1", "2", "1", "2")
    val comments = listOf("*", "****", "*****", "**")

    for (i in 0..costumer_name.size - 1) {
        when (marialStatus[i]) {
            "1" -> marialStatus[i] = "Evli"
            "2" -> marialStatus[i] = "Bekar"
        }
        println(
            "Müşteri Adı: ${costumer_name[i]} \n" +
                    "bakiye: ${balance[i]}, \n" +
                    "Doğum günü: ${birthday[i]} \n" +
                    "Medeni Durumu: ${marialStatus[i]}\n" +
                    "Ürün Yorumu: ${comments[i]}"
        )
        println("----------------------------------------------------------------------")
    }

    val paymentDate = "15.12.2024"
    println("Ödeme Tarihi: $paymentDate")

    println("----------------------------------------------------------------------")
    val paymentType = "CreditCard"
    println("Ödeme Yöntemi: $paymentType")
    println("----------------------------------------------------------------------")

    val orderQuantity = 10
    println("Sipariş adedi $orderQuantity")
    println("----------------------------------------------------------------------")
    var carModel = "Toyota"
    println("Araba modeli: $carModel")
    println("----------------------------------------------------------------------")

    var bookName = "Suç ve Ceza"
    var publishDate = "1866"
    println("Kitabın adı: $bookName ve yayım tarihi: $publishDate")
    println("----------------------------------------------------------------------")

    var discount = 20
    println("indirim oranı %$discount")
    println("----------------------------------------------------------------------")

    var roomCount = 3
    println("Oda sayısı: $roomCount")
    println("----------------------------------------------------------------------")

    var latitude = "36.12.1234"
    var longitude = "45.43.1234"
    println("Enlem: $latitude ve Boylam $longitude")
    println("----------------------------------------------------------------------")

    var productName: String = "Macbook Air"
    println("Ürünün Adı: $productName")
    println("----------------------------------------------------------------------")


    var mealPrice = 123
    println("Yemek ücreti $mealPrice ₺")
    println("----------------------------------------------------------------------")

    var brand = "Hp"
    println("Marka Adı $brand ")
    println("----------------------------------------------------------------------")

    var musicName = "Barış Manco - Gülpembe"
    println("Müzik Adı $musicName ")
    println("----------------------------------------------------------------------")

    var videoLength = 25
    println("Video uzunluğu: $videoLength'dk")
    println("----------------------------------------------------------------------")

    var productScore = 5
    println("Ürün $productScore puandır.")
    println("----------------------------------------------------------------------")

    var imageName = "qwerty"
    println("Resim adı: $imageName")
    println("----------------------------------------------------------------------")

    var fileFormat = "png"
    println("Dosya formatı: .$fileFormat")
    println("----------------------------------------------------------------------")

    val color = "Beyaz"
    println(color)
    println("----------------------------------------------------------------------")

    val colorCode = 1232456
    println("Renk kodu: #$colorCode")
    println("----------------------------------------------------------------------")

    val phoneModel = "Samsung S24"
    println("Telefon modeli: $phoneModel")
    println("----------------------------------------------------------------------")

    val screenSize = 19
    println("Ekran boyutu: $screenSize inch'dir.")
    println("----------------------------------------------------------------------")

    val weight = 100
    println("Kilonuz $weight kg'dır")
    println("----------------------------------------------------------------------")

    val nationalDay = listOf("19.05", "23.04", "30.08", "29.10")
    println("Belirtilen tarihin Ulusal Gün Olup olmadığını öğrenmek için lütfen aralarına nokta koyarak GÜN.AY cinsinden tarihi giriniz")
    val input = Scanner(System.`in`)
    val date = input.nextLine()
    if (date in nationalDay) {
        println("Girilen tarih ulusal gündür.")
    } else {
        println("Girilen tarih ulusal gün değildir.")
    }
    println("----------------------------------------------------------------------")

    var restDay:Boolean=false
    var days = 7
    when (days) {
        1 -> restDay
        2 -> restDay
        3 -> restDay
        4 -> restDay
        5 -> restDay
        6 -> restDay=true
        7 -> restDay=true

        else ->
            println("1 Hafta 7 Gündür.")
    }
    if (restDay==true){
        println("Bugün tatil günüdür.")
    }

    println("----------------------------------------------------------------------")

    val reservationDate="12.01.2025"
    println("Rezerve ettiğiniz tarih: $reservationDate'dir.")
    println("----------------------------------------------------------------------")

    val streetName="Yıldıztepe Sokak"
    val busline="320A"
    println("Sokagınızın adı $streetName ve Rota üzerinde $busline hattı geçmektedir. ")
    println("----------------------------------------------------------------------")

    var remainingMinutes=100
    println("kalan Dakikanız: $remainingMinutes")
    println("----------------------------------------------------------------------")

    var trackkingCode="TK12334A1231B24"
    println("Takip kodunuz: $trackkingCode")
    println("----------------------------------------------------------------------")

    var couponperiod="3"
    var couponCode="ASD123554GDS"
    println("Kupon süreniz: $couponperiod ay ve Kupon kodunuz: $couponCode'dir.")
    println("----------------------------------------------------------------------")
    var billAdress="Maltepe/ISTANBUL"
    println("Fatura Adresiniz: $billAdress")
}



