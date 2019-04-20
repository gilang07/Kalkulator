package com.example.simplemvp

class KalkulatorPresenters : KalkulatorPresenterImp{

    var mainView : MainViewImp? = null

    constructor(mainView : MainViewImp){
        this.mainView = mainView
    }
    override fun perhitunganTambah(nilai1: String, nilai2: String) {

        var hasil = nilai1.toDouble() + nilai2.toDouble()
        mainView?.hitung(hasil.toString())
    }

    override fun perhitunganKurang(nilai1: String, nilai2: String) {
        var hasil = nilai1.toDouble() - nilai2.toDouble()
        mainView?.hitung(hasil.toString())

    }

    override fun perhitunganKali(nilai1: String, nilai2: String) {
        var hasil = nilai1.toDouble() * nilai2.toDouble()
        mainView?.hitung(hasil.toString())

    }

    override fun perhitunganBagi(nilai1: String, nilai2: String) {
        var hasil = nilai1.toDouble() / nilai2.toDouble()
        mainView?.hitung(hasil.toString())

    }


}