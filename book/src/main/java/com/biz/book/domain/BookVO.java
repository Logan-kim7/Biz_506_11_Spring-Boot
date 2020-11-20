package com.biz.book.domain;

import javafx.scene.NodeBuilder;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name="tbl_book")
public class BookVO {

    @Id // 기본키 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // vo에서 저장되어있는 변수이름하고 테이블에서 저장되어있는  변수명을 다르게 쓰고싶을때 사용
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "str_name")
    private String strName;

    @Column(columnDefinition = "VARCHAR(125)")
    private String title;

    @Column(length= 30)
    private String author;

    @Column(length = 125)
    private String comp;

    @Column(nullable = true)
    private int price;



}

