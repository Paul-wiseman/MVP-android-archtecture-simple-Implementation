package com.example.mvptesting.model

data class User(
    var userName:String,
    var email:String
){
    override fun toString(): String {
        return "userName: $userName \n email: $email"
    }
}
