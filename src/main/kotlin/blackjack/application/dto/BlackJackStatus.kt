package blackjack.application.dto

import blackjack.domain.card.Card
import blackjack.domain.participant.vo.Name

data class BlackJackStatus(
    val name: Name,
    val cards: List<Card>
)

data class BlackJackStatuses(
    val statuses: List<BlackJackStatus>
)