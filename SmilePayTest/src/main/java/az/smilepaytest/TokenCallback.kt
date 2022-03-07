package az.smilepaytest

interface TokenCallback {

    fun onSuccess()

    fun onFailure(error: String)
}