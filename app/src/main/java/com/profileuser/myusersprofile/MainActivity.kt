package com.profileuser.myusersprofile

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.profileuser.myusersprofile.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.rvUsers.layoutManager = LinearLayoutManager(this)
        listOfProfiles()
    }

    fun listOfProfiles(){
        val profile1 = Profile(
            "Mercy",
            "2023",
            "",
            "Born A Crime",
            "Trevor Noah was born in 1984 during apartheid in South " +
                "Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                "in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile2 = Profile("Mary",
            "2020",
            "",
            "Blossoms Of The Savannah",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    "                Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "                in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile3 = Profile("Jacky",
            "2012",
            "",
            "Kigogo",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    " Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile4 = Profile("Peter",
            "2013",
            "",
            "The Pearl",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    "Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile5 = Profile("Noel"
            , "2014"
            ,"",
            "The River And The Source",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    " Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile6 = Profile("Letty",
            "2015",
            "",
            "Head Of The Nation",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    "                Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "                in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")

        val profile7 = Profile("Yvonne",
            "2019",
            "",
            "Violet Flowers",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    "                Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "                in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile8 = Profile("Faith",
            "2004",
            "",
            "The Rocks",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    "                Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "                in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile9 = Profile("Essy",
            "2007",
            "",
            "Born A Crime",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    "                Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "                in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile10 = Profile("joy",
            "2010",
            "",
            "Born A Crime",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    "                Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "                in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")
        val profile11= Profile("Benson",
            "2010",
            "",
            "Born A Crime",
            "Trevor Noah was born in 1984 during apartheid in South " +
                    "                Africa to a black mother and white father, which was a criminal act at the time. He grew up " +
                    "                in poverty in Johannesburg and Soweto, with his religious single mother Patricia as his main caregiver",
            "See more",
            "")

        val myProfiles = listOf(profile1,profile2,profile3, profile4,profile5,profile6,profile7,profile8,profile9,profile10,profile11)
       val profileAdapter = ProfileRecyclerViewAdapter(myProfiles)
        binding.rvUsers.adapter = profileAdapter

    }
}