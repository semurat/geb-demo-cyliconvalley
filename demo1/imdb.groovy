b = new Browser()
b.baseUrl="http://imdb.com"
b.go()
b.$("#navbar-query")<< "Blade Runner"
b.$("#navbar-submit-button").click()
b.waitFor{b.title=="Find - IMDb"}
b.$(".findList", 0).find("a")*.text()
b.$(".findList", 0).find("a", text:"Blade Runner").click()
assert b.$(".star-box-giga-star").text() =="8,2"
b.$("table.cast_list td.itemprop a")[0..3]*.text()