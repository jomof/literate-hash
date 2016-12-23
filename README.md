[![Build Status](https://travis-ci.org/jomof/literate-hash.svg?branch=master)](https://travis-ci.org/jomof/literate-hash)
[![](https://jitpack.io/v/jomof/literate-hash.svg)](https://jitpack.io/#jomof/literate-hash)
[![codecov](https://codecov.io/gh/jomof/literate-hash/branch/master/graph/badge.svg)](https://codecov.io/gh/jomof/literate-hash)

# Literate Hash
Creates a hash code that is human-readable and easier to remember than a 32-bit number.

        String hash = LiterateHash.of(
                "Beware the Jabberwock, my son!" +
                "The jaws that bite, the claws that catch!" +
                "Beware the Jubjub bird, and shun" +
                "The frumious Bandersnatch! ");
                
        Result: TidyRadioThrillsLead

# Using from Gradle

    repositories {
        maven { url 'https://jitpack.io' }
    }
    
    dependencies {
        compile 'com.github.jomof:literate-hash:*'
    }

# Building the Code

    git clone https://github.com/jomof/literate-hash.git
    cd literate-hash
    ./gradlew assemble check
