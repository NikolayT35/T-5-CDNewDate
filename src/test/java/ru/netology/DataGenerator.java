package ru.netology;
import com.github.javafaker.Faker;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DataGenerator {


private Faker faker;
    LocalDate today = LocalDate.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public String createDate(int plusDays) {
        LocalDate newDate = today.plusDays(plusDays);
        return formatter.format(newDate);
    }

    public String getCity() {
        String[] CityList = new String[]{"Абакан", "Анадырь", "Архангельск", "Астрахань", "Барнаул", "Владикавказ", "Горно-Алтайск", "Йошкар-Ола", "Казань", "Калининград", "Калуга", "Краснодар", "Магас", "Махачкала", "Нарьян-Мар", "Салехард", "Самара", "Саранск", "Саратов", "Хабаровск", "Ханты-Мансийск", "Южно-Сахалинск", "Великий Новгород", "Владивосток", "Владимир", "Вологда", "Рязань", "Биробиджан", "Чебоксары", "Москва", "Санкт-Петербург", "Ульяновск", "Симферополь", "Ростов-на-Дону"};
        int city = (int) Math.floor(Math.random() * CityList.length);
        return CityList[city];
    }
    public String getName() {
       faker = new Faker(new Locale("ru"));
        return (faker.name().lastName()+(" ")+faker.name().firstName());
    }

    public String getPhone() {
      faker = new Faker(new Locale("ru"));
        return faker.phoneNumber().phoneNumber();
    }
}

