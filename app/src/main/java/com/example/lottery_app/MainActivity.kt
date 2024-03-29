package com.example.lottery_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.lottery_app.ui.theme.LotteryappTheme
import com.example.lottery_app.viewModels.CounterViewModel
import com.example.lottery_app.viewModels.LotteryViewModel
import com.example.lottery_app.views.Counter
import com.example.lottery_app.views.LotteryView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //val viewModel : CounterViewModel by viewModels();
        val viewModel : LotteryViewModel by viewModels();
        setContent {
            LotteryappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Counter(viewModel)
                    LotteryView(viewModel = viewModel);
                }
            }
        }
    }
}

