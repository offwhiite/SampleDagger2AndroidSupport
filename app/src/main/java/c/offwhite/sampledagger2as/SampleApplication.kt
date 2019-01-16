package c.offwhite.sampledagger2as

import c.offwhite.sampledagger2as.di.DaggerApplicationComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class SampleApplication : DaggerApplication() {

    // injectはDaggerApplicationがやってくれるので、AndroidInjectorを渡すだけ。
    override fun applicationInjector(): AndroidInjector<SampleApplication> {
        return DaggerApplicationComponent.builder().build()
    }
}