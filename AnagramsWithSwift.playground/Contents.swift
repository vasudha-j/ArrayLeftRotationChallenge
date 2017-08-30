//: Playground - noun: a place where people can play

//Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

import Foundation


var str = "Hello, playground"

//Provided no duplicate characters in the string


// Enter your code here
var a = String(readLine()!)!
var b = String(readLine()!)!
let charactersOfa = Array(a.characters)
let characterOfb = Array(b.characters)
var e = ""


for i in 0...charactersOfa.count - 1{
    
    for j in 0...characterOfb.count - 1{
        
        if !(charactersOfa.contains(characterOfb[j])){
            if !(e.contains(String(characterOfb[j]))){
                e.append(characterOfb[j])
                
            }
            
        }
        
    }
    
    if !(characterOfb.contains(charactersOfa[i])){
        if !(e.contains(String(charactersOfa[i]))){
            e.append(charactersOfa[i])
            
        }
        
    }
}


print(e.characters.count)