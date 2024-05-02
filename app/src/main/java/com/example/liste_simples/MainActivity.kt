package com.example.liste_simples

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.liste_simples.R.id.etnovatarefa

class MainActivity : AppCompatActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val etnovatarefa = findViewById<EditText>(etnovatarefa)
        val btadd = findViewById<Button>(R.id.btadd)
        val lvtarefas = findViewById<ListView>(R.id.lvtarefas)

        val listaTarefas: ArrayList<String> = ArrayList()

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaTarefas)

        lvtarefas.adapter = adapter

        btadd.setOnClickListener{
            if (etnovatarefa.text.isNullOrEmpty()) {
                Toast.makeText(this, "Digite uma Tarefa...", Toast.LENGTH_LONG).show()
            } else {
                listaTarefas.add(etnovatarefa.text.toString())

                adapter.notifyDataSetChanged()
                etnovatarefa.setText("")
            }

                }



            }
        }


