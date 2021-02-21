package com.example.movieapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.movieapp.model.Moovie
import kotlinx.android.synthetic.main.activity_add_movie.*

class AddMovie : AppCompatActivity() {

    private lateinit  var tvMovieName: EditText
    private lateinit  var tvMovieAuthor: EditText
    private lateinit  var tvMovieDescription: EditText
    private lateinit  var tvMovieUrlPoster: EditText
    //private lateinit  var btnAddMoovie: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_movie)


        val btn_click_me = findViewById(R.id.btnAddMovie) as Button

        btn_click_me.setOnClickListener {

                val vlcName = tvMovieName.text.toString()
                val vlcAuthor = tvMovieAuthor.text.toString()
                val vlcDescription = tvMovieDescription.text.toString()
                val vlcUrl = tvMovieUrlPoster.text.toString()
                if(vlcName == "" ||vlcAuthor == "" ||vlcDescription == "" ||vlcUrl == "" ){
                    Toast.makeText(this@AddMovie,"Some elements don't have been filled yet, please check!", Toast.LENGTH_LONG).show();
                    return@setOnClickListener
                }

                val vloPeli = Moovie( tvMovieName.text.toString(), tvMovieAuthor.text.toString(),1, tvMovieDescription.text.toString(),tvMovieUrlPoster.text.toString())

                MainActivity.mMovie.add(vloPeli)

                Toast.makeText(this,"Moovie has been registered successfully", Toast.LENGTH_LONG).show();
                finish()

        }



        //btnAddMoovie = findViewById(R.id.btnAddMovie) as Button
        tvMovieName = findViewById<EditText>(R.id.txv_add_moovie_name)
        tvMovieAuthor = findViewById<EditText>(R.id.txv_add_moovie_author)
        tvMovieDescription = findViewById<EditText>(R.id.txv_add_moovie_description)
        tvMovieUrlPoster = findViewById<EditText>(R.id.txv_add_UrlImagen)
    }


}