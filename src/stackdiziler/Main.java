package stackdiziler;

public class Main {
public static void main(String[] args){
StackArray array=new StackArray(5);
array.push(10);
array.push(20);
array.push(30);
array.push(40);
array.push(50);
array.push(60);
System.out.println(array.pop());

}
}
