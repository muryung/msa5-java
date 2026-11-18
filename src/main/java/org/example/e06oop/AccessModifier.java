package org.example.e06oop;

public class AccessModifier {
    // default:     같은 패키지에 소속 된 클래스에서만 접근 가능
    String strDefault = "Default";

    // public:      클래스 내/외부 어디에서나 접근 가능
    public String strPublic = "Public";

    // private:     클래스 내부에서만 접근 가능
    private String strPrivate = "Private";

    // protected    같은 패키지 / 클래스 내부 / 자식 클래스에서 접근 가능
    protected String strProtected = "Protected";

    void fnDefault() {
        System.out.println("Default Fn");
    }

    public void fnPublic() {
        System.out.println("Public Fn");
    }

    private void fnPrivate() {
        System.out.println("Private Fn");
    }

    protected void fnProtected() {
        System.out.println("Protected Fn");
    }
}
