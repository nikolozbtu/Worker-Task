package ge.msda.workertask

import android.content.Context
import android.graphics.BitmapFactory
import android.util.Log

/*
 *  Created by Nikoloz Katsitadze on 11.07.21
 */

class BlurWorker {

    private fun processImage(appContext: Context) {

        val picture = BitmapFactory
            .decodeResource(appContext.resources, R.drawable.maserati)

        val output = blurBitmap(picture, appContext)

        val outputUri = writeBitmapToFile(appContext, output)

        Log.d("My Tag", outputUri.toString())

    }

}