package utils;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	
	 public static void readExcel(String filePath) {
	        String basePath = System.getProperty("user.dir");
	        String excelPath = basePath+filePath;
	        XSSFWorkbook workbook = new XSSFWorkbook(new File(excelPath));
	        XSSFSheet sheet = workbook.getSheetAt(0);
	        int rowCount = sheet.getLastRowNum();
	        Row row = sheet.getRow(0);
	        System.out.println(rowCount);
	        for (int i =0; i< rowCount;i++){
	            int colcount = row.getLastCellNum();
	            for (int j=0;j<colcount;j++
	                 ) {
	                System.out.print(getCellData(sheet,i,j)+"\t");
	            }
	            System.out.println();
	        }

	    }

	    public static String getCellData(Sheet sheet,int row, int colName){
	        return sheet.getRow(row).getCell(colName).toString();
	    }

}
