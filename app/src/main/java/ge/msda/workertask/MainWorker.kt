package ge.msda.workertask

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters

/*
 *  Created by Nikoloz Katsitadze on 11.07.21
 */

class MainWorker(ctx: Context, params: WorkerParameters) : Worker(ctx, params) {

    override fun doWork(): Result {
        return try {
            doSomething(this.javaClass.name)
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }

}