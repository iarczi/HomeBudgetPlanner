package xyz.thecodeside.homebudgetplanner.dagger

import dagger.Component
import xyz.thecodeside.homebudgetplanner.paymentlist.PaymentsListActivity
import javax.inject.Singleton

/**
 * Created by Artur Latoszewski on 24.05.2017.
 */
@Singleton
@Component(modules = arrayOf(ContextModule::class, SchedulersModule::class))
interface DataComponent {
    fun inject(view: PaymentsListActivity)
}