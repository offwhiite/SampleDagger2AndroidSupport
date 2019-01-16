package c.offwhite.sampledagger2as.di

import c.offwhite.sampledagger2as.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeMainActivityInjector(): MainActivity
}