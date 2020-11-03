package cherokee.conjugation.util


class StemEntry {
    String syllabary = ""
    StemType stemtype = StemType.OTHER

    StemEntry(String syllabary, StemType stemType) {
        this.syllabary = syllabary
        this.stemtype = stemType
    }

    StemEntry(StemEntry entry) {
        this.syllabary = entry.syllabary
        this.stemtype = entry.stemtype
    }

}