package vn.edu.giadinh;

public class bo {
   
    
    String tenbo;
    double cannang;
    bo (double cannang) {
        this.cannang = cannang;
    }
    void thongtinbo(){
        System.out.println(" tên bò " + tenbo);
        System.out.println(" cân nặng của bò"+ cannang);
    }
}

