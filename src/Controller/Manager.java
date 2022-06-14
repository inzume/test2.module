package Controller;

import Product.Product;
import Product.SortGiamDan;
import Product.SortTangDan;
import Validate.Validate;
import io.WriteAndReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    WriteAndReader writeAndReader = new WriteAndReader();
    ArrayList<Product> products = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
     Validate validate = new Validate();

    public void Menu() {
        System.out.println("Menu");
        System.out.println("1.Xem danh sách");
        System.out.println("2.Thêm mới");
        System.out.println("3.Cập nhật");
        System.out.println("4.Xóa");
        System.out.println("5.Sắp xếp");
        System.out.println("6.Sản phẩm đắt giá nhất");
        System.out.println("7.Đọc từ file");
        System.out.println("8.Ghi vào file");
        System.out.println("9.Thoát");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice) {
            case 1:
                Show();
                break;
            case 2:
                Add();
                break;
            case 3:
                Edit();
                break;
            case 4:
                Deleted();
                break;
            case 5:
                Sort();
                break;
            case 6:
                Max();
                break;

            case 7:
                products = writeAndReader.Reader();
                Show();
                break;
            case 8:
                writeAndReader.write(products);
                System.out.println("Finish");
                break;
            case 9:
                System.exit(0);
        }
    }

    public void Show() {
        for (Product p : products) {
            System.out.println(p);

        }
    }

    public Product Creat() {
        String id = validate.ValidateID("id");
        String name = validate.Validate("Name");
        String price = validate.ValidateNumber("Price");
        String amount = validate.ValidateAmount("Amount");
        String detail = validate.Validate("detail");
        return new Product(id,name,price,amount,detail)   ;
    }

    public void Add() {
        products.add(Creat());

    }

    public void Edit() {
        for (int i = 0; i < products.size(); i++) {
            String id = validate.ValidateID("id need to find ");
            if (products.get(i).getId().equals(id) ) {
                products.set(i, Creat());
writeAndReader.write(products);
            } else {
                System.out.println("id not exist ");
            }


        }
    }

    public void Deleted() {
        System.out.println("Input id need to delete:");
        for (int i = 0; i < products.size(); i++) {
            String id = sc.nextLine();
            if (products.get(i).getId().equals(id)) {
                System.out.println("nhan y de xoa:");
                String a = sc.nextLine();
                if (a.equals("y")) {
                    products.remove(i);
                    writeAndReader.write(products);
                }
            }else break;

        }
    }


    public void Sort(){
        System.out.println("1.Sắp xếp theo giá tăng dần:");
        System.out.println("2.Sắp xếp theo giá giảm dần:");
        int choice = Integer.parseInt(sc.nextLine());
        switch (choice){
            case 1:
                products.sort(new SortTangDan());
                break;
            case 2:
                products.sort(new SortGiamDan());
                break;
        }
    }
    public void Max(){

        for (int i = 0; i < products.size(); i++) {
            String max = products.get(0).getPrice();
            if (((Double.parseDouble(products.get(i).getPrice()))) > ((Double.parseDouble(max)))){
                max = products.get(i).getPrice();
                System.out.println(max);
                break;
            }

        }
    }
}