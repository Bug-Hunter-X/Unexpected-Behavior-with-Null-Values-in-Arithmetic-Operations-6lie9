```groovy
def calculate(a, b) {
  if (a == null || b == null) {
    return 0 // Handle null inputs
  }
  return a + b
}

println calculate(5, 3) // Output: 8
println calculate(null, 3) // Output: 0
println calculate(5, null) // Output: 0
println calculate(null, null) // Output: 0

//More robust solution using the Elvis operator
def calculateRobust(a, b) {
  return (a ?: 0) + (b ?: 0)
}
println calculateRobust(5,3) // Output: 8
println calculateRobust(null,3) // Output: 3
println calculateRobust(5,null) // Output: 5
println calculateRobust(null,null) // Output: 0
```