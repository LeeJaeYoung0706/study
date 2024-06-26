package jpabook.japshop.domain.extendsmapping.mappedSuperClass;

public class 설명 {
    /**
     * 예를 들어
     *
     * @Entity 패키지를 참조하면 된다.
     *
     *
     * 공통맵핑 이 필요할 때.
     * 상속 이라는 개념보다는 공통변수를 주는 개념이 맞다.
     *
     *
     * 중요
     * 1. 엔티티로 생성하면 안됨.
     * 2. 테이블과 매핑이 안됨.
     * 3. 부모클래스를 상속받는 자식클래스에게 변수 정보만 넘겨줌.
     * 4. 따라서, 부모타입으로 조회가 안됨.
     * 5. 추상클래스로 만드십쇼
     *
     *
     * 사용처
     * 1. 수정일 , 생성일 등 공통정보를 처리할 때 사용하십쇼.
     *
     */
}
