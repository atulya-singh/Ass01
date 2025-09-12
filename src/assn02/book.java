package assn02;

public class book{
    public String bookname;
    public String author;
    book(String b, String a){
        bookname=b;
        author=a;
    }

    public  static book[] books=new book[5];
    static int pointer=0;
    public static void add_book(String Book, String Author) {
        if (pointer >= books.length) {
            System.out.println("Book not added. Library is full!");
        } else {
            book obj = new book(Book, Author);
            books[pointer] = obj;
            pointer++;
            System.out.println("Book added to library!");
        }
    }

    public static int []flag ={-1,-1,-1,-1,-1};
   public static void check_out_book(int i){
       if(i<5){
           System.out.println("Book checked out successfully!");
       flag[i]=i;
       }
       else{
           System.out.println("Invalid book number!");
       }
   }

   public static void display_All(book [] arr){
       System.out.println("Books in library:");
       for(int i=0;i<5;i++){
           if(flag[i]==i && arr[i]!=null){
               System.out.println((i+1)+" Title: "+arr[i].bookname+", Author: Checked Out: Yes");
           }
           else if(flag[i]==-1 && arr[i]!=null){
               System.out.println((i+1)+" Title: "+arr[i].bookname+", Author: Checked Out: No");
           }
       }
   }
   public static void return_book(int j){
       if(j<5){
           flag[j]=0;
       System.out.println("Book returned!");}
       else{
           System.out.println("Invalid book number!");
       }
   }
}
