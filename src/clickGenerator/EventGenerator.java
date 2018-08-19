package clickGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventGenerator {

    @Autowired
    ClickAndConversionService clickAndConversionService;


    public static void main(String[] args) {

        Long TIME = 1525181400000L;
        String Date = "2017-01-01 00:50:50";
        String CONVERSION_TYPE = "Test1";
//        must chang



        String ORDER_ID = "32156670";
        String COOKIE = "b6750054-869e-402a-9374-a739ed6d97af";

        String PROFILE_TOKEN = "7ccb4aa0-f58d-4305-9cdc-d5a74ebcff95";
        String KS_PROFILE_ID = "845";
//        FB Ad id or social adgroup id in target
        String CID_AD_CREATIVE_ID_IN_TARGET = "23842781693780300";
        String CLICK_TIME = String.valueOf(TIME);
        String CONVERSION_TIME = String.valueOf(TIME + 3000);
        String VALUE = "15.2";




        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("clickGenerator");
        ClickAndConversionService clickAndConversionService = context.getBean("clickAndConversionServiceImpl", ClickAndConversionService.class);


        Event event = new Event(TIME, Date,CONVERSION_TYPE, ORDER_ID, COOKIE, PROFILE_TOKEN, KS_PROFILE_ID, CID_AD_CREATIVE_ID_IN_TARGET);

        clickAndConversionService.clickGenerator(event);
        clickAndConversionService.conversionGenerator(event);


    }


}
