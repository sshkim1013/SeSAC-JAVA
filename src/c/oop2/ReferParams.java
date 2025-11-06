package c.oop2;

class Data {
    int value;
}

public class ReferParams {

    void changeValue99(Data data) {
        data.value = 99;
        System.out.println("변경된 data.value = " + data.value);
    }

    public static void main(String[] args) {
        ReferParams refer = new ReferParams();
        Data data = new Data();
        data.value = 10;
        System.out.println("첫 data.value = " + data.value);
        refer.changeValue99(data);
        System.out.println("최종 data.value = " + data.value);
    }
}
