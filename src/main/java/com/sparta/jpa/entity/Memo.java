package com.sparta.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity // JPA가 관리할 수 있는 Entity 클래스 지정
// @Entity(name = "이름")으로 Entity의 이름을 지정할 수 있는데 Default 값은 Class의 이름과 똑같다
@Table(name = "memo") // 매핑할 테이블의 이름을 지정
@Getter @Setter
public class Memo {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    private Long id;

    // nullable: null 허용 여부
    // unique: 중복 허용 여부 (false 일때 중복 허용)
    @Column(name = "username", nullable = false, unique = true)
    private String username;

    // length: 컬럼 길이 지정(Default는 255)
    @Column(name = "contents", nullable = false, length = 500)
    private String contents;
}