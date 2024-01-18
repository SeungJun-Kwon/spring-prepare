package com.sparta.springprepare.memo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Memo {
    private String username;
    private String contents;
}

class Main {
    public static void main(String[] args) {
        Memo memo = new Memo();
        System.out.println(memo.getUsername() + " " + memo.getContents());
        memo.setUsername("가나다라");
        memo.setContents("수정");
        System.out.println(memo.getUsername() + " " + memo.getContents());
    }
}