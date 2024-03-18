package com.example.easy_excel.vo;


import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class H5Data {

    @ExcelProperty(index = 0)
    private  int id;

    @ExcelProperty(index = 1)
    private  String msg_id;

    @ExcelProperty(index = 2)
    private  String mas_name;
}
