


class testquiz1{
    public static void main(String[] args){
        System.out.println("Hello World");
        newlist<String> s = new newlist<>();
        s.addFirst("something");
        s.addFirst("else");
        s.addFirst("something1");
        s.addFirst("something2");
        s.addFirst("something3");
        s.addFirst("something4");
        s.addFirst("something5");
        s.addLast("end");
        System.out.println(s);
        s.removeLast();
        System.out.println(s.isEmpty());
        while(!s.isEmpty()){
            s.removeLast();
        }
        System.out.println("Start size");
        System.out.println(s);
        System.out.println("End size");


        silves<String> sil = new silves<>();
        sil.push("push1");
        sil.push("push2");
        sil.push("push3");
        sil.push("push4");
        System.out.println(sil);
        System.out.println(sil.pop());
        System.out.println(sil.pop());
        System.out.println(sil.pop());
        System.out.println(sil.pop());


        // t.push("s");
        // System.out.println(t.peek());
    }
}