
package com.lilili.com.util;

import com.alibaba.excel.converters.Converter;
import com.alibaba.excel.enums.CellDataTypeEnum;
import com.alibaba.excel.metadata.*;
import com.alibaba.excel.metadata.data.CellData;
import com.alibaba.excel.metadata.data.ReadCellData;
import com.alibaba.excel.metadata.data.WriteCellData;
import com.alibaba.excel.metadata.property.ExcelContentProperty;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * LocalDate类型转换器
 */

public class LocalDateConverter implements Converter<LocalDate> {
    @Override
    public Class<LocalDate> supportJavaTypeKey() {
        return LocalDate.class;
    }

    @Override
    public CellDataTypeEnum supportExcelTypeKey() {
        return CellDataTypeEnum.STRING;
    }

    @Override
    public LocalDate convertToJavaData(ReadCellData<?> cellData, ExcelContentProperty excelContentProperty
            , GlobalConfiguration globalConfiguration) throws Exception {
        System.out.println(cellData.getStringValue());
        return LocalDate.parse(cellData.getStringValue(), DateTimeFormatter.ofPattern("yyyy/MM/dd"));
    }

    @Override
    public WriteCellData<LocalDate> convertToExcelData(LocalDate localDate, ExcelContentProperty excelContentProperty
            , GlobalConfiguration globalConfiguration) throws Exception {
        return null;
    }
}