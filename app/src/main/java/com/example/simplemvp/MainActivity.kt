package com.example.simplemvp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() ,MainViewImp {

    lateinit var presenters: KalkulatorPresenters

    override fun hitung(data: String) {
        tvhasil.text = data
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initPresenter()
        initView()
    }

    private fun initPresenter(){
        presenters = KalkulatorPresenters(this)
    }

    private fun initView() {

        btnTambah.setOnClickListener {
            presenters.perhitunganTambah(edtBil1.text.toString(), edtBil2.text.toString())
            //presenters.perhitunganKali(edtBil1.text.toString(),edtBil2.text.toString())
            //presenters.perhitunganBagi(edtBil1.text.toString(), edtBil2.text.toString())
        }

        btnKurang.setOnClickListener {
            presenters.perhitunganKurang(edtBil1.text.toString(), edtBil2.text.toString())

        }

        btnKali.setOnClickListener {
            presenters.perhitunganKali(edtBil1.text.toString(), edtBil2.text.toString())

        }

        btnBagi.setOnClickListener {
            presenters.perhitunganBagi(edtBil1.text.toString(), edtBil2.text.toString())
        }
    }
}
