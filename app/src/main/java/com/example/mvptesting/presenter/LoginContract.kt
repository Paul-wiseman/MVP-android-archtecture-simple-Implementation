package com.example.mvptesting.presenter

import com.example.mvptesting.model.User

interface LoginContract
{

interface Presenter{
    fun updateUserName(userName:String)
    fun updateEmail(userEmail:String)
}

    interface View{
        fun updateUserInfoTextView(user:User)
        fun showProgressBar()
        fun hideProgressBar()
    }
}