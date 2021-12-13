package com.lilili.com.controller;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import com.lilili.com.model.BillBasic;
import com.lilili.com.model.Student;
import com.lilili.com.util.LocalDateConverter;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping(value = "/excel")
public class EasyexcelController {


    @PostMapping(value = "/import")
    public String excelImport(MultipartFile file) throws IOException {

        EasyExcel.read(file.getInputStream(), Student.class, new PageReadListener<Student>(dataList -> {
            print(dataList);
            System.out.println(dataList);
        })).sheet().doRead();
        return "读取成功";
    }

    public void print(List<Student> st) {
        System.out.println(st);
    }

    @PostMapping(value = "/import2")
    public String excelImport2(MultipartFile file) throws IOException {
        EasyExcel.read(file.getInputStream(), BillBasic.class, new PageReadListener<BillBasic>(data -> {
            System.out.println(data);
        })).sheet().doRead();
        return "读取成功";
    }
}
