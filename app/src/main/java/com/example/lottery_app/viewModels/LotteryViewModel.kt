package com.example.lottery_app.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LotteryViewModel:ViewModel() {

    private val _lottoNumbers = mutableStateOf(emptyList<Int>())
    val lottoNumbers: State<List<Int>> = _lottoNumbers;

    fun generateLottoNumbers(){
        _lottoNumbers.value = (1..60 ).shuffled().take(6).sorted();
    }

}