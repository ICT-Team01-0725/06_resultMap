// User.java - 사용자 정보를 담는 클래스

import java.util.List;

public class User {
    private int id;
    private String username;
    private String email;       // 예제 1
    private Address address;    // 예제 2 (다중 객체 매핑)
    private List<Order> orders; // 예제 3 (컬렉션 매핑)

    // ~ Getters and setters ~
}
