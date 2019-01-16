package c.offwhite.sampledagger2as

import android.os.Bundle
import android.widget.TextView
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var coffeeMaker: CoffeeMaker // DaggerActivityがinjectしてくれるのでinjectは記載しなくてよい

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.testText).text = coffeeMaker.getTemperature()
    }
}
