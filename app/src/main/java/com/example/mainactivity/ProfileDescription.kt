package com.example.mainactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import java.time.format.DateTimeFormatter

class ProfileDescription : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_description)

        val myProfile = intent.getSerializableExtra("EXTRA_PROFILE") as MainActivity.Profile
        val nom = myProfile.nom
        val prenom = myProfile.prenom
        val dateNaissance = myProfile.dateNaissance
        val iDUL = myProfile.iDUL

        val textViewNom: TextView = findViewById(R.id.textView7)
        textViewNom.text = nom

        val textViewPrenom: TextView = findViewById(R.id.textView6)
        textViewPrenom.text = prenom

        val textViewDateNaissance: TextView = findViewById(R.id.textView8)
        textViewDateNaissance.text = dateNaissance.toGMTString().substring(0,12)

        val textViewIDUL: TextView = findViewById(R.id.textView9)
        textViewIDUL.text = iDUL
    }


}