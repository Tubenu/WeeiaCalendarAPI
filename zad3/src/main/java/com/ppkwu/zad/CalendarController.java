package com.ppkwu.zad;

import biweekly.ICalendar;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CalendarController {

    @RequestMapping("/GetCalendarEvents")
    public Object calendar(@RequestParam(defaultValue = "2019") int year, @RequestParam(defaultValue = "01") int month) {

        String CALENDAR_URL = "http://weeia.p.lodz.pl/pliki_strony_kontroler/kalendarz.php";
        String YEAR_PARAM = "?year=";
        String MONTH_PARAM = "&month=";
        String HTML_SELECTOR = "td";
        String CLASS_NAME = "active";
        String MATCHER = "a class=\"active\" href=\"javascript:void();\"";
        String REGEX = "\\n";
        String FILENAME = "calendar.ics";
        String MEDIA_TYPE = "text/calendar";
        int INDEX = 0;


        String url = CALENDAR_URL + YEAR_PARAM + year + MONTH_PARAM + month;
        List<Calendar> calendarEvents = new ArrayList<>();
        ICalendar calendar = new ICalendar();
        LocalDate localDate = LocalDate.now();
        Month actualMonth = localDate.getMonth();
    }
}
