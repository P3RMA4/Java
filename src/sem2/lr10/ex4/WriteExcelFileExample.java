package sem2.lr10.ex4;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Товары");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Харатеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Художественная литература");
        dataRow1.createCell(1).setCellValue("Жанр: Детектив Автор: Микол Остоу");
        dataRow1.createCell(2).setCellValue(380.0);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Ноутбук");
        dataRow2.createCell(1).setCellValue("Процессор: Intel Core i7, Оперативная память: 8 ГБ");
        dataRow2.createCell(2).setCellValue(123990.0);

        String filePath  = "C:/Users/assur/Desktop/git/src/sem2/lr10/ex4/exampleExel.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("Данные записаны в файл: "+filePath);
    }

}