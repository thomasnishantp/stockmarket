
package com.digitrader.dto.dhan.request;

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
    "EXCH",
    "SYM",
    "SEG",
    "INST",
    "EXPCODE",
    "SEC_ID",
    "START",
    "END",
    "INTERVAL"
})
@Generated("jsonschema2pojo")
public class DhanRequestDailyDTO {

    @JsonProperty("EXCH")
    private String exch;
    @JsonProperty("SYM")
    private String sym;
    @JsonProperty("SEG")
    private String seg;
    @JsonProperty("INST")
    private String inst;
    @JsonProperty("EXPCODE")
    private Integer expcode;
    @JsonProperty("SEC_ID")
    private Integer secId;
    @JsonProperty("START")
    private Integer start;
    @JsonProperty("END")
    private Integer end;
    @JsonProperty("INTERVAL")
    private String interval;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("EXCH")
    public String getExch() {
        return exch;
    }

    @JsonProperty("EXCH")
    public void setExch(String exch) {
        this.exch = exch;
    }

    public DhanRequestDailyDTO withExch(String exch) {
        this.exch = exch;
        return this;
    }

    @JsonProperty("SYM")
    public String getSym() {
        return sym;
    }

    @JsonProperty("SYM")
    public void setSym(String sym) {
        this.sym = sym;
    }

    public DhanRequestDailyDTO withSym(String sym) {
        this.sym = sym;
        return this;
    }

    @JsonProperty("SEG")
    public String getSeg() {
        return seg;
    }

    @JsonProperty("SEG")
    public void setSeg(String seg) {
        this.seg = seg;
    }

    public DhanRequestDailyDTO withSeg(String seg) {
        this.seg = seg;
        return this;
    }

    @JsonProperty("INST")
    public String getInst() {
        return inst;
    }

    @JsonProperty("INST")
    public void setInst(String inst) {
        this.inst = inst;
    }

    public DhanRequestDailyDTO withInst(String inst) {
        this.inst = inst;
        return this;
    }

    @JsonProperty("EXPCODE")
    public Integer getExpcode() {
        return expcode;
    }

    @JsonProperty("EXPCODE")
    public void setExpcode(Integer expcode) {
        this.expcode = expcode;
    }

    public DhanRequestDailyDTO withExpcode(Integer expcode) {
        this.expcode = expcode;
        return this;
    }

    @JsonProperty("SEC_ID")
    public Integer getSecId() {
        return secId;
    }

    @JsonProperty("SEC_ID")
    public void setSecId(Integer secId) {
        this.secId = secId;
    }

    public DhanRequestDailyDTO withSecId(Integer secId) {
        this.secId = secId;
        return this;
    }

    @JsonProperty("START")
    public Integer getStart() {
        return start;
    }

    @JsonProperty("START")
    public void setStart(Integer start) {
        this.start = start;
    }

    public DhanRequestDailyDTO withStart(Integer start) {
        this.start = start;
        return this;
    }

    @JsonProperty("END")
    public Integer getEnd() {
        return end;
    }

    @JsonProperty("END")
    public void setEnd(Integer end) {
        this.end = end;
    }

    public DhanRequestDailyDTO withEnd(Integer end) {
        this.end = end;
        return this;
    }

    @JsonProperty("INTERVAL")
    public String getInterval() {
        return interval;
    }

    @JsonProperty("INTERVAL")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public DhanRequestDailyDTO withInterval(String interval) {
        this.interval = interval;
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

    public DhanRequestDailyDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DhanRequestDailyDTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("exch");
        sb.append('=');
        sb.append(((this.exch == null)?"<null>":this.exch));
        sb.append(',');
        sb.append("sym");
        sb.append('=');
        sb.append(((this.sym == null)?"<null>":this.sym));
        sb.append(',');
        sb.append("seg");
        sb.append('=');
        sb.append(((this.seg == null)?"<null>":this.seg));
        sb.append(',');
        sb.append("inst");
        sb.append('=');
        sb.append(((this.inst == null)?"<null>":this.inst));
        sb.append(',');
        sb.append("expcode");
        sb.append('=');
        sb.append(((this.expcode == null)?"<null>":this.expcode));
        sb.append(',');
        sb.append("secId");
        sb.append('=');
        sb.append(((this.secId == null)?"<null>":this.secId));
        sb.append(',');
        sb.append("start");
        sb.append('=');
        sb.append(((this.start == null)?"<null>":this.start));
        sb.append(',');
        sb.append("end");
        sb.append('=');
        sb.append(((this.end == null)?"<null>":this.end));
        sb.append(',');
        sb.append("interval");
        sb.append('=');
        sb.append(((this.interval == null)?"<null>":this.interval));
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
        result = ((result* 31)+((this.seg == null)? 0 :this.seg.hashCode()));
        result = ((result* 31)+((this.sym == null)? 0 :this.sym.hashCode()));
        result = ((result* 31)+((this.exch == null)? 0 :this.exch.hashCode()));
        result = ((result* 31)+((this.inst == null)? 0 :this.inst.hashCode()));
        result = ((result* 31)+((this.start == null)? 0 :this.start.hashCode()));
        result = ((result* 31)+((this.expcode == null)? 0 :this.expcode.hashCode()));
        result = ((result* 31)+((this.end == null)? 0 :this.end.hashCode()));
        result = ((result* 31)+((this.interval == null)? 0 :this.interval.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.secId == null)? 0 :this.secId.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DhanRequestDailyDTO) == false) {
            return false;
        }
        DhanRequestDailyDTO rhs = ((DhanRequestDailyDTO) other);
        return (((((((((((this.seg == rhs.seg)||((this.seg!= null)&&this.seg.equals(rhs.seg)))&&((this.sym == rhs.sym)||((this.sym!= null)&&this.sym.equals(rhs.sym))))&&((this.exch == rhs.exch)||((this.exch!= null)&&this.exch.equals(rhs.exch))))&&((this.inst == rhs.inst)||((this.inst!= null)&&this.inst.equals(rhs.inst))))&&((this.start == rhs.start)||((this.start!= null)&&this.start.equals(rhs.start))))&&((this.expcode == rhs.expcode)||((this.expcode!= null)&&this.expcode.equals(rhs.expcode))))&&((this.end == rhs.end)||((this.end!= null)&&this.end.equals(rhs.end))))&&((this.interval == rhs.interval)||((this.interval!= null)&&this.interval.equals(rhs.interval))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.secId == rhs.secId)||((this.secId!= null)&&this.secId.equals(rhs.secId))));
    }

}
