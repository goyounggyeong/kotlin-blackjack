package resume.builder

import resume.model.Language
import resume.model.Languages

class LanguagesBuilder {
    private val languages = mutableListOf<Language>()

    infix fun String.level(level: Int) {
        languages.add(Language(this, level))
    }

    fun build(): Languages {
        return Languages(languages)
    }
}