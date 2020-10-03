inline fun View.snack(message: String?, messageRes: Int, length: Int = Snackbar.LENGTH_LONG,color: Int? = null,colorBackground: Int? = null, f: Snackbar.() -> Unit) {
    val snack = Snackbar.make(this, message!!, length)
    val snackBarView: View = snack.view
    snack.f()
    snack.show()
    color?.let {
        snack.setActionTextColor(ContextCompat.getColor(context, color))
        snackBarView.setBackgroundColor(ContextCompat.getColor(context,colorBackground!!));
    }
}