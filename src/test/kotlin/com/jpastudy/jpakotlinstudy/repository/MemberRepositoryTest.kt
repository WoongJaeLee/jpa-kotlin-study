package com.jpastudy.jpakotlinstudy.repository

import com.jpastudy.jpakotlinstudy.entity.Member
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
internal class MemberRepositoryTest(@Autowired val memberRepository: MemberRepository) {

    @Test
    fun `member save and select test`() {
        val testId = 1L
        val member = Member(testId, "TEST_NAME")

        memberRepository.save(member)

        val dbMember = memberRepository.findById(testId)
        assertThat(dbMember.get()).isEqualToComparingFieldByField(member)
    }
}