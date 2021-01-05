package com.oms.serverapi;

import java.util.ArrayList;
import java.util.Map;

import com.oms.bean.Book;

public interface IDataMediaApi<T> {
	public ArrayList<T> gets(Map<String, String> queryParams);
	public T update(T t);
}
