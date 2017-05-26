package xyz.thecodeside.homebudgetplanner.dagger

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import javax.inject.Named

/**
 * Created by Artur Latoszewski on 24.05.2017.
 */
@Module
class SchedulersModule {
    @Module
    class SchedulersModule {

        @Provides
        @Named(SCHEDULER_IO)
        fun ioScheduler(): Scheduler {
            return Schedulers.io()
        }

        @Provides
        @Named(SCHEDULER_MAIN)
        fun mainScheduler(): Scheduler {
            return AndroidSchedulers.mainThread()
        }

        companion object {
            const val SCHEDULER_IO = "io"
            const val SCHEDULER_MAIN = "main"
        }

    }
}