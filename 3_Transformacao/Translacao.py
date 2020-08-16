x = int(input("Insert x: "))
y = int(input("Insert y: "))
P = [x,y]
x = int(input("Insert x translation: "))
y = int(input("Insert y translation: "))
P_ = [P[0] + x ,P[1] + y]

def ShowIt(P, P_):
    print("P:  (", P[0],",",P[1],")")
    print("P': (", P_[0],",",P_[1],")")


ShowIt(P,P_)
