package com.digitrader.dao;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "NSEStockMasterData", uniqueConstraints = {@UniqueConstraint(name = "symbolField",columnNames = {"sym"})})
public class DhanDataDAO {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private Double dayRSI14CurrentCandle;
    private Double daySMA200CurrentCandle;
    private Double daySMA50CurrentCandle;
    private String dispSym;
    private Integer divYeild;
    private Double eps;
    private String exch;
    private Integer high1Yr;
    private Double indPe;
    private String inst;
    private String isin;
    private Integer lotSize;
    private Double low1Yr;
    private Double ltp;
    private Double mcap;
    private Integer multiplier;
    private Double netProfitMargin;
    private Double pPerchange;
    private Double pb;
    private Double pchange;
    private Double pricePerchng1mon;
    private Double pricePerchng1year;
    private Double pricePerchng3mon;
    private Double pricePerchng3year;
    private Double pricePerchng5year;
    private Double roce;
    private Integer revenue;
    private Double roe;
    private String seg;
    private String seosym;
    private Integer sid;
    private String sym;
    private Double tickSize;
    private Integer volume;
    private Double year1RevenueGrowth;
    private Double yoYLastQtrlyProfitGrowth;
    private Double pe;
    private String status;
    private int version;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private String updatedBy;
    private String createdBy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DhanDataDAO that = (DhanDataDAO) o;
        return id == that.id && Objects.equals(dayRSI14CurrentCandle, that.dayRSI14CurrentCandle) && Objects.equals(daySMA200CurrentCandle, that.daySMA200CurrentCandle) && Objects.equals(daySMA50CurrentCandle, that.daySMA50CurrentCandle) && Objects.equals(dispSym, that.dispSym) && Objects.equals(divYeild, that.divYeild) && Objects.equals(eps, that.eps) && Objects.equals(exch, that.exch) && Objects.equals(high1Yr, that.high1Yr) && Objects.equals(indPe, that.indPe) && Objects.equals(inst, that.inst) && Objects.equals(isin, that.isin) && Objects.equals(lotSize, that.lotSize) && Objects.equals(low1Yr, that.low1Yr) && Objects.equals(ltp, that.ltp) && Objects.equals(mcap, that.mcap) && Objects.equals(multiplier, that.multiplier) && Objects.equals(netProfitMargin, that.netProfitMargin) && Objects.equals(pPerchange, that.pPerchange) && Objects.equals(pb, that.pb) && Objects.equals(pchange, that.pchange) && Objects.equals(pricePerchng1mon, that.pricePerchng1mon) && Objects.equals(pricePerchng1year, that.pricePerchng1year) && Objects.equals(pricePerchng3mon, that.pricePerchng3mon) && Objects.equals(pricePerchng3year, that.pricePerchng3year) && Objects.equals(pricePerchng5year, that.pricePerchng5year) && Objects.equals(roce, that.roce) && Objects.equals(revenue, that.revenue) && Objects.equals(roe, that.roe) && Objects.equals(seg, that.seg) && Objects.equals(seosym, that.seosym) && Objects.equals(sid, that.sid) && Objects.equals(sym, that.sym) && Objects.equals(tickSize, that.tickSize) && Objects.equals(volume, that.volume) && Objects.equals(year1RevenueGrowth, that.year1RevenueGrowth) && Objects.equals(yoYLastQtrlyProfitGrowth, that.yoYLastQtrlyProfitGrowth) && Objects.equals(pe, that.pe) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dayRSI14CurrentCandle, daySMA200CurrentCandle, daySMA50CurrentCandle, dispSym, divYeild, eps, exch, high1Yr, indPe, inst, isin, lotSize, low1Yr, ltp, mcap, multiplier, netProfitMargin, pPerchange, pb, pchange, pricePerchng1mon, pricePerchng1year, pricePerchng3mon, pricePerchng3year, pricePerchng5year, roce, revenue, roe, seg, seosym, sid, sym, tickSize, volume, year1RevenueGrowth, yoYLastQtrlyProfitGrowth, pe, status);
    }
}
