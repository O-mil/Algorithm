while True:
    n1, n2, n3 = map(int, input().split())
    
    if (n1 == 0 and n2 == 0 and n3 == 0):
        break;
    
    else:
        if sum((n1, n2, n3)) - max((n1, n2, n3)) <= max((n1, n2, n3)):
            print("Invalid")
        
        else:
            if n1 == n2 and n2 == n3:
                print("Equilateral")
            
            elif n1 == n2 or n2 == n3 or n3 == n1:
                print("Isosceles")
            
            elif n1 != n2 and n2 != n3 and n1 != n3:
                print("Scalene")