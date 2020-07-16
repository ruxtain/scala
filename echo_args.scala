// this script will echo any argument you pass to it

println("normal style using 'while'")
var i = 0

while (i < args.length) {
    println(args(i))
    i += 1
}

println("normal style using 'for'")
for (arg <- args) println(arg)

println("normal scala style")
args.foreach((arg: String) => println(arg))

println("concise scala style")
args.foreach(println(_))

println("most concise scala style")
args.foreach(println)

