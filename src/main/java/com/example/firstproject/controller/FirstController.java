package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;      // 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;  // URL 연결 요청(@Getmappin()) 과 동시에 자동으로 임포트

@Controller                                 // 컨트롤러 선언
public class FirstController {


    @GetMapping("/hi")              // URL 요청 접수
    public String niceTOMeetYOu(Model model){           // 메서드 작성
        model.addAttribute("username", "Chanpark");
        return "greetings";                         // greeting.mustache 파일 반환
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model){
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }
}
