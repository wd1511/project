package papermanage;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.hssf.*;
import java.io.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
public class seproject {

	 public void exportPaper(Paper p){
	 	try{
			FileInputStream fs = new FileInputStream("/Users/joker/Desktop/1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int currentLastRowIndex = sheet.getLastRowNum();
			int newRowIndex = currentLastRowIndex + 1;
			XSSFRow newRow = sheet.createRow(newRowIndex);
			
			int cellIndex = 0;
			XSSFCell newIdCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_NUMERIC);
			newIdCell.setCellValue(p.getId());
			
			XSSFCell newPaperNameCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newPaperNameCell.setCellValue(p.getPaperName());
			
			XSSFCell newAuthorCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newAuthorCell.setCellValue(p.getAuthor());
			
			XSSFCell newKeywordsCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newKeywordsCell.setCellValue(p.getKeywords());
			
			XSSFCell newSort1Cell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newSort1Cell.setCellValue(p.getSort1());
			
			XSSFCell newSort2Cell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newSort2Cell.setCellValue(p.getSort2());
			
			XSSFCell newSort3Cell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newSort3Cell.setCellValue(p.getSort3());
			
			XSSFCell newPublicationCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newPublicationCell.setCellValue(p.getPublication());
			
			XSSFCell newWorkloadCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newWorkloadCell.setCellValue(p.getWorkload());
			
			XSSFCell newDateCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newDateCell.setCellValue(p.getDate());
			
			XSSFCell newReferenceCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newReferenceCell.setCellValue(p.getReference());
			
			FileOutputStream excelFileOutPutStream = new FileOutputStream("/Users/joker/Desktop/1.xlsx");
			workbook.write(excelFileOutPutStream);
			excelFileOutPutStream.flush();
			excelFileOutPutStream.close();
			
			workbook.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	 } 
	 
	 public void exportReference(Reference p){
	 	try{
			FileInputStream fs = new FileInputStream("/Users/joker/Desktop/1.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fs);
			System.out.println("ok");
			XSSFSheet sheet = workbook.getSheetAt(0);
			
			int currentLastRowIndex = sheet.getLastRowNum();
			int newRowIndex = currentLastRowIndex + 1;
			XSSFRow newRow = sheet.createRow(newRowIndex);
			
			int cellIndex = 0;
			XSSFCell newIdCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_NUMERIC);
			newIdCell.setCellValue(p.getId());
			
			XSSFCell newReferenceNameCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newReferenceNameCell.setCellValue(p.getReferenceName());
			
			XSSFCell newAuthorCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newAuthorCell.setCellValue(p.getAuthor());
			
			XSSFCell newKeywordsCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newKeywordsCell.setCellValue(p.getKeywords());
			
			XSSFCell newSort1Cell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newSort1Cell.setCellValue(p.getSort1());
			
			XSSFCell newSort2Cell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newSort2Cell.setCellValue(p.getSort2());
			
			XSSFCell newSort3Cell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newSort3Cell.setCellValue(p.getSort3());
			
			XSSFCell newPublicationCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newPublicationCell.setCellValue(p.getPublication());
			
			XSSFCell newWorkloadCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newWorkloadCell.setCellValue(p.getWorkload());
			
			XSSFCell newDateCell = newRow.createCell(cellIndex++,Cell.CELL_TYPE_STRING);
			newDateCell.setCellValue(p.getDate());
			
			
			FileOutputStream excelFileOutPutStream = new FileOutputStream("/Users/joker/Desktop/1.xlsx");
			workbook.write(excelFileOutPutStream);
			excelFileOutPutStream.flush();
			excelFileOutPutStream.close();
			
			workbook.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	 } 
	 
}
