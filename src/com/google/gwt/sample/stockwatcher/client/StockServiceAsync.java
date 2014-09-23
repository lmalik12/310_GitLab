package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockServiceAsync {
  public void addStock(String symbol, AsyncCallback<Void> async);
  public void removeStock(String symbol, AsyncCallback<Void> async);
  public void getStocks(AsyncCallback<String[]> async);
}