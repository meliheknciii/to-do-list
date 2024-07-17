package com.melihekinci.todolist

import android.graphics.Paint
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.melihekinci.todolist.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var sayac = 0
        var mediaPlayer = MediaPlayer.create(this,R.raw.photo)

        fun grv(x:Int){
            if(x==1){
                binding.gorev1.visibility = View.VISIBLE
                binding.gorev1.text = binding.textGir.text
                binding.checkBox1.visibility = View.VISIBLE
                binding.linear1.visibility = View.VISIBLE
            }
            else if (x==2){
                binding.gorev2.visibility = View.VISIBLE
                binding.gorev2.text = binding.textGir.text
                binding.checkBox2.visibility = View.VISIBLE
                binding.linear2.visibility = View.VISIBLE
            }
            else if(x==3){
                binding.gorev3.visibility = View.VISIBLE
                binding.gorev3.text = binding.textGir.text
                binding.checkBox3.visibility = View.VISIBLE
                binding.linear3.visibility = View.VISIBLE
            }
            else if(x==4){
                binding.gorev4.visibility = View.VISIBLE
                binding.gorev4.text = binding.textGir.text
                binding.checkBox4.visibility = View.VISIBLE
                binding.linear4.visibility = View.VISIBLE
            }
            else if(x==5){
                binding.gorev5.visibility = View.VISIBLE
                binding.gorev5.text = binding.textGir.text
                binding.checkBox5.visibility = View.VISIBLE
                binding.linear5.visibility = View.VISIBLE
            }
            else if(x==6){
                binding.gorev6.visibility = View.VISIBLE
                binding.gorev6.text = binding.textGir.text
                binding.checkBox6.visibility = View.VISIBLE
                binding.linear6.visibility = View.VISIBLE
            }
            else if(x==7){
                binding.gorev7.visibility = View.VISIBLE
                binding.gorev7.text = binding.textGir.text
                binding.checkBox7.visibility = View.VISIBLE
                binding.linear7.visibility = View.VISIBLE
            }
            else if(x==8){
                binding.gorev8.visibility = View.VISIBLE
                binding.gorev8.text = binding.textGir.text
                binding.checkBox8.visibility = View.VISIBLE
                binding.linear8.visibility = View.VISIBLE
            }
            else if(x==9){
                binding.gorev9.visibility = View.VISIBLE
                binding.gorev9.text = binding.textGir.text
                binding.checkBox9.visibility = View.VISIBLE
                binding.linear9.visibility = View.VISIBLE
            }
            else if(x==10){
                binding.gorev10.visibility = View.VISIBLE
                binding.gorev10.text = binding.textGir.text
                binding.checkBox10.visibility = View.VISIBLE
                binding.linear10.visibility = View.VISIBLE
            }
            else {
                binding.btnekle.isEnabled = false
            }
        }
        binding.btnekle.setOnClickListener { v -> klavyeKapatmaFonk()
            sayac++
            grv(sayac)
            binding.textGir.text.clear()


        }

        /* CheckBOX tıklama işlemleri */
        binding.checkBox1.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev1.paintFlags = binding.gorev1.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear1.background = ContextCompat.getDrawable(this, R.drawable.todochecked)
            }
            else
            {
                binding.gorev1.paintFlags = binding.gorev1.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear1.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }

        }
        binding.checkBox2.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev2.paintFlags = binding.gorev2.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear2.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev2.paintFlags = binding.gorev2.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear2.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }
        }
        binding.checkBox3.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev3.paintFlags = binding.gorev3.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear3.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev3.paintFlags = binding.gorev3.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear3.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }
        }
        binding.checkBox4.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev4.paintFlags = binding.gorev4.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear4.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev4.paintFlags = binding.gorev4.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear4.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }
        }
        binding.checkBox5.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev5.paintFlags = binding.gorev5.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear5.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev5.paintFlags = binding.gorev5.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear5.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }
        }
        binding.checkBox6.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev6.paintFlags = binding.gorev6.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear6.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev6.paintFlags = binding.gorev6.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear7.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }
        }
        binding.checkBox7.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev7.paintFlags = binding.gorev7.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear7.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev7.paintFlags = binding.gorev7.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear7.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }
        }
        binding.checkBox8.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev8.paintFlags = binding.gorev8.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear8.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev8.paintFlags = binding.gorev8.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear8.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }
        }
        binding.checkBox9.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev9.paintFlags = binding.gorev9.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear9.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev9.paintFlags = binding.gorev9.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear9.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }
        }
        binding.checkBox10.setOnCheckedChangeListener { buttonView, isChecked ->
            if(isChecked){
                binding.gorev10.paintFlags = binding.gorev10.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG
                binding.linear10.background = ContextCompat.getDrawable(this,R.drawable.todochecked)
            }
            else
            {
                binding.gorev10.paintFlags = binding.gorev10.paintFlags and  Paint.STRIKE_THRU_TEXT_FLAG.inv()
                binding.linear10.background = ContextCompat.getDrawable(this,R.drawable.todounchecked)
            }

        }


    }
    private fun klavyeKapatmaFonk() {
        val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(binding.textGir.windowToken,0)
    }
    fun playSound(){
        if(mediaPlayer.isPlaying){
            mediaPlayer.stop()
            mediaPlayer.prepare()
        }
        mediaPlayer.start()
    }

    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.release()
    }
}