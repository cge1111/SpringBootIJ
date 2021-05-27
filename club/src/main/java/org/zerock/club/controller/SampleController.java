package org.zerock.club.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/sample/")
public class SampleController {
    @GetMapping("/all")  // 모든 사용자 접근 가능
    public void exAll(){
        log.info("exAll.......");
    }

    @GetMapping("/member") // 로그인한 멤버만 접근 가능
    public void exMemebr(){
        log.info("exMember.......");
    }

    @GetMapping("/admin")  // 관리자만 접근 가능
    public void exAdmin(){
        log.info("exAdmin.......");
    }
}
