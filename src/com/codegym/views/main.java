package com.codegym.views;

import com.codegym.controller.ProductController;
import com.codegym.model.Product;

import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int choise;
        ProductController productController = new ProductController();
        do {
            menu();
            Scanner scanner = new Scanner(System.in);
            choise = scanner.nextInt();
            switch (choise) {
                case 1: {
                    List<Product> productList = productController.findAll();
                    for (Product product : productList) {
                        System.out.println("ID: " + product.getId() + "----NAME: " + product.getName().toUpperCase()+" Giá tiền: "+product.getPrice()
                                +"----TRẠNG THÁI: "+product.isStatus()+"----MIÊU TẢ: "+product.getDescription()) ;
                    }
                    break;
                }
                case 2: {
                    Product product = createProduct();
                    productController.addProduct(product);
                    break;
                }
                case 3:{
                    System.out.println("Nhập vị trí cần sửa: ");
                    int index=scanner.nextInt();
                    Product product =createProduct();
                    productController.edit(index,product);
                    break;
                }
                case 4: {
                    System.out.print("Nhập vị trí cần xóa: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    productController.delete(index);
                    break;
                }
                case 5:{
                    System.out.println("Tìm sản phẩm: ");
                    productController.find(inputString());


                    break;
                }
                case 6:{
                    System.out.println("Sản phẩm tăng dần theo giá:");
                    productController.sortUpPrice();

                    break;
                }
                case 7:{
                    System.out.println("Sản phẩm giảm dần theo giá:");
                    productController.sortDownPrice();
                    break;
                }
                default:
                    System.out.println("Vui lòng nhập số thứ tự trên menu!");
            }
        } while (choise != 0) ;

    }
    public static void menu() {
        System.out.println("\n-----ProductManager-----");
        System.out.println("1. Hiển thị danh sách sản phẩm");
        System.out.println("2. Thêm mới");
        System.out.println("3. Sửa thông tin sản phẩm");
        System.out.println("4. Xóa sản phẩm ");
        System.out.println("5. Tìm sản phẩm theo tên ");
        System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá ");
        System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
        System.out.println("0. Thoát!");
        System.out.println("Nhập vào chọn lựa: ");
    }



    public static Product createProduct(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá tiền sản phẩm: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Nhập trạng thái: ");
        boolean status= true;
        scanner.nextLine();

        System.out.println("Miêu tả sản phẩm: ");
        String description =scanner.nextLine();

        Product product = new Product(id,name,price,status,description);

        return product;
    }
    public static String inputString() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
