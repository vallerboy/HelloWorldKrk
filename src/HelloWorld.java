/**
 * Created by Lenovo on 07.08.2017.
 */
public class HelloWorld {

    public static void main(String[] args){
        System.out.println("HelloWorld");
       final int myCash = Integer.MAX_VALUE;

        System.out.println(myCash);

        String text = "Ala ma kota, ale kot też ma\n Ale i wyszły niezłe jaja ółżź";
        System.out.println(text);

        char sex = 'ź';
        System.out.println((int)sex);

        String textOne = null;
        String textTwo = "";
        String textThree = "Cześć!";

        System.out.println(textOne);

        int myAge = 10;
        int yourAge = 12;
        System.out.println("Mój wiek to: " + ((double)myAge / yourAge));



        int intMyText = 123;
        String myText = String.valueOf(intMyText);

        System.out.println(myText);

    }


}
