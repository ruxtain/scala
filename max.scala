// compare 2 numbers
def max2(x: Int, y: Int): Int = {
    if (x > y) x else y
}

// compare 3 numbers 
def max3(x: Int, y: Int, z: Int): Int = {
    max2(max2(x, y), z)
}

// what about N numbers? 
// a (?,?)=>? 2-argument function is required for reduce/fold/scan
def maxN(nums: Int*): Int = nums.reduce(max2)

// let's run some example 
println("max2(2, 3) = " + max2(2, 3)) 
println("max3(2, 5, 4) = " + max3(2, 5, 4)) 
println("maxN(2, 3, 1, 9, 0, 3) = " + maxN(2, 3, 1, 9, 0, 3)) 
println("maxN(2, 3, 1, 9, 0, 3, 666) = " + maxN(2, 3, 1, 9, 0, 3, 666)) 

/*
output:
max2(2, 3) = 3
max3(2, 5, 4) = 5
maxN(2, 3, 1, 9, 0, 3) = 9
maxN(2, 3, 1, 9, 0, 3, 666) = 666
*/
