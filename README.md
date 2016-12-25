[![Build Status](https://travis-ci.org/jomof/literate-hash.svg?branch=master)](https://travis-ci.org/jomof/literate-hash)
[![](https://jitpack.io/v/com.jomofisher/literate-hash.svg)](https://jitpack.io/#com.jomofisher/literate-hash)
[![codecov](https://codecov.io/gh/jomof/literate-hash/branch/master/graph/badge.svg)](https://codecov.io/gh/jomof/literate-hash)
[![license](https://img.shields.io/github/license/jomof/literate-hash.svg)](https://github.com/jomof/literate-hash/blob/master/LICENSE.txt)
[![tag](https://img.shields.io/github/tag/jomof/literate-hash.svg)](https://github.com/jomof/literate-hash/releases)

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
        compile 'com.jomofisher:literate-hash:1.0-alpha8'
    }

# Building the Code

    git clone https://github.com/jomof/literate-hash.git
    cd literate-hash
    ./gradlew assemble check
