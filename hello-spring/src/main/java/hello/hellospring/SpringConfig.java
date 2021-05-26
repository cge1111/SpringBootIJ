package hello.hellospring;

import hello.hellospring.repository.JdbcMemberRepository;
import hello.hellospring.repository.JdbcTemplateMemberRepository;
import hello.hellospring.repository.JpaMemberRepository;
import hello.hellospring.repository.*;
import hello.hellospring.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;

    public SpringConfig(SpringDataJpaMemberRepository memberRepository){
        this.memberRepository = memberRepository;
    }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }
}

//    private final MemberRepository memberRepository;
//    private final DataSource dataSource;
//    private final EntityManager em;

//    public SpringConfig(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;


//    public SpringConfig(DataSource dataSource, EntityManager em,SpringDataJpaMemberRepository memberRepository) {
//        this.dataSource = dataSource;
//        this.em = em;
//        this.memberRepository = memberRepository;
//    }

//    @Bean
//    public MemberService memberService() {
//        return new MemberService(memberRepository());
//    }

//    @Bean
//    public MemberRepository memberRepository() {
//        return new JdbcTemplateMemberRepository(dataSource);
//        return new JpaMemberRepository(em);
//    }
//}
