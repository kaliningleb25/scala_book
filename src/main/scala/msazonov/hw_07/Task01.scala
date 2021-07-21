package msazonov.hw_07

/***
 * 1. Write an example program to demonstrate that
       package com.horstmann.impatient
            is not the same as
       package com
       package horstmann
       package impatient
 */

object Task01 {
    def main(args: Array[String]): Unit = {
    }
}

package com.horstmann {
    object Horst {
        val name: String = "Maksim"
    }
}

package com {
    package horstmann {
        package impatient {
            class EmployeeA(val name: String) {
                println(Horst.name) //Horst is accessible
            }
        }
    }
}

package com.horstmann.impatient {
    class EmployeeB(val name: String) {
//        println(Horst.name) //Horst is not accessible
    }
}
