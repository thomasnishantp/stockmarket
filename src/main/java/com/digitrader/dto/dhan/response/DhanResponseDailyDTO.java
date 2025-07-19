
package com.digitrader.dto.dhan.response;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "success",
    "data",
    "nextTime"
})
@Generated("jsonschema2pojo")
public class DhanResponseDailyDTO {

    @JsonProperty("success")
    private Boolean success;
    @JsonProperty("data")
    private DhanResponseDailyDataDTO data;
    @JsonProperty("nextTime")
    private Integer nextTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("success")
    public Boolean getSuccess() {
        return success;
    }

    @JsonProperty("success")
    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public DhanResponseDailyDTO withSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    @JsonProperty("data")
    public DhanResponseDailyDataDTO getData() {
        return data;
    }

    @JsonProperty("data")
    public void setData(DhanResponseDailyDataDTO data) {
        this.data = data;
    }

    public DhanResponseDailyDTO withData(DhanResponseDailyDataDTO data) {
        this.data = data;
        return this;
    }

    @JsonProperty("nextTime")
    public Integer getNextTime() {
        return nextTime;
    }

    @JsonProperty("nextTime")
    public void setNextTime(Integer nextTime) {
        this.nextTime = nextTime;
    }

    public DhanResponseDailyDTO withNextTime(Integer nextTime) {
        this.nextTime = nextTime;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public DhanResponseDailyDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DhanResponseDailyDTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("success");
        sb.append('=');
        sb.append(((this.success == null)?"<null>":this.success));
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("nextTime");
        sb.append('=');
        sb.append(((this.nextTime == null)?"<null>":this.nextTime));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+((this.success == null)? 0 :this.success.hashCode()));
        result = ((result* 31)+((this.nextTime == null)? 0 :this.nextTime.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DhanResponseDailyDTO) == false) {
            return false;
        }
        DhanResponseDailyDTO rhs = ((DhanResponseDailyDTO) other);
        return (((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&((this.success == rhs.success)||((this.success!= null)&&this.success.equals(rhs.success))))&&((this.nextTime == rhs.nextTime)||((this.nextTime!= null)&&this.nextTime.equals(rhs.nextTime))));
    }

}
