package jpabook.japshop.domain.OneAndOne;

public class 개념설명 {

    /**
     *     * 1:1 관계
     *      *
     *      * 주테이블 관계나 대상 테이블 중에 외래키를 선택할 수 있음.
     *      * 아무 거나 둘다 가능하다는 뜻
     *      *
     *      * 외래키에 데이터베이스 유니크 제약조건을 사용해야함.
     *      *
     *      * 항상 개발자는
     *      * trade off 에 대해 고민하고 설계해야 한다.
     *      * 객체지향을 할 때에는 주 테이블에 외래키
     *      * 대상 테이블 할 때에는 DBA 입장에서 미래를 봤을 때 변경 ,
     *      * 단지 주 테이블에 외래키가 있을 때에는 null 을 허용해야하고,
     *      * 대상 테이블일 경우에는 JPA 설계상 양방향으로 설계해야하는 단점이 있다. 또한
     *      * 지연로딩으로 설정해도 즉시 로딩이 된다.
     *      *
     *      * 지연로딩은 좋은 건데 왜~!~!
     *      * 프록시 활용이 어렵다.
     *      * Member locker 를 조회 할 때 locker 를 뒤져야하는데,
     *      * 이렇게 되면 서브 쿼리를 사용해서 exist 할 때처럼 확인해야함.
     *      * 그렇기 때문에 프록시로 만들 필요가 없게 되고 즉시로딩이 된다.
     *      *
     *      * 프록시 객체 경우에는
     *      * 값이나 null 을 넣어야하는데 이미 쿼리를 넣어야 확인 할 수 있기 때문에
     *      * 결국 지연로딩을 하지 않고 바로 쿼리를 날리는 형태로 가는 것
     *      *
     *      * 이 단점은 크다.
     */
}
