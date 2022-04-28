package baitap;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
      StaffManager manager = new StaffManager();
        Scanner sc = new Scanner(System.in);
      int choice = -1;
      while (choice!=0){
          System.out.println("-----MENU");
          System.out.println("---VUI LONG LUA CHON----");
          System.out.println("1.HIEN THI TAT CA NHAN VIEN\n"+
                  "2.Them nhan vien\n"+
                  "3.Tim kiem \n"+
                  "4.In ra danh sach nhan vien FullTime\n"+
                  "5.Sua thong tin nhan vien\n"+
                  "6.Đoi trang thai, chuyen tu dang lam sang nghi\n"+
                  "7.Tinh tong luong cac nhan vien\n"+
                  "8.Ghi vao file\n"+
                  "9.Doc tu file\n"+
                  "10.Thoat\n"
          );
          choice = sc.nextInt();
          sc.nextLine();
          switch (choice){
              case 1:
                  manager.showStaffList();
                  break;
              case 2:
                  System.out.println("Nhap ten ");
                  String name = sc.nextLine();
                  System.out.println("Nhap type");
                  String type = sc.nextLine();
                  System.out.println("Nhap status");
                  String status = sc.nextLine();
                  System.out.println("Nhập luong");
                  int salary = sc.nextInt();

                  Staff staff = new Staff(name,type,status,salary);
                  manager.add(staff);
                  System.out.println(staff);
                  break;
              case 3:
                  System.out.println("Nhap ten can tim kiem");
                  String name1 = sc.nextLine();
                  System.out.println(manager.findByName(name1));
                  break;
              case 4:
                  manager.filterFullTimeStaff();
                  break;
              case 5:
                  System.out.println("Nhap ten can sua");
                  String ne = sc.nextLine();
                  System.out.println("Nhap name sua ");
                  String nameSua = sc.nextLine();
                  System.out.println("Nhap type sua");
                  String typeSua = sc.nextLine();
                  System.out.println("Nhap Status sua");
                  String statusSua = sc.nextLine();
                  System.out.println("Nhap tien luong sua");
                  int luongSua = sc.nextInt();
                  Staff staff1 = new Staff(nameSua,typeSua,statusSua,luongSua);
                  manager.editByName(ne,staff1);
                  break;
              case 6:
                  System.out.println("Nhap ten can tim kiem");
                  String name3= sc.nextLine();
                  manager.updateStaffStatus(name3);
                  break;
              case 7:

                  break;
              case 8:
                  FileCSV.wirteFile(manager.getList(),"src/contents.csv");
                  break;
              case 9:
                  FileCSV.readFile("src/contents.csv");
                  break;
              case 10:
                  System.exit(0);
                  break;
              default:
                  System.out.println("Vui long chi chon tu 1 den 10");
          }
      }

    }
}
