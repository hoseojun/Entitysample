package com.entitysample.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "entitytb3") // 테이블 이름 선언, 없을 경우 JAVA 파일명으로 생성되며, JAVA파일명과 다른 이름으로 테이블 생성가능
@Getter
@EnableJpaAuditing
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EntityListeners(AuditingEntityListener.class)
public class Entitytest {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Integer id;

    @Column(length = 100)
    private String Contents;
    
    @Column(length = 100)
    private String Name;
    
    //DB에 테이블 생성
    @Builder
    public Entitytest(Integer testId, String testContents, String testName) {
        this.id = testId;
        this.Contents = testContents;
        this.Name = testName;
    }
}
