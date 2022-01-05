package hello.typeconverter.type;

import hello.typeconverter.converter.IntegerToStringConverter;
import hello.typeconverter.converter.IpPortToStringConverter;
import hello.typeconverter.converter.StringToIntegerConverter;
import hello.typeconverter.converter.StringToIpPortConverter;
import hello.typeconverter.formatter.MyNumberFormatter;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistrar;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.FileOutputStream;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registory) {

    //주석처리 우선순위
//        registory.addConverter(new StringToIntegerConverter());
//        registory.addConverter(new IntegerToStringConverter());
        registory.addConverter(new StringToIpPortConverter());
        registory.addConverter(new IpPortToStringConverter());

        //추가
        registory.addFormatter(new MyNumberFormatter());
    }

}
