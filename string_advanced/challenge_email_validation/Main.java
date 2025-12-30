package com.example;

public class Main {

    static boolean validateEmail(String email) {
        int atSymbolIndex = email.indexOf("@");
        int dotIndex = email.lastIndexOf(".");
        return atSymbolIndex > 0 && dotIndex > atSymbolIndex && dotIndex < email.length() - 1;
    }

    static String extractDomainFromEmail(String email) {
        int atSymbolIndex = email.indexOf("@");
        return email.substring(atSymbolIndex + 1);
    }

    public static void main(String[] args) {
        String email = "  john.doe@example.com  ";
       email = email.trim();
        
        if (validateEmail(email)) {
            String domain = extractDomainFromEmail(email);
            System.out.println("Domain email: " + domain);
        } else {
            System.out.println("Invalid email address.");
        }
    }
}