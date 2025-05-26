package misc

fun main(){

    var hashMap : HashMap<String, String> = HashMap<String, String>()

    hashMap.put("TextInputLayout","TextInputLayout")
    hashMap.put("TextInputEditText","TextInputEditText")
    hashMap.put("RadioGroup","RadioGroup")
    hashMap.put("AppCompatAutoCompleteTextView","AppCompatAutoCompleteTextView")
    hashMap.put("MaterialRadioButton","MaterialRadioButton")
    hashMap.put("Toolbar","Toolbar")
    hashMap.put("LinearLayout","LinearLayout")
    hashMap.put("ImageView","ImageView")
    hashMap.put("TextView","TextView")
    hashMap.put("ScrollView","ScrollView")
    hashMap.put("MapView","MapView")
    hashMap.put("view","view")
    hashMap.put("Button","Button")
    hashMap.put("AutoCompleteTextView","AutoCompleteTextView")
    hashMap.put("RecyclerView","RecyclerView")
    hashMap.put("CollapsingToolbarLayout","CollapsingToolbarLayout")
    hashMap.put("FrameLayout","FrameLayout")
    hashMap.put("ViewPager","ViewPager")
    hashMap.put("TabLayout","TabLayout")
    hashMap.put("DrawerLayout","DrawerLayout")
    hashMap.put("CardView","CardView")
    hashMap.put("MaterialCardView","MaterialCardView")
    hashMap.put("RelativeLayout","RelativeLayout")

    val validViews = arrayListOf<String>("TextInputLayout","TextInputEditText",
        "RadioGroup","AppCompatAutoCompleteTextView","MaterialRadioButton",
        "Toolbar","LinearLayout","ImageView","TextView",
        "ScrollView","MapView","view","Button","AutoCompleteTextView","RecyclerView","CollapsingToolbarLayout")


    generateVariable("tv_date",hashMap["TextView"].toString())
    generateVariable("txtTitleReport",hashMap["TextView"].toString())

    generateId2("recyclerView",hashMap["view"].toString())
    generateId2("txtTitleReport",hashMap["view"].toString())

}

fun generateId(param: String,view : String) {
    println("$param = $view.findViewById(R.id.$param)")
}

fun generateId2(param: String,view : String) {
    println("$param = findViewById(R.id.$param)")
}




fun generateVariable(param: String, view: String) {
    println("private lateinit var $param : $view")
}
