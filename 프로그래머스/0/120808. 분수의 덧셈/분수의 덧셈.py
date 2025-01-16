def solution(numer1, denom1, numer2, denom2):
    numer3 = numer1 * denom2 + numer2 * denom1
    denom3 = denom1 * denom2
    
    greatest_common_divisor = gcd(numer3, denom3)
    
    numer3 //= greatest_common_divisor
    denom3 //= greatest_common_divisor
    
    return [numer3, denom3]

def gcd(a, b):
    while b != 0:
        a, b = b, a % b
    return a