package com.profileuser.myusersprofile

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class ProfileRecyclerViewAdapter(var profileList: List<Profile>):
    RecyclerView.Adapter<ProfileViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.profile_list_items, parent, false)
        return ProfileViewHolder(itemView)

    }

    override fun getItemCount(): Int {
       return profileList.size
    }
    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val profile = profileList[position]
        holder.tvName.text = profile.name
        holder.tvTitle.text = profile.title
        holder.tvPublicationYear.text = profile.publicationYear
        holder.tvDescription.text = profile.description
        holder.tvseeMore.text = profile.seeMore

        Picasso.get()
            .load(profile.image1Url)
            .placeholder(R.drawable.user)
            .into(holder.tvImage)

        Picasso.get()
            .load(profile.image2Url)
            .placeholder(R.drawable.user)
            .into(holder.tvImage2)
    }

}

class ProfileViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPublicationYear = itemView.findViewById<TextView>(R.id.tvYearOfPublication)
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    var tvDescription = itemView.findViewById<TextView>(R.id.tvDescription)
    var tvseeMore = itemView.findViewById<TextView>(R.id.tvSeemore)
    var tvImage = itemView.findViewById<ImageView>(R.id.tvImage)
    var tvImage2 = itemView.findViewById<ImageView>(R.id.tvImage2)
}