package com.example.movieapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import com.example.movieapp.model.Moovie
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_serie_detail.*

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_serie_detail)

        //val nMoovieIndex = intent.getStringExtra("index")
        //val index = intent.getIntExtra("index",0)
        val name = intent.getStringExtra("name")
        val author = intent.getStringExtra("author")
        val season = intent.getStringExtra("season")
        val description = intent.getStringExtra("description")
        val url = intent.getStringExtra("url")

        val btnClickDelete = findViewById<FloatingActionButton>(R.id.btnDeleteMovie)

        btnClickDelete.setOnClickListener {

            Toast.makeText(this,"Moovie has been registered successfully", Toast.LENGTH_LONG).show();


        }

//        val mBtnDelete: View = findViewById(R.id.btnDeleteMovie)
//        mBtnDelete.setOnClickListener { view ->
//            Snackbar.make(view, "Here's a Snackbar", Snackbar.LENGTH_LONG)
//                .setAction("Action", null)
//                .show()
//        }


        //val mBtnDelete = findViewById<FloatingActionButton>(R.id.btnDeleteMovie)

//        mBtnDelete.setOnClickListener{
//
//            // Initialize a new instance of
//            val builder = AlertDialog.Builder(this@DetailActivity)
//
//            // Set the alert dialog title
//            builder.setTitle("Delete")
//            // Display a message on alert dialog
//            builder.setMessage("Do you want to Delete?")
//            // Set a positive button and its click listener on alert dialog
//            builder.setPositiveButton("YES"){_, _ ->
//                // Do something when user press the positive button
//                Toast.makeText(applicationContext,"Ok, we delete the movie.",Toast.LENGTH_SHORT).show()
//
//            }
//
//
//            // Display a negative button on alert dialog
//            builder.setNegativeButton("No"){_,_ ->
//                Toast.makeText(applicationContext,"Ok, we don't delete the movie.",Toast.LENGTH_SHORT).show()
//            }
//            // Display a neutral button on alert dialog
//            builder.setNeutralButton("Cancel"){_,_ ->
//                Toast.makeText(applicationContext,"You cancelled the dialog.",Toast.LENGTH_SHORT).show()
//            }
//
//            // Finally, make the alert dialog using builder
//            val dialog: AlertDialog = builder.create()
//
//            // Display the alert dialog on app interface
//            dialog.show()
//
//
////            AlertDialog.Builder(this@DetailActivity)
////                .setCancelable(false)
////                .setPositiveButton("Yes") { _, _ ->
////                    // Delete selected movie from list
////                    MainActivity.mMovie.removeAt(index)
////                }
////                .setNegativeButton("No") { dialog, _ ->
////                    // Dismiss the dialog
////                    dialog.dismiss()
////                }
////                .setTitle("Delete")
////                .setMessage("Do you want to Delete")
////                //.setIcon(R.drawable.delete)
//        }
        val mName = findViewById<TextView>(R.id.nameTextView)
        val mAuthor = findViewById<TextView>(R.id.authorTextView)
        val mSeason = findViewById<TextView>(R.id.seasonTextView)
        val mDescription = findViewById<TextView>(R.id.descriptionTextView)
        val mPoster = findViewById<ImageView>(R.id.posterImageView)
        val mVistaImageView = findViewById<ImageView>(R.id.vistaImageView)

        mName.text = name
        mAuthor.text = author
        mSeason.text = season
        mDescription.text = description

        Glide.with(this)
            .load(url)
            .into(mPoster)

        Glide.with(this)
            .load(url)
            .into(mVistaImageView)
    }

}
