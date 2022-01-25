package com.binance.client.model.trade;

import java.math.BigDecimal;

public class Bracket {

    private BigDecimal bracket;
    private BigDecimal initialLeverage;
    private BigDecimal notionalCap;
    private BigDecimal notionalFloor;
    private BigDecimal maintMarginRatio;
    private BigDecimal cum;
    
	public BigDecimal getBracket() {
		return bracket;
	}
	public void setBracket(BigDecimal bracket) {
		this.bracket = bracket;
	}
	
	public BigDecimal getInitialLeverage() {
		return initialLeverage;
	}
	
	public void setInitialLeverage(BigDecimal initialLeverage) {
		this.initialLeverage = initialLeverage;
	}
	
	public BigDecimal getNotionalCap() {
		return notionalCap;
	}
	
	public void setNotionalCap(BigDecimal notionalCap) {
		this.notionalCap = notionalCap;
	}
	
	public BigDecimal getNotionalFloor() {
		return notionalFloor;
	}
	
	public void setNotionalFloor(BigDecimal notionalFloor) {
		this.notionalFloor = notionalFloor;
	}
	
	public BigDecimal getMaintMarginRatio() {
		return maintMarginRatio;
	}
	
	public void setMaintMarginRatio(BigDecimal maintMarginRatio) {
		this.maintMarginRatio = maintMarginRatio;
	}
	
	public BigDecimal getCum() {
		return cum;
	}
	
	public void setCum(BigDecimal cum) {
		this.cum = cum;
	}
    
}
