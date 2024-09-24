package com.example.repository

import VideosEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface VideosEntityRepository : JpaRepository<VideosEntity, String>

