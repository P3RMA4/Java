package sem2.kursovaya;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ExcelPhoneBook {
    private final String path;
    private final Map<String, String> phoneBook;

    public ExcelPhoneBook(String path) throws IOException {
        this.path = path;
        this.phoneBook = new HashMap<>();
        readExcelFile();
    }

    private void readExcelFile() throws IOException {
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        Iterator<Row> rows = sheet.iterator();

        while (rows.hasNext()) {
            Row currentRow = rows.next();
            String name = currentRow.getCell(0).getStringCellValue();
            String phone = currentRow.getCell(1).getStringCellValue();
            phoneBook.put(name, phone);
        }
        fis.close();
    }

    public void addContact(String name, String phoneNumber) throws IOException {
        phoneBook.put(name, phoneNumber);
        writeExcelFile();
    }

    private void writeExcelFile() throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Контакты");

        int rowIndex = 0;
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            Row row = sheet.createRow(rowIndex++);
            row.createCell(0).setCellValue(entry.getKey());
            row.createCell(1).setCellValue(entry.getValue());
        }

        FileOutputStream fos = new FileOutputStream(path);
        workbook.write(fos);
        fos.close();
    }

    public String getPhoneNumber(String name) {
        if(phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            return "Пользователь не найден.";
        }
    }

    public void printAllContacts() {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) throws IOException {
        ExcelPhoneBook phoneBook = new ExcelPhoneBook("C:\\Users\\assur\\Desktop\\git\\src\\sem2\\kursovaya\\Contact.xlsx");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите 'поиск' для чтения, 'запись' для записи данных, 'список' для вывода всех контактов или 'выйти' для выхода:");
            String action = scanner.nextLine();

            switch (action) {
                case "поиск":
                    System.out.println("Введите имя для поиска телефонного номера:");
                    String name = scanner.nextLine();
                    String phoneNumber = phoneBook.getPhoneNumber(name);
                    if(phoneNumber.equals("Пользователь не найден.")) {
                        System.out.println(phoneNumber);
                    } else {
                        System.out.println(name + " номер телефона: " + phoneNumber);
                    }
                    break;
                case "запись":
                    System.out.println("Введите имя и телефонный номер через пробел:");
                    String[] inputData = scanner.nextLine().split(" ");
                    phoneBook.addContact(inputData[0], inputData[1]);
                    break;
                case "список":
                    phoneBook.printAllContacts();
                    break;
                case "выйти":
                    System.out.println("Выход из программы...");
                    return;
                default:
                    System.out.println("Неизвестное действие. Введите 'поиск', 'запись', 'список' или 'выйти'.");
            }
        }
    }
}