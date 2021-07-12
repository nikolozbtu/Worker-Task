package ge.msda.workertask

import android.content.Context
import android.graphics.Bitmap
import android.net.Uri
import android.renderscript.Allocation
import android.renderscript.Element
import android.renderscript.RenderScript
import android.renderscript.ScriptIntrinsicBlur
import android.util.Log
import androidx.annotation.WorkerThread
import java.io.File
import java.io.FileNotFoundException
import java.io.FileOutputStream
import java.io.IOException
import java.util.*

/*
 *  Created by Nikoloz Katsitadze on 11.07.21
 */

fun doSomething(workerName: String) {

    for (i in 1..15) {
        Log.d("MyData", "$workerName - $i")
        Thread.sleep(1000)
    }

}