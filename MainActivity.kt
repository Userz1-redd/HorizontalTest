package com.example.worksmobileui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.library.mainview.DevScheduleView
import com.example.library.model.Schedule
import com.example.library.model.Time
import com.example.library.model.User
import com.example.worksmobileui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.addScheduleBtn.setOnClickListener {
            startActivity( Intent (this, AddScheduleActivity::class.java))
        }
        binding.goScheduleBtn.setOnClickListener{
            startActivity(Intent(this,DetailScheduleActivity::class.java))
        }
        var scheduleList = ArrayList<Schedule>()
        scheduleList.add(
            Schedule(
                "1",
                "2022 인턴십 회의 일",
                Time(2022, 1, 21, 10, 30, "FRI"),
                Time(2022, 1, 21, 11, 30, "FRI")
            )
        )
        scheduleList.add(
            Schedule(
                "2",
                "2022 인턴십 회의 일",
                Time(2022, 1, 21, 10, 40, "FRI"),
                Time(2022, 1, 21, 11, 40, "FRI")
            )
        )
        scheduleList.add(
            Schedule(
                "1000",
                "2022 인턴십 회의 일",
                Time(2022, 1, 21, 10, 50, "FRI"),
                Time(2022, 1, 21, 11, 50, "FRI")
            )
        )
        scheduleList.add(
            Schedule(
                "1000",

                "2022 인턴십 회의 일",
                Time(2022, 1, 21, 10, 50, "FRI"),
                Time(2022, 1, 21, 11, 50, "FRI")
            )
        )
        scheduleList.add(
            Schedule(
                "1000",
                "2022 인턴십 회의 일",
                Time(2022, 1, 21, 10, 50, "FRI"),
                Time(2022, 1, 21, 11, 50, "FRI")
            )
        )
        scheduleList.add(
            Schedule(
                "1000",
                "2022 인턴십 회의 일",
                Time(2022, 1, 21, 11, 40, "FRI"),
                Time(2022, 1, 21, 12, 40, "FRI")
            )
        )
        scheduleList.add(
            Schedule(
                "1000",
                "2022 인턴십 회의 일",
                Time(2022, 1, 21, 11, 50, "FRI"),
                Time(2022, 1, 21, 12, 50, "FRI")
            )
        )
        scheduleList.add(
            Schedule(
                "1000",
                "2022 인턴십 회의 일",
                Time(2022, 1, 21, 13, 0, "FRI"),
                Time(2022, 1, 21, 14, 10, "FRI")
            )
        )
        var userList = ArrayList<User>()
        var user1 = User("1", "사용자1", scheduleList)
        userList.add(user1)
        scheduleList = ArrayList<Schedule>()
        scheduleList.add(
            Schedule(
                "3",
                "종료일이 하루넘어감sssssssssssssssswwwwwwwwewrqrwqrwqrqw",
                Time(2022, 1, 21, 10, 30, "FRI"),
                Time(2022, 1, 22, 11, 30, "FRI")
            )
        )
        scheduleList.add(
            Schedule(
                "223",
                "종료일이 하루넘어감sssssssssssssssswwwwwwwwewrqrwqrwqrqw",
                Time(2022, 1, 21, 10, 30, "FRI"),
                Time(2022, 1, 22, 11, 30, "FRI")
            )
        )
        var user2 = User("2", "사용자2", scheduleList)
        userList.add(user2)
        scheduleList = ArrayList<Schedule>()
        scheduleList.add(
            Schedule(
                "4",
                "중간에낌",
                Time(2022, 1, 20, 10, 30, "FRI"),
                Time(2022, 1, 22, 11, 30, "FRI")
            )
        )
        var user3 = User("3", "사용자3", scheduleList)
        userList.add(user3)
        scheduleList = ArrayList<Schedule>()
        scheduleList.add(
            Schedule(
                "5",
                "마지막날",
                Time(2022, 1, 20, 10, 30, "FRI"),
                Time(2022, 1, 21, 15, 30, "FRI")
            )
        )
        var user4 = User("4", "사용자4", scheduleList)
        userList.add(user4)
        for (i in 1..50) {
            userList.add(user1)
            userList.add(user2)
            userList.add(user3)
            userList.add(user4)
        }
        binding.scheduleView.setDate(Time(2022,1,21,0,0,""))
        binding.scheduleView.submitUserList(userList)

    }
}