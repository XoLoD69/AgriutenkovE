package Lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private final Map<String, List<String>> surnamesAndPhones = new HashMap<>();

    public void add(String name, String phone) {
        List<String> phones = surnamesAndPhones.getOrDefault(name, new ArrayList<>());
        phones.add(phone);
        surnamesAndPhones.put(name, phones);
    }

    public void getPhone(String name) {
        List<String> phones = surnamesAndPhones.get(name);
        System.out.println(name + ": " + phones);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "namesAndPhones=" + surnamesAndPhones +
                '}';
    }
}