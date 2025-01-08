package com.company;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws TelegramApiException, IOException {
        TelegramBotsApi api = new TelegramBotsApi(DefaultBotSession.class);
        api.registerBot(new Ourbot());
        System.out.println("Hello World!");
//        Workbook workbook = new XSSFWorkbook();
//        Sheet sheet = workbook.createSheet("users");
//
//        User user = new User();
//        user.setChatId(78263423);
//        user.setFullName("Yusuf");
//        user.setUsername("myshukurov");
//
//
//        Row row = sheet.createRow(1);
//        row.createCell(0).setCellValue(user.getChatId());
//        row.createCell(1).setCellValue(user.getFullName());
//        row.createCell(2).setCellValue(user.getUsername());
//
//        Row headerRow = sheet.createRow(0);
//        headerRow.createCell(0).setCellValue("chatId");
//        headerRow.createCell(1).setCellValue("fullName");
//        headerRow.createCell(2).setCellValue("username");
//
//        FileOutputStream fos = new FileOutputStream("users.xlsx");
//        workbook.write(fos);
//
//        FileOutputStream fileOutputStream = new FileOutputStream("users.xlsx", true);
//        workbook.write(fileOutputStream);

    }
}