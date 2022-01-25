package com.binance.client.model.trade;

import java.util.List;
import java.util.Objects;

public class LeverageBracket {

    private String symbol;

    private List<Bracket> brackets;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public List<Bracket> getBrackets() {
		return brackets;
	}

	public void setBrackets(List<Bracket> brackets) {
		this.brackets = brackets;
	}

	@Override
	public int hashCode() {
		return Objects.hash(symbol);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LeverageBracket other = (LeverageBracket) obj;
		return Objects.equals(symbol, other.symbol);
	}

}
