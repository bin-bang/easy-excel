package com.example.easy_excel.util;

import com.alibaba.excel.EasyExcel;

import java.util.List;
import java.util.Map;

public class OperateFile {


    public void writeFile(List data, Class ReqData){
        String outputPath = "D://easy_excel/output/";
        EasyExcel.write(outputPath+"h5.xlsx",ReqData).sheet().doWrite(data);
    }
}
