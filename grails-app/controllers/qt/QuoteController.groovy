package qt

class QuoteController {

    def index() {
        redirect(action: home())
    }

    def home() {
        render "<h1>This is the action or the property of controller</h1>"
    }

    def random() {
        def staticAuthor = "Anonymous"
        def staticQuote = "Real programmers bla bla bla"
        [author: staticAuthor, content: staticQuote]

    }
}
