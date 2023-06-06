package MyOwnArrayList2;

public class Main {
    public static void main(String[] args) {

        MyOwnArrayList2<Double> listDoubles = new MyOwnArrayList2<Double>();  //не пойму почему нужно 2 раза писать Тип, хотя на занятии один...

        listDoubles.addElement(3.5);
        listDoubles.addElement(4.5);
        listDoubles.addElement(5.5);

        double d1 = listDoubles.getElement(0);
        double d2 = listDoubles.getElement(1);
        double d3 = listDoubles.getElement(2);
        System.out.println(listDoubles);
        listDoubles.removeElement(2);
        System.out.println(listDoubles);


        MyOwnArrayList2<String> listStrings = new MyOwnArrayList2<String>();

        listStrings.addElement("Word1");
        listStrings.addElement("Word11");
        listStrings.addElement("Word111");

        String str1 = listStrings.getElement(0);
        String str2 = listStrings.getElement(1);
        String str3 = listStrings.getElement(2);
        System.out.println(listStrings);

        listStrings.removeElement(2);
        System.out.println(listStrings);



    }
}
