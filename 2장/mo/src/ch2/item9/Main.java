package ch2.item9;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        try(Chat chat = new Chat("Hello World")) {
            System.out.println(chat.getMsg());
            System.out.println(chat.getMsg());
            System.out.println(chat.getMsg());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Chat implements AutoCloseable {
    private String msg = "";

    public Chat(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public void close() throws Exception {
        System.out.println("close");
    }
}
