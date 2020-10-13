package chapter2

data class Country(
        val name: String,
        val continent: String,
        val population: Int
)

class CountryApp {
    fun filterCountries(countries: List<Country>,
                        test: (Country) -> Boolean): List<Country> {
        val res = mutableListOf<Country>()
        for (c in countries) {
            if (test(c)) {
                res.add(c)
            }
        }
        return res
    }
}

class CountryTest {
    fun isBigEuropeanCountry(country: Country): Boolean {
        return country.continent == "EU" && country.population > 10_000
    }
}


fun main(args: Array<String>) {
    val countryApp = CountryApp()
    val countryTest = CountryTest()
    val countries = ArrayList<Country>()
    countries.add(Country("Test", "EU", 100001))
    countries.add(Country("Test2", "EU", 1))
    countries.add(Country("Test3", "JP", 1))
    println(countries)
    val ans = countryApp.filterCountries(countries, countryTest::isBigEuropeanCountry)
    println(ans)
}