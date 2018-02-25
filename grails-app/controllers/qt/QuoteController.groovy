package qt

class QuoteController {

    def index() {
        redirect(action: home())
    }

    def home() {
        render "<h1>This is the action or the property of controller</h1>"
    }

    def random() {

        def allQuotes = Quote.list()
        def randomQuote

        if (allQuotes.size() > 0) {
            def randomIdx = new Random().nextInt(allQuotes.size())
            randomQuote = new Quote(author: "Anonymous",
            content: "Real Programmers Don’t eat Quiche")
        }

        [quote: randomQuote]
    }
}
