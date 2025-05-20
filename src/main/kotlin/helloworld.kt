import java.security.SecureRandom
import javax.crypto.Cipher
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.SecretKeySpec

fun main(){
    //main() is a function denoted by the keyword fun()

  //  println("Hello World !!")
    //println is also a function


}

fun conversion(text:String, key:ByteArray){

    val data: ByteArray = text.toByteArray(Charsets.UTF_8)

    encrypt(data,key)
}


fun encrypt(data: ByteArray?, secretKey: ByteArray?): ByteArray
{
    requireNotNull(data) { "Data must not be null" }
    require(secretKey?.size == 32) { "Key must be 256 bits (32 bytes)" }

//    val iv = ByteArray(12) // 96-bit IV for GCM
//    SecureRandom().nextBytes(iv)

    val iv = SecureRandom().generateSeed(12)
    val cipher = Cipher.getInstance("AES/GCM/NoPadding")
    val keySpec = SecretKeySpec(secretKey, "AES")
    val gcmSpec = GCMParameterSpec(128, iv) // 128-bit auth tag

    cipher.init(Cipher.ENCRYPT_MODE, keySpec, gcmSpec)
    val encrypted = cipher.doFinal(data)

   println(iv + encrypted)

    return iv + encrypted
}


//Here the code (the main function) may not reside inside a class like Java. In java all methods reside inside a class.
// Java methods equivalent to Kotlin functions loosely.

