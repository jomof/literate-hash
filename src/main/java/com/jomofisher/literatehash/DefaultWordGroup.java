package com.jomofisher.literatehash;

/**
 * Some built-in word groups.
 */
public class DefaultWordGroup {
    final static String ADJECTIVES[] = new String[]{
            "Glassy", "Transparent", "Opaque", "Shimmering", "Sparkling", "Glowing", "Shining", "Honorary",
            "Soggy", "Killer", "Showy", "Idolized", "Slippery", "Rash", "Corny", "Smelly", "Instable",
            "Gaseous", "Aqueous", "Understated", "Overstated", "Dwarf", "Lively", "Admired", "Damaged",
            "Heartfelt", "American", "Half", "Wideeyed", "Distant", "Imaginative", "Jolly", "Valuable",
            "Concerned", "WellOff", "Menacing", "Giant", "Horned", "Enlightened", "Waterlogged",
            "Deteriorating", "Unknown", "Sparse", "Mad", "Shocked", "Respectful", "Different", "Sarcastic",
            "Wasteful", "Measly", "Definite", "Exemplary", "Miniature", "Common", "Pointed", "Active",
            "Bighearted", "Acceptable", "Hidden", "Speedy", "Ashamed", "Occasional", "Tidy", "Admirable",
            "Walking", "Running", "Sprinting", "Dashing", "Crashing", "Spirited", "Spiritual", "Ancient",
            "Melting", "Boiling", "Evaporating", "Freezing", "Sublimating", "Triple", "Double", "Quadruple",
            "Quintuple", "Octo", "Former", "Latter", "Formal", "Decorated", "Hypnotic", "Drunken", "Realizing",
            "Grassy", "Sandy", "Rocky", "Gigantic", "Hilarious", "Hard", "Soft", "Curious", "Rigid",
            "Adorable", "Clean", "Elegant", "Turquoise", "Blue", "Green", "Famous", "Gifted", "Thankful",
            "Brave", "Calm", "Mysterious", "Round", "Square", "Massive", "Faint", "Melodic", "Tall",
            "Brief", "Swift", "Whispering", "Salty", "Weak", "Inspirational", "Cellar", "Better", "Best", "Early",
            "Important", "Wild", "Swamp", "Arboreal", "Jungle", "Molten", "Frozen", "Aromatic", "Zippy", "Zesty",
            "Comfortable", "Cozy", "Abstract", "Surreal", "Impressionist", "Cubist", "Fauvist", "Dadaist", "Pop",
            "Nouveau", "Aesthetic", "Real", "Concrete", "Conceptual", "Deconstructed", "Digital", "Fantastic",
            "Figurative", "Folk", "Future", "Geometric", "Gothic", "Typographic", "Lyrical", "Magical", "Maximum",
            "Minimum", "Modern", "Naive", "Primitive", "Objective", "Precision", "Psychedelic",
            "Regional", "Romantic", "Rococo", "Resonating", "Space", "Symbolic", "Street", "Supreme",
            "Penultimate", "Ultimate", "Underground", "Baroque", "Race", "Solar", "Apparent",
            "High", "Low", "Country"
    };

    final static String NOUNS[] = new String[]{
            "Honeyeater", "Dog", "Cat", "Ocean", "Submarine", "Salamander", "Tree", "Forest", "Rock",
            "Earth", "Burrito", "Guppy", "Fly", "Dowitcher", "All", "Chupacabra", "Rattlesnake", "Butterfly",
            "Monarch", "Chimney", "Chimneysweep", "Frog", "Bonobo", "Chimpanzee", "SpiderMonkey",
            "Hunter", "Teacher", "Fire", "Tower", "Lamp", "Flame", "Theory", "Love", "People", "History",
            "World", "Map", "Family", "Door", "Window", "Music", "Bird", "Fact", "Area", "Language", "Rhythm",
            "Worm", "Time", "Year", "Hand", "Night", "Day", "Story", "Chemistry", "Painting", "Cigarette",
            "Scene", "Mood", "Expression", "Foundation", "Grandfather", "Hope", "Selection", "Wine", "Passion",
            "Happiness", "Republic", "Engine", "Hotel", "Motorcycle", "Leader", "Cousin", "Flute", "Piano",
            "Beetle", "Spider", "Lion", "Snake", "Fish", "Shark", "Whale", "Ship", "Capsule", "Travel", "Train",
            "Range", "Locus", "Pentagon", "Polygon", "Sphere", "Pyramid", "Tide", "Wheel", "Tire",
            "Seat", "Rose", "Tulip", "Azalea", "Chest", "Blouse", "Tiger", "Cube", "Scorpion", "Fox", "Sandwich",
            "Taco", "Poem", "Novel", "Candle", "Sketch", "Vine", "Ceramic", "Bowl", "Plate", "Spoon",
            "Fork", "Hammock", "Cable", "Wire", "Diamond", "Ruby", "Emerald", "Comet", "Planet", "Star", "Moon",
            "Rocket", "Sled", "Table", "Couch", "Bed", "Room", "Basket", "Box", "Envelope", "Robe", "Silk",
            "Terrier", "Shepherd", "Sheep", "Cow", "Corgi", "Hill", "Lake", "Pond", "Mountain", "Plateau",
            "Grocer", "Horse", "Bicycle", "Helmet", "Turtle", "Moose", "Mine", "Cave", "Core", "Snow", "Angel",
            "Cactus", "Elephant", "Hippo", "Zippo", "Cigar", "Eagle", "Hawk", "Raptor", "Dinosaur", "Vegetable",
            "Carrot", "Celery", "Gerbil", "Rabbit", "Pig", "Mouse", "Paintbrush", "Easel", "Shoe", "Sock",
            "Wall", "Roof", "Drawer", "Straw", "Wick", "Gasoline", "Kerosene", "Blanket", "Pillow", "Musician",
            "Artist", "Poet", "Chiclet", "Physics", "Anatomy", "Astrobiology", "Biochemistry",
            "Biogeography", "Biophysics", "Neuroscience", "Biotechnology", "Botany", "Cryobiology",
            "Ecology", "Ethnobiology", "Gerontology", "Immunology", "Limnology", "Microbiology",
            "Paleontology", "Parasitology", "Physiology", "Radiobiology", "Sociobiology", "Toxicology", "Zoology",
            "Carnation", "Lily", "Thistle", "Orchid", "Sunflower", "Snapdragon", "Lavender", "Holly", "Peony",
            "Marigold", "Lilac", "Ginger", "Aster", "Bloom", "Bell", "Corn", "Wheat", "Hound", "Akita", "Malamute",
            "Spaniel", "Azawakh", "Barbet", "Basenji", "Collie", "Malinois", "Tervuren", "Picard", "Frise",
            "Bolognese", "Boxer", "Briard", "Griffon", "Chihuahua", "Dachshund", "Dalmatian", "Pinscher",
            "Setter", "Pointer", "Pyrenees", "Harrier", "Havanese", "Keeshond", "Kuvasz", "Labradoodle",
            "Mutt", "Otterhound", "Papillon", "Pug", "Puli", "Ridgeback", "Rottweiler", "Whippet", "Yorkipoo",
            "Quarterhourse", "Bovine", "Octopus", "Squid", "Dolphin", "Porpoise", "Salmon", "Sailfish",
            "Penguin", "Shellfish", "Officer", "Firefighter", "Bluetickhound", "Ambush",
            "Amethyst", "Television", "Radio", "Phone", "Burro", "Storm", "Shower", "Tornado", "Hurricane",
            "Earthquake", "Tsunami", "Bottle", "Violin", "Harp", "Guitar", "Trumpet", "Horn",
            "Clarinet", "Bassoon", "Orchestra", "Choir", "Club", "Highway", "Road", "Alley", "Skyscraper",
            "Galaxy", "System", "Lacquer", "Shellac", "Glue", "Tape", "Baseball", "Football", "Tumbler",
            "Hydrant", "Conduit", "Transistor", "Cheater", "Drifter", "Astronaut", "Cosmonaut", "Reality",
            "Fantasy", "Elf", "Ork", "Wizard", "Fighter", "Intelligence", "Dexterity", "Strength", "Charisma",
            "Dungeon", "Treasure", "Crack", "River", "Tributary"
    };

    final static String VERBS[] = new String[]{
            "Runs", "Walks", "Speaks", "Waits", "Learns", "Opens", "Closes", "Calls", "Asks", "Becomes", "Helps",
            "Plays", "Moves", "Lives", "Writes", "Stands", "Meets", "Continues", "Changes", "Creates",
            "Grows", "Remembers", "Sends", "Builds", "Reaches", "Raises", "Hopes", "Supports", "Catches",
            "Delights", "Entrances", "Improves", "Captures", "Befriends", "Elevates", "Erupts", "Lowers",
            "Extends", "Heightens", "Keeps", "Organizes", "Predicts", "Embiggens", "Waltzes", "Tunes", "Carries",
            "Reads", "Drives", "Teleports", "Throws", "Hammers", "Drills", "Thrills", "Kills", "Wills", "Bills",
            "Mills", "Tills", "Fills", "Trills", "Chills"
    };

}
