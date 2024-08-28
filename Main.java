import java.util.*;
public class Main{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>0){
        System.out.println("Positive");
    }
    else if(n<0){
        System.out.println("Negative");
    }
    else{
        System.out.println("Zero");
    }
    switch(n){
        case 0:{
            System.out.println("Sunday");
            break;
        }
        case 1:{
            System.out.println("Monday");
            break;
        }
        case 2:{
            System.out.println("Tuesday");
            break;
        }
        case 3:{
            System.out.println("Wednesday");
            break;
        }
        case 4:{
            System.out.println("Thursday");
            break;
        }
        case 5:{
            System.out.println("Friday");
            break;
        }
        case 6:{
            System.out.println("Saturday");
            break;
        }
        default:{
            System.out.println("Number exceeded week limit");
            break;
        }
    }
    for(int i=1;i<=n;i++){
        System.out.print(i+" ");
    }
    int m=n;
    System.out.println();
    while(m>0){
       
        System.out.print(m+" ");
        m--;
    }
    System.out.println();
    int k=1;
    do{
        System.out.print(k+" ");
        k++;
    }while(k<=3);
    
 }
}