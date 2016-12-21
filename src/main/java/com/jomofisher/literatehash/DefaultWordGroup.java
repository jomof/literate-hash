package com.jomofisher.literatehash;

/**
 * Some built-in word groups.
 */
public class DefaultWordGroup {

    final static String ADJECTIVE_CODE = "{Adj}";
    final static String ADJECTIVES[] = new String[]{
            "Glassy", "Opaque", "Shimmering", "Sparkling", "Glowing", "Shining", "Honorary",
            "Soggy", "Killer", "Showy", "Idolized", "Slippery", "Rash", "Corny", "Smelly",
            "Gaseous", "Aqueous", "Overstated", "Dwarf", "Lively", "Admired", "Damaged",
            "Heartfelt", "American", "Half", "Distant", "Jolly", "Valuable",
            "Concerned", "WellOff", "Menacing", "Giant", "Horned",
            "Unknown", "Sparse", "Mad", "Shocked", "Respectful", "Different", "Sarcastic",
            "Wasteful", "Measly", "Definite", "Exemplary", "Miniature", "Common", "Pointed", "Active",
            "Bighearted", "Acceptable", "Hidden", "Speedy", "Ashamed", "Occasional", "Tidy", "Admirable",
            "Walking", "Running", "Sprinting", "Dashing", "Crashing", "Spirited", "Spiritual", "Ancient",
            "Melting", "Boiling", "Freezing", "Triple", "Double", "Quadruple",
            "Quintuple", "Former", "Latter", "Formal", "Decorated", "Hypnotic", "Drunken", "Realizing",
            "Grassy", "Sandy", "Rocky", "Gigantic", "Hilarious", "Hard", "Soft", "Curious", "Rigid",
            "Adorable", "Clean", "Elegant", "Turquoise", "Blue", "Green", "Famous", "Gifted", "Thankful",
            "Brave", "Calm", "Mysterious", "Round", "Square", "Massive", "Faint", "Melodic", "Tall",
            "Brief", "Whispering", "Salty", "Weak", "Cellar", "Better", "Best", "Early",
            "Important", "Wild", "Swamp", "Arboreal", "Jungle", "Molten", "Frozen", "Aromatic", "Zippy", "Zesty",
            "Cozy", "Abstract", "Surreal", "Cubist", "Fauvist", "Dadaist", "Pop",
            "Aesthetic", "Real", "Concrete", "Conceptual", "Digital", "Fantastic",
            "Figurative", "Folk", "Future", "Geometric", "Gothic", "Lyrical", "Magical", "Maximum",
            "Minimum", "Modern", "Naive", "Primitive", "Objective", "Precision",
            "Regional", "Romantic", "Rococo", "Resonating", "Space", "Symbolic", "Street", "Supreme",
            "Ultimate", "Underground", "Baroque", "Race", "Solar", "Apparent",
            "High", "Low", "Country", "Fishing", "Naval", "Slender", "Water", "Surf",
            "Super", "Sub", "Speed", "Ski", "Reed", "Reaction", "Pleasure",
            "Personal", "Padded", "Luxury", "Port", "Starboard", "Electric", "Mechanical", "Flying", "Folding",
            "Almond", "Amaretto", "Anise", "Apple", "Apricot", "Banana", "Bacon",
            "Blackberry",
            "Blueberry", "Bourbon", "Bubblegum", "Butter", "Buttermilk",
            "Candy", "Caramel",
            "Cheesecake", "Cherry", "Chocolate",
            "Cinnamon", "Coconut", "Coffee", "Cola",
            "Cranberry", "Cucumber", "Doughnut", "Elderberry", "Eggnog",
            "Eucalyptus", "Gingersnap", "Grape", "Grapefruit",
            "Hazelnut", "Honey", "Huckleberry",
            "Kiwi", "Lemon", "Lemonade", "Lime",
            "Mango", "Maple", "Margarita", "Mint",
            "Mocha", "Nutmeg", "Orange",
            "Mandarin", "Papaya", "Peach", "Peanut", "Pear",
            "Pecan", "Peppermint", "Pineapple", "Pistachio", "Plum",
            "Pomegranate", "Pumpkin", "Punch", "Quinine", "Raspberry",
            "Rum", "Sassafras", "Smoke", "Sour", "Strawberry", "Spice",
            "Spearmint", "Tangerine", "TartLemon", "Tequila", "Toasted", "Toffee", "Tonic",
            "Vanilla", "Watermelon",
            "Wintergreen", "Mahogany", "Chestnut", "Bitter", "Sweet", "Melon",
            "Burnt", "Sienna", "Brown", "Sepia", "Copper",
            "Atomic", "Beaver", "DesertSand", "RawSienna", "Tumbleweed", "Tan",
            "Gold", "Shadow",
            "SunGlow", "Goldenrod", "Dandelion", "Yellow",
            "LaserLemon", "Canary", "YellowGreen", "Inchworm", "Asparagus",
            "Screaming", "Fern", "Sea", "Mountain", "Meadow", "Shamrock",
            "JungleGreen", "Caribbean", "PineGreen", "Aquamarine",
            "SkyBlue", "Outer", "BlueGreen", "Pacific", "Cerulean", "Cornflower",
            "NavyBlue", "Denim", "Periwinkle", "CadetBlue", "Indigo",
            "Manatee", "Bluebell", "BlueViolet", "Violet", "Wisteria", "VividViolet",
            "Fuchsia", "HotMagenta",
            "Orchid", "RedViolet", "Eggplant", "Cerise", "Magenta", "Lavender",
            "Razzmatazz", "PiggyPink", "Blush", "Maroon",
            "Red", "RadicalRed", "Scarlet", "Salmon", "BrickRed", "White",
            "Silver", "Gray", "Black", "Jedi", "Whitewater", "Foaming", "Draining", "Teaching", "Carrying",
            "Hopping", "Hoping", "Throwing", "Grunting", "Lumping", "Talking", "Eating", "Sleeping",
            "Doubting", "Routing", "Scouting", "Rushing", "Hushing", "Greeting", "Dismissing", "Rippling",
            "Dribbling", "Riveting", "Shattering", "Blabbering", "Nagging", "Bragging", "Harping", "Guessing",
            "Wrestling", "Tussling", "Bustling", "Muscling", "Hustling",
            "Speaking", "Waiting", "Learning", "Opening", "Closing", "Calling", "Asking", "Becoming", "Helping",
            "Playing", "Moving", "Living", "Writing", "Standing", "Meeting", "Continuing", "Changing", "Creating",
            "Growing", "Remembering", "Sending", "Building", "Reaching", "Raising", "Supporting", "Catching",
            "Delightful", "Entrancing", "Improving", "Capturing", "Befriending", "Elevating", "Erupting", "Lowering",
            "Extending", "Heightening", "Keeping", "Organizing", "Predicting", "Waltzing", "Tuning",
            "Reading", "Driving", "Hammering", "Drilling", "Thrilling",
            "Killing", "Willing", "Billing", "Milling", "Tilling", "Filling", "Trilling", "Chilling", "Verifying",
            "Confessing"
    };

    final static String SINGULAR_PRONOUN_CODE = "{SingularPronoun}";
    final static String SINGULAR_PRONOUNS[] = new String[]{"He", "She", "It"};

    final static String SINGULAR_NOUN_CODE = "{SingularNoun}";
    final static String SINGULAR_NOUNS[] = new String[]{
            "Dog", "Cat", "Ocean", "Submarine", "Tree", "Forest", "Rock",
            "Earth", "Burrito", "Guppy", "Fly", "All", "Butterfly",
            "Monarch", "Chimney", "Sweep", "Frog",
            "Hunter", "Teacher", "Fire", "Tower", "Lamp", "Flame", "Theory", "Love", "People", "History",
            "World", "Map", "Family", "Door", "Window", "Music", "Bird", "Fact", "Area", "Language", "Rhythm",
            "Worm", "Time", "Year", "Hand", "Night", "Day", "Story", "Chemistry", "Painting", "Cigarette",
            "Scene", "Mood", "Hope", "Selection", "Wine", "Passion",
            "Happiness", "Republic", "Engine", "Hotel", "Leader", "Cousin", "Flute", "Piano",
            "Beetle", "Spider", "Lion", "Snake", "Fish", "Shark", "Whale", "Capsule", "Travel", "Train",
            "Range", "Locus", "Pentagon", "Polygon", "Sphere", "Pyramid", "Tide", "Wheel", "Tire",
            "Seat", "Rose", "Tulip", "Azalea", "Chest", "Blouse", "Tiger", "Cube", "Scorpion", "Fox", "Sandwich",
            "Taco", "Poem", "Novel", "Candle", "Sketch", "Vine", "Ceramic", "Bowl", "Plate", "Spoon",
            "Fork", "Hammock", "Wire", "Diamond", "Ruby", "Emerald", "Comet", "Planet", "Star", "Moon",
            "Rocket", "Sled", "Table", "Couch", "Bed", "Room", "Basket", "Box", "Envelope", "Robe", "Silk",
            "Terrier", "Shepherd", "Sheep", "Cow", "Corgi", "Hill", "Lake", "Pond", "Mountain", "Plateau",
            "Grocer", "Horse", "Bicycle", "Helmet", "Turtle", "Moose", "Mine", "Cave", "Core", "Snow", "Angel",
            "Cactus", "Elephant", "Hippo", "Cigar", "Eagle", "Hawk", "Raptor", "Dinosaur", "Vegetable",
            "Carrot", "Celery", "Gerbil", "Rabbit", "Pig", "Mouse", "Easel", "Shoe", "Sock",
            "Wall", "Roof", "Drawer", "Straw", "Wick", "Gasoline", "Kerosene", "Blanket", "Pillow", "Musician",
            "Artist", "Poet", "Physics", "Anatomy",
            "Botany",
            "Ecology",
            "Zoology",
            "Carnation", "Lily", "Thistle", "Orchid", "Sunflower", "Lavender", "Holly", "Peony",
            "Marigold", "Lilac", "Ginger", "Aster", "Bloom", "Bell", "Corn", "Wheat", "Hound", "Akita", "Malamute",
            "Spaniel",
            "Boxer", "Chihuahua", "Dachshund", "Dalmatian",
            "Setter", "Pointer", "Pyrenees", "Harrier",
            "Mutt", "Pug", "Whippet",
            "Bovine", "Octopus", "Squid", "Dolphin", "Porpoise", "Salmon", "Sailfish",
            "Penguin", "Shellfish", "Officer", "Ambush",
            "Amethyst", "Radio", "Phone", "Burro", "Storm", "Shower", "Tornado", "Hurricane",
            "Tsunami", "Bottle", "Violin", "Harp", "Guitar", "Trumpet", "Horn",
            "Clarinet", "Bassoon", "Orchestra", "Choir", "Club", "Highway", "Road", "Alley",
            "Galaxy", "System", "Lacquer", "Shellac", "Glue", "Tape", "Baseball", "Football", "Tumbler",
            "Hydrant", "Conduit", "Transistor", "Cheater", "Astronaut", "Cosmonaut", "Reality",
            "Fantasy", "Elf", "Ork", "Wizard", "Fighter", "Dexterity", "Strength", "Charisma",
            "Dungeon", "Treasure", "Crack", "River", "Tributary",
            "Basalt", "Granite", "Pumice",
            "Hydrogen", "Helium", "Lithium", "Boron", "Carbon", "Nitrogen", "Oxygen", "Fluorine", "Neon",
            "Sodium", "Silicon", "Sulfur", "Chlorine", "Argon",
            "Calcium", "Chromium", "Manganese", "Iron", "Cobalt", "Nickel",
            "Copper", "Zinc", "Gallium", "Arsenic", "Selenium", "Bromine", "Krypton",
            "Silver", "Cadmium", "Indium", "Tin", "Antimony", "Iodine", "Xenon", "Cesium",
            "Tantalum", "Tungsten", "Rhenium", "Osmium", "Iridium", "Platinum", "Gold", "Mercury", "Lead",
            "Bismuth", "Radon", "Radium", "Thorium",
            "Uranium",
            "Fermium", "Nobelium", "Banana", "Barge", "Bass", "BowRider", "Cabin",
            "Cable", "Canoe",
            "Catamaran", "Center", "Console", "Coracle", "Cutter", "Dhow", "Dinghy", "Dory",
            "Dredging", "DriftBoat", "Drifter", "Dugout", "Durham", "Electric", "Express", "Ferry",
            "Float", "Tube", "Friendship", "Garbage", "Scow", "Gondola",
            "Houseboat", "Hovercraft", "Hydrofoil", "Hydroplane", "Ice", "JonBoat",
            "Junk", "Kayak", "Sea", "Ketch", "Landing", "Lifeboat",
            "Lighter", "Carrier", "Log", "Longboat", "Lugger", "Yacht",
            "Missile", "Monitor", "Motorboat", "Motor", "Launch",
            "Oil", "Optimist", "Outrigger", "Paddle", "Steamer", "Patrol", "Pedalo",
            "Water", "Craft", "Police", "Watercraft", "Pontoon", "Powerboat",
            "Pram", "Punt", "Raft", "Inflatable", "Riverboat", "Rowboat", "Runabout",
            "Sailboat", "Sampan", "Schooner", "ShadBoat", "Sharpie", "Ship",
            "Skiff", "Steamboat", "Slipper", "Sloop", "Tanker",
            "Torpedo", "Towboat", "Trimaran", "Trawler", "Tugboat", "Umiak",
            "Vessel", "Ambulance", "Taxi", "Whaleboat", "Yawl",
            "Force", "Child"
    };

    final static String THIRD_PERSON_SINGULAR_VERB_CODE = "{SingularVerb}";
    final static String THIRD_PERSON_SINGULAR_VERBS[] = new String[]{
            "Runs", "Walks", "Speaks", "Waits", "Learns", "Opens", "Closes", "Calls", "Asks", "Becomes", "Helps",
            "Plays", "Moves", "Lives", "Writes", "Stands", "Meets", "Continues", "Changes", "Creates",
            "Grows", "Remembers", "Sends", "Builds", "Reaches", "Raises", "Hopes", "Supports", "Catches",
            "Delights", "Entrances", "Improves", "Captures", "Befriends", "Elevates", "Erupts", "Lowers",
            "Extends", "Heightens", "Keeps", "Organizes", "Predicts", "Embiggens", "Waltzes", "Tunes", "Carries",
            "Reads", "Drives", "Teleports", "Throws", "Hammers", "Drills", "Thrills", "Kills", "Wills", "Bills",
            "Mills", "Tills", "Fills", "Trills", "Chills", "Verifies", "Confesses", "Is", "Was"
    };
}
