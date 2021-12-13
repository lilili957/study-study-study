package com.lilili.com.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class Student {

    @ExcelProperty("姓名")
    private String name;

    @ExcelProperty("昵称")
    private String nickName;
}
