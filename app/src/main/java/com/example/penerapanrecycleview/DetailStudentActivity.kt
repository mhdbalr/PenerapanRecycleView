package com.example.penerapanrecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.penerapanrecycleview.databinding.ActivityDetailStudentBinding

class DetailStudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val getDetail = intent.getSerializableExtra("detail") as ListStudent
        binding.detailImg.setImageResource(getDetail.img)
        binding.detailNama.text = getDetail.nama
        binding.detailUmur.setText(getDetail.umur)
    }
}