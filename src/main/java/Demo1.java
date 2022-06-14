import org.apache.poi.hssf.util.AreaReference;
import org.apache.poi.hssf.util.CellReference;
import org.apache.poi.ss.usermodel.DataConsolidateFunction;
import org.apache.poi.xssf.usermodel.XSSFPivotTable;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        /**
         * 标签名称	特征值	分析对象占比	大盘人数占比
         * 性别分布	男	99.64%	28.59%
         * 性别分布	未知	0.05%	1.74%
         * 年龄分布	41岁以上	99.1%	0%
         *
         *
         */
        XSSFWorkbook wb = new XSSFWorkbook();
        XSSFSheet sheet = wb.createSheet();
        XSSFRow row1 = sheet.createRow(0);
        row1.createCell(0   ).setCellValue("标签名称");
        row1.createCell(1   ).setCellValue("特征值");
        row1.createCell(2   ).setCellValue("分析对象占比");
        row1.createCell(3   ).setCellValue("大盘人数占比");

        XSSFRow row2 = sheet.createRow(1);
        row2.createCell(0   ).setCellValue("2");
        row2.createCell(1   ).setCellValue("2");
        row2.createCell(2   ).setCellValue("2");
        row2.createCell(3   ).setCellValue("2");

        XSSFRow row3 = sheet.createRow(2);
        row3.createCell(0   ).setCellValue("3");
        row3.createCell(1   ).setCellValue("3");
        row3.createCell(2   ).setCellValue("3");
        row3.createCell(3   ).setCellValue("3");

        XSSFRow row4 = sheet.createRow(3);
        row4.createCell(0   ).setCellValue("4");
        row4.createCell(1   ).setCellValue("4");
        row4.createCell(2   ).setCellValue("4");
        row4.createCell(3   ).setCellValue("4");







        //创建一些数据来构建数据透视表
//        设置单元格数据（表）； Pivot
        XSSFPivotTable pivotTable = sheet.createPivotTable(new AreaReference("A1:D4"), new CellReference("H5"));
        //配置数据透视表
        //使用第一列作为行标签
        pivotTable.addRowLabel(0);
        //总结第二列
        pivotTable.addColumnLabel(DataConsolidateFunction.SUM, 1);
        //设置第三列为过滤器
        pivotTable.addColumnLabel(DataConsolidateFunction.AVERAGE, 2);
        //在第四列添加过滤器
        pivotTable.addReportFilter(3);
        FileOutputStream fileOutputStream = new FileOutputStream("./1.xlsx");
        wb.write(fileOutputStream);
        fileOutputStream.close();
        wb.close();
    }
}
