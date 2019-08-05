package com.panda.KotlinLearn.resource

import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository : JpaRepository<Users,Long> {
}