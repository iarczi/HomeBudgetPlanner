package xyz.thecodeside.homebudgetplanner

import android.app.Application
import xyz.thecodeside.homebudgetplanner.dagger.ContextModule
import xyz.thecodeside.homebudgetplanner.dagger.DaggerDataComponent
import xyz.thecodeside.homebudgetplanner.dagger.DataComponent
import xyz.thecodeside.homebudgetplanner.dagger.SchedulersModule

/**
 * Created by Artur Latoszewski on 26.05.2017.
 */
class App : Application() {

    companion object {
        lateinit var dataComponent: DataComponent
    }

    override fun onCreate() {
        super.onCreate()


        dataComponent = DaggerDataComponent
                .builder()
                .contextModule(ContextModule(this))
                .schedulersModule(SchedulersModule())
                .build()

    }

}