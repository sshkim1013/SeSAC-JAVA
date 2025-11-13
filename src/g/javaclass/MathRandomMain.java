package g.javaclass;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MathRandomMain {

    public static void main(String[] args) {
        System.out.println(Math.PI);    // 3.141592653589793
        System.out.println(Math.sqrt(16));  // 4.0

        Random random = new Random();
        int num = random.nextInt(99999);
        System.out.println(num);

        double doubleBNum = random.nextDouble();
        System.out.println(doubleBNum);

        System.out.println("=== 주사위 ===");

        int dice = random.nextInt(6) + 1;
        System.out.println(dice);


        System.out.println("=== 로또 번호 생성기 ===");
        Set<Integer> lotto = new HashSet<>();

        while (lotto.size() < 6) {
            int randomNumber = random.nextInt(45) + 1;
            lotto.add(randomNumber);
        }
        System.out.println(lotto);
    }
}
