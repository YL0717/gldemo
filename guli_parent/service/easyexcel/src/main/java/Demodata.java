import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class Demodata {
    @ExcelProperty("编号")
    private int id;

    @ExcelProperty("姓名")
    private String name;
}
