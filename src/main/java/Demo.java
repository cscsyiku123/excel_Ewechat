//package com.jsfund.crm.common.utils;
//import java.io.FileOutputStream;
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.apache.poi.ss.usermodel.BorderStyle;
//import org.apache.poi.ss.usermodel.CellStyle;
//import org.apache.poi.ss.usermodel.Chart;
//import org.apache.poi.ss.usermodel.ClientAnchor;
//import org.apache.poi.ss.usermodel.FillPatternType;
//import org.apache.poi.ss.usermodel.HorizontalAlignment;
//import org.apache.poi.ss.usermodel.IndexedColors;
//import org.apache.poi.ss.util.CellRangeAddress;
//import org.apache.poi.xssf.streaming.SXSSFDrawing;
//import org.apache.poi.xssf.streaming.SXSSFSheet;
//import org.apache.poi.xssf.streaming.SXSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFChart;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaChart;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTAreaSer;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTAxDataSource;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTBarChart;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTBarSer;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTBoolean;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTCatAx;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTChart;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTDLbls;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTLegend;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineChart;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTLineSer;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarker;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTMarkerStyle;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumDataSource;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTNumRef;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTPie3DChart;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTPieChart;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTPieSer;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTPlotArea;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTScaling;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTSerTx;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTStrRef;
//import org.openxmlformats.schemas.drawingml.x2006.chart.CTValAx;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STAxPos;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STBarDir;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STBarGrouping;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STCrossBetween;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STCrosses;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STLblAlgn;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STTickMark;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STBarGrouping.Enum;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STDispBlanksAs;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STGrouping;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STLegendPos;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STMarkerStyle;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STOrientation;
//import org.openxmlformats.schemas.drawingml.x2006.chart.STTickLblPos;
//import com.jsfund.crm.common.bean.BaseFormMap;
//
//
//
//public class ExcelChartUtil {
//    public static void main(String[] args) throws Exception {
//        boolean result=false;
//        List<BaseFormMap> dataList=new ArrayList<BaseFormMap>();//??????
//        List<String> fldNameArr = new ArrayList<String>();// ?????????
//        List<String> titleArr = new ArrayList<String>();// ??????
//        BaseFormMap baseFormMap=new BaseFormMap();
//        List<String> showtailArr=new ArrayList<String>();
//        List<String> ispercentArr=new ArrayList<String>();
//        baseFormMap.put("value1", "??????");
//        baseFormMap.put("value2", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap.put("value3", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap.put("value4", new BigDecimal(new java.util.Random().nextDouble()));
//
//        BaseFormMap baseFormMap1=new BaseFormMap();
//        baseFormMap1.put("value1", "???????????????");
//        baseFormMap1.put("value2", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap1.put("value3", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap1.put("value4", new BigDecimal(new java.util.Random().nextDouble()));
//
//        BaseFormMap baseFormMap2=new BaseFormMap();
//        baseFormMap2.put("value1", "?????????");
//        baseFormMap2.put("value2", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap2.put("value3", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap2.put("value4", new BigDecimal(new java.util.Random().nextDouble()));
//
//        BaseFormMap baseFormMap3=new BaseFormMap();
//        baseFormMap3.put("value1", "????????????");
//        baseFormMap3.put("value2", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap3.put("value3", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap3.put("value4", new BigDecimal(new java.util.Random().nextDouble()));
//
//        BaseFormMap baseFormMap4=new BaseFormMap();
//        baseFormMap4.put("value1", "????????????");
//        baseFormMap4.put("value2", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap4.put("value3", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap4.put("value4", new BigDecimal(new java.util.Random().nextDouble()));
//
//        BaseFormMap baseFormMap5=new BaseFormMap();
//        baseFormMap5.put("value1", "????????????");
//        baseFormMap5.put("value2", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap5.put("value3", new BigDecimal(new java.util.Random().nextDouble()));
//        baseFormMap5.put("value4", new BigDecimal(new java.util.Random().nextDouble()));
//
//        fldNameArr.add("value1");
//        fldNameArr.add("value2");
//        fldNameArr.add("value3");
//        fldNameArr.add("value4");
//
//        titleArr.add("??????");
//        titleArr.add("??????");
//        titleArr.add("??????");
//        titleArr.add("??????");
//
//        showtailArr.add("0");
//        showtailArr.add("2");
//        showtailArr.add("2");
//        showtailArr.add("2");
//
//        ispercentArr.add("0");
//        ispercentArr.add("1");
//        ispercentArr.add("1");
//        ispercentArr.add("1");
//
//        dataList.add(baseFormMap);
//        dataList.add(baseFormMap1);
//        dataList.add(baseFormMap2);
//        dataList.add(baseFormMap3);
//        dataList.add(baseFormMap4);
//        dataList.add(baseFormMap5);
//
//
//        SXSSFWorkbook wb = new SXSSFWorkbook();
//        SXSSFSheet sheet = wb.createSheet("Sheet1");
//
//        result=createChart(wb,sheet,10,"bar",STBarGrouping.STACKED,false,false,dataList, fldNameArr, titleArr,showtailArr,ispercentArr);
//
//        result=createChart(wb,sheet,10+dataList.size()+12,"bar",STBarGrouping.CLUSTERED,true,true,dataList, fldNameArr, titleArr,showtailArr,ispercentArr);
//
//
//
//
//        //System.out.println(ctChart);
//        System.out.println(result);
//
//        FileOutputStream fileOut = new FileOutputStream("D://BarChart.xlsx");
//        wb.write(fileOut);
//        fileOut.close();
//    }
//
//    /**
//     * @Description: ??????Excel??????
//     * @param wb:?????????
//     * @param sheet???wb.createSheet();
//     * @param sheetName???sheet??????
//     * @param dataList
//     * @param fldNameArr
//     * @param titleArr
//     * @param showtailArr
//     * @param ispercentArr
//     * @param position:??????????????????(0??????????????????)
//     * @return boolean
//     */
//    public static boolean refreshChartExcel(SXSSFWorkbook wb,SXSSFSheet sheet,
//                                            List<BaseFormMap> dataList,List<String> fldNameArr,List<String> titleArr,
//                                            List<String> showtailArr,List<String> ispercentArr,int position) {
//        boolean result = true;
//        //????????????
//        CellStyle style = wb.createCellStyle();
//        style.setFillForegroundColor(IndexedColors.ROYAL_BLUE.getIndex());
//        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
//        style.setBorderBottom(BorderStyle.THIN); //?????????
//        style.setBorderLeft(BorderStyle.THIN);//?????????
//        style.setBorderTop(BorderStyle.THIN);//?????????
//        style.setBorderRight(BorderStyle.THIN);//?????????
//        style.setAlignment(HorizontalAlignment.CENTER);
//
//        CellStyle style1 = wb.createCellStyle();
//        style1.setBorderBottom(BorderStyle.THIN); //?????????
//        style1.setBorderLeft(BorderStyle.THIN);//?????????
//        style1.setBorderTop(BorderStyle.THIN);//?????????
//        style1.setBorderRight(BorderStyle.THIN);//?????????
//        style1.setAlignment(HorizontalAlignment.CENTER);
//
//        CellStyle cellStyle = wb.createCellStyle();
//        cellStyle.setBorderTop(BorderStyle.THIN);//?????????
//        cellStyle.setBorderBottom(BorderStyle.THIN); //?????????
//        cellStyle.setBorderLeft(BorderStyle.THIN);//?????????
//        cellStyle.setBorderRight(BorderStyle.THIN);//?????????
//        cellStyle.setAlignment(HorizontalAlignment.CENTER);//??????????????????
//        //cellStyle.setVerticalAlignment(VerticalAlignment.TOP);//??????????????????
//
//        //??????????????????excel??????????????????
//        for (int i = 0; i < titleArr.size(); i++) {
//            if(sheet.getRow(position)==null){
//                sheet.createRow(position).createCell(i).setCellValue(titleArr.get(i)==null?"":titleArr.get(i));
//
//            }else{
//                sheet.getRow(position).createCell(i).setCellValue(titleArr.get(i)==null?"":titleArr.get(i));
//            }
//            //???????????????????????????
//            sheet.getRow(position).getCell(i).setCellStyle(style);
//        }
//
//        //???????????????
//        for (int i = 0; i < dataList.size(); i++) {
//            BaseFormMap baseFormMap = dataList.get(i);//?????????
//            //fldNameArr????????????
//            for (int j = 0; j < fldNameArr.size(); j++) {
//                if(sheet.getRow(position+i+1)==null){
//                    if(j==0){
//                        try {
//                            sheet.createRow(position+i+1).createCell(j).setCellValue(baseFormMap.getStr(fldNameArr.get(j))==null?"":baseFormMap.getStr(fldNameArr.get(j)));
//                        } catch (Exception e) {
//                            if(baseFormMap.getStr(fldNameArr.get(j))==null){
//                                sheet.createRow(position+i+1).createCell(j).setCellValue("");
//                            }else{
//                                sheet.createRow(position+i+1).createCell(j).setCellValue(baseFormMap.getDate(fldNameArr.get(j)));
//                            }
//                        }
//                    }
//                    //???????????????????????????
//                    sheet.getRow(position+i+1).getCell(j).setCellStyle(style1);
//                }else{
//                    BigDecimal b=baseFormMap.getBigDecimal(fldNameArr.get(j));
//                    double value=0d;
//                    if(b!=null){
//                        value=b.doubleValue();
//                    }
//                    if(value==0){
//                        sheet.getRow(position+i+1).createCell(j);
//                    }else{
//                        sheet.getRow(position+i+1).createCell(j).setCellValue(baseFormMap.getBigDecimal(fldNameArr.get(j)).doubleValue());
//                    }
//                    if("1".equals(ispercentArr.get(j))){//?????????????????????
//                        // ??????Y????????????????????????????????????
//                        StringBuilder sb=new StringBuilder();
//
//                        if("0".equals(showtailArr.get(j))){//??????????????????
//                            sb.append("0");
//                            if("1".equals(ispercentArr.get(j))){//???????????????
//                                sb.append("%");
//                            }
//                        }else{
//                            sb.append("0.");
//                            for(int k=0;k<Integer.parseInt(showtailArr.get(j));k++){
//                                sb.append("0");
//                            }
//                            if("1".equals(ispercentArr.get(j))){//???????????????
//                                sb.append("%");
//                            }
//                        }
//                        cellStyle.setDataFormat(wb.createDataFormat().getFormat(sb.toString()));
//                        sheet.getRow(position+i+1).getCell(j).setCellStyle(cellStyle);
//                    }else{
//                        //?????????????????????
//                        // ??????Y????????????????????????????????????
//                        StringBuilder sb=new StringBuilder();
//
//                        if("0".equals(showtailArr.get(j))){//??????????????????
//                            sb.append("0");
//                        }else{
//                            sb.append("0.");
//                            for(int k=0;k<Integer.parseInt(showtailArr.get(j));k++){
//                                sb.append("0");
//                            }
//                        }
//                        cellStyle.setDataFormat(wb.createDataFormat().getFormat(sb.toString()));
//                        sheet.getRow(position+i+1).getCell(j).setCellStyle(cellStyle);
//                    }
//                }
//            }
//
//        }
//        return result;
//    }
//
//    /**
//     * @Description:???????????????
//     * @param wb
//     * @param sheet
//     * @param sheetName
//     * @param curRow:????????????
//     * @param type:?????????
//     * @param group:??????????????? @see STBarGrouping
//     * @param isLegend:??????????????????
//     * @param isvalAxis:????????????Y??????
//     * @param dataList:??????
//     * @param fldNameArr:??????
//     * @param titleArr:??????
//     * @param showtailArr:??????????????????
//     * @param ispercentArr:???????????????
//     * @return
//     */
//    public static boolean createChart(SXSSFWorkbook wb,SXSSFSheet sheet, int curRow,String type, Enum group,boolean isLegend,boolean isvalAxis, List<BaseFormMap> dataList, List<String> fldNameArr, List<String> titleArr,List<String> showtailArr,List<String> ispercentArr) {
//        boolean result=false;
//        String sheetName=sheet.getSheetName();
//        //?????????sheet??????
//        result=refreshChartExcel(wb, sheet,dataList, fldNameArr, titleArr, showtailArr, ispercentArr, curRow);
//
//        //??????????????????
//        SXSSFDrawing drawing = sheet.createDrawingPatriarch();
//
//        //???????????????0???[0,5]??????0???5?????????;[6,20]:??????6???20???????????????20???
//        //????????????(14-8)*12
//        ClientAnchor anchor =null;
//        if(dataList.size()<10){
//            anchor=drawing.createAnchor(0, 0, 0, 0, 0, curRow+dataList.size()+1, 6, curRow+dataList.size()+12);
//        }else{
//            anchor=drawing.createAnchor(0, 0, 0, 0, 0, curRow+dataList.size()+1, (int)Math.round(dataList.size()*0.5), curRow+dataList.size()+12);
//        }
//
//
//        //????????????chart??????
//        Chart chart = drawing.createChart(anchor);
//        CTChart ctChart = ((XSSFChart)chart).getCTChart();
//        CTPlotArea ctPlotArea = ctChart.getPlotArea();
//        if("bar".equals(type)){
//            CTBarChart ctBarChart = ctPlotArea.addNewBarChart();
//            CTBoolean ctBoolean=ctBarChart.addNewVaryColors();
//            ctBarChart.getVaryColors().setVal(true);
//
//            //????????????
//            ctBarChart.addNewGrouping().setVal(group);
//            ctBoolean.setVal(true);
//            ctBarChart.addNewBarDir().setVal(STBarDir.COL);
//
//            //???????????????????????????
//            ctChart.addNewDispBlanksAs().setVal(STDispBlanksAs.ZERO);
//            ctChart.addNewShowDLblsOverMax().setVal(true);
//
//            //?????????????????????????????????STACKED??????????????????????????????(standard)???????????????????????????????????????
//            if("stacked".equals(group.toString())||"percentStacked".equals(group.toString())){
//                ctBarChart.addNewGapWidth().setVal(150);
//                ctBarChart.addNewOverlap().setVal((byte)100);
//            }
//
//            //????????????,????????????????????????
//            for (int i = 0; i < fldNameArr.size()-1; i++) {
//                CTBarSer ctBarSer = ctBarChart.addNewSer();
//                CTSerTx ctSerTx = ctBarSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctBarSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctBarSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctBarSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                ctBarSer.addNewSpPr().addNewLn().addNewSolidFill().addNewSrgbClr().setVal(new byte[] {0,0,0});
//
//                //??????????????????????????????
//                ctBarSer.addNewInvertIfNegative().setVal(false);
//                //??????????????????
//                ctBoolean.setVal(false);
//                CTDLbls newDLbls = ctBarSer.addNewDLbls();
//                newDLbls.setShowLegendKey(ctBoolean);
//                ctBoolean.setVal(true);
//                newDLbls.setShowVal(ctBoolean);
//                ctBoolean.setVal(false);
//                newDLbls.setShowCatName(ctBoolean);
//                newDLbls.setShowSerName(ctBoolean);
//                newDLbls.setShowPercent(ctBoolean);
//                newDLbls.setShowBubbleSize(ctBoolean);
//                newDLbls.setShowLeaderLines(ctBoolean);
//            }
//
//            //telling the BarChart that it has axes and giving them Ids
//            ctBarChart.addNewAxId().setVal(123456);
//            ctBarChart.addNewAxId().setVal(123457);
//
//            //cat axis
//            CTCatAx ctCatAx = ctPlotArea.addNewCatAx();
//            ctCatAx.addNewAxId().setVal(123456); //id of the cat axis
//            CTScaling ctScaling = ctCatAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctCatAx.addNewAxPos().setVal(STAxPos.B);
//            ctCatAx.addNewCrossAx().setVal(123457); //id of the val axis
//            ctCatAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //val axis
//            CTValAx ctValAx = ctPlotArea.addNewValAx();
//            ctValAx.addNewAxId().setVal(123457); //id of the val axis
//            ctScaling = ctValAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            //????????????
//            ctValAx.addNewAxPos().setVal(STAxPos.L);
//            ctValAx.addNewCrossAx().setVal(123456); //id of the cat axis
//            ctValAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //????????????????????????
//            if(isvalAxis){
//                ctValAx.addNewDelete().setVal(false);
//            }else{
//                ctValAx.addNewDelete().setVal(true);
//            }
//
//            //?????????????????????
//            ctCatAx.addNewDelete().setVal(false);
//
//            //legend??????
//            if(isLegend){
//                CTLegend ctLegend = ctChart.addNewLegend();
//                ctLegend.addNewLegendPos().setVal(STLegendPos.B);
//                ctLegend.addNewOverlay().setVal(false);
//            }
//        }else if("line".equals(type)){
//            CTLineChart ctLineChart = ctPlotArea.addNewLineChart();
//            CTBoolean ctBoolean = ctLineChart.addNewVaryColors();
//            ctLineChart.addNewGrouping().setVal(STGrouping.STANDARD);
//
//            //????????????,????????????????????????
//            for (int i = 0; i < fldNameArr.size()-1; i++) {
//                CTLineSer ctLineSer = ctLineChart.addNewSer();
//                CTSerTx ctSerTx = ctLineSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctStrRef.setF(legendDataRange);
//                ctLineSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctLineSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctLineSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                //??????????????????
//                ctBoolean.setVal(false);
//                CTDLbls newDLbls = ctLineSer.addNewDLbls();
//                newDLbls.setShowLegendKey(ctBoolean);
//                ctBoolean.setVal(true);
//                newDLbls.setShowVal(ctBoolean);
//                ctBoolean.setVal(false);
//                newDLbls.setShowCatName(ctBoolean);
//                newDLbls.setShowSerName(ctBoolean);
//                newDLbls.setShowPercent(ctBoolean);
//                newDLbls.setShowBubbleSize(ctBoolean);
//                newDLbls.setShowLeaderLines(ctBoolean);
//
//                //?????????????????????
//                CTBoolean addNewSmooth = ctLineSer.addNewSmooth();
//                addNewSmooth.setVal(false);
//
//                //?????????????????????
//                CTMarker addNewMarker = ctLineSer.addNewMarker();
//                CTMarkerStyle addNewSymbol = addNewMarker.addNewSymbol();
//                addNewSymbol.setVal(STMarkerStyle.NONE);
//            }
//            //telling the BarChart that it has axes and giving them Ids
//            ctLineChart.addNewAxId().setVal(123456);
//            ctLineChart.addNewAxId().setVal(123457);
//
//            //cat axis
//            CTCatAx ctCatAx = ctPlotArea.addNewCatAx();
//            ctCatAx.addNewAxId().setVal(123456); //id of the cat axis
//            CTScaling ctScaling = ctCatAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctCatAx.addNewAxPos().setVal(STAxPos.B);
//            ctCatAx.addNewCrossAx().setVal(123457); //id of the val axis
//            ctCatAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //val axis
//            CTValAx ctValAx = ctPlotArea.addNewValAx();
//            ctValAx.addNewAxId().setVal(123457); //id of the val axis
//            ctScaling = ctValAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctValAx.addNewAxPos().setVal(STAxPos.L);
//            ctValAx.addNewCrossAx().setVal(123456); //id of the cat axis
//            ctValAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //????????????????????????
//            if(isvalAxis){
//                ctValAx.addNewDelete().setVal(false);
//            }else{
//                ctValAx.addNewDelete().setVal(true);
//            }
//
//            //?????????????????????
//            ctCatAx.addNewDelete().setVal(false);
//
//            //legend??????
//            if(isLegend){
//                CTLegend ctLegend = ctChart.addNewLegend();
//                ctLegend.addNewLegendPos().setVal(STLegendPos.B);
//                ctLegend.addNewOverlay().setVal(false);
//            }
//        }else if("bar-line-2".equals(type)){
//            CTBarChart ctBarChart = ctPlotArea.addNewBarChart();
//            CTBoolean ctBoolean=ctBarChart.addNewVaryColors();
//            ctBarChart.getVaryColors().setVal(true);
//
//            //????????????
//            ctBarChart.addNewGrouping().setVal(STBarGrouping.CLUSTERED);
//            ctBoolean.setVal(true);
//            ctBarChart.addNewBarDir().setVal(STBarDir.COL);
//
//            //???????????????????????????
//            ctChart.addNewDispBlanksAs().setVal(STDispBlanksAs.ZERO);
//            ctChart.addNewShowDLblsOverMax().setVal(true);
//
//            //????????????,????????????????????????
//            for (int i = 0; i < fldNameArr.size()-2; i++) {
//                CTBarSer ctBarSer = ctBarChart.addNewSer();
//                CTSerTx ctSerTx = ctBarSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctBarSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctBarSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctBarSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                ctBarSer.addNewSpPr().addNewLn().addNewSolidFill().addNewSrgbClr().setVal(new byte[] {0,0,0});
//                //??????????????????????????????
//                ctBarSer.addNewInvertIfNegative().setVal(false);
//                //??????????????????
//                ctBoolean.setVal(false);
//                CTDLbls newDLbls = ctBarSer.addNewDLbls();
//                newDLbls.setShowLegendKey(ctBoolean);
//                ctBoolean.setVal(true);
//                newDLbls.setShowVal(ctBoolean);
//                ctBoolean.setVal(false);
//                newDLbls.setShowCatName(ctBoolean);
//                newDLbls.setShowSerName(ctBoolean);
//                newDLbls.setShowPercent(ctBoolean);
//                newDLbls.setShowBubbleSize(ctBoolean);
//                newDLbls.setShowLeaderLines(ctBoolean);
//            }
//
//            //telling the BarChart that it has axes and giving them Ids
//            ctBarChart.addNewAxId().setVal(123456);
//            ctBarChart.addNewAxId().setVal(123457);
//
//            //telling the BarChart that it has axes and giving them Ids
//            ctBarChart.addNewAxId().setVal(123456);
//            ctBarChart.addNewAxId().setVal(123457);
//
//            //cat axis
//            CTCatAx ctCatAx = ctPlotArea.addNewCatAx();
//            ctCatAx.addNewAxId().setVal(123456); //id of the cat axis
//            CTScaling ctScaling = ctCatAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctCatAx.addNewAxPos().setVal(STAxPos.B);
//            ctCatAx.addNewCrossAx().setVal(123457); //id of the val axis
//            ctCatAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //val axis
//            CTValAx ctValAx = ctPlotArea.addNewValAx();
//            ctValAx.addNewAxId().setVal(123457); //id of the val axis
//            ctScaling = ctValAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctValAx.addNewAxPos().setVal(STAxPos.L);
//            ctValAx.addNewCrossAx().setVal(123456); //id of the cat axis
//            ctValAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //????????????????????????
//            if(isvalAxis){
//                ctValAx.addNewDelete().setVal(false);
//            }else{
//                ctValAx.addNewDelete().setVal(true);
//            }
//
//            //?????????????????????
//            ctCatAx.addNewDelete().setVal(false);
//
//            //legend??????
//            if(isLegend){
//                CTLegend ctLegend = ctChart.addNewLegend();
//                ctLegend.addNewLegendPos().setVal(STLegendPos.B);
//                ctLegend.addNewOverlay().setVal(false);
//            }
//
//
//            CTLineChart ctLineChart = ctPlotArea.addNewLineChart();
//            ctLineChart.addNewGrouping().setVal(STGrouping.STANDARD);
//
//            //????????????,????????????????????????
//            for (int i =1; i < fldNameArr.size()-1; i++) {
//                CTLineSer ctLineSer = ctLineChart.addNewSer();
//                CTSerTx ctSerTx = ctLineSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctStrRef.setF(legendDataRange);
//                ctLineSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctLineSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctLineSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                //?????????????????????
//                CTBoolean addNewSmooth = ctLineSer.addNewSmooth();
//                addNewSmooth.setVal(false);
//
//                //?????????????????????
//                CTMarker addNewMarker = ctLineSer.addNewMarker();
//                CTMarkerStyle addNewSymbol = addNewMarker.addNewSymbol();
//                addNewSymbol.setVal(STMarkerStyle.NONE);
//            }
//
//            //telling the BarChart that it has axes and giving them Ids
//            //TODO:????????????????????????
//            ctLineChart.addNewAxId().setVal(1234567);
//            ctLineChart.addNewAxId().setVal(1234578);
//
//            //cat axis
//            CTCatAx ctCatAxline = ctPlotArea.addNewCatAx();
//            ctCatAxline.addNewAxId().setVal(1234567); //id of the cat axis
//            CTScaling ctScalingline = ctCatAxline.addNewScaling();
//            ctScalingline.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctCatAxline.addNewDelete().setVal(true);
//            ctCatAxline.addNewAxPos().setVal(STAxPos.B);
//            ctCatAxline.addNewMajorTickMark().setVal(STTickMark.OUT);
//            ctCatAxline.addNewMinorTickMark().setVal(STTickMark.NONE);
//            ctCatAxline.addNewAuto().setVal(true);
//            ctCatAxline.addNewLblAlgn().setVal(STLblAlgn.CTR);
//            ctCatAxline.addNewLblOffset().setVal(100);
//            ctCatAxline.addNewNoMultiLvlLbl().setVal(false);
//            ctCatAxline.addNewCrossAx().setVal(1234578); //id of the val axis
//            ctCatAxline.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //val axis
//            CTValAx ctValAxline = ctPlotArea.addNewValAx();
//            ctValAxline.addNewAxId().setVal(1234578); //id of the val axis
//            ctScalingline = ctValAxline.addNewScaling();
//            ctScalingline.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            //Y???????????????true?????????false??????
//            ctValAxline.addNewDelete().setVal(false);
//            ctValAxline.addNewAxPos().setVal(STAxPos.R);
//            ctValAxline.addNewMajorTickMark().setVal(STTickMark.OUT);
//            ctValAxline.addNewMinorTickMark().setVal(STTickMark.NONE);
//            ctValAxline.addNewCrosses().setVal(STCrosses.MAX);
//            ctValAxline.addNewCrossBetween().setVal(STCrossBetween.BETWEEN);
//            ctValAxline.addNewCrossAx().setVal(1234567); //id of the cat axis
//            ctValAxline.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//        }else if("bar-line-4".equals(type)){
//            CTBarChart ctBarChart = ctPlotArea.addNewBarChart();
//            CTBoolean ctBoolean=ctBarChart.addNewVaryColors();
//            ctBarChart.getVaryColors().setVal(true);
//
//            //????????????
//            ctBarChart.addNewGrouping().setVal(STBarGrouping.CLUSTERED);
//            ctBoolean.setVal(true);
//            ctBarChart.addNewBarDir().setVal(STBarDir.COL);
//
//            //???????????????????????????
//            ctChart.addNewDispBlanksAs().setVal(STDispBlanksAs.ZERO);
//            ctChart.addNewShowDLblsOverMax().setVal(true);
//
//            //????????????,????????????????????????
//            for (int i = 0; i < fldNameArr.size()-1-2; i++) {
//                CTBarSer ctBarSer = ctBarChart.addNewSer();
//                CTSerTx ctSerTx = ctBarSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctBarSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctBarSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctBarSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                ctBarSer.addNewSpPr().addNewLn().addNewSolidFill().addNewSrgbClr().setVal(new byte[] {0,0,0});
//                //??????????????????????????????
//                ctBarSer.addNewInvertIfNegative().setVal(false);
//                //??????????????????
//                ctBoolean.setVal(false);
//                CTDLbls newDLbls = ctBarSer.addNewDLbls();
//                newDLbls.setShowLegendKey(ctBoolean);
//                ctBoolean.setVal(true);
//                newDLbls.setShowVal(ctBoolean);
//                ctBoolean.setVal(false);
//                newDLbls.setShowCatName(ctBoolean);
//                newDLbls.setShowSerName(ctBoolean);
//                newDLbls.setShowPercent(ctBoolean);
//                newDLbls.setShowBubbleSize(ctBoolean);
//                newDLbls.setShowLeaderLines(ctBoolean);
//            }
//
//            //telling the BarChart that it has axes and giving them Ids
//            ctBarChart.addNewAxId().setVal(123456);
//            ctBarChart.addNewAxId().setVal(123457);
//
//            //telling the BarChart that it has axes and giving them Ids
//            ctBarChart.addNewAxId().setVal(123456);
//            ctBarChart.addNewAxId().setVal(123457);
//
//            //cat axis
//            CTCatAx ctCatAx = ctPlotArea.addNewCatAx();
//            ctCatAx.addNewAxId().setVal(123456); //id of the cat axis
//            CTScaling ctScaling = ctCatAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctCatAx.addNewAxPos().setVal(STAxPos.B);
//            ctCatAx.addNewCrossAx().setVal(123457); //id of the val axis
//            ctCatAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //val axis
//            CTValAx ctValAx = ctPlotArea.addNewValAx();
//            ctValAx.addNewAxId().setVal(123457); //id of the val axis
//            ctScaling = ctValAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctValAx.addNewAxPos().setVal(STAxPos.L);
//            ctValAx.addNewCrossAx().setVal(123456); //id of the cat axis
//            ctValAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //????????????????????????
//            if(isvalAxis){
//                ctValAx.addNewDelete().setVal(false);
//            }else{
//                ctValAx.addNewDelete().setVal(true);
//            }
//
//            //?????????????????????
//            ctCatAx.addNewDelete().setVal(false);
//
//            //legend??????
//            if(isLegend){
//                CTLegend ctLegend = ctChart.addNewLegend();
//                ctLegend.addNewLegendPos().setVal(STLegendPos.B);
//                ctLegend.addNewOverlay().setVal(false);
//            }
//
//
//            CTLineChart ctLineChart = ctPlotArea.addNewLineChart();
//            ctLineChart.addNewGrouping().setVal(STGrouping.STANDARD);
//
//            //????????????,????????????????????????
//            for (int i = 2; i < fldNameArr.size()-1; i++) {
//                CTLineSer ctLineSer = ctLineChart.addNewSer();
//                CTSerTx ctSerTx = ctLineSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctStrRef.setF(legendDataRange);
//                ctLineSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctLineSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctLineSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                //?????????????????????
//                CTBoolean addNewSmooth = ctLineSer.addNewSmooth();
//                addNewSmooth.setVal(false);
//
//                //?????????????????????
//                CTMarker addNewMarker = ctLineSer.addNewMarker();
//                CTMarkerStyle addNewSymbol = addNewMarker.addNewSymbol();
//                addNewSymbol.setVal(STMarkerStyle.NONE);
//            }
//
//            //telling the BarChart that it has axes and giving them Ids
//            //TODO:????????????????????????
//            ctLineChart.addNewAxId().setVal(1234567);
//            ctLineChart.addNewAxId().setVal(1234578);
//
//            //cat axis
//            CTCatAx ctCatAxline = ctPlotArea.addNewCatAx();
//            ctCatAxline.addNewAxId().setVal(1234567); //id of the cat axis
//            CTScaling ctScalingline = ctCatAxline.addNewScaling();
//            ctScalingline.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctCatAxline.addNewDelete().setVal(true);
//            ctCatAxline.addNewAxPos().setVal(STAxPos.B);
//            ctCatAxline.addNewMajorTickMark().setVal(STTickMark.OUT);
//            ctCatAxline.addNewMinorTickMark().setVal(STTickMark.NONE);
//            ctCatAxline.addNewAuto().setVal(true);
//            ctCatAxline.addNewLblAlgn().setVal(STLblAlgn.CTR);
//            ctCatAxline.addNewLblOffset().setVal(100);
//            ctCatAxline.addNewNoMultiLvlLbl().setVal(false);
//            ctCatAxline.addNewCrossAx().setVal(1234578); //id of the val axis
//            ctCatAxline.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //val axis
//            CTValAx ctValAxline = ctPlotArea.addNewValAx();
//            ctValAxline.addNewAxId().setVal(1234578); //id of the val axis
//            ctScalingline = ctValAxline.addNewScaling();
//            ctScalingline.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctValAxline.addNewDelete().setVal(false);
//            ctValAxline.addNewAxPos().setVal(STAxPos.R);
//            ctValAxline.addNewMajorTickMark().setVal(STTickMark.OUT);
//            ctValAxline.addNewMinorTickMark().setVal(STTickMark.NONE);
//            ctValAxline.addNewCrosses().setVal(STCrosses.MAX);
//            ctValAxline.addNewCrossBetween().setVal(STCrossBetween.BETWEEN);
//            ctValAxline.addNewCrossAx().setVal(1234567); //id of the cat axis
//            ctValAxline.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//        }else if("pie".equals(type)){//pie
//            CTPieChart ctPieChart = ctPlotArea.addNewPieChart();
//            CTBoolean ctBoolean = ctPieChart.addNewVaryColors();
//
//            //????????????,????????????????????????
//            for (int i = 0; i < fldNameArr.size()-1; i++) {
//                CTPieSer ctPieSer = ctPieChart.addNewSer();
//                CTSerTx ctSerTx = ctPieSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctPieSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctPieSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctPieSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                ctPieSer.addNewSpPr().addNewLn().addNewSolidFill().addNewSrgbClr().setVal(new byte[] {0,0,0});
//
//                //??????????????????
//                ctBoolean.setVal(true);
//            }
//            //legend??????
//            CTLegend ctLegend = ctChart.addNewLegend();
//            ctLegend.addNewLegendPos().setVal(STLegendPos.B);
//            ctLegend.addNewOverlay().setVal(true);
//        }else if("pie3D".equals(type)){//pie3D
//            CTPie3DChart ctPie3DChart = ctPlotArea.addNewPie3DChart();
//            CTBoolean ctBoolean = ctPie3DChart.addNewVaryColors();
//
//            //????????????,????????????????????????
//            for (int i = 0; i < fldNameArr.size()-1; i++) {
//                CTPieSer ctPieSer = ctPie3DChart.addNewSer();
//                CTSerTx ctSerTx = ctPieSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctPieSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctPieSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctPieSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                ctPieSer.addNewSpPr().addNewLn().addNewSolidFill().addNewSrgbClr().setVal(new byte[] {0,0,0});
//
//                //??????????????????
//                ctBoolean.setVal(true);
//            }
//            //legend??????
//            CTLegend ctLegend = ctChart.addNewLegend();
//            ctLegend.addNewLegendPos().setVal(STLegendPos.B);
//            ctLegend.addNewOverlay().setVal(true);
//        }else{//area
//            CTAreaChart ctAreaChart = ctPlotArea.addNewAreaChart();
//            CTBoolean ctBoolean = ctAreaChart.addNewVaryColors();
//            ctAreaChart.addNewGrouping().setVal(STGrouping.STANDARD);
//
//            //????????????,????????????????????????
//            for (int i = 0; i < fldNameArr.size()-1; i++) {
//                CTAreaSer ctAreaSer = ctAreaChart.addNewSer();
//                CTSerTx ctSerTx = ctAreaSer.addNewTx();
//                //?????????
//                CTStrRef ctStrRef = ctSerTx.addNewStrRef();
//                String legendDataRange = new CellRangeAddress(curRow,curRow, i+1, i+1).formatAsString(sheetName, true);
//                ctStrRef.setF(legendDataRange);
//                ctStrRef.setF(legendDataRange);
//                ctAreaSer.addNewIdx().setVal(i);
//
//                //????????????
//                CTAxDataSource cttAxDataSource = ctAreaSer.addNewCat();
//                ctStrRef = cttAxDataSource.addNewStrRef();
//                String axisDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), 0, 0)
//                        .formatAsString(sheetName, true);
//                ctStrRef.setF(axisDataRange);
//
//                //????????????
//                CTNumDataSource ctNumDataSource = ctAreaSer.addNewVal();
//                CTNumRef ctNumRef = ctNumDataSource.addNewNumRef();
//                String numDataRange = new CellRangeAddress(curRow+1, curRow+dataList.size(), i+1, i+1)
//                        .formatAsString(sheetName, true);
//                ctNumRef.setF(numDataRange);
//
//                //??????????????????
//                ctBoolean.setVal(false);
//                CTDLbls newDLbls = ctAreaSer.addNewDLbls();
//                newDLbls.setShowLegendKey(ctBoolean);
//                ctBoolean.setVal(true);
//                newDLbls.setShowVal(ctBoolean);
//                ctBoolean.setVal(false);
//                newDLbls.setShowCatName(ctBoolean);
//                newDLbls.setShowSerName(ctBoolean);
//                newDLbls.setShowPercent(ctBoolean);
//                newDLbls.setShowBubbleSize(ctBoolean);
//                newDLbls.setShowLeaderLines(ctBoolean);
//
//      /*     //?????????????????????
//           CTBoolean addNewSmooth = ctAreaSer.addNewSmooth();
//           addNewSmooth.setVal(false);
//
//           //?????????????????????
//           CTMarker addNewMarker = ctAreaSer.addNewMarker();
//           CTMarkerStyle addNewSymbol = addNewMarker.addNewSymbol();
//           addNewSymbol.setVal(STMarkerStyle.NONE);*/
//            }
//            //telling the BarChart that it has axes and giving them Ids
//            ctAreaChart.addNewAxId().setVal(123456);
//            ctAreaChart.addNewAxId().setVal(123457);
//
//            //cat axis
//            CTCatAx ctCatAx = ctPlotArea.addNewCatAx();
//            ctCatAx.addNewAxId().setVal(123456); //id of the cat axis
//            CTScaling ctScaling = ctCatAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctCatAx.addNewAxPos().setVal(STAxPos.B);
//            ctCatAx.addNewCrossAx().setVal(123457); //id of the val axis
//            ctCatAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //val axis
//            CTValAx ctValAx = ctPlotArea.addNewValAx();
//            ctValAx.addNewAxId().setVal(123457); //id of the val axis
//            ctScaling = ctValAx.addNewScaling();
//            ctScaling.addNewOrientation().setVal(STOrientation.MIN_MAX);
//            ctValAx.addNewAxPos().setVal(STAxPos.L);
//            ctValAx.addNewCrossAx().setVal(123456); //id of the cat axis
//            ctValAx.addNewTickLblPos().setVal(STTickLblPos.NEXT_TO);
//
//            //????????????????????????
//            if(isvalAxis){
//                ctValAx.addNewDelete().setVal(false);
//            }else{
//                ctValAx.addNewDelete().setVal(true);
//            }
//
//            //?????????????????????
//            ctCatAx.addNewDelete().setVal(false);
//
//            //legend??????
//            if(isLegend){
//                CTLegend ctLegend = ctChart.addNewLegend();
//                ctLegend.addNewLegendPos().setVal(STLegendPos.B);
//                ctLegend.addNewOverlay().setVal(false);
//            }
//
//
//        }
//        return result;
//    }
