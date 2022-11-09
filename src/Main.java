import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> takSan = new ArrayList<>();
        ArrayList<Integer> jupSan = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            arrayList.add(random.nextInt(1, 100));
        }
        System.out.println(arrayList);
        for (Integer a: arrayList ){
            if (a%2==0){
                jupSan .add(a);
            }else {
                takSan.add(a);
            }
        }
        System.out.println("Жупсан"+jupSan );
        System.out.println("Таксан"+takSan );
    }
}

