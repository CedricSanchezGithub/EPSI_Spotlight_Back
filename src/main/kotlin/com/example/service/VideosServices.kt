package com.example.service

import VideosEntity
import com.example.repository.VideosEntityRepository

class VideosServices(private val videosEntityRepository: VideosEntityRepository) {

    fun findAllRecipes(): MutableList<VideosEntity> = videosEntityRepository.findAll()

}