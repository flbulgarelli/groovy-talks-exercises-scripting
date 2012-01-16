def ls(path = ".") {
     new File(path).listFiles().findAll { !it.hidden }.collect { it.name - "./" }.each { print "$it\n" }
}

