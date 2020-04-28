fun main (args: Array<String>) {
    val name = if (args.isNotEmpty()) args[0] else "kotlin"

    val lang = arrayListOf("java")
    lang.add(args[1])
    lang.add("Perl")

    println("Hello, $name!") //////


    println(lang[1])  ////////

    lang.add("C++")
    lang.add("C++")
    lang.add("C++")
    lang.add("C++")
    lang.add("C++")
    lang.add("C++")

    println ("LANG SIZE:-- $lang") ////////
    println(lang.size) 				///////

    println ("\n\n PRINTING ENTIRE ARRAY \n\n")

/* this will print array in normal order! */

    var c=0
    while (c < lang.size)
    {
        println("${lang[c]}  <---> $c --- ${c*c}")    ////////////
        c++
    }

//  this wil print array in reverse order
    println ("\n\n PRINTING ENTIRE ARRAY REVERSE ORDER!!! \n\n")
    var c2=lang.size
    while (c2 > 0)
    {
        println("${lang[c2-1]} <---> $c2")    ////////////
        c2--
    }
    /**/


    val tt = args.size
    println("\nPRINTING ARGS SIZE: ---- $tt")     ///////////////

}



