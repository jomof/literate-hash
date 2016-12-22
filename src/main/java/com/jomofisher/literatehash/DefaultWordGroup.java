package com.jomofisher.literatehash;

/**
 * Some built-in word groups.
 */
public class DefaultWordGroup {

    final static String ADJECTIVE_CODE = "{Adj}";
    final static String ADJECTIVES[] = new String[]{
            "Active", "Admired", "Almond", "Ancient", "Anise", "Apple", "Apricot", "Aqueous", "Ashamed", "Atomic",
            "Bacon", "Baroque", "Beaver", "Best", "Better", "Bitter", "Black", "Blue", "Blush", "Boiling", "Bourbon",
            "Brave", "Brief", "Brown", "Burnt", "Butter", "Calm", "Canary", "Candy", "Caramel", "Cellar", "Cerise",
            "Cherry", "Clean", "Coconut", "Coffee", "Cola", "Common", "Copper", "Corny", "Country", "Cozy", "Cubist",
            "Curious", "Dadaist", "Damaged", "Dashing", "Denim", "Digital", "Distant", "Double", "Drunken", "Dwarf",
            "Early", "Eating", "Eggnog", "Elegant", "Faint", "Famous", "Fauvist", "Fern", "Fishing", "Flying",
            "Foaming", "Folding", "Folk", "Formal", "Former", "Frozen", "Fuchsia", "Future", "Gaseous", "Giant",
            "Gifted", "Glassy", "Glowing", "Gold", "Gothic", "Grape", "Grassy", "Gray", "Green", "Growing", "Half",
            "Hard", "Hidden", "High", "Honey", "Hoping", "Hopping", "Horned", "Hushing", "Indigo", "Jedi", "Jolly",
            "Jungle", "Keeping", "Killer", "Kiwi", "Laser", "Latter", "Lemon", "Lime", "Lively", "Low", "Lumping",
            "Luxury", "Lyrical", "Mad", "Magenta", "Magical", "Manatee", "Mango", "Maple", "Maroon", "Massive",
            "Maximum", "Meadow", "Measly", "Melodic", "Melon", "Melting", "Minimum", "Mint", "Mocha", "Modern",
            "Molten", "Naive", "Naval", "Nutmeg", "Opaque", "Orange", "Outer", "Pacific", "Padded", "Papaya", "Peach",
            "Peanut", "Pear", "Pecan", "Plum", "Pointed", "Pop", "Port", "Pumpkin", "Punch", "Quinine", "Race",
            "Raising", "Rash", "Real", "Red", "Reed", "Rigid", "Rocky", "Rococo", "Round", "Routing", "Rum", "Running",
            "Rushing", "Salty", "Sandy", "Scarlet", "Sending", "Sepia", "Shadow", "Shining", "Shocked", "Showy",
            "Sienna", "Silver", "Ski", "SkyBlue", "Slender", "Smelly", "Smoke", "Soft", "Soggy", "Solar", "Sour",
            "Space", "Sparse", "Speed", "Speedy", "Spice", "Square", "Street", "Sub", "SunGlow", "Super", "Supreme",
            "Surf", "Surreal", "Swamp", "Sweet", "Talking", "Tall", "Tan", "Tart", "Tequila", "Tidy", "Toasted",
            "Toffee", "Tonic", "Triple", "Tuning", "Unknown", "Vanilla", "Violet", "Walking", "Weak", "White", "Wild",
            "Yellow", "Zesty", "Zippy",

    };

    final static String SINGULAR_PRONOUN_CODE = "{SingularPronoun}";
    final static String SINGULAR_PRONOUNS[] = new String[]{"He", "She", "It"};

    final static String SINGULAR_NOUN_CODE = "{SingularNoun}";
    final static String SINGULAR_NOUNS[] = new String[]{
            "Akita", "All", "Alley", "Ambush", "Anatomy", "Angel", "Area", "Argon", "Arsenic", "Artist", "Aster",
            "Azalea", "Banana", "Barge", "Basalt", "Basket", "Bass", "Bassoon", "Bed", "Beetle", "Bell", "Bicycle",
            "Bird", "Bismuth", "Blanket", "Bloom", "Blouse", "Boron", "Botany", "Bottle", "Bovine", "Bowl", "Box",
            "Boxer", "Bromine", "Burrito", "Burro", "Cabin", "Cable", "Cactus", "Cadmium", "Calcium", "Candle",
            "Canoe", "Capsule", "Carbon", "Carrier", "Carrot", "Cat", "Cave", "Celery", "Ceramic", "Cesium", "Cheater",
            "Chest", "Child", "Chimney", "Choir", "Cigar", "Club", "Cobalt", "Comet", "Conduit", "Console", "Coracle",
            "Core", "Corgi", "Corn", "Couch", "Cousin", "Cow", "Crack", "Craft", "Cube", "Cutter", "Day", "Dhow",
            "Diamond", "Dinghy", "Dog", "Dolphin", "Door", "Dory", "Drawer", "Drifter", "Dugout", "Dungeon", "Durham",
            "Eagle", "Earth", "Easel", "Ecology", "Elf", "Emerald", "Engine", "Express", "Fact", "Family", "Fantasy",
            "Fermium", "Ferry", "Fighter", "Fire", "Fish", "Flame", "Float", "Flute", "Fly", "Force", "Forest", "Fork",
            "Fox", "Frog", "Galaxy", "Gallium", "Garbage", "Gerbil", "Ginger", "Glue", "Gondola", "Granite", "Grocer",
            "Guitar", "Guppy", "Hammock", "Hand", "Harp", "Harrier", "Hawk", "Helium", "Helmet", "Highway", "Hill",
            "Hippo", "History", "Holly", "Hope", "Horn", "Horse", "Hotel", "Hound", "Hunter", "Hydrant", "Ice",
            "Indium", "Iodine", "Iridium", "Iron", "JonBoat", "Junk", "Kayak", "Ketch", "Krypton", "Lacquer", "Lake",
            "Lamp", "Landing", "Launch", "Lead", "Leader", "Lighter", "Lilac", "Lily", "Lion", "Lithium", "Locus",
            "Log", "Love", "Lugger", "Map", "Mercury", "Mine", "Missile", "Monarch", "Monitor", "Mood", "Moon",
            "Moose", "Motor", "Mouse", "Music", "Mutt", "Neon", "Nickel", "Night", "Novel", "Ocean", "Octopus",
            "Officer", "Oil", "Orchid", "Ork", "Osmium", "Oxygen", "Paddle", "Patrol", "Pedalo", "Penguin", "Peony",
            "People", "Phone", "Physics", "Piano", "Pig", "Pillow", "Planet", "Plate", "Plateau", "Poem", "Poet",
            "Pointer", "Police", "Polygon", "Pond", "Pontoon", "Pram", "Pug", "Pumice", "Punt", "Pyramid", "Rabbit",
            "Radio", "Radium", "Radon", "Raft", "Range", "Raptor", "Reality", "Rhenium", "Rhythm", "River", "Road",
            "Robe", "Rock", "Rocket", "Roof", "Room", "Rose", "Rowboat", "Ruby", "Salmon", "Sampan", "Scene", "Scow",
            "Sea", "Seat", "Setter", "Shark", "Sharpie", "Sheep", "Shellac", "Ship", "Shoe", "Shower", "Silicon",
            "Silk", "Sketch", "Skiff", "Sled", "Slipper", "Sloop", "Snake", "Snow", "Sock", "Sodium", "Spaniel",
            "Sphere", "Spider", "Spoon", "Squid", "Star", "Steamer", "Storm", "Story", "Straw", "Sulfur", "Sweep",
            "System", "Table", "Taco", "Tanker", "Tape", "Taxi", "Teacher", "Terrier", "Theory", "Thistle", "Thorium",
            "Tide", "Tiger", "Time", "Tin", "Tire", "Tornado", "Torpedo", "Towboat", "Tower", "Train", "Travel",
            "Trawler", "Tree", "Trumpet", "Tsunami", "Tube", "Tugboat", "Tulip", "Tumbler", "Turtle", "Umiak",
            "Uranium", "Vessel", "Vine", "Violin", "Wall", "Water", "Whale", "Wheat", "Wheel", "Whippet", "Wick",
            "Window", "Wine", "Wire", "Wizard", "World", "Worm", "Xenon", "Yacht", "Yawl", "Year", "Zinc", "Zoology",
    };

    final static String THIRD_PERSON_SINGULAR_VERB_CODE = "{SingularVerb}";
    final static String THIRD_PERSON_SINGULAR_VERBS[] = new String[]{
            "Runs", "Walks", "Speaks", "Waits", "Learns", "Opens", "Closes", "Calls", "Asks", "Becomes", "Helps",
            "Plays", "Moves", "Lives", "Writes", "Stands", "Meets", "Changes", "Creates",
            "Grows", "Remembers", "Sends", "Builds", "Reaches", "Raises", "Hopes", "Supports", "Catches",
            "Delights", "Improves", "Captures", "Befriends", "Elevates", "Erupts", "Lowers",
            "Extends", "Keeps", "Organizes", "Predicts", "Waltzes", "Tunes", "Carries",
            "Reads", "Drives", "Throws", "Hammers", "Drills", "Thrills", "Kills", "Wills", "Bills",
            "Mills", "Tills", "Chills", "Verifies", "Is", "Was"
    };
}
