
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
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DayRSI14CurrentCandle",
    "DaySMA200CurrentCandle",
    "DaySMA50CurrentCandle",
    "DispSym",
    "DivYeild",
    "Eps",
    "Exch",
    "High1Yr",
    "Ind_Pe",
    "Inst",
    "Isin",
    "LotSize",
    "Low1Yr",
    "Ltp",
    "Mcap",
    "Multiplier",
    "NetProfitMargin",
    "PPerchange",
    "Pb",
    "Pchange",
    "PricePerchng1mon",
    "PricePerchng1year",
    "PricePerchng3mon",
    "PricePerchng3year",
    "PricePerchng5year",
    "ROCE",
    "Revenue",
    "Roe",
    "Seg",
    "Seosym",
    "Sid",
    "Sym",
    "TickSize",
    "Volume",
    "Year1RevenueGrowth",
    "YoYLastQtrlyProfitGrowth",
    "Pe"
})
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DhanResponseDatumDTO {

    @JsonProperty("DayRSI14CurrentCandle")
    private Double dayRSI14CurrentCandle;
    @JsonProperty("DaySMA200CurrentCandle")
    private Double daySMA200CurrentCandle;
    @JsonProperty("DaySMA50CurrentCandle")
    private Double daySMA50CurrentCandle;
    @JsonProperty("DispSym")
    private String dispSym;
    @JsonProperty("DivYeild")
    private Integer divYeild;
    @JsonProperty("Eps")
    private Double eps;
    @JsonProperty("Exch")
    private String exch;
    @JsonProperty("High1Yr")
    private Integer high1Yr;
    @JsonProperty("Ind_Pe")
    private Double indPe;
    @JsonProperty("Inst")
    private String inst;
    @JsonProperty("Isin")
    private String isin;
    @JsonProperty("LotSize")
    private Integer lotSize;
    @JsonProperty("Low1Yr")
    private Double low1Yr;
    @JsonProperty("Ltp")
    private Double ltp;
    @JsonProperty("Mcap")
    private Double mcap;
    @JsonProperty("Multiplier")
    private Integer multiplier;
    @JsonProperty("NetProfitMargin")
    private Double netProfitMargin;
    @JsonProperty("PPerchange")
    private Double pPerchange;
    @JsonProperty("Pb")
    private Double pb;
    @JsonProperty("Pchange")
    private Double pchange;
    @JsonProperty("PricePerchng1mon")
    private Double pricePerchng1mon;
    @JsonProperty("PricePerchng1year")
    private Double pricePerchng1year;
    @JsonProperty("PricePerchng3mon")
    private Double pricePerchng3mon;
    @JsonProperty("PricePerchng3year")
    private Double pricePerchng3year;
    @JsonProperty("PricePerchng5year")
    private Double pricePerchng5year;
    @JsonProperty("ROCE")
    private Double roce;
    @JsonProperty("Revenue")
    private Integer revenue;
    @JsonProperty("Roe")
    private Double roe;
    @JsonProperty("Seg")
    private String seg;
    @JsonProperty("Seosym")
    private String seosym;
    @JsonProperty("Sid")
    private Integer sid;
    @JsonProperty("Sym")
    private String sym;
    @JsonProperty("TickSize")
    private Double tickSize;
    @JsonProperty("Volume")
    private Integer volume;
    @JsonProperty("Year1RevenueGrowth")
    private Double year1RevenueGrowth;
    @JsonProperty("YoYLastQtrlyProfitGrowth")
    private Double yoYLastQtrlyProfitGrowth;
    @JsonProperty("Pe")
    private Double pe;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("DayRSI14CurrentCandle")
    public Double getDayRSI14CurrentCandle() {
        return dayRSI14CurrentCandle;
    }

    @JsonProperty("DayRSI14CurrentCandle")
    public void setDayRSI14CurrentCandle(Double dayRSI14CurrentCandle) {
        this.dayRSI14CurrentCandle = dayRSI14CurrentCandle;
    }

    public DhanResponseDatumDTO withDayRSI14CurrentCandle(Double dayRSI14CurrentCandle) {
        this.dayRSI14CurrentCandle = dayRSI14CurrentCandle;
        return this;
    }

    @JsonProperty("DaySMA200CurrentCandle")
    public Double getDaySMA200CurrentCandle() {
        return daySMA200CurrentCandle;
    }

    @JsonProperty("DaySMA200CurrentCandle")
    public void setDaySMA200CurrentCandle(Double daySMA200CurrentCandle) {
        this.daySMA200CurrentCandle = daySMA200CurrentCandle;
    }

    public DhanResponseDatumDTO withDaySMA200CurrentCandle(Double daySMA200CurrentCandle) {
        this.daySMA200CurrentCandle = daySMA200CurrentCandle;
        return this;
    }

    @JsonProperty("DaySMA50CurrentCandle")
    public Double getDaySMA50CurrentCandle() {
        return daySMA50CurrentCandle;
    }

    @JsonProperty("DaySMA50CurrentCandle")
    public void setDaySMA50CurrentCandle(Double daySMA50CurrentCandle) {
        this.daySMA50CurrentCandle = daySMA50CurrentCandle;
    }

    public DhanResponseDatumDTO withDaySMA50CurrentCandle(Double daySMA50CurrentCandle) {
        this.daySMA50CurrentCandle = daySMA50CurrentCandle;
        return this;
    }

    @JsonProperty("DispSym")
    public String getDispSym() {
        return dispSym;
    }

    @JsonProperty("DispSym")
    public void setDispSym(String dispSym) {
        this.dispSym = dispSym;
    }

    public DhanResponseDatumDTO withDispSym(String dispSym) {
        this.dispSym = dispSym;
        return this;
    }

    @JsonProperty("DivYeild")
    public Integer getDivYeild() {
        return divYeild;
    }

    @JsonProperty("DivYeild")
    public void setDivYeild(Integer divYeild) {
        this.divYeild = divYeild;
    }

    public DhanResponseDatumDTO withDivYeild(Integer divYeild) {
        this.divYeild = divYeild;
        return this;
    }

    @JsonProperty("Eps")
    public Double getEps() {
        return eps;
    }

    @JsonProperty("Eps")
    public void setEps(Double eps) {
        this.eps = eps;
    }

    public DhanResponseDatumDTO withEps(Double eps) {
        this.eps = eps;
        return this;
    }

    @JsonProperty("Exch")
    public String getExch() {
        return exch;
    }

    @JsonProperty("Exch")
    public void setExch(String exch) {
        this.exch = exch;
    }

    public DhanResponseDatumDTO withExch(String exch) {
        this.exch = exch;
        return this;
    }

    @JsonProperty("High1Yr")
    public Integer getHigh1Yr() {
        return high1Yr;
    }

    @JsonProperty("High1Yr")
    public void setHigh1Yr(Integer high1Yr) {
        this.high1Yr = high1Yr;
    }

    public DhanResponseDatumDTO withHigh1Yr(Integer high1Yr) {
        this.high1Yr = high1Yr;
        return this;
    }

    @JsonProperty("Ind_Pe")
    public Double getIndPe() {
        return indPe;
    }

    @JsonProperty("Ind_Pe")
    public void setIndPe(Double indPe) {
        this.indPe = indPe;
    }

    public DhanResponseDatumDTO withIndPe(Double indPe) {
        this.indPe = indPe;
        return this;
    }

    @JsonProperty("Inst")
    public String getInst() {
        return inst;
    }

    @JsonProperty("Inst")
    public void setInst(String inst) {
        this.inst = inst;
    }

    public DhanResponseDatumDTO withInst(String inst) {
        this.inst = inst;
        return this;
    }

    @JsonProperty("Isin")
    public String getIsin() {
        return isin;
    }

    @JsonProperty("Isin")
    public void setIsin(String isin) {
        this.isin = isin;
    }

    public DhanResponseDatumDTO withIsin(String isin) {
        this.isin = isin;
        return this;
    }

    @JsonProperty("LotSize")
    public Integer getLotSize() {
        return lotSize;
    }

    @JsonProperty("LotSize")
    public void setLotSize(Integer lotSize) {
        this.lotSize = lotSize;
    }

    public DhanResponseDatumDTO withLotSize(Integer lotSize) {
        this.lotSize = lotSize;
        return this;
    }

    @JsonProperty("Low1Yr")
    public Double getLow1Yr() {
        return low1Yr;
    }

    @JsonProperty("Low1Yr")
    public void setLow1Yr(Double low1Yr) {
        this.low1Yr = low1Yr;
    }

    public DhanResponseDatumDTO withLow1Yr(Double low1Yr) {
        this.low1Yr = low1Yr;
        return this;
    }

    @JsonProperty("Ltp")
    public Double getLtp() {
        return ltp;
    }

    @JsonProperty("Ltp")
    public void setLtp(Double ltp) {
        this.ltp = ltp;
    }

    public DhanResponseDatumDTO withLtp(Double ltp) {
        this.ltp = ltp;
        return this;
    }

    @JsonProperty("Mcap")
    public Double getMcap() {
        return mcap;
    }

    @JsonProperty("Mcap")
    public void setMcap(Double mcap) {
        this.mcap = mcap;
    }

    public DhanResponseDatumDTO withMcap(Double mcap) {
        this.mcap = mcap;
        return this;
    }

    @JsonProperty("Multiplier")
    public Integer getMultiplier() {
        return multiplier;
    }

    @JsonProperty("Multiplier")
    public void setMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
    }

    public DhanResponseDatumDTO withMultiplier(Integer multiplier) {
        this.multiplier = multiplier;
        return this;
    }

    @JsonProperty("NetProfitMargin")
    public Double getNetProfitMargin() {
        return netProfitMargin;
    }

    @JsonProperty("NetProfitMargin")
    public void setNetProfitMargin(Double netProfitMargin) {
        this.netProfitMargin = netProfitMargin;
    }

    public DhanResponseDatumDTO withNetProfitMargin(Double netProfitMargin) {
        this.netProfitMargin = netProfitMargin;
        return this;
    }

    @JsonProperty("PPerchange")
    public Double getPPerchange() {
        return pPerchange;
    }

    @JsonProperty("PPerchange")
    public void setPPerchange(Double pPerchange) {
        this.pPerchange = pPerchange;
    }

    public DhanResponseDatumDTO withPPerchange(Double pPerchange) {
        this.pPerchange = pPerchange;
        return this;
    }

    @JsonProperty("Pb")
    public Double getPb() {
        return pb;
    }

    @JsonProperty("Pb")
    public void setPb(Double pb) {
        this.pb = pb;
    }

    public DhanResponseDatumDTO withPb(Double pb) {
        this.pb = pb;
        return this;
    }

    @JsonProperty("Pchange")
    public Double getPchange() {
        return pchange;
    }

    @JsonProperty("Pchange")
    public void setPchange(Double pchange) {
        this.pchange = pchange;
    }

    public DhanResponseDatumDTO withPchange(Double pchange) {
        this.pchange = pchange;
        return this;
    }

    @JsonProperty("PricePerchng1mon")
    public Double getPricePerchng1mon() {
        return pricePerchng1mon;
    }

    @JsonProperty("PricePerchng1mon")
    public void setPricePerchng1mon(Double pricePerchng1mon) {
        this.pricePerchng1mon = pricePerchng1mon;
    }

    public DhanResponseDatumDTO withPricePerchng1mon(Double pricePerchng1mon) {
        this.pricePerchng1mon = pricePerchng1mon;
        return this;
    }

    @JsonProperty("PricePerchng1year")
    public Double getPricePerchng1year() {
        return pricePerchng1year;
    }

    @JsonProperty("PricePerchng1year")
    public void setPricePerchng1year(Double pricePerchng1year) {
        this.pricePerchng1year = pricePerchng1year;
    }

    public DhanResponseDatumDTO withPricePerchng1year(Double pricePerchng1year) {
        this.pricePerchng1year = pricePerchng1year;
        return this;
    }

    @JsonProperty("PricePerchng3mon")
    public Double getPricePerchng3mon() {
        return pricePerchng3mon;
    }

    @JsonProperty("PricePerchng3mon")
    public void setPricePerchng3mon(Double pricePerchng3mon) {
        this.pricePerchng3mon = pricePerchng3mon;
    }

    public DhanResponseDatumDTO withPricePerchng3mon(Double pricePerchng3mon) {
        this.pricePerchng3mon = pricePerchng3mon;
        return this;
    }

    @JsonProperty("PricePerchng3year")
    public Double getPricePerchng3year() {
        return pricePerchng3year;
    }

    @JsonProperty("PricePerchng3year")
    public void setPricePerchng3year(Double pricePerchng3year) {
        this.pricePerchng3year = pricePerchng3year;
    }

    public DhanResponseDatumDTO withPricePerchng3year(Double pricePerchng3year) {
        this.pricePerchng3year = pricePerchng3year;
        return this;
    }

    @JsonProperty("PricePerchng5year")
    public Double getPricePerchng5year() {
        return pricePerchng5year;
    }

    @JsonProperty("PricePerchng5year")
    public void setPricePerchng5year(Double pricePerchng5year) {
        this.pricePerchng5year = pricePerchng5year;
    }

    public DhanResponseDatumDTO withPricePerchng5year(Double pricePerchng5year) {
        this.pricePerchng5year = pricePerchng5year;
        return this;
    }

    @JsonProperty("ROCE")
    public Double getRoce() {
        return roce;
    }

    @JsonProperty("ROCE")
    public void setRoce(Double roce) {
        this.roce = roce;
    }

    public DhanResponseDatumDTO withRoce(Double roce) {
        this.roce = roce;
        return this;
    }

    @JsonProperty("Revenue")
    public Integer getRevenue() {
        return revenue;
    }

    @JsonProperty("Revenue")
    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public DhanResponseDatumDTO withRevenue(Integer revenue) {
        this.revenue = revenue;
        return this;
    }

    @JsonProperty("Roe")
    public Double getRoe() {
        return roe;
    }

    @JsonProperty("Roe")
    public void setRoe(Double roe) {
        this.roe = roe;
    }

    public DhanResponseDatumDTO withRoe(Double roe) {
        this.roe = roe;
        return this;
    }

    @JsonProperty("Seg")
    public String getSeg() {
        return seg;
    }

    @JsonProperty("Seg")
    public void setSeg(String seg) {
        this.seg = seg;
    }

    public DhanResponseDatumDTO withSeg(String seg) {
        this.seg = seg;
        return this;
    }

    @JsonProperty("Seosym")
    public String getSeosym() {
        return seosym;
    }

    @JsonProperty("Seosym")
    public void setSeosym(String seosym) {
        this.seosym = seosym;
    }

    public DhanResponseDatumDTO withSeosym(String seosym) {
        this.seosym = seosym;
        return this;
    }

    @JsonProperty("Sid")
    public Integer getSid() {
        return sid;
    }

    @JsonProperty("Sid")
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public DhanResponseDatumDTO withSid(Integer sid) {
        this.sid = sid;
        return this;
    }

    @JsonProperty("Sym")
    public String getSym() {
        return sym;
    }

    @JsonProperty("Sym")
    public void setSym(String sym) {
        this.sym = sym;
    }

    public DhanResponseDatumDTO withSym(String sym) {
        this.sym = sym;
        return this;
    }

    @JsonProperty("TickSize")
    public Double getTickSize() {
        return tickSize;
    }

    @JsonProperty("TickSize")
    public void setTickSize(Double tickSize) {
        this.tickSize = tickSize;
    }

    public DhanResponseDatumDTO withTickSize(Double tickSize) {
        this.tickSize = tickSize;
        return this;
    }

    @JsonProperty("Volume")
    public Integer getVolume() {
        return volume;
    }

    @JsonProperty("Volume")
    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public DhanResponseDatumDTO withVolume(Integer volume) {
        this.volume = volume;
        return this;
    }

    @JsonProperty("Year1RevenueGrowth")
    public Double getYear1RevenueGrowth() {
        return year1RevenueGrowth;
    }

    @JsonProperty("Year1RevenueGrowth")
    public void setYear1RevenueGrowth(Double year1RevenueGrowth) {
        this.year1RevenueGrowth = year1RevenueGrowth;
    }

    public DhanResponseDatumDTO withYear1RevenueGrowth(Double year1RevenueGrowth) {
        this.year1RevenueGrowth = year1RevenueGrowth;
        return this;
    }

    @JsonProperty("YoYLastQtrlyProfitGrowth")
    public Double getYoYLastQtrlyProfitGrowth() {
        return yoYLastQtrlyProfitGrowth;
    }

    @JsonProperty("YoYLastQtrlyProfitGrowth")
    public void setYoYLastQtrlyProfitGrowth(Double yoYLastQtrlyProfitGrowth) {
        this.yoYLastQtrlyProfitGrowth = yoYLastQtrlyProfitGrowth;
    }

    public DhanResponseDatumDTO withYoYLastQtrlyProfitGrowth(Double yoYLastQtrlyProfitGrowth) {
        this.yoYLastQtrlyProfitGrowth = yoYLastQtrlyProfitGrowth;
        return this;
    }

    @JsonProperty("Pe")
    public Double getPe() {
        return pe;
    }

    @JsonProperty("Pe")
    public void setPe(Double pe) {
        this.pe = pe;
    }

    public DhanResponseDatumDTO withPe(Double pe) {
        this.pe = pe;
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

    public DhanResponseDatumDTO withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(DhanResponseDatumDTO.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("dayRSI14CurrentCandle");
        sb.append('=');
        sb.append(((this.dayRSI14CurrentCandle == null)?"<null>":this.dayRSI14CurrentCandle));
        sb.append(',');
        sb.append("daySMA200CurrentCandle");
        sb.append('=');
        sb.append(((this.daySMA200CurrentCandle == null)?"<null>":this.daySMA200CurrentCandle));
        sb.append(',');
        sb.append("daySMA50CurrentCandle");
        sb.append('=');
        sb.append(((this.daySMA50CurrentCandle == null)?"<null>":this.daySMA50CurrentCandle));
        sb.append(',');
        sb.append("dispSym");
        sb.append('=');
        sb.append(((this.dispSym == null)?"<null>":this.dispSym));
        sb.append(',');
        sb.append("divYeild");
        sb.append('=');
        sb.append(((this.divYeild == null)?"<null>":this.divYeild));
        sb.append(',');
        sb.append("eps");
        sb.append('=');
        sb.append(((this.eps == null)?"<null>":this.eps));
        sb.append(',');
        sb.append("exch");
        sb.append('=');
        sb.append(((this.exch == null)?"<null>":this.exch));
        sb.append(',');
        sb.append("high1Yr");
        sb.append('=');
        sb.append(((this.high1Yr == null)?"<null>":this.high1Yr));
        sb.append(',');
        sb.append("indPe");
        sb.append('=');
        sb.append(((this.indPe == null)?"<null>":this.indPe));
        sb.append(',');
        sb.append("inst");
        sb.append('=');
        sb.append(((this.inst == null)?"<null>":this.inst));
        sb.append(',');
        sb.append("isin");
        sb.append('=');
        sb.append(((this.isin == null)?"<null>":this.isin));
        sb.append(',');
        sb.append("lotSize");
        sb.append('=');
        sb.append(((this.lotSize == null)?"<null>":this.lotSize));
        sb.append(',');
        sb.append("low1Yr");
        sb.append('=');
        sb.append(((this.low1Yr == null)?"<null>":this.low1Yr));
        sb.append(',');
        sb.append("ltp");
        sb.append('=');
        sb.append(((this.ltp == null)?"<null>":this.ltp));
        sb.append(',');
        sb.append("mcap");
        sb.append('=');
        sb.append(((this.mcap == null)?"<null>":this.mcap));
        sb.append(',');
        sb.append("multiplier");
        sb.append('=');
        sb.append(((this.multiplier == null)?"<null>":this.multiplier));
        sb.append(',');
        sb.append("netProfitMargin");
        sb.append('=');
        sb.append(((this.netProfitMargin == null)?"<null>":this.netProfitMargin));
        sb.append(',');
        sb.append("pPerchange");
        sb.append('=');
        sb.append(((this.pPerchange == null)?"<null>":this.pPerchange));
        sb.append(',');
        sb.append("pb");
        sb.append('=');
        sb.append(((this.pb == null)?"<null>":this.pb));
        sb.append(',');
        sb.append("pchange");
        sb.append('=');
        sb.append(((this.pchange == null)?"<null>":this.pchange));
        sb.append(',');
        sb.append("pricePerchng1mon");
        sb.append('=');
        sb.append(((this.pricePerchng1mon == null)?"<null>":this.pricePerchng1mon));
        sb.append(',');
        sb.append("pricePerchng1year");
        sb.append('=');
        sb.append(((this.pricePerchng1year == null)?"<null>":this.pricePerchng1year));
        sb.append(',');
        sb.append("pricePerchng3mon");
        sb.append('=');
        sb.append(((this.pricePerchng3mon == null)?"<null>":this.pricePerchng3mon));
        sb.append(',');
        sb.append("pricePerchng3year");
        sb.append('=');
        sb.append(((this.pricePerchng3year == null)?"<null>":this.pricePerchng3year));
        sb.append(',');
        sb.append("pricePerchng5year");
        sb.append('=');
        sb.append(((this.pricePerchng5year == null)?"<null>":this.pricePerchng5year));
        sb.append(',');
        sb.append("roce");
        sb.append('=');
        sb.append(((this.roce == null)?"<null>":this.roce));
        sb.append(',');
        sb.append("revenue");
        sb.append('=');
        sb.append(((this.revenue == null)?"<null>":this.revenue));
        sb.append(',');
        sb.append("roe");
        sb.append('=');
        sb.append(((this.roe == null)?"<null>":this.roe));
        sb.append(',');
        sb.append("seg");
        sb.append('=');
        sb.append(((this.seg == null)?"<null>":this.seg));
        sb.append(',');
        sb.append("seosym");
        sb.append('=');
        sb.append(((this.seosym == null)?"<null>":this.seosym));
        sb.append(',');
        sb.append("sid");
        sb.append('=');
        sb.append(((this.sid == null)?"<null>":this.sid));
        sb.append(',');
        sb.append("sym");
        sb.append('=');
        sb.append(((this.sym == null)?"<null>":this.sym));
        sb.append(',');
        sb.append("tickSize");
        sb.append('=');
        sb.append(((this.tickSize == null)?"<null>":this.tickSize));
        sb.append(',');
        sb.append("volume");
        sb.append('=');
        sb.append(((this.volume == null)?"<null>":this.volume));
        sb.append(',');
        sb.append("year1RevenueGrowth");
        sb.append('=');
        sb.append(((this.year1RevenueGrowth == null)?"<null>":this.year1RevenueGrowth));
        sb.append(',');
        sb.append("yoYLastQtrlyProfitGrowth");
        sb.append('=');
        sb.append(((this.yoYLastQtrlyProfitGrowth == null)?"<null>":this.yoYLastQtrlyProfitGrowth));
        sb.append(',');
        sb.append("pe");
        sb.append('=');
        sb.append(((this.pe == null)?"<null>":this.pe));
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
        result = ((result* 31)+((this.pPerchange == null)? 0 :this.pPerchange.hashCode()));
        result = ((result* 31)+((this.pricePerchng1year == null)? 0 :this.pricePerchng1year.hashCode()));
        result = ((result* 31)+((this.sym == null)? 0 :this.sym.hashCode()));
        result = ((result* 31)+((this.low1Yr == null)? 0 :this.low1Yr.hashCode()));
        result = ((result* 31)+((this.roe == null)? 0 :this.roe.hashCode()));
        result = ((result* 31)+((this.seosym == null)? 0 :this.seosym.hashCode()));
        result = ((result* 31)+((this.indPe == null)? 0 :this.indPe.hashCode()));
        result = ((result* 31)+((this.sid == null)? 0 :this.sid.hashCode()));
        result = ((result* 31)+((this.tickSize == null)? 0 :this.tickSize.hashCode()));
        result = ((result* 31)+((this.divYeild == null)? 0 :this.divYeild.hashCode()));
        result = ((result* 31)+((this.pricePerchng1mon == null)? 0 :this.pricePerchng1mon.hashCode()));
        result = ((result* 31)+((this.revenue == null)? 0 :this.revenue.hashCode()));
        result = ((result* 31)+((this.seg == null)? 0 :this.seg.hashCode()));
        result = ((result* 31)+((this.high1Yr == null)? 0 :this.high1Yr.hashCode()));
        result = ((result* 31)+((this.dispSym == null)? 0 :this.dispSym.hashCode()));
        result = ((result* 31)+((this.daySMA50CurrentCandle == null)? 0 :this.daySMA50CurrentCandle.hashCode()));
        result = ((result* 31)+((this.lotSize == null)? 0 :this.lotSize.hashCode()));
        result = ((result* 31)+((this.multiplier == null)? 0 :this.multiplier.hashCode()));
        result = ((result* 31)+((this.pricePerchng3year == null)? 0 :this.pricePerchng3year.hashCode()));
        result = ((result* 31)+((this.eps == null)? 0 :this.eps.hashCode()));
        result = ((result* 31)+((this.ltp == null)? 0 :this.ltp.hashCode()));
        result = ((result* 31)+((this.roce == null)? 0 :this.roce.hashCode()));
        result = ((result* 31)+((this.pricePerchng3mon == null)? 0 :this.pricePerchng3mon.hashCode()));
        result = ((result* 31)+((this.year1RevenueGrowth == null)? 0 :this.year1RevenueGrowth.hashCode()));
        result = ((result* 31)+((this.volume == null)? 0 :this.volume.hashCode()));
        result = ((result* 31)+((this.dayRSI14CurrentCandle == null)? 0 :this.dayRSI14CurrentCandle.hashCode()));
        result = ((result* 31)+((this.netProfitMargin == null)? 0 :this.netProfitMargin.hashCode()));
        result = ((result* 31)+((this.pchange == null)? 0 :this.pchange.hashCode()));
        result = ((result* 31)+((this.pb == null)? 0 :this.pb.hashCode()));
        result = ((result* 31)+((this.pricePerchng5year == null)? 0 :this.pricePerchng5year.hashCode()));
        result = ((result* 31)+((this.pe == null)? 0 :this.pe.hashCode()));
        result = ((result* 31)+((this.mcap == null)? 0 :this.mcap.hashCode()));
        result = ((result* 31)+((this.exch == null)? 0 :this.exch.hashCode()));
        result = ((result* 31)+((this.inst == null)? 0 :this.inst.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.daySMA200CurrentCandle == null)? 0 :this.daySMA200CurrentCandle.hashCode()));
        result = ((result* 31)+((this.isin == null)? 0 :this.isin.hashCode()));
        result = ((result* 31)+((this.yoYLastQtrlyProfitGrowth == null)? 0 :this.yoYLastQtrlyProfitGrowth.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DhanResponseDatumDTO) == false) {
            return false;
        }
        DhanResponseDatumDTO rhs = ((DhanResponseDatumDTO) other);
        return (((((((((((((((((((((((((((((((((((((((this.pPerchange == rhs.pPerchange)||((this.pPerchange!= null)&&this.pPerchange.equals(rhs.pPerchange)))&&((this.pricePerchng1year == rhs.pricePerchng1year)||((this.pricePerchng1year!= null)&&this.pricePerchng1year.equals(rhs.pricePerchng1year))))&&((this.sym == rhs.sym)||((this.sym!= null)&&this.sym.equals(rhs.sym))))&&((this.low1Yr == rhs.low1Yr)||((this.low1Yr!= null)&&this.low1Yr.equals(rhs.low1Yr))))&&((this.roe == rhs.roe)||((this.roe!= null)&&this.roe.equals(rhs.roe))))&&((this.seosym == rhs.seosym)||((this.seosym!= null)&&this.seosym.equals(rhs.seosym))))&&((this.indPe == rhs.indPe)||((this.indPe!= null)&&this.indPe.equals(rhs.indPe))))&&((this.sid == rhs.sid)||((this.sid!= null)&&this.sid.equals(rhs.sid))))&&((this.tickSize == rhs.tickSize)||((this.tickSize!= null)&&this.tickSize.equals(rhs.tickSize))))&&((this.divYeild == rhs.divYeild)||((this.divYeild!= null)&&this.divYeild.equals(rhs.divYeild))))&&((this.pricePerchng1mon == rhs.pricePerchng1mon)||((this.pricePerchng1mon!= null)&&this.pricePerchng1mon.equals(rhs.pricePerchng1mon))))&&((this.revenue == rhs.revenue)||((this.revenue!= null)&&this.revenue.equals(rhs.revenue))))&&((this.seg == rhs.seg)||((this.seg!= null)&&this.seg.equals(rhs.seg))))&&((this.high1Yr == rhs.high1Yr)||((this.high1Yr!= null)&&this.high1Yr.equals(rhs.high1Yr))))&&((this.dispSym == rhs.dispSym)||((this.dispSym!= null)&&this.dispSym.equals(rhs.dispSym))))&&((this.daySMA50CurrentCandle == rhs.daySMA50CurrentCandle)||((this.daySMA50CurrentCandle!= null)&&this.daySMA50CurrentCandle.equals(rhs.daySMA50CurrentCandle))))&&((this.lotSize == rhs.lotSize)||((this.lotSize!= null)&&this.lotSize.equals(rhs.lotSize))))&&((this.multiplier == rhs.multiplier)||((this.multiplier!= null)&&this.multiplier.equals(rhs.multiplier))))&&((this.pricePerchng3year == rhs.pricePerchng3year)||((this.pricePerchng3year!= null)&&this.pricePerchng3year.equals(rhs.pricePerchng3year))))&&((this.eps == rhs.eps)||((this.eps!= null)&&this.eps.equals(rhs.eps))))&&((this.ltp == rhs.ltp)||((this.ltp!= null)&&this.ltp.equals(rhs.ltp))))&&((this.roce == rhs.roce)||((this.roce!= null)&&this.roce.equals(rhs.roce))))&&((this.pricePerchng3mon == rhs.pricePerchng3mon)||((this.pricePerchng3mon!= null)&&this.pricePerchng3mon.equals(rhs.pricePerchng3mon))))&&((this.year1RevenueGrowth == rhs.year1RevenueGrowth)||((this.year1RevenueGrowth!= null)&&this.year1RevenueGrowth.equals(rhs.year1RevenueGrowth))))&&((this.volume == rhs.volume)||((this.volume!= null)&&this.volume.equals(rhs.volume))))&&((this.dayRSI14CurrentCandle == rhs.dayRSI14CurrentCandle)||((this.dayRSI14CurrentCandle!= null)&&this.dayRSI14CurrentCandle.equals(rhs.dayRSI14CurrentCandle))))&&((this.netProfitMargin == rhs.netProfitMargin)||((this.netProfitMargin!= null)&&this.netProfitMargin.equals(rhs.netProfitMargin))))&&((this.pchange == rhs.pchange)||((this.pchange!= null)&&this.pchange.equals(rhs.pchange))))&&((this.pb == rhs.pb)||((this.pb!= null)&&this.pb.equals(rhs.pb))))&&((this.pricePerchng5year == rhs.pricePerchng5year)||((this.pricePerchng5year!= null)&&this.pricePerchng5year.equals(rhs.pricePerchng5year))))&&((this.pe == rhs.pe)||((this.pe!= null)&&this.pe.equals(rhs.pe))))&&((this.mcap == rhs.mcap)||((this.mcap!= null)&&this.mcap.equals(rhs.mcap))))&&((this.exch == rhs.exch)||((this.exch!= null)&&this.exch.equals(rhs.exch))))&&((this.inst == rhs.inst)||((this.inst!= null)&&this.inst.equals(rhs.inst))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.daySMA200CurrentCandle == rhs.daySMA200CurrentCandle)||((this.daySMA200CurrentCandle!= null)&&this.daySMA200CurrentCandle.equals(rhs.daySMA200CurrentCandle))))&&((this.isin == rhs.isin)||((this.isin!= null)&&this.isin.equals(rhs.isin))))&&((this.yoYLastQtrlyProfitGrowth == rhs.yoYLastQtrlyProfitGrowth)||((this.yoYLastQtrlyProfitGrowth!= null)&&this.yoYLastQtrlyProfitGrowth.equals(rhs.yoYLastQtrlyProfitGrowth))));
    }

}
