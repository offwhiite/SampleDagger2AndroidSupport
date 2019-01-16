package c.offwhite.sampledagger2as.di

import c.offwhite.sampledagger2as.SampleApplication
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Component(modules = [AndroidInjectionModule::class, ActivityModule::class])
interface ApplicationComponent : AndroidInjector<SampleApplication> // // AndroidInjector<SampleApplication>を継承する。inject()は自動生成されるよう。