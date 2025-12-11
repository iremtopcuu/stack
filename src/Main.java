public class Main {
    public static void main(String[] args) {
        StackYapisi list = new StackYapisi(5);
        list.push(5);
        list.push(10);
        list.push(12);
        list.push(20);
        list.push(30);
        list.push(40);
        list.pop();
        list.pop();
        list.push(16);
        list.push(80);
        list.peek();;



    }
}