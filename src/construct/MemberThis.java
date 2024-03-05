package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter;  // nameField앞에 this.가 생략되어 있음, 매개변수와 이름이 다르기 때문
    }

}
