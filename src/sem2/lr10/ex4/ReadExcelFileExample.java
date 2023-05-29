package sem2.lr10.ex4;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFileExample {
    public static void main(String[] args) {
        var filePath = "C:/Users/assur/Desktop/git/src/sem2/lr10/ex4/exampleExel.xlsx";
        try (var fis = new FileInputStream(filePath); var workbook = new XSSFWorkbook(fis)) {
            var sheet = workbook.getSheet("Товары");

            for (var row : sheet) {
                for (var cell : row) {
                    System.out.println(cell.toString() + "\t");
                }
                System.out.println();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл " + filePath + " не найден");
        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл");
        }
    }
}