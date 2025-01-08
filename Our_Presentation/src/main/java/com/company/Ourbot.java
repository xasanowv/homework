package com.company;

import lombok.SneakyThrows;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ourbot extends TelegramLongPollingBot {
    private final Map<Long, Boolean> awaitingRegistration = new HashMap<>();
    private static final String EXCEL_FILE_PATH = "users.xlsx";

    @SneakyThrows
    @Override
    public void onUpdateReceived(Update update) {
        Message message = update.getMessage();
        Long chatId = message.getChatId();
        String text = message.getText();
        if (text.equals("/start")) {
            setwelcome(chatId,text);
            setregister(message);
        }else if (text.equals("/Language")) {
            setLanguageButtons(chatId,text);

        } else if (text.equals("\uD83C\uDF10\uD83C\uDDFA\uD83C\uDDF8English")) {
            setEnglishlevel(chatId,text);
        } else if (text.equals("\uD83C\uDF10\uD83C\uDDF7\uD83C\uDDFARus tili")) {
            setRuskiylevel(chatId,text);
        } else if (text.equals("\uD83C\uDF10\uD83C\uDDEB\uD83C\uDDF7Fransuz tili")) {
            setFransuzlevel(chatId,text);
        } else if (text.equals("\uD83C\uDF10\uD83C\uDDEA\uD83C\uDDF8Ispan tili")) {
            setIspanlevel(chatId,text);
        } else if (text.equals("\uD83C\uDF10\uD83C\uDDEE\uD83C\uDDF3Hind tili")) {
            setHindlevel(chatId,text);
        } else if (text.equals("\uD83C\uDF10\uD83C\uDDF8\uD83C\uDDE6Arab tili")) {
            setArablevel(chatId,text);
        } else if (text.equals("\uD83C\uDF10\uD83C\uDDE8\uD83C\uDDF3Xitoy tili")) {
            setXitoylevel(chatId,text);
        } else if (text.equals("\uD83D\uDCD3Biz Haqimizda")) {
            setBizhaqimizda(chatId,text);
        }
        if(text.equals("⬅\uFE0FOrqaga")){
            setLanguageButtons(chatId,text);
        }else if(text.equals("⬅\uFE0FНазат")) {
            setLanguageButtons(chatId,text);
        } else if (text.equals("⬅\uFE0FOrtga")) {
            setLanguageButtons(chatId,text);
        }
    }

    private void setBizhaqimizda(Long chatId, String text) throws TelegramApiException {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Bizning Telegram botimiz – til o'rganishni oson va qiziqarli qiluvchi innovatsion platforma. U ingliz, xitoy, ispan, hind, fransuz, arab va rus tillarini o'rgatish uchun mo'ljallangan. Har bir foydalanuvchi uchun individual darslar, testlar va maqsadlar belgilangan bo'lib, til o'rganish jarayoni samarali va motivatsion bo'ladi. Bizning botimiz yordamida siz tilni o'rganishda faqat o'z maqsadlaringizni amalga oshirishingiz bilan birga, yangi bilimlarni o'rganishda o'zingizni qulay his qilasiz. Qadamma-qadam rivojlaning va dunyo bilan bog'laning!");
        execute(message);
    }

    private void setXitoylevel(Long chatId, String text) throws TelegramApiException {
        KeyboardButton button = new KeyboardButton();
        button.setText("A1(Beginner):");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("A2(Elementary)");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("B1(Intermediate):");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("B2(Upper Intermediate):");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("C1(Advanced):");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("C2(Proficient):");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0FOrtga");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(button8);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Quyidagi darjalardan bittasini tanlang o'sha darajadan boshlab oqing\uD83D\uDCCA!!!");
        message.setReplyMarkup(markup);
        execute(message);
    }

    private void setArablevel(Long chatId, String text) throws TelegramApiException {
        KeyboardButton button = new KeyboardButton();
        button.setText("A1(Beginner):");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("A2(Elementary)");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("B1(Intermediate):");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("B2(Upper Intermediate):");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("C1(Advanced):");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("C2(Proficient):");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0FOrtga");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(button8);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Quyidagi darjalardan bittasini tanlang o'sha darajadan boshlab oqing\uD83D\uDCCA!!!");
        message.setReplyMarkup(markup);
        execute(message);
    }

    private void setHindlevel(Long chatId, String text) throws TelegramApiException {
        KeyboardButton button = new KeyboardButton();
        button.setText("A1(Beginner):");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("A2(Elementary)");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("B1(Intermediate):");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("B2(Upper Intermediate):");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("C1(Advanced):");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("C2(Proficient):");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0FOrtga");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(button8);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Quyidagi darjalardan bittasini tanlang o'sha darajadan boshlab oqing\uD83D\uDCCA!!!");
        message.setReplyMarkup(markup);
        execute(message);
    }

    private void setIspanlevel(Long chatId, String text) throws TelegramApiException {
        KeyboardButton button = new KeyboardButton();
        button.setText("A1(Beginner):");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("A2(Elementary)");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("B1(Intermediate):");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("B2(Upper Intermediate):");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("C1(Advanced):");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("C2(Proficient):");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0FOrtga");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(button8);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Quyidagi darjalardan bittasini tanlang o'sha darajadan boshlab oqing\uD83D\uDCCA!!!");
        message.setReplyMarkup(markup);
        execute(message);
    }

    private void setFransuzlevel(Long chatId, String text) throws TelegramApiException {
        if(text.equals("⬅\uFE0FOrdaga")){
            setFransuzlevel(chatId,text);
        }
        KeyboardButton button = new KeyboardButton();
        button.setText("A1(Beginner):");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("A2(Elementary)");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("B1(Intermediate):");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("B2(Upper Intermediate):");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("C1(Advanced):");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("C2(Proficient):");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0FOrtga");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(button8);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Quyidagi darjalardan bittasini tanlang o'sha darajadan boshlab oqing\uD83D\uDCCA!!!");
        message.setReplyMarkup(markup);
        execute(message);
    }

    private void setRuskiylevel(Long chatId, String text) throws TelegramApiException {
        KeyboardButton button = new KeyboardButton();
        button.setText("A1–Элементарный уровень");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("A2 – Базовый уровень");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("B1 – Уровень порога");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("B2 – Самодостаточный уровень");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("C1 – Профессиональный уровень");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("C2 – Уровень носителя языка");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0FНазат");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(button8);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Quyidagi darjalardan bittasini tanlang o'sha darajadan boshlab oqing\uD83D\uDCCA!!!");
        message.setReplyMarkup(markup);
        execute(message);
    }

    private void setEnglishlevel(Long chatId, String text) throws TelegramApiException {
        KeyboardButton button = new KeyboardButton();
        button.setText("Beginner(A1)");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("Elementary(A2)");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("Pre-Intermediate(A2-B1)");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("Intermediate(B1)");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("Upper Intermediate(B2)");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("Advanced (C1)");
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("Proficient(C2)");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("⬅\uFE0FOrqaga");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(button7);
        row4.add(button8);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setKeyboard(rows);
        markup.setResizeKeyboard(true);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Quyidagi darjalardan bittasini tanlang o'sha darajadan boshlab oqing\uD83D\uDCCA!!!");
        message.setReplyMarkup(markup);
        execute(message);
    }

    private void setLanguageButtons(Long chatId, String text) throws TelegramApiException {
        KeyboardButton button = new KeyboardButton();
        button.setText("\uD83C\uDF10\uD83C\uDDFA\uD83C\uDDF8English");
        KeyboardButton button2 = new KeyboardButton();
        button2.setText("\uD83C\uDF10\uD83C\uDDF7\uD83C\uDDFARus tili");
        KeyboardButton button3 = new KeyboardButton();
        button3.setText("\uD83C\uDF10\uD83C\uDDEB\uD83C\uDDF7Fransuz tili");
        KeyboardButton button4 = new KeyboardButton();
        button4.setText("\uD83C\uDF10\uD83C\uDDEA\uD83C\uDDF8Ispan tili");
        KeyboardButton button5 = new KeyboardButton();
        button5.setText("\uD83C\uDF10\uD83C\uDDEE\uD83C\uDDF3Hind tili");
        KeyboardButton button6 = new KeyboardButton();
        button6.setText("\uD83C\uDF10\uD83C\uDDF8\uD83C\uDDE6Arab tili");
        KeyboardButton button7 = new KeyboardButton();
        button7.setText("\uD83C\uDF10\uD83C\uDDE8\uD83C\uDDF3Xitoy tili");
        KeyboardButton button8 = new KeyboardButton();
        button8.setText("\uD83D\uDCD3Biz Haqimizda");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        row.add(button2);
        KeyboardRow row2 = new KeyboardRow();
        row2.add(button3);
        row2.add(button4);
        KeyboardRow row3 = new KeyboardRow();
        row3.add(button5);
        row3.add(button6);
        KeyboardRow row4 = new KeyboardRow();
        row4.add(button7);
        row4.add(button8);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        rows.add(row2);
        rows.add(row3);
        rows.add(row4);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setSelective(true);
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rows);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Quyidagi tillardan birini Tanlang\uD83C\uDF10!!!");
        message.setReplyMarkup(markup);
        execute(message);


    }

    private void setregister(Message message) {
        if (message != null && message.hasText()) {
            String text = message.getText();
            long userId = message.getFrom().getId();
            long chatId = message.getChatId();

            if (text.equals("/start")) {
                if (isUserRegistered(userId)) {
                    sendMessage(chatId, "Siz allaqachon ro'yhatdan o'tgansiz!");
                } else {
                    awaitingRegistration.put(userId, true);
                    sendMessage(chatId, "Siz ro'yhatdan o'tmagansiz. Iltimos, ism va familiyangizni kiriting (masalan: Ism Familiya).");
                }
            } else if (awaitingRegistration.getOrDefault(userId, false)) {
                // Ism va familiya qabul qilinadi
                String[] parts = text.split(" ", 2);
                if (parts.length == 2) {
                    String firstName = parts[0];
                    String lastName = parts[1];
                    registerUser(firstName, lastName, userId);
                    awaitingRegistration.remove(userId);
                    sendMessage(chatId, "Siz muvaffaqiyatli ro'yhatdan o'tdingiz!");
                } else {
                    sendMessage(chatId, "Iltimos, to'g'ri formatda ism va familiyangizni kiriting (masalan: Ism Familiya).");
                }
            } else {
                sendMessage(chatId, "Iltimos, /start buyrug'ini yuboring.");
            }
        }
    }

    private boolean isUserRegistered(long userId) {
        try (FileInputStream fis = new FileInputStream(EXCEL_FILE_PATH)) {
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheetAt(0);
            for (Row row : sheet) {
                Cell cell = row.getCell(2);
                if (cell != null && cell.getCellType() == CellType.NUMERIC && cell.getNumericCellValue() == userId) {
                    return true;
                }
            }
        } catch (IOException e) {
            // Fayl yo'q bo'lsa, yangi ro'yhatni boshlash kerak
            createExcelFile();
        }
        return false;
    }

    private void registerUser(String firstName, String lastName, long userId) {
        try (FileInputStream fis = new FileInputStream(EXCEL_FILE_PATH);
             Workbook workbook = new XSSFWorkbook(fis)) {

            Sheet sheet = workbook.getSheetAt(0);
            Row newRow = sheet.createRow(sheet.getPhysicalNumberOfRows());
            newRow.createCell(0).setCellValue(firstName);
            newRow.createCell(1).setCellValue(lastName);
            newRow.createCell(2).setCellValue(userId);
//            newRow.createCell(3).setCellValue(level);

            try (FileOutputStream fos = new FileOutputStream(EXCEL_FILE_PATH)) {
                workbook.write(fos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createExcelFile() {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("Users");
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("First Name");
            headerRow.createCell(1).setCellValue("Last Name");
            headerRow.createCell(2).setCellValue("User ID");

            try (FileOutputStream fos = new FileOutputStream(EXCEL_FILE_PATH)) {
                workbook.write(fos);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void sendMessage(long chatId, String text) {
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText(text);
        try {
            execute(message);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }

    private void setwelcome(Long chatId, String text) throws TelegramApiException {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.setText("Asalomu Alaykum bizning 'Language Teacher' botimizga xush kelibsiz!!\n\n" +
                "Botdan foydalinish uchun ro'yxatdan o'ting!!!");
        execute(sendMessage);
        KeyboardButton button = new KeyboardButton();
        button.setText("/Language");
        KeyboardRow row = new KeyboardRow();
        row.add(button);
        List<KeyboardRow> rows = new ArrayList<>();
        rows.add(row);
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        markup.setResizeKeyboard(true);
        markup.setKeyboard(rows);
        SendMessage message = new SendMessage();
        message.setChatId(chatId);
        message.setText("Tilni tanlash uchun '/Language'  tugmani bosing!!");
        message.setReplyMarkup(markup);
        execute(message);

    }

    @Override
    public String getBotUsername() {
        return "https://t.me/languagementor_bot";
    }
    @Override
    public String getBotToken() {
        return "7863672465:AAEt0q-zlfkb5ZklRMw_UfXXlUVhzWmT2So";
    }
}
