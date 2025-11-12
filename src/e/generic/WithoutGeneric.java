package e.generic;

class Box {

    private Object item;

    public Object getItem() {
        return item;
    }

    public void setItem(Object item) {
        this.item = item;
    }
}

class StringBox {
    private String item;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}

public class WithoutGeneric {

    public static void main(String[] args) {
        Box box = new Box();
        box.setItem("Hello");
        // System.out.println(box.getItem());  // Hello <- 문자열
        String str = (String) box.getItem();    // 명시적 형변환 사용

        box.setItem(123);
        System.out.println(box.getItem());  // 123 <- 숫자

        StringBox sb = new StringBox();
        sb.setItem("Hello");
        System.out.println(sb.getItem());   // Hello <- 문자열

        // sb.setItem(123);  <- 컴파일 에러(문자열만 받는 박스)
    }
}
