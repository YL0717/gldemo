import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.ReadListener;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String filename="D:\\test.xlsx";
//        EasyExcel.write(filename,Demodata.class).sheet().doWrite(test());
        EasyExcel.read(filename,Demodata.class,new ExcelListener()).sheet().doRead();
    }

    public static List<Demodata> test(){
        List<Demodata> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Demodata demodata=new Demodata();
            demodata.setId(i);
            demodata.setName("lucy"+i);
            list.add(demodata);
        }
        return list;
    }
}
