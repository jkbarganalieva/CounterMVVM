package com.geektech.countermvvm.remote

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {
  private  var count = 0
    var liveCount=MutableLiveData<Int>()

       fun increment() {
           count++
           liveCount.postValue(count)
       }

    fun decrement() {
        count--
    liveCount.postValue(count)}
}