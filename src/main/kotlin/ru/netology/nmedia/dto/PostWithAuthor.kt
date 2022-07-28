package ru.netology.nmedia.dto

data class PostWithAuthor(
    val id: Long,
    val authorName: String,
    val content: String,
    val published: Long,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
)