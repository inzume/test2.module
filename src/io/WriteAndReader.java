package io;

import Product.Product;

import java.io.*;
import java.util.ArrayList;

public class WriteAndReader {
    File dssv=new File("C:\\Users\\Windows\\IdeaProjects\\ThiThucHanh\\product.csv2");
    public void write(ArrayList<Product> products){

        try {
            FileWriter fileWriter=new FileWriter(dssv);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write("Product Code,Product Name,Price,Quantity,Description");
            bufferedWriter.newLine();
            for (Product product : products) {
                bufferedWriter.write(product.towrite());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<Product> Reader(){

        try {
            FileReader fileReader=new FileReader(dssv);
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            bufferedReader.readLine();
            ArrayList<Product>products1=new ArrayList<>();
            String line;
            while ((line=bufferedReader.readLine())!=null){
                String str[]=line.split(",");
                products1.add(new Product(str[0],str[1],(str[2]),(str[3]),str[4]));
            }
            bufferedReader.close();
            fileReader.close();
            return products1;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean fileValidate(){
        return dssv.exists();
    }
}