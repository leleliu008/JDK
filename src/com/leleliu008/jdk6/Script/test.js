var array = [12,13,15,16,17,18];  
for (var i = 0; i < array.length; i++) {  
	println("index:" + i + ",value:" + array[i]);  
}  

var object = {};  
object.a = 'i am a';  
object.b = 'i am b';  
for (var p in object) {  
	println("Attribute:" + p + ",value:" + object[p]);  
}  
