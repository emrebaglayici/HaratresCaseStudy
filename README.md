Written with TDD , lastly added main methods for optional.
1.	Merge String
Fonksiyonumuz string olarak 2 parametre alacak. String a ve String b. Amacımız bu iki stringi tek bir stringte sırasıyla birleştirmek.

Örneğin:
String a = hrte
String b = aars

Çıktı: haratres

Kısıtlar
a ve b nin boyuları 1< a, b < 2500 olmalıdır

Ödev java programlama dilinde yazılacaktır. Her ödev ayrı sınıfta olacaktır. Değerlendirme işlemi her için önceden yazılmış unit test methodlarından geçirilerek yapılacaktır.

Kısıtlara uymayan durumlarda system exception throw etmeli.


2.	Yakın Numaralar Problemi
      Dışardan parametre olarak integer sayılardan oluşan bir array alacağız. Bu array içerisindeki mutlak olarak en yakın sayıları tespit etmemiz ve sıralı şekilde yazdırmamız gerekiyor farkımız 0 dan büyük olmalı. Örneğin: Parametre olarak A= { 3, 1, 5, 23, 2, 4, 9, 10, 15, 31 }  min fark = |2-1| = 1 veya |5-4| = 1 demek oluyor bizim arrayimizdeki yakınlık seviyemiz minum 1 o zaman uygulamamızın çıktısı şu şekilde olmalı

1 2
2 3
3 4
4 5
9 10


Eğer listemiz B = { 32, 41, 12 , 15, 21, 32, 48, 35} şekilde olsaydı mutlak en küçük farkımız: |12 - 15| = 3

Çıktımız: String array olarak : D = {"12 15", "32 35"} şeklinde olmalı.

Kısıtlar: Arrayimizin boyu  1 < n < 1000    arrayimizin elemanları ise -20.000 < i < 20.000

Ödev java programlama dilinde yazılacaktır. Her ödev ayrı sınıfta olacaktır. Değerlendirme işlemi her için önceden yazılmış unit test methodlarından geçirilerek yapılacaktır.

Kısıtlara uymayan durumlarda system exception throw etmeli.



3.	Alışveriş Sepeti
      Dışardan parametere olarak integer bir array alınacak. Bu araydeki her bir değer sepetimizdeki ürünleri ifade ediyor. Eğer sepetimdeki üründen sonraki gelen ürünün fiyatı daha düşük ise o ürünün fiyatı kadar indirim uygulanacaktır.

Örneğin A = {5, 6, 4, 3, 4 }  2. ürün birinci üründen büyük olduğu için birinci ürüne indirim uygulanmaz ama 3. ürün 2. üründen ucuz olduğu için 2. ürüne 4 lira indirim uygulanır. Aynı şekilde 4. ürün 3. üründen ucuz olduğu için 3 lira indirim uygulanır. Yani sepetimizdeki ürünlerin indirim uygulandıktan sonraki fiyatları şu şekilde olur: B = { 5, 2, 1, 3, 4 }

Sonuçlara sizlerden istenen
a.	Sepetimizin son tutarının hesaplanması.
b.	Sepetimizde indirim uygulanmayan elamanların küçükte büyüğe yazdırılması.

Örnek çıktı: Toplam tutar: 15,  İndirim yapılmayan kalemler, C = {3, 4, 5}

Kısıtlar: Arrayimizin boyu  1 < n < 100    arrayimizin elemanları ise 0 < i < 2.000

Ödev java programlama dilinde yazılacaktır. Her ödev ayrı sınıfta olacaktır. Değerlendirme işlemi her için önceden yazılmış unit test methodlarından geçirilerek yapılacaktır.

Kısıtlara uymayan durumlarda system exception throw etmeli.


Çıktı doğru değilse 5 puan .
Kısıtlara uyulmamış 3 puan.
Kod yazım kurallarına uyguması farklı bir çözüm bulması 2 puan. 


