package org.zerock.cleanaido_customer_back.category.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@ToString
public class Category {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_number", unique = true, nullable = false)
    private Long cno;

    @Column(name = "category_name", nullable = false, length = 100)
    private String cname;

    @Column(name = "depth", nullable = false, length = 100)
    private int depth;

    @Column(name = "parent")
    private Long parent;

}
