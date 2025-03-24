import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SportsStatsController {

    @GetMapping("/statistics")
    fun getStatistics(): String {
        // Add your sports statistics here
        val data = mutableListOf<String>()
        data.add("Player 1: Goals:1, Assists:2, Points:3")
        data.add("Player 2: Goals:4, Assists:5, Points:6")
        return "Sports Statistics"
    }
}
