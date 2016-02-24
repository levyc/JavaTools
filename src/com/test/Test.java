package com.test;

import java.io.IOException;
import com.propertyReading.PropertyTool;

public class Test {
   public static void main(String[] args) throws IOException {
     PropertyTool pTool  = new PropertyTool();
     pTool.openPropertyFile("src/file.txt");
     pTool.setValueByKey("uri", "baidu.com");
}
}
