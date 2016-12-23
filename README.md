[![Build Status](https://travis-ci.org/jomof/literate-hash.svg?branch=master)](https://travis-ci.org/jomof/literate-hash)
[![](https://jitpack.io/v/jomof/literate-hash.svg)](https://jitpack.io/#jomof/literate-hash)
[![Coverage Status](https://coveralls.io/repos/github/jomof/literate-hash/badge.svg?branch=master)](https://coveralls.io/github/jomof/literate-hash?branch=master)

# Literate Hash
Creates a hash code that is human-readable and easier to remember than a 32-bit number.

        String hash = LiterateHash.of(
                "Beware the Jabberwock, my son!" +
                "The jaws that bite, the claws that catch!" +
                "Beware the Jubjub bird, and shun" +
                "The frumious Bandersnatch! ");
                
        Result: TidyRadioThrillsLead


# Building the Code

    git clone https://github.com/jomof/literate-hash.git
    cd literate-hash
    ./gradlew assemble check
