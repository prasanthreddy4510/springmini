package com.ashokit.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.ashokit.interfaces.ProductDataReader;
import com.ashokit.pojo.Product;

public class ProductDataReaderImpl implements ProductDataReader {

	@Override
	public List<Product> dataReader(Product product) {
		List<Product> dataList=new ArrayList<Product>();
		try {
			File inputFile=new File("E://Files/productData.txt");
			InputStream inputFS=new FileInputStream(inputFile);
			BufferedReader br=new BufferedReader(new InputStreamReader(inputFS)); 
			dataList=br.lines().map(mapToItem).collect(Collectors.toList());
			br.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return dataList;
	}
	private Function<String,Product> mapToItem=(line)->{
		String[] p=line.split(",");
		Product product=new Product();
		product.setProductId(p[0]);
		product.setProductName(p[1]);
		product.setProductPrice(p[2]);
		
	
		return product;
		
	};

}
