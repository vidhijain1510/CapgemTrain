mport java.util.Scanner;

public class difference {
  public static void main(String[] args) {
    int x, y, sub;
    Scanner myObj = new Scanner(System.in);
        x = myObj.nextInt();
    y = myObj.nextInt();

    sub = x - y; 
    System.out.println("sub is: " + sub);
  }}