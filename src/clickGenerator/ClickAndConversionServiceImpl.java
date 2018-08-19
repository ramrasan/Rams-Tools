package clickGenerator;

import org.springframework.stereotype.Component;


@Component
public class ClickAndConversionServiceImpl implements ClickAndConversionService {

    @Override
    public void clickGenerator(Event event) {

        System.out.println("CLICK");
        System.out.println(
                "{\"EventType\":\"CLICK\",\"EventTimestamp\":" +
                        String.valueOf(event.getTime()) + ",\"IP-Address\":\"24.72.174.55\",\"QUERY_STRING\":\"prof=" +
                        event.getKsProfileId() + "&cid=" +
                        event.getAdCreativeIdInTarget() + "&url[]=http://www.stitchfix.com/women%3Futm_source%3Dinstagram%26utm_campaign%3DInstagram%26utm_medium%3DInterests%26utm_content%3Dmobile%26utm_term%3D137675357\",\"X-Cluster-Client-Ip\":null,\"X-Forwarded-For\":\"24.72.174.55\",\"Host\":\"7178.xg4ken.com\",\"Referer\":\"http://instagram.com/\",\"Cookie\":\"kenshoo_id=" +
                        event.getCookie() + "\",\"User-Agent\":\"Mozilla/5.0 (iPhone; CPU iPhone OS 11_1_2 like Mac OS X) AppleWebKit/604.3.5 (KHTML, like Gecko) Mobile/15B202 Instagram 24.0.0.14.205 (iPhone9,3; iOS 11_1_2; en_US; en-US; scale=2.00; gamut=wide; 750x1334)\",\"ProfileToken\":\"\",\"RedirUrl\":\"http://www.stitchfix.com/women?utm_source=instagram&utm_campaign=Instagram&utm_medium=Interests&utm_content=mobile&utm_term=137675357\",\"KSHostName\":\"7178\",\"ProxyIpAddress\":\"ecprdfwb02-proxy\",\"AlternateKS\":\"\",\"HeartbeatKS\":\"\",\"ServicePath\":\"\",\"Ordinal\":0,\"Version\":1}\n");


    }

    @Override
    public void conversionGenerator(Event event) {

        String CONVERSION_TIME = String.valueOf(event.getTime() + 3000);

        System.out.println("CONVERSION");
        System.out.println("{\"EventType\":\"CONVERSION\",\"EventTimestamp\":" +
                CONVERSION_TIME + ",\"IP-Address\":\"174.29.202.209\"," + "\"QUERY_STRING\":\"track=1&token=" +
                event.getProfileToken() + "&business_line=womens&type=" +
                event.getConversionType() + "&orderId=" +
                event.getOrderId() + "\",\"X-Cluster-Client-Ip\":null,\"X-Forwarded-For\":\"174.29.202.209\",\"Host\":\"7178.xg4ken.com\",\"Referer\":\"https://www.stitchfix.com/welcome/schedule\",\"Cookie\":\"kenshoo_id=" +
                event.getCookie() + "\",\"User-Agent\":\"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/62.0.3202.94 Safari/537.36\",\"ProfileToken\":\"" +
                event.getProfileToken() + "\",\"RedirUrl\":\"\",\"KSHostName\":\"7178\",\"ProxyIpAddress\":\"ecprdfwb18-proxy\",\"AlternateKS\":\"\",\"HeartbeatKS\":\"\",\"ServicePath\":\"\",\"Ordinal\":0,\"Version\":1}");


    }
}
