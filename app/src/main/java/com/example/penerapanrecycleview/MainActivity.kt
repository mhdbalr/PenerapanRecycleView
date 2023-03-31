package com.example.penerapanrecycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.penerapanrecycleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    //data student berupa array list
        val ListStudentData = arrayListOf(
            ListStudent("Andi", 19, R.drawable.img),
            ListStudent("Ayu", 23, R.drawable.img),
            ListStudent("Rey", 22, R.drawable.img),
            ListStudent("Ade", 18, R.drawable.img),
            ListStudent("Axel", 20, R.drawable.img),
            ListStudent("Kak Ze", 20, R.drawable.img),
            ListStudent("Jihan", 20, R.drawable.img)
        )

        //panggil class adapter lalu isi data berupa arraylist
        val adapterStudent = StudentAdapter(ListStudentData)
        //mengatur tata letak dari recyclerview
        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //val gl = GridLayout(this)
        binding.rvStudent.layoutManager = lm
        binding.rvStudent.adapter = adapterStudent

        adapterStudent.onClick = {
            val pindah = Intent(this, DetailStudentActivity::class.java)
            pindah.putExtra("detail", it)
            startActivity(pindah)
        }

    }
}