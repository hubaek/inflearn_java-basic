package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1);  // value1은 초기화 하지 않았지만 자동으로 0으로 초기화
        System.out.println("value2 = " + data.value2);
    }
}
