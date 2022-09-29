import SwiftUI
import common

struct ContentView: View {
    var body: some View {
        VStack {
            Image(systemName: "globe")
                .imageScale(.large)
                .foregroundColor(.accentColor)
            Text(Greeting().greeting())
        }
        .padding()
    }
}
