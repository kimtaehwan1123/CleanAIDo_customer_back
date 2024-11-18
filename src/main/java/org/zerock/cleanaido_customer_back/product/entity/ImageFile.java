package org.zerock.cleanaido_customer_back.product.entity;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ImageFile {

    private int ord;
    private String fileName;
    private Boolean type;
}