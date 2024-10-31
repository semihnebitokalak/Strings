public class Main {
    public static void main(String[] args) {
        String mesaj = "Today, the weather is very hot!";
        System.out.println(mesaj);
        // Mesaj adlı değişkenin uzunluğunu bulalım.
        System.out.println("Uzunluk > "+mesaj.length());
        // İstenilen elemanı yazdırmak için charAt kullanırız.
        System.out.println("5. eleman > "+mesaj.charAt(4));
        // String ifadeye bir şeyler eklemek istersek şöyle yaparız.
        System.out.println(mesaj.concat(" Yehuuuu!"));
        System.out.println(mesaj.startsWith("T"));
        // Başta dediğimiz gibi küçük büyük harf kullanımı önemlidir.
        System.out.println(mesaj.startsWith("t"));
        System.out.println(mesaj.endsWith("u"));
        System.out.println(mesaj.startsWith("A"));
        System.out.println(mesaj.endsWith("!"));
        // Yukarıda yazdığımız kodların çıktısından anlayacağınız üzere başlangıç ve bitiş
        // değerlerinin doğru olup olmaması koşulunda true ve false değeri yazdırılır.
        char[] karakterler = new char[5];
        // aşağıda mesaj stringinde başlayacağımız ve bitireceğimiz noktaları belirliyoruz.
        // Ondan sonra yazdırmak istediğimiz yere nereden başladığını belirtip yazdırıyoruz.
        mesaj.getChars( 0,  5, karakterler,  0);
        System.out.println(karakterler);
        // İlk karşılaşılan ifadede durur ve hangi index bloğunda olduğunu gösterir.
        System.out.println(mesaj.indexOf('a'));
        // Tam terside mevcuttur.
        System.out.println(mesaj.lastIndexOf('a'));
        // Şimdi ise istediğimiz ifadeyi değiştiren fonksiyonu kullanacağız.
        // Aşağıda boşluk karakterlerini kısa çizgi şeklinde çeviriyoruz.
        String yenimesaj = mesaj.replace(' ', '-');
        System.out.println(yenimesaj);
        System.out.println(mesaj.substring(0, 4)); // Burada verilen indexler arasını yaz demektir.
        System.out.println(mesaj.substring(4));// böyle yaparsak 4. indexten başlar
        // sona kadar yazar.
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        // Yukarıda gördüğünüz iki fonksiyon büyük ve küçük yazmamızı sağlar.


    }
}