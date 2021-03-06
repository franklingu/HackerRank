// This function will be used while invoking "Summation" to compute
 // The area under the curve.
 def f(coefficients:List[Int],powers:List[Int],x:Double):Double =
   {
      coefficients.zip(powers).map(arg => math.pow(x, arg._2) * arg._1).sum
   }

  // This function will be used while invoking "Summation" to compute
  // The Volume of revolution of the curve around the X-Axis
  // The 'Area' referred to here is the area of the circle obtained
  // By rotating the point on the curve (x,f(x)) around the X-Axis
  def area(coefficients:List[Int],powers:List[Int],x:Double):Double =
   {
      math.pow(f(coefficients, powers, x), 2) * math.Pi
   }

   // This is the part where the series is summed up
   // This function is invoked once with func = f to compute the area         // under the curve
    // Then it is invoked again with func = area to compute the volume
    // of revolution of the curve
   def summation(func:(List[Int],List[Int],Double)=>Double,upperLimit:Int,lowerLimit:Int,coefficients:List[Int],powers:List[Int]):Double =
   {
      (lowerLimit*1d to upperLimit*1d by 0.001d).map(0.001d*func(coefficients,powers,_)).sum
   }


// The Input-Output functions will be handled by us. You only need to concentrate your effort on the function bodies above.
