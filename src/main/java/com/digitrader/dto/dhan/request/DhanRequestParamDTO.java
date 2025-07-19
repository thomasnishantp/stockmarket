
package com.digitrader.dto.dhan.request;

import com.fasterxml.jackson.annotation.*;
import lombok.*;

import java.util.LinkedHashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "field",
    "op",
    "val"
})
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DhanRequestParamDTO {

    @JsonProperty("field")
    public String field;
    @JsonProperty("op")
    public String op;
    @JsonProperty("val")
    public String val;
    @JsonIgnore
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
