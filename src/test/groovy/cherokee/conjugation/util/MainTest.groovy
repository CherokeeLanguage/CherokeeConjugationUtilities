package cherokee.conjugation.util

import cherokee.conjugation.constants.Tense
import cherokee.conjugation.stemming.DefinitionLine
import cherokee.conjugation.stemming.Stemmer

class MainTest extends GroovyTestCase {
    static def hiwoniha = new Stemmer()
    static {
        hiwoniha.habitual = new DefinitionLine(syllabary: "ᎦᏬᏂᏍᎪᎢ")
        hiwoniha.imperative = new DefinitionLine(syllabary: "ᎯᏬᏂᎯ")
        hiwoniha.infinitive = new DefinitionLine(syllabary: "ᎤᏬᏂᎯᏍᏗ")
        hiwoniha.present1st = new DefinitionLine(syllabary: "ᏥᏬᏂᎭ")
        hiwoniha.present3rd = new DefinitionLine(syllabary: "ᎦᏬᏂᎭ")
        hiwoniha.remotepast = new DefinitionLine(syllabary: "ᎤᏬᏂᏒᎢ")
    }

    void testGetStem() {
        assertEquals("ᏬᏂᏒᎢ", hiwoniha.getStem(Tense.REMOTE_PAST))
    }
}