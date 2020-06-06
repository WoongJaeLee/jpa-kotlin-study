package com.jpastudy.jpakotlinstudy.repository

import com.jpastudy.jpakotlinstudy.entity.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository: JpaRepository<Member, Long> {
}