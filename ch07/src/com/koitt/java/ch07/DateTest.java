package com.koitt.java.ch07;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateTest {

    public static void main(String[] args) {
         Date now = new Date();
         System.out.println(now);
         System.out.println(now.getTime());
         
         DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.KOREA);//date의 instant객체 만들어서df에 넣기
         System.out.println(df.format(now));
         
         df = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT, Locale.KOREA);
         System.out.println(df.format(now));
         System.out.println();
         // 1970년 1월 1일 이후 지난 천분의 1초 시간으로 생성
         Date when = new Date(100_000_000_000L);//1억 초 지난 뒤 시간
         System.out.println(when + " == " + (Date)when.clone());//클론은 객체를 하나 복제 
         System.out.println(when.before(now));//특정날짜 이전인지 비교하는 것
         System.out.println(when.equals(now));//주소값이 아닌 실제 날짜가 같은지 비교
         System.out.println(when.compareTo(now));

    }

}

