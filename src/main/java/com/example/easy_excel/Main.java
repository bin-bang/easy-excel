package com.example.easy_excel;

import com.alibaba.excel.EasyExcel;
import com.example.easy_excel.easyexcel.ExcelListenter;
import com.example.easy_excel.vo.H5Data;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        String inputPath = "D://easy_excel/input/";
        //修改读取对象类H5Data
        logger.info("读取数据");
        EasyExcel.read(inputPath+"h5.xlsx", H5Data.class,new ExcelListenter()).sheet().doRead();
    }
}
