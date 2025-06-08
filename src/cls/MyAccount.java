package cls;

public class MyAccount {
    private String id;              // 사용자 아이디
    private String password;        // 비밀번호

    public MyAccount() {
        id = "";
        password = "";
    }

    public MyAccount(String id, String pw) {
        this.id = id;
        password = pw;
    }

    // id, password 필드에 대해서 각각 setter와 getter를 정의하세요
    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPassword(String pw) {
        password = pw;
    }

    public String getPassword() {
        return password;
    }
    // toString 메소드를 재정의(Override)하세요
    // ID : xxxx
    // PASSWORD : xxxxx

    @Override
    public String toString() {
        return String.format("ID : %s\nPASSWORD : %s", id, password);
    }

    // equals 메소드를 재정의하여 id와 password가 완전히 동일하면 true를 반환하고 아니면 false를 반환하도록 정의하세요

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof MyAccount) )
            return false;

        MyAccount acc = (MyAccount)obj;
        return id.equals(acc.getId()) &&
               password.equals(acc.getPassword());
    }
}

// 파일이름(문자열), 파일 크기(int)를 필드로 갖는 클래스 MyFile을 정의하세요