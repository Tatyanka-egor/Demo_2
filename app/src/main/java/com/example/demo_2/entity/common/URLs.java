package com.example.demo_2.entity.common;

public class URLs {
    //для запросов
    private final static String BASE="http://cinema.areas.su/";//servers
    public final static String REGISTER=BASE+"auth/register";//регистрация
    public final static String LOGON=BASE+"auth/login";//аутентификция пользователя
    public final static String CHATSSPICOK=BASE+"chats/{movieId}";//список чатов
    public final static String CHATMASSEGE=BASE+"chats/{chatId}/messages";//сообщения в чате
}
