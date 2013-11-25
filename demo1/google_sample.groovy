b = new Browser(baseUrl:"http://www.google.com/")

b.go()
b.$("input", name:"q") << "geb"
b.$("button", name: "btnG").click()
b.waitFor{b.title.toLowerCase().startsWith("geb")}

b.$("li.g", 0).find("a").text()
b.$("li.g").find("a")*.text()
b.$("li.g").find("a").@href
b.$("input", name:"q") << " groovy"
b.$("button", name: "btnG").click()
b.$("li.g").find("a").click()
b.quit()