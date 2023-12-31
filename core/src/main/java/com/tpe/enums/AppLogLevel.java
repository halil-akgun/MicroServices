package com.tpe.enums;

public enum AppLogLevel {

    ERROR("ERROR"), WARN("WARN"), INFO("INFO");

    private String name;

    private AppLogLevel(String name) {
        this.name = name;
    }

    //    String to Enum Value
    public static AppLogLevel fromString(String text) {
        for (AppLogLevel level : AppLogLevel.values()) {
            if (level.name.equalsIgnoreCase(text)) return level;
//   mesela turkce kullanacaksak if("HATA".equalsIgnoreCase(text)) return AppLogLevel.ERROR;
        }
        return null;
    }
}
