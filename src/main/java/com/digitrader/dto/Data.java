
package com.digitrader.dto;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.Valid;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sort",
    "sorder",
    "count",
    "params",
    "fields",
    "pgno"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("sort")
    public String sort;
    @JsonProperty("sorder")
    public String sorder;
    @JsonProperty("count")
    public Integer count;
    @JsonProperty("params")
    @Valid
    public List<Param> params;
    @JsonProperty("fields")
    @Valid
    public List<String> fields;
    @JsonProperty("pgno")
    public Integer pgno;
    @JsonIgnore
    @Valid
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
