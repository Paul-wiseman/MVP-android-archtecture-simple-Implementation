package com.example.mvptesting.presenter

import com.example.mvptesting.model.User

class MainActivityPresenter():LoginContract.Presenter,BasePresenter<LoginContract.View>() {
    private val user = User("", "")

    override fun updateUserName(userName: String) {
        getView()?.updateUserInfoTextView(user.apply {
            this.userName = userName
        })
    }

    override fun updateEmail(userEmail: String) {
        getView()?.updateUserInfoTextView(user.apply {
            this.email = userEmail
        })
    }
}