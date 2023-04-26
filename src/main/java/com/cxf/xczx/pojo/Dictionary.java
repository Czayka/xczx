package com.cxf.xczx.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dictionary {
    private long id;
    private String name;
    private String code;
    private String itemValues;
}
