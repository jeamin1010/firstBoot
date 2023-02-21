package com.toy.pro.domain;

import lombok.*;

@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class boardDTO {
    //eneity/테이블과 일치하는 요소
    private int vSeqId;
    private String bName;
    private String bTitle;
    private String bContent;
    private String bDate;
    private int bRef;
    private int bStep;
    private int bDept;
}
