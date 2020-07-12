package com.ashokit.interfaces;

import java.io.File;
import java.util.List;

import com.ashokit.pojo.Product;

public interface ProductDataWriter {
public File dataWriter(List<Product> dataMap);
}
