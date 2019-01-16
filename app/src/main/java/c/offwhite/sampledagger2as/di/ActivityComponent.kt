package c.offwhite.sampledagger2as.di

import c.offwhite.sampledagger2as.MainActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent
interface ActivityComponent : AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()
}