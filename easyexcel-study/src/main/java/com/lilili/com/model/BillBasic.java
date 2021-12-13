package com.lilili.com.model;

import com.alibaba.excel.annotation.ExcelProperty;


import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.lilili.com.util.LocalDateConverter;
import lombok.Data;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;


/**
 * <p>
 *
 * </p>
 *
 * @author liyuan
 * @since 2021-11-04
 */
@Data
public class BillBasic {

    //    private Long id;
//    private String serialNumber;
//    @ExcelProperty(index = 0)
    @ExcelProperty("条目编号")
    private String itemCodee;
    @ExcelProperty(value = "单位代码")
//    @ExcelProperty(index = 1)
    private String agencyCode;

    @ExcelProperty(value = "交款人")
//    @ExcelProperty(index = 2)
    private String payer;

    //    @ExcelProperty(index = 3)
    @ExcelProperty(value = "交款人类型")
    private Integer payerType;

    //    @ExcelProperty(index = 4)
    @ExcelProperty(value = "单位组织机构代码")
    private String creditCode;
    ////
//    @ExcelProperty(index = 5)
    @ExcelProperty(value = "交款人手机号")
    private String payerTel;
    //
//    @ExcelProperty(index = 6, converter = LocalDateConverter.class)
    @ExcelProperty(value = "开票日期", converter = LocalDateConverter.class)
////    @JsonFormat(pattern = "yyyy/MM/dd")
////    @DateTimeFormat("yyyy/MM/dd")
    private LocalDate date;

    //    @ExcelProperty(index = 7)
    @ExcelProperty(value = "开票人名字")
    private String author;

    //    @ExcelProperty(index = 8)
    @ExcelProperty("票据种类编码")
    private String billCode;

    //    @ExcelProperty(index = 9)
    @ExcelProperty("合计金额")
    private BigDecimal totalAmt;

    //    @ExcelProperty(index = 10)
    @ExcelProperty(value = "收款方式")
    private Integer recMode;

    //    @ExcelProperty(index = 11)
    @ExcelProperty(value = "备注")
    private String memo;

    //    @ExcelProperty(index = 12)
    @ExcelProperty(value = "复核人")
    private String ext1Name;

    //    @ExcelProperty(index = 13)
    @ExcelProperty(value = "证件类型")
    private String ext1Value;

    //    @ExcelProperty(index = 14)
    @ExcelProperty(value = "证件号")
    private String ext2Name;


}
