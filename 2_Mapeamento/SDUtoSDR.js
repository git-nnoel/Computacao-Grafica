var UXmax = 10
var DXmax = 1024
var UYmax = 8
var DYmax = 768

var Ux, Uy, Dx, Dy
Ux = process.argv[2]
Uy = process.argv[3]
Dx = (Ux * DXmax)/UXmax
Dy = (Uy * DYmax)/UYmax
console.log(Dx + " , " + Dy)
