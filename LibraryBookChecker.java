import java.util.Scanner;
public class LibraryBookChecker{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] books={"Java","Python","Data Structures",
            "Database Management","Operating Systems"};
        System.out.print("Enter book name to search:");
        String search=sc.nextLine();
        boolean found=false;
        for (int i=0; i<books.length;i++) {
            if (books[i].equalsIgnoreCase(search)) {
                found=true;
                break;
            }
        }
        if(found){
            System.out.println("Book is available in the library.");
        } else {
            System.out.println("Book is not available in the library.");
        }
        sc.close();
    }
}

