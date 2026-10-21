package edu.temple.counterapp

import androidx.compose.runtime.mutableIntStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
    val countValue = mutableIntStateOf(0)
}