package com.example.lottery_app.viewModels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    private val _counter = mutableStateOf(0)
    val counter: State<Int> = _counter

    fun add(){
        _counter.value = _counter.value + 1;
    }
}