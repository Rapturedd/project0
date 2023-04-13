package com.raptured.notepad

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class NoteSaveActivity: AppCompatActivity() {

    private lateinit var textView: EditText

            override fun onCreate(savedInstanceState: Bundle? ) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_note_save)
        textView = findViewById(R.id.isimGir)
        getInfo(textView.text.toString())
    }


}

fun getInfo(isim:String) {
    var aciklama = isim
    if(isim == "ibrahim") {
        aciklama = "merhaba" + isim
    }
    println(aciklama)
}