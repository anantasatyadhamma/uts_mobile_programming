package com.ananta.a18090003_ananta_satya_dhamma_5c_uts

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_main.*


class Login : AppCompatActivity() {

    var userName: EditText? = null
    var passWord: EditText? = null
    lateinit var preferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        userName = findViewById<View>(R.id.edtUsername) as EditText
        passWord = findViewById<View>(R.id.edtPass) as EditText
        preferences = getSharedPreferences(KEYPREF, MODE_PRIVATE)

        if (preferences.contains(KEYUSERNAME) && preferences.contains(
                KEYPASSWORD
            )
        ) {
            userName!!.setText(preferences.getString(KEYUSERNAME, ""))
            passWord!!.setText(preferences.getString(KEYPASSWORD, ""))
        }

        btnExit.setOnClickListener {
            finish()
            System.exit(0)
        }
    }

    fun masuk(view: View?) {
        val user = userName!!.text.toString()
        val pass = passWord!!.text.toString()
        val editor = preferences!!.edit()
        editor.putString(KEYUSERNAME, user)
        editor.putString(KEYPASSWORD, pass)
        editor.apply()
        val intent= Intent(this,MainActivity::class.java)
        startActivity(intent)
    }



    companion object {
        const val KEYPREF = "Key Preferences"
        const val KEYUSERNAME = "Key Username"
        const val KEYPASSWORD = "Key Password"
    }
}