package com.example.powerup.nearparking.parking

import android.support.v4.util.SparseArrayCompat
import android.support.v7.widget.RecyclerView
import android.util.SparseArray
import android.view.ViewGroup
import com.example.powerup.nearparking.adapter.AdapterConstants
import com.example.powerup.nearparking.adapter.ViewType
import com.example.powerup.nearparking.adapter.ViewTypeDelegateAdapter
import com.example.powerup.nearparking.commons.ParkingItem
import java.util.*

/**
 * @author: Sergio on 1/12/2016.
 */
class ParkingAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private var items: ArrayList<ViewType>
    private var delegateAdapters = SparseArrayCompat<ViewTypeDelegateAdapter>()

    init {
        delegateAdapters.put(AdapterConstants.PARKING, ParkingDelegateAdapter(  ))
        items = ArrayList()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        delegateAdapters.get(getItemViewType(position)).onBindViewHolder(holder, this.items[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return delegateAdapters.get(viewType).onCreateViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun getItemViewType(position: Int): Int {
        return this.items[position].getViewType()
    }

    fun getParkins(): List<ParkingItem> {
        return items
                .filter { it.getViewType() == AdapterConstants.PARKING }
                .map { it as ParkingItem }
    }

    fun addParking(parkinks: List<ParkingItem>) {
        items.addAll(parkinks)
        notifyItemRangeChanged(0, items.size)
    }
}