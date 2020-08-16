def bresenham(x1,y1,x2, y2):

    curv_ = 2 * (y2 - y1)
    curvinha = curv_ - (x2 - x1)

    y=y1
    for x in range(x1,x2+1):
        print("(",x ,",",y ,")\n")
        curvinha = curvinha + curv_
        if (curvinha >= 0):
            y=y+1
            curvinha =curvinha - 2 * (x2 - x1)


x1 = 3
y1 = 2
x2 = 15
y2 = 5
bresenham(x1, y1, x2, y2)
