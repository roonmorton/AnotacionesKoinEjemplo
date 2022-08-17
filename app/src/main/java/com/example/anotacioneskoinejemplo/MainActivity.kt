package com.example.anotacioneskoinejemplo

import android.graphics.Color
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.anotacioneskoinejemplo.databinding.ActivityMainBinding
import com.example.anotacioneskoinejemplo.viemodel.ColorViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val myViewModel: ColorViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        myViewModel.colorModel.observe(this, Observer {
            binding.txtColor.text = getString(R.string.label_color,it.colorName)
            binding.txtColor.setBackgroundColor(Color.parseColor(it.color))
            binding.txtColor.setTextColor(Color.parseColor(it.textColor))
            binding.main.setBackgroundColor(Color.parseColor(it.color))
            binding.toolbar.setBackgroundColor(Color.parseColor(it.color))
            binding.toolbar.setTitleTextColor(Color.parseColor(it.textColor))
        })
        myViewModel.randomColor()
        binding.main.setOnClickListener {
            /*Snackbar.make(it, "Has hecho un click", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()*/
            myViewModel.randomColor()
        }
        /*binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }*/
    }


}