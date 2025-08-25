def call() { return this }

void success(String msg) {
    echo "✅ SUCCESS: ${msg}"
}

void failure(String msg) {
    echo "❌ FAILURE: ${msg}"
}