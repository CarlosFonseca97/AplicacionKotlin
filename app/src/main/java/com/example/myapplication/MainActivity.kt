package com.example.myapplication

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.google.firebase.referencecode.database.R
abstract class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "KotlinActivity"

    val database = Firebase.database
    val myRef = database.getReference("message")

    myRef.setValue("Hello, World!")
    }