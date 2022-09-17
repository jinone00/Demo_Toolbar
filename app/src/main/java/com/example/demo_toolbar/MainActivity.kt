package com.example.demo_toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.example.demo_toolbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        setSupportActionBar(binding?.toolbar)
        if (supportActionBar != null){
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }

        //Toolbar 뒤로가기 버튼 생성하기
        binding?.toolbar?.setNavigationOnClickListener{
            onBackPressed()
        }

        //Toolbar Title Text 제거하기
        supportActionBar?.setDisplayShowTitleEnabled(false)

        //Toolbar 제목 만들기
        binding?.toolbar?.title = "툴바제목 만들기"

    }

    //액션버튼 메뉴 액션바에 집어 넣기
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.toolbar_menu, menu)
        return true
    }

    //액션버튼 클릭 했을 때

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){
            R.id.action_search -> {
                //검색 버튼 눌렀을 때
                Toast.makeText(applicationContext, "검색 이벤트 실행", Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }
            R.id.action_share -> {
                //공유 버튼 눌렀을 때
                Toast.makeText(applicationContext, "공유 이벤트 실행", Toast.LENGTH_LONG).show()
                return super.onOptionsItemSelected(item)
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }




}