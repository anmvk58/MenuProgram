package entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
    Scanner scanner = new Scanner(System.in);
    List<News> news = new ArrayList<>();

    public void printMenu(){
        System.out.println("************** MENU **************");
        System.out.println("1 - Insert News");
        System.out.println("2 - View List News");
        System.out.println("3 - Average Rate");
        System.out.println("4 - Exit");
        System.out.println("************** o00o **************");
    }

    public void chooseMenu(){
        int choose;
        boolean check = true;
        while(check) {
            //in ra menu
            printMenu();
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    //Thực hiện nhập từ bàn phím các giá trị của News sau đó insert vào
                    pickOne();
                    break;
                case 2:
                    //Thực hiện in tất cả các tin tức:
                    pickTwo();
                    break;
                case 3:
                    //Thực thi method đánh giá, sau đó thực thi method display
                    pickThree();
                    break;
                case 4:
                    //thoát khỏi chương trình;
                    System.out.println("Cảm ơn bạn đã sử dụng phần mềm");
                    check = false;
                    break;
                default:
                    System.out.println("Mời nhập các giá trị từ 1 - 4");
            }
        }
        scanner.close();
    }

    public void pickOne(){
        String tempTitle;
        String tempPublishDate;
        String tempAuthor;
        String tempContent;
        int[]  tempRates = {0, 0, 0};

        //Nhập dữ liệu từ bàn phím
        System.out.println("Mời bạn nhập Title: ");
        tempTitle = scanner.nextLine();
        tempTitle = scanner.nextLine();

        System.out.println("Mời bạn nhập PublishDate: ");
        tempPublishDate = scanner.nextLine();

        System.out.println("Mời bạn nhập Author: ");
        tempAuthor = scanner.nextLine();

        System.out.println("Mời bạn nhập Content: ");
        tempContent = scanner.nextLine();

        for(int i = 0; i < 3; i++){
            System.out.println("Mời nhập đánh giá thứ " + (i+1));
            tempRates[i] = scanner.nextInt();
        }
        //Tạo ra biến temps kiểu đối tượng News
        News tempNews = new News(tempTitle, tempPublishDate, tempAuthor,  tempContent, tempRates);

        //add tempNews vào trong Array List News
        this.news.add(tempNews);

        System.out.println("Tạo mới tin tức thành công");
    }

    public void pickTwo(){
        if(this.news.size() == 0){
            System.out.println("Chưa có tin tức nào cả ");
        }else{
            for(News news : this.news){
                news.Display();
            }
        }
    }

    public void pickThree(){
        for (News news : this.news){
            float tempAverageRate = news.Calculate();
        }
        //gán xong thì in lại danh sách:
        pickTwo();
    }
}