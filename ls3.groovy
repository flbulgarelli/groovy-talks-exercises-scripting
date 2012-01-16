def ls(path = ".") {
     (path as File).eachFileMatch { !it.startsWith('.') } { print "${it.name - './' }\n" }
}
