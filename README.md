[![Build Status](https://travis-ci.org/jomof/literate-hash.svg?branch=master)](https://travis-ci.org/jomof/literate-hash)


# Literate Hash
Creates a hash code that is human-readable and easier to remember than a 32-bit number.

        String hash = LiterateHash.of(
                "Beware the Jabberwock, my son!" +
                "The jaws that bite, the claws that catch!" +
                "Beware the Jubjub bird, and shun\n" +
                "The frumious Bandersnatch! ");
                
        Result: JediGalaxyRaisesTiger

[Download] (https://github.com/jomof/literate-hash/releases)

Or build it yourself:

    git clone https://github.com/jomof/literate-hash.git
    cd literate-hash
    ./gradlew assemble check
