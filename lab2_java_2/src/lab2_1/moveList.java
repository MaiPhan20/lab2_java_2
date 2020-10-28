package lab2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class moveList {
    public static void main(String[] args) {
        ArrayList<String> moveList = new ArrayList<String>();
        moveList.add("Friend Zone");
        moveList.add("Harry Potter");
        moveList.add("Mr Bean");
        moveList.add("The Legend");
        System.out.println("Bộ phim yêu thích của bạn là: ");
        System.out.println(moveList);
        System.out.println("Cập nhật lại sau khi chỉnh sửa: ");
        moveList.set(3,"Football Legend");
        System.out.println(moveList);
        moveList.remove("Mr Bean");
        System.out.println("Các bộ phim còn lại sau khi xóa \"Mr Bean\": "+moveList);
        System.out.println("Có tên phim có tên là \"Harry Potter\": ");
        System.out.println(moveList.contains("Harry Potter"));
        System.out.println("Có tên phim có tên là \"Hi\": ");
        System.out.println(moveList.contains("Hi"));

    }
}
