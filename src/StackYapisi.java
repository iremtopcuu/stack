public class StackYapisi {
    int count;
    int size;
    Node top = null;//en üst düğümü tutan gösterici (head gibi)


    public StackYapisi(int size) {
        this.size = size;
        count = 0;
    }

    void push(int data) {    //ekleme
        Node eleman = new Node(data);
        if (isFull() ) {
            System.out.println("stack dolu ekleme yapılamaz");
        } else {
            if (isEmpty()) {
                top=eleman;
                System.out.println(top.data + " stacke ilk eleman olarak eklendi");
            }else{
                eleman.next=top;
                top=eleman;
                System.out.println(top.data + " stacke eklendi");
            } count++;
        }
    }

    void pop(){//siler
        if(isEmpty()){
            System.out.println("silinecek eleman yok ,stack boş");
        }else{
            System.out.println(top.data + " silindi");
            top=top.next;
            count--;
        }
    }

    boolean isFull() {
        return count==size;
    }


    boolean isEmpty(){
        return count==0;
    }

    void print(){
        if (isEmpty()){
            System.out.println("stack boş");
        }else{
            Node temp=top;
            System.out.println("stackteki veriler \n");
           while (temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
            }
        }
    }

    void peek(){
        if(isEmpty()){
            System.out.println("stack boş");
        }else{
            System.out.println(top.data);
        }
    }













}




