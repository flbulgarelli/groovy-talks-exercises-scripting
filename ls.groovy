def ls(path = ".") {
     new File(path).listFiles().findAll { !it.hidden }.collect { it.name - "./" }. collect { "$it\n" }.join()
}
 
