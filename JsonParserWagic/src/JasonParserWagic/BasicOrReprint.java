package JasonParserWagic;

/**
 *
 * @author Eduardo
 */
public class BasicOrReprint {

    protected static boolean isReprintOrBasic(String name) {

        String[] DOM = {
            "Aesthir Glider",
            "Divination",
            "Fire Elemental",
            "Gaea's Blessing",
            "Gilded Lotus",
            "Gideon's Reproach",
            "Goblin Warchief",
            "Icy Manipulator",
            "Juggernaut",
            "Llanowar Elves",
            "Nature's Spiral",
            "Opt",
            "Rescue",
            "Serra Angel",
            "Siege-Gang Commander",
            "Skirk Prospector",
            "Tragic Poet",
            "Verdant Force",
            "Isolated Chapel",
            "Woodland Cemetery",
            "Hinterland Harbor",
            "Sulfur Falls",
            "Clifftop Retreat",
            "Meandering River",
            "Timber Gorge",
            "Sage of Lat-Nam",
            "Skizzik",
            "Thorn Elemental",
            "Syncopate"};

        String[] M19 = {
            "Ajani's Pridemate",
            "Inspired Charge",
            "Knightly Valor",
            "Luminous Bonds",
            "Make a Stand",
            "Mentor of the Meek",
            "Mighty Leap",
            "Oreskos Swiftclaw",
            "Pegasus Courser",
            "Anticipate",
            "Cancel",
            "Disperse",
            "Divination",
            "Djinn of Wishes",
            "Essence Scatter",
            "Ghostform",
            "Horizon Scholar",
            "Omenspeaker",
            "Omniscience",
            "Sleep",
            "Snapping Drake",
            "Switcheroo",
            "Tolarian Scholar",
            "Totally Lost",
            "Child of Night",
            "Death Baron",
            "Diregraf Ghoul",
            "Doomed Dissenter",
            "Duress",
            "Gravedigger",
            "Infectious Horror",
            "Infernal Scarring",
            "Macabre Waltz",
            "Mind Rot",
            "Phylactery Lich",
            "Reassembling Skeleton",
            "Rise from the Grave",
            "Skymarch Bloodletter",
            "Walking Corpse",
            "Act of Treason",
            "Banefire",
            "Boggart Brute",
            "Crash Through",
            "Electrify",
            "Fire Elemental",
            "Guttersnipe",
            "Lava Axe",
            "Lightning Strike",
            "Shock",
            "Smelt",
            "Sure Strike",
            "Tectonic Rift",
            "Tormenting Voice",
            "Volcanic Dragon",
            "Blanchwood Armor",
            "Centaur Courser",
            "Colossal Dreadmaw",
            "Daggerback Basilisk",
            "Druid of the Cowl",
            "Ghirapur Guide",
            "Giant Spider",
            "Highland Game",
            "Naturalize",
            "Oakenform",
            "Plummet",
            "Rabid Bite",
            "Reclamation Sage",
            "Recollect",
            "Thornhide Wolves",
            "Titanic Growth",
            "Wall of Vines",
            "Enigma Drake",
            "Explosive Apparatus",
            "Field Creeper",
            "Gargoyle Sentinel",
            "Magistrate's Scepter",
            "Manalith",
            "Millstone",
            "Rogue's Gloves",
            "Cinder Barrens",
            "Forsaken Sanctuary",
            "Foul Orchard",
            "Highland Lake",
            "Meandering River",
            "Reliquary Tower",
            "Stone Quarry",
            "Submerged Boneyard",
            "Timber Gorge",
            "Tranquil Expanse",
            "Woodland Stream"};

        String[] reprints = {
            "Plains", "Island", "Swamp", "Mountain", "Forest",
            "Luminous Bonds",
            "Righteous Blow",
            "Disdainful Stroke",
            "Wall of Mist",
            "Child of Night",
            "Dead Weight",
            "Maniacal Rage",
            "Sure Strike",
            "Crushing Canopy",
            "Hitchclaw Recluse",
            "Ironshell Beetle",
            "Prey Upon",
            "Siege Wurm",
            "Goblin Electromancer",
            "Skyknight Legionnaire",
            "Wee Dragonauts",
            "Chromatic Lantern",
            "Boros Guildgate",
            "Dimir Guildgate",
            "Golgari Guildgate",
            "Izzet Guildgate",
            "Selesnya Guildgate",
            "Overgrown Tomb",
            "Sacred Foundry",
            "Steam Vents",
            "Temple Garden",
            "Watery Grave"};

        for (String reprint : reprints) {
            if (name.equals(reprint)) {
                return true;
            }
        }

        for (String reprintSET : M19) {
            if (name.equals(reprintSET)) {
                return true;
            }
        }

        return false;
    }
}
