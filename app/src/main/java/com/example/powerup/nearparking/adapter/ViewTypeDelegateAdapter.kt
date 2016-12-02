package com.example.powerup.nearparking.adapter

import android.support.v7.widget.RecyclerView
import android.view.SurfaceHolder
import android.view.ViewGroup

/**
 * @author: Sergio on 1/12/2016.
 */
interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}