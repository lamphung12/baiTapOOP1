package baitap;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class StaffManager {
    private List<Staff> list = new ArrayList<>();


    public List<Staff> getList() {
        return list;
    }

    public void setList(List<Staff> list) {
        this.list = list;
    }

    public StaffManager() {

    }
//////ham doc du lieu tu file staffList/////
//    public void StaffManagement() throws FileNotFoundException {
//       FileCSV.readFile("/Users/macpro/IdeaProjects/BaiTap/src/contents.csv");
//    }
///////them vao file
    public void add(Staff staff){
       list.add(staff);
    }
///////hien thi
    public void showStaffList(){
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }
///// tim theo ten gan dung ////////
    public int findByName(String name){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getName().equals(name) ){
                System.out.println(list.get(i));
            }
        }
        return 0;
    }
//////Nhap vao ten sua vao file
    public void editByName(String name, Staff staff){
        int index = findByName(name);
        if(index==-1){
            System.out.println("Ko tim thay");
        }else{
            list.set(index,staff);
        }

    }
//////xoa theo ten cap nhap file
    public void remoteByName(String name){
        int index = findByName(name);
        if(index==-1){
            System.out.println("Ko tim thay");
        }else{
            list.remove(index);
        }
    }
//////sua trang thai nhan vien tu dag lam = nghi cap nhat file///
    public void updateStaffStatus(String name){
        int index = findByName(name);
        if(index==-1){
            System.out.println("Ko tim thay");
        }else{
            list.get(index).setStatus("Nghi");
        }

    }
/////in ra luong nhan vien fulltime//////
    public void calSalaryFullTime(){
        int sum=0;
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getType().contains("FullTime")){
                sum+=list.get(i).getSalary();
            }
        }

    }
    /////in ra luong nhan vien Parttime//////
    public void calSalaryPartTime(String name){

    }
/////////in ra cac nhan vien fulltime//////
    public void filterFullTimeStaff(){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getType().contains("FullTime")){
                System.out.println(list.get(i));
            }
        }
    }
    /////in ra cac nhan vien parttime//////
    public void filterPartTimeStaff(){
        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).getType().contains("PartTime")){
                System.out.println(list.get(i));
            }
        }
    }

}
