package com.jomofisher.literatehash;

/**
 * Some built-in word groups.
 */
abstract class DefaultWordGroup {
    final static String ADJECTIVE_CODE = "{Adj}";
    final static String ADJECTIVES[] = new String[]{
            "Active", "Almond", "Anise", "Apple", "Atomic", "Bacon", "Beaver", "Best", "Better", "Bitter", "Black",
            "Blue", "Blush", "Brave", "Brief", "Brown", "Burnt", "Butter", "Calm", "Canary", "Candy", "Cellar",
            "Cerise", "Cherry", "Clean", "Coffee", "Cola", "Common", "Copper", "Corny", "Cozy", "Cubist", "Denim",
            "Double", "Dwarf", "Early", "Eggnog", "Faint", "Famous", "Fern", "Flying", "Folk", "Formal",
            "Former", "Frozen", "Future", "Giant", "Gifted", "Glassy", "Gold", "Gothic", "Grape", "Grassy", "Gray",
            "Green", "Half", "Hard", "Hidden", "High", "Honey", "Hoping", "Horned", "Indigo", "Jedi", "Jolly",
            "Jungle", "Killer", "Kiwi", "Laser", "Latter", "Lemon", "Lime", "Lively", "Low", "Luxury", "Mad", "Mango",
            "Maple", "Maroon", "Meadow", "Measly", "Melon", "Mint", "Mocha", "Modern", "Molten", "Naive", "Naval",
            "Nutmeg", "Opaque", "Orange", "Outer", "Padded", "Papaya", "Peach", "Peanut", "Pear", "Pecan", "Plum",
            "Pop", "Port", "Punch", "Race", "Rash", "Real", "Red", "Reed", "Rigid", "Rocky", "Rococo", "Round", "Rum",
            "Salty", "Sandy", "Sepia", "Shadow", "Showy", "Sienna", "Silver", "Ski", "Smelly", "Smoke", "Soft",
            "Soggy", "Solar", "Sour", "Space", "Sparse", "Speed", "Speedy", "Spice", "Square", "Street", "Sub",
            "Super", "Surf", "Swamp", "Sweet", "Tall", "Tan", "Tart", "Tidy", "Toffee", "Tonic", "Triple", "Tuning",
            "Violet", "Weak", "White", "Wild", "Yellow", "Zesty", "Zippy", "Happy", "Lucky", "Unlucky", "Guava",
            "Amber", "Hot", "Cold", "Winner", "Acolyte", "Elder", "Sister", "Brother", "Mother", "Father", "Free",
            "Broken", "Perfect", "Smart", "Plain", "Pretty", "Handsome", "Attractive", "Hero", "Warrior", "Noble",
            "Gentle", "Titled", "Worthy", "Decent", "Upright", "Moral", "Reputable", "Sugary", "Nice", "Fine",
            "Lovely", "Great", "Notable", "Famed", "Revered", "Eminent", "Special", "Serious", "Large", "Big",
            "Extensive", "Expansive", "Broad", "Wide", "Sizable", "Huge", "Massive", "Ample", "Compact", "Dense",
            "Thick", "Tight", "Firm", "Profuse", "Bushy", "Rich", "Riotous", "Impassable", "Opulent", "Generous",
            "Copious", "Splendid", "Fancy", "Classy", "Ritzy", "Swank", "Lavish", "Prolific", "Creative",
            "Lush", "Original", "Artistic", "Inspired", "Visionary", "Enterprising", "Resourceful", "Innovative",
            "Experimental", "Trial", "Test", "Pilot", "Unorthodox", "Alternative", "Exploratory", "Radical",
            "Complete", "Thorough", "Profound", "Major", "Sweeping", "Rigorous", "Stringent", "Total", "Entire",
            "Whole", "Aggregate", "Final", "Utter", "Absolute", "Sheer", "Arrant", "Positive", "Rank", "Qualified",
            "Devoted", "Loyal", "Faithful", "True", "Constant", "Committed", "Devout", "Steadfast", "Loving",
            "Caring", "Affectionate", "Fond", "Pious", "Reverent", "Dutiful", "Righteous", "Orthodox", "Genuine",
            "Keen", "Ardent", "Fervent", "Sworn", "Zealous"

    };
    final static String SINGULAR_PRONOUN_CODE = "{SingularPronoun}";
    final static String SINGULAR_PRONOUNS[] = new String[]{"He", "She", "It"};
    final static String SINGULAR_NOUN_CODE = "{SingularNoun}";
    final static String SINGULAR_NOUNS[] = new String[]{
            "Akita", "All", "Alley", "Ambush", "Anatomy", "Angel", "Area", "Argon", "Arsenic", "Artist", "Aster",
            "Azalea", "Banana", "Barge", "Basalt", "Basket", "Bass", "Bassoon", "Bed", "Beetle", "Bell", "Bicycle",
            "Bird", "Blanket", "Bloom", "Blouse", "Boron", "Botany", "Bottle", "Bovine", "Bowl", "Box",
            "Boxer", "Burrito", "Burro", "Cabin", "Cable", "Cactus", "Candle",
            "Canoe", "Capsule", "Carbon", "Carrot", "Cat", "Cave", "Celery", "Ceramic", "Cesium",
            "Chest", "Child", "Chimney", "Choir", "Cigar", "Club", "Comet", "Conduit",
            "Core", "Corgi", "Corn", "Couch", "Cousin", "Cow", "Crack", "Craft", "Cube", "Cutter", "Day", "Well",
            "Diamond", "Dinghy", "Dog", "Dolphin", "Door", "Dory", "Drawer", "Drifter", "Dugout", "Dungeon", "Durham",
            "Eagle", "Earth", "Easel", "Ecology", "Elf", "Emerald", "Engine", "Express", "Fact", "Family", "Fantasy",
            "Ferry", "Fighter", "Fire", "Fish", "Flame", "Float", "Flute", "Fly", "Force", "Forest", "Fork",
            "Fox", "Frog", "Galaxy", "Gallium", "Garbage", "Gerbil", "Ginger", "Glue", "Gondola", "Granite", "Grocer",
            "Guitar", "Guppy", "Hammock", "Hand", "Harp", "Harrier", "Hawk", "Helium", "Helmet", "Highway", "Hill",
            "Hippo", "History", "Holly", "Hope", "Horn", "Horse", "Hotel", "Hound", "Hunter", "Hydrant", "Ice",
            "Indium", "Iodine", "Iron", "JonBoat", "Junk", "Kayak", "Ketch", "Krypton", "Lacquer", "Lake",
            "Lamp", "Landing", "Launch", "Lead", "Leader", "Lighter", "Lilac", "Lily", "Lion", "Lithium", "Locus",
            "Log", "Love", "Lugger", "Map", "Mercury", "Mine", "Missile", "Monarch", "Monitor", "Mood", "Moon",
            "Moose", "Motor", "Mouse", "Music", "Mutt", "Neon", "Nickel", "Night", "Novel", "Ocean", "Octopus",
            "Officer", "Oil", "Orchid", "Ork", "Oxygen", "Paddle", "Patrol", "Pedalo", "Penguin", "Peony",
            "People", "Phone", "Physics", "Piano", "Pig", "Pillow", "Planet", "Plate", "Plateau", "Poem", "Poet",
            "Pointer", "Police", "Polygon", "Pond", "Pontoon", "Pram", "Pug", "Pumice", "Punt", "Pyramid", "Rabbit",
            "Radio", "Radium", "Radon", "Raft", "Range", "Raptor", "Reality", "Rhythm", "River", "Road",
            "Robe", "Rock", "Rocket", "Roof", "Room", "Rose", "Rowboat", "Ruby", "Salmon", "Scene", "Scow",
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
            "Speaks", "Learns", "Opens", "Closes", "Calls", "Asks", "Becomes", "Helps",
            "Plays", "Moves", "Lives", "Writes", "Stands", "Meets", "Changes", "Creates",
            "Grows", "Remembers", "Sends", "Builds", "Reaches", "Raises", "Hopes", "Supports", "Catches",
            "Delights", "Improves", "Captures", "Elevates", "Erupts", "Lowers",
            "Extends", "Keeps", "Organizes", "Predicts", "Waltzes", "Tunes", "Carries",
            "Reads", "Drives", "Throws", "Hammers", "Drills", "Thrills", "Kills", "Wills", "Greets",
            "Mills", "Chills", "Is", "Was"
    };
}
