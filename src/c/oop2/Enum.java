package c.oop2;

import c.oop2.pratice1.Direction;

import java.util.Arrays;

public class Enum {

    public static void main(String[] args) {
        Direction direction = Direction.NORTH;
        System.out.println(direction);

        System.out.println(direction.name());

        // ordinal() : 몇번째 인덱스에 있는가??
        System.out.println(direction.ordinal());

        // values() : 내부 값 확인
        System.out.println(Arrays.toString(direction.values()));
    }
}
