// UserMapper.java - MyBatis 인터페이스, XML에 정의된 쿼리를 호출하는 메서드를 선언

public interface UserMapper {
    
    // 예제 1: 기본 resultMap을 사용하는 메서드
    User selectUserById(int id);

    // 예제 2: 다중 객체 매핑을 사용하는 메서드
    User selectUserWithAddress(int id);

    // 예제 3: 컬렉션 매핑을 사용하는 메서드
    User selectUserWithOrders(int id);
}
