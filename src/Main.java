public class Main {

    public static void main(String[] args) {
        String message = "Hello, Java";

        System.out.println(message);
        System.out.println("eleman sayısı=" + message.length());//stringin toplam eleman sayısı length methodu ile yazdırılır.
        System.out.println("6.eleman=" + message.charAt(5));//chartAt methodu ilr istenilen indise ait eleman yazdırılır.
        System.out.println(message.startsWith("D"));//stringin ilk harfini sorgular ve boolean sonuç döndürür.
        System.out.println(message.endsWith("a"));//stringin son harfini sorgular ve boolean sonuç döndürür.
        System.out.println(message.concat(" Programming!"));//concatenation=birleştime
        System.out.println(message.indexOf(','));//"," kaçıncı indekste bulunduğunu döndürür.lastIndexOf ise aramayı sağdan başlayarak yapar.
        char[] array = new char[5];
        message.getChars(1,6,array,0);
        //sırayla stringin nereden başlanarak alınacağını,nerede biteceğini,nereye atılacağını ve atılacağı dizinin nereden başayacağını belirtir.
        System.out.println(array);
        System.out.println(message.substring(2,10));//stringi parçalamak için kullanılır.
        for(String word :message.split(" ")) {//split ile string i neye göre parçalanacaağı belirlenir
            System.out.println(word);
        }
    }
}
