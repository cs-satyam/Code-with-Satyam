package OOPs.Encaplation;

import java.sql.SQLOutput;

class book{
    private int pageNum;

    // setter
   void   setPageNum(int pageNo){
       if(pageNo>=0){
           pageNum = pageNo;
       }else {
           System.out.println("Kindly add non Zero number  !!!!!!!!");       }
    }
// getter
    int getPageNum(){
       return pageNum;
    }

    void display(){
        System.out.println("java inheritance is present in pageNumber: "+pageNum);
    }
}

public class LaunchEncap {
    public static void main(String[] args) {
        book book = new book();

//        book.pageNum=4;
        book.setPageNum(4);
//        book.setPageNum(-44);
//        book.setPageNum(-4);

        System.out.println(book.getPageNum());

//        System.out.println(book.pageNum);
        book.display();

    }
}
