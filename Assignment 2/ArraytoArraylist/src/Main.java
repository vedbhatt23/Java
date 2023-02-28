import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ATA obj = new ATA();
        ArrayList l = obj.ATAL();
        obj.ALTA(l);
    }
}
class ATA {
    private ArrayList j;

    ArrayList ATAL() {
        String[] names = {"A", "B", "C", "D", "E"};
        ArrayList<String> a1 = new ArrayList<String>();
        for (int i = 0; i < names.length; i++) {
            a1.add(names[i]);
        }
        System.out.println("Original ArrayList : ");
        for (int i = 0; i < names.length; i++) {
            System.out.print(a1.get(i)+ " ");
        }

        a1.add("X");
        a1.add("Y");
        a1.add("Z");

        System.out.println("\nNew ArrayList : ");
        for (int i = 0; i < a1.size(); i++) {
            System.out.print(a1.get(i)+ " ");
        }
        return (a1);
    }

    void ALTA(ArrayList j) {
        this.j = j;
        String[] str = new String[5];

        System.out.println("\nArray : ");

        for (int i = 0; i < str.length; i++) {
            str[i]=(String) j.get(i);
        }

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+  " ");
        }
    }
}