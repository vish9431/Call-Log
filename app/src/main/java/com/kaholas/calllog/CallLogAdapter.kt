package com.kaholas.calllog

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.kaholas.calllog.databinding.ItemCallLogBinding

class CallLogAdapter :RecyclerView.Adapter<CallLogAdapter.CallLogViewHolder>() {


    class CallLogViewHolder(val binding : ItemCallLogBinding) : RecyclerView.ViewHolder(binding.root)


    private val diffUtil = object: DiffUtil.ItemCallback<Call>(){  // Created an object of DiffUtil ItemCallBack class
        override fun areItemsTheSame(oldItem: Call, newItem: Call): Boolean {
            // checks if the items are same
            return oldItem == newItem  // returns true if item id is same
        }

        override fun areContentsTheSame(oldItem: Call, newItem: Call): Boolean {
            // check if the contents of item same
            return oldItem == newItem  // returns true if the items are same
        }
    }
    // does something
    val differ = AsyncListDiffer(this, diffUtil)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CallLogViewHolder {
        return CallLogViewHolder(
            ItemCallLogBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    override fun onBindViewHolder(holder: CallLogViewHolder, position: Int) {
        val currentCall = differ.currentList[position]

        val details = currentCall.day + " " + currentCall.data + " " + currentCall.time + " | Dur : " + currentCall.dur + " s"

        holder.binding.apply {
            tvPhone.text = currentCall.number.toString()
            tvFrom.text = "From: " + currentCall.number.toString()
            tvStatus.text = currentCall.status
            tvRecordId.text = currentCall.recordId
            tvDetails.text = details
            tvDetails.setSelected(true);
        }
    }


}