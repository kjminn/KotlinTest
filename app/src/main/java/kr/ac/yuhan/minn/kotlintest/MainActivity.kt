package kr.ac.yuhan.minn.kotlintest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kr.ac.yuhan.minn.kotlintest.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener(l)
        binding.btn2.setOnClickListener(l)
    }
    var l = View.OnClickListener {
        binding.linear1.visibility = View.INVISIBLE
        binding.linear2.visibility = View.INVISIBLE
        when(it.id){
            R.id.btn1 -> binding.linear1.visibility = View.VISIBLE
            R.id.btn2 -> binding.linear2.visibility = View.VISIBLE
        }
    }
}