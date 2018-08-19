package clickGenerator;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Event {
    private Long time;
    private String date;
    private String conversionType;
    private String orderId;
    private String cookie;
    private String profileToken;
    private String ksProfileId;
    private String adCreativeIdInTarget;

    public Event(Long time, String Date,String conversionType, String orderId, String cookie, String profileToken, String ksProfileId, String adCreativeIdInTarget) {
        this.time = time;
        this.date = date;
        this.conversionType = conversionType;
        this.orderId = orderId;
        this.cookie = cookie;
        this.profileToken = profileToken;
        this.ksProfileId = ksProfileId;
        this.adCreativeIdInTarget = adCreativeIdInTarget;
    }

    public Long getTime() {
        return time;
    }

    public String getDate() {
        return date;
    }
    public String getConversionType() {
        return conversionType;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCookie() {
        return cookie;
    }

    public String getProfileToken() {
        return profileToken;
    }

    public String getKsProfileId() {
        return ksProfileId;
    }

    public String getAdCreativeIdInTarget() {
        return adCreativeIdInTarget;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Event rhs = (Event) obj;
        return new EqualsBuilder()
                .append(this.time, rhs.time)
                .append(this.date, rhs.date)
                .append(this.conversionType, rhs.conversionType)
                .append(this.orderId, rhs.orderId)
                .append(this.cookie, rhs.cookie)
                .append(this.profileToken, rhs.profileToken)
                .append(this.ksProfileId, rhs.ksProfileId)
                .append(this.adCreativeIdInTarget, rhs.adCreativeIdInTarget)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(time)
                .append(date)
                .append(conversionType)
                .append(orderId)
                .append(cookie)
                .append(profileToken)
                .append(ksProfileId)
                .append(adCreativeIdInTarget)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("time", time)
                .append("date", date)
                .append("conversionType", conversionType)
                .append("orderId", orderId)
                .append("cookie", cookie)
                .append("profileToken", profileToken)
                .append("ksProfileId", ksProfileId)
                .append("adCreativeIdInTarget", adCreativeIdInTarget)
                .toString();
    }
}
