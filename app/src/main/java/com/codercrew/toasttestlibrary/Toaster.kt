package com.codercrew.toasttestlibrary

import android.content.Context
import android.widget.Toast

class Toaster {

   companion object{
       fun ToasterMessge(c: Context?, message: String?) {
           Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
       }
   }
}