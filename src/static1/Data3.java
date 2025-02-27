package static1;

public class Data3 {
    public String name;
    public static int count;    // static
    // static 변수는 인스턴스 영역 X, 메서드영역에서 관리

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
