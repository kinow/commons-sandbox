package br.eti.kinoshita.commons;

import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;

import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import com.ibm.icu.util.ULocale;

import sun.util.resources.LocaleData;


@SuppressWarnings("restriction")
public class LangDateTests {

    public static void main(String[] args) {
        // Oracle JDK
        Locale locale = Locale.forLanguageTag("pt-PT");
        ResourceBundle resource = LocaleData.getDateFormatData(locale);
        String[] shortWeekdays = resource.getStringArray("DayAbbreviations");
        System.out.println(Arrays.asList(shortWeekdays));

        // Android + ICU
        ULocale loc = new ULocale("pt_PT");
        DateFormat df = new SimpleDateFormat("EEE", loc);
        String s = df.format(new Date(1494115200L));
        System.out.println(s);
        
    }

}
