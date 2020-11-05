package cherokee.conjugation.util

import cherokee.conjugation.constants.Tense
import cherokee.conjugation.stemming.DefinitionLine
import cherokee.conjugation.stemming.Stemmer
import cherokee.conjugation.verbal.Verb
import cherokee.conjugation.verbal.VerbFactory

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
        Verb v = VerbFactory.createVerb(hiwoniha, Tense.REMOTE_PAST)
        Verb v1 = VerbFactory.createVerb(hiwoniha, Tense.PRESENT)

        println v.verbRootLatinPhonetic + v.verbRootSuffixLatinPhonetic + v.finalSuffix.getTrueValue()
        println v1.verbRootLatinPhonetic + v1.verbRootSuffixLatinPhonetic + v1.finalSuffix.getTrueValue()
    }
}