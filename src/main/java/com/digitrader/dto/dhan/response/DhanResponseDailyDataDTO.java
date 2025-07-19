
package com.digitrader.dto.dhan.response;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "o",
    "h",
    "l",
    "c",
    "v",
    "t",
    "oi",
    "Time"
})
@Generated("jsonschema2pojo")
public class DhanResponseDailyDataDTO {

    @JsonProperty("o")
    private List<Integer> o = new ArrayList<Integer>();
    @JsonProperty("h")
    private List<Double> h = new ArrayList<Double>();
    @JsonProperty("l")
    private List<Double> l = new ArrayList<Double>();
    @JsonProperty("c")
    private List<Double> c = new ArrayList<Double>();
    @JsonProperty("v")
    private List<Integer> v = new ArrayList<Integer>();
    @JsonProperty("t")
    private List<Integer> t = new ArrayList<Integer>();
    @JsonProperty("oi")
    private List<Integer> oi = new ArrayList<Integer>();
    @JsonProperty("Time")
    private List<String> time = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("o")
    public List<Integer> getO() {
        return o;
    }

    @JsonProperty("o")
    public void setO(List<Integer> o) {
        this.o = o;
    }

    public DhanResponseDailyDataDTO withO(List<Integer> o) {
        this.o = o;
        return this;
    }

    @JsonProperty("h")
    public List<Double> getH() {
        return h;
    }

    @JsonProperty("h")
    public void setH(List<Double> h) {
        this.h = h;
    }

    public DhanResponseDailyDataDTO withH(List<Double> h) {
        this.h = h;
        return this;
    }

    @JsonProperty("l")
    public List<Double> getL() {
        return l;
    }

    @JsonProperty("l")
    public void setL(List<Double> l) {
        this.l = l;
    }

    public DhanResponseDailyDataDTO withL(List<Double> l) {
        this.l = l;
        return this;
    }

    @JsonProperty("c")
    public List<Double> getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(List<Double> c) {
        this.c = c;
    }

    public DhanResponseDailyDataDTO withC(List<Double> c) {
        this.c = c;
        return this;
    }

    @JsonProperty("v")
    public List<Integer> getV() {
        return v;
    }

    @JsonProperty("v")
    public void setV(List<Integer> v) {
        this.v = v;
    }

    public DhanResponseDailyDataDTO withV(List<Integer> v) {
        this.v = v;
        return this;
    }

    @JsonProperty("t")
    public List<Integer> getT() {
        return t;
    }

    @JsonProperty("t")
    public void setT(List<Integer> t) {
        this.t = t;
    }

    public DhanResponseDailyDataDTO withT(List<Integer> t) {
        this.t = t;
        return this;
    }

    @JsonProperty("oi")
    public List<Integer> getOi() {
        return oi;
    }

    @JsonProperty("oi")
    public void setOi(List<Integer> oi) {
        this.oi = oi;
    }

    public DhanResponseDailyDataDTO withOi(List<Integer> oi) {
        this.oi = oi;
        return this;
    }

    @JsonProperty("Time")
    public List<String> getTime() {
        return time;
    }

    @JsonProperty("Time")
    public void setTime(List<String> time) {
        this.time = time;
    }

    public DhanResponseDailyDataDTO withTime(List<String> time) {
        this.time = time;
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

    public DhanResponseDailyDataDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DhanResponseDailyDataDTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("o");
        sb.append('=');
        sb.append(((this.o == null)?"<null>":this.o));
        sb.append(',');
        sb.append("h");
        sb.append('=');
        sb.append(((this.h == null)?"<null>":this.h));
        sb.append(',');
        sb.append("l");
        sb.append('=');
        sb.append(((this.l == null)?"<null>":this.l));
        sb.append(',');
        sb.append("c");
        sb.append('=');
        sb.append(((this.c == null)?"<null>":this.c));
        sb.append(',');
        sb.append("v");
        sb.append('=');
        sb.append(((this.v == null)?"<null>":this.v));
        sb.append(',');
        sb.append("t");
        sb.append('=');
        sb.append(((this.t == null)?"<null>":this.t));
        sb.append(',');
        sb.append("oi");
        sb.append('=');
        sb.append(((this.oi == null)?"<null>":this.oi));
        sb.append(',');
        sb.append("time");
        sb.append('=');
        sb.append(((this.time == null)?"<null>":this.time));
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
        result = ((result* 31)+((this.c == null)? 0 :this.c.hashCode()));
        result = ((result* 31)+((this.t == null)? 0 :this.t.hashCode()));
        result = ((result* 31)+((this.v == null)? 0 :this.v.hashCode()));
        result = ((result* 31)+((this.h == null)? 0 :this.h.hashCode()));
        result = ((result* 31)+((this.oi == null)? 0 :this.oi.hashCode()));
        result = ((result* 31)+((this.time == null)? 0 :this.time.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.l == null)? 0 :this.l.hashCode()));
        result = ((result* 31)+((this.o == null)? 0 :this.o.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DhanResponseDailyDataDTO) == false) {
            return false;
        }
        DhanResponseDailyDataDTO rhs = ((DhanResponseDailyDataDTO) other);
        return ((((((((((this.c == rhs.c)||((this.c!= null)&&this.c.equals(rhs.c)))&&((this.t == rhs.t)||((this.t!= null)&&this.t.equals(rhs.t))))&&((this.v == rhs.v)||((this.v!= null)&&this.v.equals(rhs.v))))&&((this.h == rhs.h)||((this.h!= null)&&this.h.equals(rhs.h))))&&((this.oi == rhs.oi)||((this.oi!= null)&&this.oi.equals(rhs.oi))))&&((this.time == rhs.time)||((this.time!= null)&&this.time.equals(rhs.time))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.l == rhs.l)||((this.l!= null)&&this.l.equals(rhs.l))))&&((this.o == rhs.o)||((this.o!= null)&&this.o.equals(rhs.o))));
    }

}
