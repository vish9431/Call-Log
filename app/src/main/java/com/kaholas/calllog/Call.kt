package com.kaholas.calllog

data class Call(val number : String, val day : String, val data: String, val time : String,
                val dur : Int, val from : String, val status : String, val recordId : String)

val calllog = listOf<Call>(
    Call("+919345628967", "Tuesday", "12 September 2023", "11:12:26", 88,
        "+919345628967", "Incoming", "000934562_(8967)20230912111226.mp3"),
    Call("8769874563", "Tuesday", "12 September 2023", "11:03:29", 125,
        "8769874563", "Outgoing", "000934562_(8967)20230912110329.mp3"),
    Call("+916206555998", "Tuesday", "12 September 2023", "09:19:35", 45,
        "+916206555998", "Incoming", "0001620655_(6443)20230912091935.mp3"),
    Call("+917844440033", "Monday", "11 September 2023", "19:45:26", 97,
        "+917844440033", "Incoming", "00784444_(5642)20230911194526.mp3"),
    Call("+919345628967", "Monday", "11 September 2023", "03:00:13", 5,
        "+919345628967", "Outgoing", "00093456289_(1324)20230911030013.mp3"),
    Call("+919345628967", "Sunday", "10 September 2023", "11:11:11", 18,
        "+919345628967", "Incoming", "00093456289_(4324)20230910111111.mp3"),
)