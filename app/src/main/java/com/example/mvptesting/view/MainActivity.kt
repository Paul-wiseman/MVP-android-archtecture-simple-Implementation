package com.example.mvptesting.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import androidx.core.widget.doOnTextChanged
import com.example.mvptesting.R
import com.example.mvptesting.databinding.ActivityMainBinding
import com.example.mvptesting.model.User
import com.example.mvptesting.presenter.LoginContract
import com.example.mvptesting.presenter.MainActivityPresenter


class MainActivity : AppCompatActivity(), LoginContract.View {

    private lateinit var binding:ActivityMainBinding

    private lateinit var presenter: MainActivityPresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        presenter = MainActivityPresenter()
        presenter.setView(this)

//        binding.etEmail.addTextChangedListener(object : TextWatcher {
//            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {
//                // Code to be executed before the text is changed
//            }
//
//            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {
//                // Code to be executed when the text is changed
//                Log.d("etEmail", "onCreate:----$s ")
//                presenter.updateUserName(s.toString())
//            }
//
//            override fun afterTextChanged(s: Editable) {
//                // Code to be executed after the text is changed
//
//            }
//        })
        binding.etEmail.doOnTextChanged { text, start, before, count ->
            Log.d("etEmail", "onCreate:----$text ")
            presenter.updateUserName(text.toString())
        }

        binding.etUsername.doOnTextChanged { text, start, before, count ->
            Log.d("etUsername", "onCreate:----$text ")

            presenter.updateEmail(text.toString())
        }
    }

    override fun updateUserInfoTextView(user:User) {
        binding.tvDisplay.text = user.toString()
    }

    override fun showProgressBar() {
        TODO("Not yet implemented")
    }

    override fun hideProgressBar() {
        TODO("Not yet implemented")
    }
}