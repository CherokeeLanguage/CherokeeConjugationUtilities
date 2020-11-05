package cherokee.conjugation.verbal

import cherokee.conjugation.constants.VerbPrefixTableObject
import cherokee.conjugation.constants.VerbPrefixTableSubject

/**
 * Created by torr on 8/17/2015.
 */
class VerbCompoundPrefixes {
    static def prefixes = [:]
    static final def SG1SG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.SG1)
    static final def SG1SG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.SG2)
    static final def SG1SG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.SG3AN)
    static final def SG1SG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.SG3IN)
    static final def SG1DL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def SG1DL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def SG1PL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def SG1PL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def SG1DL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.DL2)
    static final def SG1PL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.PL2)
    static final def SG1PL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.PL3AN)
    static final def SG1PL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.PL3IN)
    static final def SG2SG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.SG1)
    static final def SG2SG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.SG2)
    static final def SG2SG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.SG3AN)
    static final def SG2SG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.SG3IN)
    static final def SG2DL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def SG2DL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def SG2PL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def SG2PL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def SG2DL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.DL2)
    static final def SG2PL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.PL2)
    static final def SG2PL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.PL3AN)
    static final def SG2PL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.PL3IN)
    static final def SG3SG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.SG1)
    static final def SG3SG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.SG2)
    static final def SG3SG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.SG3AN)
    static final def SG3SG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.SG3IN)
    static final def SG3DL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def SG3DL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def SG3PL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def SG3PL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def SG3DL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.DL2)
    static final def SG3PL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.PL2)
    static final def SG3PL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.PL3AN)
    static final def SG3PL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.PL3IN)
    static final def DL1INCLSG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.SG1)
    static final def DL1INCLSG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.SG2)
    static final def DL1INCLSG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.SG3AN)
    static final def DL1INCLSG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.SG3IN)
    static final def DL1INCLDL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def DL1INCLDL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def DL1INCLPL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def DL1INCLPL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def DL1INCLDL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.DL2)
    static final def DL1INCLPL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.PL2)
    static final def DL1INCLPL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.PL3AN)
    static final def DL1INCLPL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.PL3IN)
    static final def DL1EXCLSG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.SG1)
    static final def DL1EXCLSG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.SG2)
    static final def DL1EXCLSG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.SG3AN)
    static final def DL1EXCLSG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.SG3IN)
    static final def DL1EXCLDL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def DL1EXCLDL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def DL1EXCLPL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def DL1EXCLPL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def DL1EXCLDL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.DL2)
    static final def DL1EXCLPL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.PL2)
    static final def DL1EXCLPL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.PL3AN)
    static final def DL1EXCLPL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.PL3IN)
    static final def PL1INCLSG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.SG1)
    static final def PL1INCLSG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.SG2)
    static final def PL1INCLSG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.SG3AN)
    static final def PL1INCLSG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.SG3IN)
    static final def PL1INCLDL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def PL1INCLDL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def PL1INCLPL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def PL1INCLPL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def PL1INCLDL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.DL2)
    static final def PL1INCLPL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.PL2)
    static final def PL1INCLPL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.PL3AN)
    static final def PL1INCLPL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.PL3IN)
    static final def PL1EXCLSG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.SG1)
    static final def PL1EXCLSG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.SG2)
    static final def PL1EXCLSG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.SG3AN)
    static final def PL1EXCLSG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.SG3IN)
    static final def PL1EXCLDL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def PL1EXCLDL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def PL1EXCLPL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def PL1EXCLPL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def PL1EXCLDL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.DL2)
    static final def PL1EXCLPL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.PL2)
    static final def PL1EXCLPL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.PL3AN)
    static final def PL1EXCLPL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.PL3IN)
    static final def DL2SG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.SG1)
    static final def DL2SG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.SG2)
    static final def DL2SG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.SG3AN)
    static final def DL2SG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.SG3IN)
    static final def DL2DL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def DL2DL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def DL2PL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def DL2PL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def DL2DL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.DL2)
    static final def DL2PL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.PL2)
    static final def DL2PL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.PL3AN)
    static final def DL2PL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL2, prefix2: VerbPrefixTableObject.PL3IN)
    static final def PL2SG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.SG1)
    static final def PL2SG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.SG2)
    static final def PL2SG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.SG3AN)
    static final def PL2SG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.SG3IN)
    static final def PL2DL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def PL2DL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def PL2PL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def PL2PL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def PL2DL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.DL2)
    static final def PL2PL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.PL2)
    static final def PL2PL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.PL3AN)
    static final def PL2PL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL2, prefix2: VerbPrefixTableObject.PL3IN)
    static final def PL3SG1 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.SG1)
    static final def PL3SG2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.SG2)
    static final def PL3SG3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.SG3AN)
    static final def PL3SG3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.SG3IN)
    static final def PL3DL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.DL1INCL)
    static final def PL3DL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.DL1EXCL)
    static final def PL3PL1INCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.PL1INCL)
    static final def PL3PL1EXCL = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.PL1EXCL)
    static final def PL3DL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.DL2)
    static final def PL3PL2 = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.PL2)
    static final def PL3PL3AN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.PL3AN)
    static final def PL3PL3IN = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.PL3IN)

    static final def SG1SG3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.SG3IN)
    static final def SG2SG3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.SG3IN)
    static final def SG3SG3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.SG3IN)
    static final def DL1INCLSG3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.SG3IN)
    static final def PL1INCLSG3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.SG3IN)
    static final def DL11EXCSG3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.SG3IN)
    static final def PL1EXCLSG3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.SG3IN)
    static final def PL3SG3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.SG3IN)

    static final def SG1PL3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG1, prefix2: VerbPrefixTableObject.PL3IN)
    static final def SG2PL3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG2, prefix2: VerbPrefixTableObject.PL3IN)
    static final def SG3PL3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.SG3, prefix2: VerbPrefixTableObject.PL3IN)
    static final def DL1INCLPL3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1INCL, prefix2: VerbPrefixTableObject.PL3IN)
    static final def PL1INCLPL3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1INCL, prefix2: VerbPrefixTableObject.PL3IN)
    static final def DL1EXCLPL3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.DL1EXCL, prefix2: VerbPrefixTableObject.PL3IN)
    static final def PL1EXCLPL3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL1EXCL, prefix2: VerbPrefixTableObject.PL3IN)
    static final def PL3PL3INB = new VerbCompoundPrefix(prefix1: VerbPrefixTableSubject.PL3, prefix2: VerbPrefixTableObject.PL3IN)

    static {
        prefixes.put("SG1SG1", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG1SG2", new Prefix(preVowel: 'Ꭼy', preConsonant: 'Ꭼ', other: ''))
        prefixes.put("SG1SG3AN", new Prefix(preVowel: 'Ꮵy', preConsonant: 'Ꮵ', other: ''))
        prefixes.put("SG1SG3IN", new Prefix(preVowel: 'G', preConsonant: 'Ꮵ', other: ''))
        prefixes.put("SG1DL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG1DL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG1PL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG1PL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG1DL2", new Prefix(preVowel: 'ᏍᏛy', preConsonant: 'ᏍᏛ', other: ''))
        prefixes.put("SG1PL2", new Prefix(preVowel: 'ᎢᏨy', preConsonant: 'ᎢᏨ', other: ''))
        prefixes.put("SG1PL3AN", new Prefix(preVowel: 'ᎦᏥy', preConsonant: 'ᎦᏥ', other: ''))
        prefixes.put("SG1PL3IN", new Prefix(preVowel: 'Ꮥg', preConsonant: 'ᏕᏥ', other: ''))

        prefixes.put("SG2SG1", new Prefix(preVowel: 'Ꮝgw', preConsonant: 'ᏍᎩ', other: ''))
        prefixes.put("SG2SG2", new Prefix(preVowel: '', preConsonant: '', other: ''))
        prefixes.put("SG2SG3AN", new Prefix(preVowel: 'Ꭿy', preConsonant: 'Ꭿ', other: ''))
        prefixes.put("SG2SG3IN", new Prefix(preVowel: 'h', preConsonant: 'Ꭿ', other: ''))
        prefixes.put("SG2DL1INCL", new Prefix(preVowel: 'ᏍᎩn', preConsonant: 'ᏍᎩᏂ', other: ''))
        prefixes.put("SG2DL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG2PL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG2PL1EXCL", new Prefix(preVowel: 'ᎢᏍᎩy', preConsonant: 'ᎢᏍᎩ', other: ''))
        prefixes.put("SG2DL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG2PL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("SG2PL3AN", new Prefix(preVowel: 'ᎦᎯy', preConsonant: 'ᎦᎯ', other: ''))
        prefixes.put("SG2PL3IN", new Prefix(preVowel: 'Ꮥh', preConsonant: 'ᏕᎯ', other: ''))

        prefixes.put("SG3SG1", new Prefix(preVowel: 'Ꭰgw', preConsonant: 'ᎠᎩ', other: ''))
        prefixes.put("SG3SG2", new Prefix(preVowel: 'j', preConsonant: 'Ꮵ', other: ''))
        prefixes.put("SG3SG3AN", new Prefix(preVowel: 'G', preConsonant: 'Ꭶ', other: 'a'))
        prefixes.put("SG3SG3IN", new Prefix(preVowel: 'G', preConsonant: 'Ꭶ', other: 'a'))
        prefixes.put("SG3DL1INCL", new Prefix(preVowel: 'Ꭹn', preConsonant: 'ᎩᏂ', other: ''))
        prefixes.put("SG3DL1EXCL", new Prefix(preVowel: 'ᎣᎩn', preConsonant: 'ᎣᎩᏂ', other: ''))
        prefixes.put("SG3PL1INCL", new Prefix(preVowel: 'Ꭲg', preConsonant: 'ᎢᎩ', other: ''))
        prefixes.put("SG3PL1EXCL", new Prefix(preVowel: 'Ꭳg', preConsonant: 'ᎣᎩ', other: ''))
        prefixes.put("SG3DL2", new Prefix(preVowel: 'Ꮝd', preConsonant: 'ᏍᏗ', other: ''))
        prefixes.put("SG3PL2", new Prefix(preVowel: 'Ꭲj', preConsonant: 'ᎢᏥ', other: ''))
        prefixes.put("SG3PL3AN", new Prefix(preVowel: 'Ꮥg', preConsonant: 'ᏕᎩ', other: ''))
//        prefixes.put("SG3PL3AN", new Prefix(preVowel: 'Ꮣg', preConsonant: 'ᏓᎪ', other: ''))
        prefixes.put("SG3PL3IN", new Prefix(preVowel: 'Ꮥg', preConsonant: 'ᏕᎩ', other: ''))

        prefixes.put("DL1INCLSG1", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1INCLSG2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1INCLSG3AN", new Prefix(preVowel: 'Ꭱn', preConsonant: 'ᎡᏂ', other: ''))
        prefixes.put("DL1INCLSG3IN", new Prefix(preVowel: 'Ꭲn', preConsonant: 'ᎢᏂ', other: ''))
        prefixes.put("DL1INCLDL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1INCLDL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1INCLPL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1INCLPL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1INCLDL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1INCLPL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1INCLPL3AN", new Prefix(preVowel: 'Ꭸn', preConsonant: 'ᎨᏂ', other: ''))
        prefixes.put("DL1INCLPL3IN", new Prefix(preVowel: 'Ꮥn', preConsonant: 'ᏕᏂ', other: ''))

        prefixes.put("DL1EXCLSG1", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1EXCLSG2", new Prefix(preVowel: 'ᏍᏛy', preConsonant: 'ᏍᏛ', other: ''))
        prefixes.put("DL1EXCLSG3AN", new Prefix(preVowel: 'ᎣᏍd', preConsonant: 'ᎣᏍᏗ', other: ''))
        prefixes.put("DL1EXCLSG3IN", new Prefix(preVowel: 'ᎣᏍd', preConsonant: 'ᎣᏍᏗ', other: ''))
        prefixes.put("DL1EXCLDL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1EXCLDL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1EXCLPL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1EXCLPL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL1EXCLDL2", new Prefix(preVowel: 'ᏍᏛy', preConsonant: 'ᏍᏛ', other: ''))
        prefixes.put("DL1EXCLPL2", new Prefix(preVowel: 'Ꭲj', preConsonant: 'ᎢᏥ', other: ''))
        prefixes.put("DL1EXCLPL3AN", new Prefix(preVowel: 'ᎪᏍd', preConsonant: 'ᎪᏍᏗ', other: ''))
        prefixes.put("DL1EXCLPL3IN", new Prefix(preVowel: 'ᏙᏍd', preConsonant: 'ᏙᏍᏗ', other: ''))

        prefixes.put("PL1INCLSG1", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1INCLSG2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1INCLSG3AN", new Prefix(preVowel: 'Ꭱd', preConsonant: 'ᎡᏗ', other: ''))
        prefixes.put("PL1INCLSG3IN", new Prefix(preVowel: 'Ꭲd', preConsonant: 'ᎢᏗ', other: ''))
        prefixes.put("PL1INCLDL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1INCLDL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1INCLPL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1INCLPL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1INCLDL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1INCLPL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1INCLPL3AN", new Prefix(preVowel: 'Ꭸd', preConsonant: 'ᎨᏗ', other: ''))
        prefixes.put("PL1INCLPL3IN", new Prefix(preVowel: 'Ꮥd', preConsonant: 'ᏕᏗ', other: ''))

        prefixes.put("PL1EXCLSG1", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1EXCLSG2", new Prefix(preVowel: 'ᎢᏨy', preConsonant: 'ᎢᏨ', other: ''))
        prefixes.put("PL1EXCLSG3AN", new Prefix(preVowel: 'Ꭳj', preConsonant: 'ᎣᏥ', other: ''))
        prefixes.put("PL1EXCLSG3IN", new Prefix(preVowel: 'Ꭳj', preConsonant: 'ᎣᏥ', other: ''))
        prefixes.put("PL1EXCLDL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1EXCLDL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1EXCLPL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1EXCLPL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1EXCLDL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1EXCLPL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL1EXCLPL3AN", new Prefix(preVowel: 'Ꭺj', preConsonant: 'ᎪᏥ', other: ''))
        prefixes.put("PL1EXCLPL3IN", new Prefix(preVowel: 'Ꮩj', preConsonant: 'ᏙᏥ', other: ''))

        prefixes.put("DL2SG1", new Prefix(preVowel: 'ᏍᎩn', preConsonant: 'ᏍᎩᏂ', other: ''))
        prefixes.put("DL2SG2", new Prefix(preVowel: '', preConsonant: '', other: ''))
        prefixes.put("DL2SG3AN", new Prefix(preVowel: 'ᎡᏍd', preConsonant: 'ᎡᏍᏗ', other: ''))
        prefixes.put("DL2SG3IN", new Prefix(preVowel: 'Ꮝd', preConsonant: 'ᏍᏗ', other: ''))
        prefixes.put("DL2DL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))
        prefixes.put("DL2DL1EXCL", new Prefix(preVowel: 'ᏍᎩn', preConsonant: 'ᏍᎩᏂ', other: ''))
        prefixes.put("DL2PL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))
        prefixes.put("DL2PL1EXCL", new Prefix(preVowel: 'ᎢᏍᎩy', preConsonant: 'ᎢᏍᎩ', other: ''))
        prefixes.put("DL2DL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL2PL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("DL2PL3AN", new Prefix(preVowel: 'ᎨᏍd', preConsonant: 'ᎨᏍᏗ', other: ''))
        prefixes.put("DL2PL3IN", new Prefix(preVowel: 'ᏕᏍd', preConsonant: 'ᏕᏍᏗ', other: ''))

        prefixes.put("PL2SG1", new Prefix(preVowel: 'ᎢᏍᎩy', preConsonant: 'ᎢᏍᎩ', other: ''))
        prefixes.put("PL2SG2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL2SG3AN", new Prefix(preVowel: 'Ꭱj', preConsonant: 'ᎡᏥ', other: ''))
        prefixes.put("PL2SG3IN", new Prefix(preVowel: 'Ꭲj', preConsonant: 'ᎢᏥ', other: ''))
        prefixes.put("PL2DL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL2DL1EXCL", new Prefix(preVowel: 'ᎢᏍᎩy', preConsonant: 'ᎢᏍᎩ', other: ''))
        prefixes.put("PL2PL1INCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL2PL1EXCL", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL2DL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL2PL2", new Prefix(preVowel: '', preConsonant: '', other: ''))//blank
        prefixes.put("PL2PL3AN", new Prefix(preVowel: 'Ꭸj', preConsonant: 'ᎨᏥ', other: ''))
        prefixes.put("PL2PL3IN", new Prefix(preVowel: 'Ꮥj', preConsonant: 'ᏕᏥ', other: ''))

        prefixes.put("PL3SG1", new Prefix(preVowel: 'Ꭼgw', preConsonant: 'ᎬᎩ', other: ''))
        prefixes.put("PL3SG2", new Prefix(preVowel: 'Ꭸj', preConsonant: 'ᎨᏥ', other: ''))
        prefixes.put("PL3SG3AN", new Prefix(preVowel: 'Ꭰn', preConsonant: 'ᎠᏂ', other: ''))
        prefixes.put("PL3SG3IN", new Prefix(preVowel: 'Ꭰn', preConsonant: 'ᎠᏂ', other: ''))
        prefixes.put("PL3DL1INCL", new Prefix(preVowel: 'ᎨᎩn', preConsonant: 'ᎨᎩᏂ', other: ''))
        prefixes.put("PL3DL1EXCL", new Prefix(preVowel: 'ᎪᎩn', preConsonant: 'ᎪᎩᏂ', other: ''))
        prefixes.put("PL3PL1INCL", new Prefix(preVowel: 'Ꭸg', preConsonant: 'ᎨᎩ', other: ''))
        prefixes.put("PL3PL1EXCL", new Prefix(preVowel: 'Ꭺg', preConsonant: 'ᎪᎩ', other: ''))
        prefixes.put("PL3DL2", new Prefix(preVowel: 'ᎨᏍd', preConsonant: 'ᎨᏍᏗ', other: ''))
        prefixes.put("PL3PL2", new Prefix(preVowel: 'Ꭸj', preConsonant: 'ᎨᏥ', other: ''))
//        prefixes.put("PL3PL3AN", new Prefix(preVowel: 'Ꭰn', preConsonant: 'ᎠᏂ', other: ''))
//        prefixes.put("PL3PL3IN", new Prefix(preVowel: 'Ꭰn', preConsonant: 'ᎠᏂ', other: ''))
        prefixes.put("PL3PL3AN", new Prefix(preVowel: 'Ꮣn', preConsonant: 'ᏓᏂ', other: ''))
        prefixes.put("PL3PL3IN", new Prefix(preVowel: 'Ꮣn', preConsonant: 'ᏓᏂ', other: ''))

        prefixes.put("SG1SG3INB", new Prefix(preVowel: 'Ꭰgw', preConsonant: 'ᎠᎩ', other: ''))
        prefixes.put("SG2SG3INB", new Prefix(preVowel: 'j', preConsonant: 'Ꮳ', other: ''))
        prefixes.put("SG3SG3INB", new Prefix(preVowel: 'Ꭴw', preConsonant: 'Ꭴ', other: ''))
        prefixes.put("DL1INCLSG3INB", new Prefix(preVowel: 'Ꭹn', preConsonant: 'ᎩᏂ', other: ''))
        prefixes.put("PL1INCLSG3INB", new Prefix(preVowel: 'Ꭲg', preConsonant: 'ᎢᎩ', other: ''))
        prefixes.put("DL1EXCLSG3INB", new Prefix(preVowel: 'ᎣᎩn', preConsonant: 'ᎣᎩᏂ', other: ''))
        prefixes.put("PL1EXCLSG3INB", new Prefix(preVowel: 'Ꭳg', preConsonant: 'ᎣᎩ', other: ''))
        prefixes.put("PL3SG3INB", new Prefix(preVowel: 'Ꭴn', preConsonant: 'ᎤᏂ', other: ''))

        prefixes.put("SG1PL3INB", new Prefix(preVowel: 'Ꮣgw', preConsonant: 'ᏓᎩ', other: ''))
        prefixes.put("SG2PL3INB", new Prefix(preVowel: 'Ꮪj', preConsonant: 'ᏕᏣ', other: ''))
        prefixes.put("SG3PL3INB", new Prefix(preVowel: 'Ꮪw', preConsonant: 'Ꮪ', other: ''))
        prefixes.put("DL1INCLPL3INB", new Prefix(preVowel: 'ᏚᎩn', preConsonant: 'ᏕᎩᏂ', other: ''))
        prefixes.put("PL1INCLPL3INB", new Prefix(preVowel: 'Ꮪg', preConsonant: 'ᏚᎩ', other: ''))
        prefixes.put("DL1EXCLPL3INB", new Prefix(preVowel: 'ᏙᎩn', preConsonant: 'ᏙᎩᏂ', other: ''))
        prefixes.put("PL1EXCLPL3INB", new Prefix(preVowel: 'Ꮩg', preConsonant: 'ᏙᎩ', other: ''))
        prefixes.put("PL3PL3INB", new Prefix(preVowel: 'Ꮪn', preConsonant: 'ᏚᏂ', other: ''))
    }
}