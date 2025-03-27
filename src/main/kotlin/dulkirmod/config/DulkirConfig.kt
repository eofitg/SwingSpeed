package dulkirmod.config

import cc.polyfrost.oneconfig.config.Config
import cc.polyfrost.oneconfig.config.annotations.*
import cc.polyfrost.oneconfig.config.annotations.Number
import cc.polyfrost.oneconfig.config.data.Mod
import cc.polyfrost.oneconfig.config.data.ModType
import dulkirmod.DulkirMod
import dulkirmod.utils.Utils


object DulkirConfig : Config(Mod("DulkirMod", ModType.SKYBLOCK), "dulkirmod-config.json") {

    @Switch(
        name = "Patch Crimson Isle memory leak",
        description = "This was a temporary fix for the memory leak on crimson isles. It is now deprecated.",
        category = "General",
        subcategory = "General"
    )
    var crimsonIslesMemoryLeakPatch = false

    @Switch(
        name = "Remove Useless Armor Stands",
        description = "Another hypixel issue, should be useful for eman/arachne still.",
        category = "General",
        subcategory = "General"
    )
    var blankStandRemoval = false

    @Switch(
        name = "Hide Enchant Rune Particles",
        description = "ugly go bye-bye",
        category = "General",
        subcategory = "General"
    )
    var hideEnchantRune = false

    @Switch(
        name = "Reaper Armor Cooldown Display",
        description = "Will show as item durability",
        category = "General",
        subcategory = "General"
    )
    var displayReaperCD = false

    @Switch(
        name = "Wither Impact Cooldown Display",
        description = "Will show as item durability",
        category = "General",
        subcategory = "General"
    )
    var displayImpactCD = false

    @Switch(
        name = "Abiphone Do-Not-Disturb",
        description = "Detects incoming calls and mutes ring audio for like 5 seconds. \nWorks as long as u don't lag particularly hard at the same time you're being called.",
        category = "General",
        subcategory = "General"
    )
    var abiDND = false

    @Switch(
        name = "Abiphone Caller ID",
        description = "If DND is on, still give the player a quick 1 liner to tell them who is calling.",
        category = "General",
        subcategory = "General"
    )
    var abiCallerID = false

    @Slider(
        name = "Hurt Cam Intensity",
        description = "1 is default, make sure other mods noHurtCam stuff is off",
        category = "General",
        subcategory = "General",
        min = 0f,
        max = 2f,
        step = 0
    )
    var hurtCamIntensity = 1f

    @Switch(
        name = "Tooltip Features",
        description = "Turns on scrollable and (optional) scalable tooltips.",
        category = "General",
        subcategory = "General"
    )
    var scaledTooltips = false

    @Slider(
        name = "Tooltip Scale",
        description = "1 is default",
        category = "General",
        subcategory = "General",
        min = 0f,
        max = 2f,
        step = 0
    )
    var tooltipSize = 1f

    @Switch(
        name = "Highlight Blaze slayer Minibosses",
        description = "HITBOXES!",
        category = "General",
        subcategory = "Nether"
    )
    var minibossHitbox = false

    @Switch(
        name = "Blaze Slayer Attunement Display",
        description = "Shows a hit-box to indicate what dagger you should use",
        category = "General",
        subcategory = "Nether"
    )
    var attunementDisplay = false

    @Switch(
        name = "Hide Extra Nametags",
        description = "Prevents some nametags not covered by skytils \"Hide non-starred nametags\" from rendering.",
        category = "General",
        subcategory = "General"
    )
    var hideTags = true

    // CUSTOM ANIMATIONS
    @Switch(
        name = "Global Toggle",
        description = "Change the look of your held item",
        category = "Animations",
        subcategory = "Animations"
    )
    var customAnimations = false

    @Slider(
        name = "Size",
        description = "Scales the size of your currently held item. Default: 0",
        category = "Animations",
        subcategory = "Animations",
        min = -1.5f,
        max = 1.5f,
        step = 0
    )
    var customSize = 0f

    @Checkbox(
        name = "Scale Swing",
        description = "Also scale the size of the swing animation.",
        category = "Animations",
        subcategory = "Animations"
    )
    var doesScaleSwing = true

    @Slider(
        name = "X",
        description = "Moves the held item. Default: 0",
        category = "Animations",
        subcategory = "Animations",
        min = -1.5f,
        max = 1.5f,
        step = 0
    )
    var customX = 0f

    @Slider(
        name = "Y",
        description = "Moves the held item. Default: 0",
        category = "Animations",
        subcategory = "Animations",
        min = -1.5f,
        max = 1.5f,
        step = 0
    )
    var customY = 0f

    @Slider(
        name = "Z",
        description = "Moves the held item. Default: 0",
        category = "Animations",
        subcategory = "Animations",
        min = -1.5f,
        max = 1.5f,
        step = 0
    )
    var customZ = 0f

    @Slider(
        name = "Yaw",
        description = "Rotates your held item. Default: 0",
        category = "Animations",
        subcategory = "Animations",
        min = -180f,
        max = 180f,
        step = 1
    )
    var customYaw = 0f

    @Slider(
        name = "Pitch",
        description = "Rotates your held item. Default: 0",
        category = "Animations",
        subcategory = "Animations",
        min = -180f,
        max = 180f,
        step = 1
    )
    var customPitch = 0f

    @Slider(
        name = "Roll",
        description = "Rotates your held item. Default: 0",
        category = "Animations",
        subcategory = "Animations",
        min = -180f,
        max = 180f,
        step = 1
    )
    var customRoll = 0f

    @Slider(
        name = "Speed",
        description = "Speed of the swing animation.",
        category = "Animations",
        subcategory = "Animations",
        min = -2f,
        max = 1f,
        step = 0
    )
    var customSpeed = 0f

    @Checkbox(
        name = "Ignore Haste",
        description = "Makes the chosen speed override haste modifiers.",
        category = "Animations",
        subcategory = "Animations",
    )
    var ignoreHaste = true

    @Dropdown(
        name = "Drinking Fix",
        description = "Pick how to handle drinking animations.",
        category = "Animations",
        subcategory = "Fixes",
        options = ["No fix", "Rotationless", "Fixed"]
    )
    var drinkingSelector = 2

    @Button(
        name = "Reset Item Values",
        description = "Vanilla Look! Closes Settings GUI.",
        category = "Animations",
        subcategory = "Animations",
        text = "Reset!"
    )
    fun demoButton() {
        customSize = 0f
        customX = 0f
        customY = 0f
        customZ = 0f
        customRoll = 0f
        customPitch = 0f
        customYaw = 0f
        doesScaleSwing = true
        ignoreHaste = true
        customSpeed = 0f
        DulkirMod.mc.displayGuiScreen(null)
    }

    @Button(
        name = "Export Preset as String",
        description = "Base64 representation of your current config - will copy to clipboard when pressed.",
        category = "Animations",
        subcategory = "Presets",
        text = "Export!"
    )
    fun presetString() = Utils.animationConfigToString()


    @Button(
        name = "Import Preset from Clipboard",
        description = "Base64 representation of your config accepted from clipboard. Closes gui.",
        category = "Animations",
        subcategory = "Presets",
        text = "Import!"
    )
    fun stringToConfig() = Utils.animationStringtoConfig()

    @Switch(
        name = "Remove Selfie Camera",
        description = "Get rid of pesky reverse third person!",
        category = "General",
        subcategory = "General"
    )
    var noReverse3rdPerson = false

    @Switch(
        name = "Bridge Bot Formatter",
        description = "Global Toggle",
        category = "Bridge",
        subcategory = "Bridge"
    )
    var bridgeBot = false

    @Text(
        name = "Bridge Bot Name",
        description = "Not case-sensitive",
        category = "Bridge",
        subcategory = "Bridge",
        placeholder = "Ealman11",
        secure = false
    )
    var botName: String = "Ealman11"

    @Dropdown(
        name = "Bridge Chatter Name Color",
        description = "Pick how the player name looks.",
        category = "Bridge",
        subcategory = "Bridge",
        options = ["§0Black",
            "§1Dark Blue",
            "§2Dark Green",
            "§3Dark Aqua",
            "§4Dark Red",
            "§5Dark Purple",
            "§6Gold",
            "§7Gray",
            "§8Dark Gray",
            "§9Blue",
            "§aGreen",
            "§bAqua",
            "§cRed",
            "§dLight Purple",
            "§eYellow",
            "§fWhite",
            "§zSBA Chroma"
        ]
    )
    var bridgeColor = 6

    @Switch(
        name = "Ghast Notification",
        description = "Shows a title at 9:00pm for bestiary",
        category = "Bestiary",
        subcategory = "Notifications"
    )
    var notifyGhast = false

    @Switch(
        name = "Zombie Villager Notification",
        description = "Shows a title at 8:00pm for bestiary",
        category = "Bestiary",
        subcategory = "Notifications"
    )
    var notifyZombieVillager = false

    @Switch(
        name = "Broken Hype Notification",
        description = "Tells you if you are no longer getting bestiary! Requires champion and book of stats on your item. LEAVE OFF IF FISHING.",
        category = "Bestiary",
        subcategory = "Notifications"
    )
    var notifyHype = false

    @Switch(
        name = "Matcho Spawn Alert!",
        description = "Alerts you if your lobby becomes EXPLOSIVE!",
        category = "Bestiary",
        subcategory = "Notifications"
    )
    var notifyMatcho = false

    @Dropdown(
        name = "Bestiary Notification Color",
        description = "Changes color some bestiary features.",
        category = "Bestiary",
        subcategory = "Notifications",
        options = ["§0Black",
            "§1Dark Blue",
            "§2Dark Green",
            "§3Dark Aqua",
            "§4Dark Red",
            "§5Dark Purple",
            "§6Gold",
            "§7Gray",
            "§8Dark Gray",
            "§9Blue",
            "§aGreen",
            "§bAqua",
            "§cRed",
            "§dLight Purple",
            "§eYellow",
            "§fWhite",
            "§zSBA Chroma"
        ]
    )
    var bestiaryNotifColor = 15

    @Switch(
        name = "Text Shadow",
        description = "Shows text shadow for notification",
        category = "Bestiary",
        subcategory = "Notifications"
    )
    var bestiaryTextShadow = false

    @Slider(
        name = "Scale",
        description = "Size of notification!",
        category = "Bestiary",
        subcategory = "Notifications",
        min = 0f,
        max = 1f,
        step = 0
    )
    var bestiaryNotifSize = .7f


    @Switch(
        name = "Alert Noises",
        description = "Uses relevant mob sounds, doesn't override audio/patcher settings",
        category = "Bestiary",
        subcategory = "Audio"
    )
    var bestiaryAlertSounds = false

    @Slider(
        name = "Alert Volume",
        description = "Volume of notification!",
        category = "Bestiary",
        subcategory = "Audio",
        min = 0f,
        max = 1f,
        step = 0
    )
    var bestiaryNotifVol = .7f

    @Button(
        name = "Demo Volume Selection",
        description = "Plays the Ghast Noise as Reference, Might add individual sliders later but this seems like enough",
        category = "Bestiary",
        subcategory = "Audio",
        text = "Test"
    )
    fun demoVolume() {
        DulkirMod.mc.thePlayer.playSound("mob.ghast.scream", 1f * bestiaryNotifVol, 1f)
    }

    @Switch(
        name = "Hide Arachne Loot Nametags",
        description = "Useful when killing a lot of them",
        category = "Bestiary",
        subcategory = "Arachne"
    )
    var hideArachneTags = false

    @Switch(
        name = "Arachne kill timer",
        description = "Shows in chat.",
        category = "Bestiary",
        subcategory = "Arachne"
    )
    var arachneKillTimer = false

    @Switch(
        name = "Arachne spawn countdown",
        description = "Shows how long it takes for the arachne to spawn (in world).",
        category = "Bestiary",
        subcategory = "Arachne"
    )
    var arachneSpawnTimer = false

    @Switch(
        name = "Show Arachne Keeper Spawn Locations",
        description = "simple text waypoints",
        category = "Bestiary",
        subcategory = "Arachne"
    )
    var keeperWaypoints = false

    @Switch(
        name = "Focus Mode",
        description = "only show the nametags of keepers. make sure to turn off when you're done",
        category = "Bestiary",
        subcategory = "Arachne"
    )
    var keeperFocus = false

    @Switch(
        name = "Turn off re-equip animation",
        description = "Will stop the spam re-equip when stuff like cultivating is updating",
        category = "Animations",
        subcategory = "Fixes"
    )
    var cancelReequip = false

    @Switch(
        name = "Show re-equip animation when changing slots",
        description = "Will overwrite \"Turn off re-equip animation\" when switching the slot.",
        category = "Animations",
        subcategory = "Fixes"
    )
    var showReEquipAnimationWhenChangingSlots = true

    fun init() {
        initialize()
        addDependency("customMessage", "throttleNotifier")
        addDependency("throttleNotifierSpam", "throttleNotifier")
        addDependency("bestiaryNotifVol", "bestiaryAlertSounds")
        addDependency("demoVolume", "bestiaryAlertSounds")
        addDependency("highlightLeapName", "highlightLeap")
        addDependency("abiCallerID", "abiDND")
        addDependency("hurtCamIntensity", "hurtCamSlider")
        addDependency("tooltipSize", "scaledTooltips")
        addDependency("secretSoundVolume", "secretClickSounds")
        addDependency("demoSecretVolume", "secretClickSounds")
        addDependency("archerBoxEverywhere", "archerBox")
        addDependency("showReEquipAnimationWhenChangingSlots", "cancelReequip")
    }
}
