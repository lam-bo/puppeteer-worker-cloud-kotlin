package com.demo

@JsName("mainHandler")
fun handle(request: Request, context: Map<String, Any>, callback: (err: String?, result: dynamic) -> Unit) {
    callback(null, "Hello world!")
}
