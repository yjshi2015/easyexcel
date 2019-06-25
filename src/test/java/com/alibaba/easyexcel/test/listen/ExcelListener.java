package com.alibaba.easyexcel.test.listen;

import com.alibaba.easyexcel.test.model.AssetsDetailVO;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

public class ExcelListener extends AnalysisEventListener {


    private List<AssetsDetailVO>  data = new ArrayList<AssetsDetailVO>();

    @Override
    public void invoke(Object object, AnalysisContext context) {
        System.out.println(context.getCurrentSheet());
        if (context.getCurrentRowNum() == 0) {
            return;
        }
//        AssetsDetailVO assetsDetail = new AssetsDetailVO();
//        assetsDetail

        data.add((AssetsDetailVO) object);
        if(data.size()>=1){
            doSomething();
            data = new ArrayList<AssetsDetailVO>();
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        System.out.println("excel 解析 end");
    }

    public void doSomething(){
        for (Object o:data) {
            System.out.println(o);
        }
    }
}
