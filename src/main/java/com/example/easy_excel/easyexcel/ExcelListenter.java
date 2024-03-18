package com.example.easy_excel.easyexcel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.example.easy_excel.service.HandleService;
import com.example.easy_excel.util.OperateFile;
import com.example.easy_excel.vo.H5Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelListenter extends AnalysisEventListener<Object> {

    List<Object> list = new ArrayList<Object>();
    private static OperateFile operateFile = new OperateFile();
    private static HandleService service = new HandleService();


    @Override
    public void invoke(Object h5Data, AnalysisContext analysisContext) {
        list.add(h5Data);
    }

    @Override
    public void invokeHeadMap(Map<Integer, String> headMap, AnalysisContext context) {
        System.out.println("表头信息："+headMap);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        //这里添加数据处理逻辑


        //修改写入对象类H5Data
        operateFile.writeFile(list,H5Data.class);
    }
}
