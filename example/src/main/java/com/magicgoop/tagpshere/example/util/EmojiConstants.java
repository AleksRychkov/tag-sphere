/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.magicgoop.tagpshere.example.util;

public class EmojiConstants {
    /*
     * Emoji list from Unicode.org:
     * http://unicode.org/cldr/utility/list-unicodeset.jsp?a=%5Cp%7BEmoji%7D%0D%0A&g=
     */
    public static int[] emojiCodePoints = {
            0x000A9, // COPYRIGHT SIGN
            0x000AE, // REGISTERED SIGN
            0x02002, // EN SPACE
            0x02003, // EM SPACE
            0x02005, // FOUR-PER-EM SPACE
            0x0203C, // DOUBLE EXCLAMATION MARK
            0x02049, // EXCLAMATION QUESTION MARK
            0x020E3, // COMBINING ENCLOSING KEYCAP
            0x02122, // TRADE MARK SIGN
            0x02139, // INFORMATION SOURCE
            0x02194, // LEFT RIGHT ARROW
            0x02195, // UP DOWN ARROW
            0x02196, // NORTH WEST ARROW
            0x02197, // NORTH EAST ARROW
            0x02198, // SOUTH EAST ARROW
            0x02199, // SOUTH WEST ARROW
            0x021A9, // LEFTWARDS ARROW WITH HOOK
            0x021AA, // RIGHTWARDS ARROW WITH HOOK
            0x0231A, // WATCH
            0x0231B, // HOURGLASS
            0x023E9, // BLACK RIGHT-POINTING DOUBLE TRIANGLE
            0x023EA, // BLACK LEFT-POINTING DOUBLE TRIANGLE
            0x023EB, // BLACK UP-POINTING DOUBLE TRIANGLE
            0x023EC, // BLACK DOWN-POINTING DOUBLE TRIANGLE
            0x023F0, // ALARM CLOCK
            0x023F3, // HOURGLASS WITH FLOWING SAND
            0x024C2, // CIRCLED LATIN CAPITAL LETTER M
            0x025AA, // BLACK SMALL SQUARE
            0x025AB, // WHITE SMALL SQUARE
            0x025B6, // BLACK RIGHT-POINTING TRIANGLE
            0x025C0, // BLACK LEFT-POINTING TRIANGLE
            0x025FB, // WHITE MEDIUM SQUARE
            0x025FC, // BLACK MEDIUM SQUARE
            0x025FD, // WHITE MEDIUM SMALL SQUARE
            0x025FE, // BLACK MEDIUM SMALL SQUARE
            0x02600, // BLACK SUN WITH RAYS
            0x02601, // CLOUD
            0x0260E, // BLACK TELEPHONE
            0x02611, // BALLOT BOX WITH CHECK
            0x02615, // HOT BEVERAGE
            0x02668, // HOT SPRINGS
            0x0267F, // WHEELCHAIR SYMBOL
            0x026A0, // WARNING SIGN
            0x026A1, // HIGH VOLTAGE SIGN
            0x02614, // UMBRELLA WITH RAIN DROPS
            0x0261D, // WHITE UP POINTING INDEX
            0x0263A, // WHITE SMILING FACE
            0x02648, // ARIES
            0x02649, // TAURUS
            0x0264A, // GEMINI
            0x0264B, // CANCER
            0x0264C, // LEO
            0x0264D, // VIRGO
            0x0264E, // LIBRA
            0x0264F, // SCORPIUS
            0x02650, // SAGITTARIUS
            0x02651, // CAPRICORN
            0x02652, // AQUARIUS
            0x02653, // PISCES
            0x026CE, // OPHIUCHUS
            0x02660, // BLACK SPADE SUIT
            0x02663, // BLACK CLUB SUIT
            0x02665, // BLACK HEART SUIT
            0x02666, // BLACK DIAMOND SUIT
            0x0267B, // BLACK UNIVERSAL RECYCLING SYMBOL
            0x02693, // ANCHOR
            0x026AA, // MEDIUM WHITE CIRCLE
            0x026AB, // MEDIUM BLACK CIRCLE
            0x026BD, // SOCCER BALL
            0x026BE, // BASEBALL
            0x026C4, // SNOWMAN WITHOUT SNOW
            0x026C5, // SUN BEHIND CLOUD
            0x026D4, // NO ENTRY
            0x026EA, // CHURCH
            0x026F2, // FOUNTAIN
            0x026F3, // FLAG IN HOLE
            0x026F5, // SAILBOAT
            0x026FA, // TENT
            0x026FD, // FUEL PUMP
            0x02702, // BLACK SCISSORS
            0x02705, // WHITE HEAVY CHECK MARK
            0x02708, // AIRPLANE
            0x02709, // ENVELOPE
            0x0270A, // RAISED FIST
            0x0270B, // RAISED HAND
            0x0270C, // VICTORY HAND
            0x0270F, // PENCIL
            0x02712, // BLACK NIB
            0x02714, // HEAVY CHECK MARK
            0x02716, // HEAVY MULTIPLICATION X
            0x0274C, // CROSS MARK
            0x0274E, // NEGATIVE SQUARED CROSS MARK
            0x02753, // BLACK QUESTION MARK ORNAMENT
            0x02754, // WHITE QUESTION MARK ORNAMENT
            0x02755, // WHITE EXCLAMATION MARK ORNAMENT
            0x02757, // HEAVY EXCLAMATION MARK SYMBOL
            0x027B0, // CURLY LOOP
            0x027BF, // DOUBLE CURLY LOOP
            0x02728, // SPARKLES
            0x02733, // EIGHT SPOKED ASTERISK
            0x02734, // EIGHT POINTED BLACK STAR
            0x02744, // SNOWFLAKE
            0x02747, // SPARKLE
            0x02764, // HEAVY BLACK HEART
            0x02795, // HEAVY PLUS SIGN
            0x02796, // HEAVY MINUS SIGN
            0x02797, // HEAVY DIVISION SIGN
            0x027A1, // BLACK RIGHTWARDS ARROW
            0x02934, // ARROW POINTING RIGHTWARDS THEN CURVING UPWARDS
            0x02935, // ARROW POINTING RIGHTWARDS THEN CURVING DOWNWARDS
            0x02B05, // LEFTWARDS BLACK ARROW
            0x02B06, // UPWARDS BLACK ARROW
            0x02B07, // DOWNWARDS BLACK ARROW
            0x02B1B, // BLACK LARGE SQUARE
            0x02B1C, // WHITE LARGE SQUARE
            0x02B50, // WHITE MEDIUM STAR
            0x02B55, // HEAVY LARGE CIRCLE
            0x03030, // WAVY DASH
            0x0303D, // PART ALTERNATION MARK
            0x03297, // CIRCLED IDEOGRAPH CONGRATULATION
            0x03299, // CIRCLED IDEOGRAPH SECRET
            0x1F004, // MAHJONG TILE RED DRAGON
            0x1F0CF, // PLAYING CARD BLACK JOKER
            0x1F170, // NEGATIVE SQUARED LATIN CAPITAL LETTER A
            0x1F171, // NEGATIVE SQUARED LATIN CAPITAL LETTER B
            0x1F17E, // NEGATIVE SQUARED LATIN CAPITAL LETTER O
            0x1F17F, // NEGATIVE SQUARED LATIN CAPITAL LETTER P
            0x1F18E, // NEGATIVE SQUARED AB
            0x1F191, // SQUARED CL
            0x1F192, // SQUARED COOL
            0x1F193, // SQUARED FREE
            0x1F194, // SQUARED ID
            0x1F195, // SQUARED NEW
            0x1F196, // SQUARED NG
            0x1F197, // SQUARED OK
            0x1F198, // SQUARED SOS
            0x1F199, // SQUARED UP WITH EXCLAMATION MARK
            0x1F19A, // SQUARED VS
            0x1F1E6, // REGIONAL INDICATOR SYMBOL LETTER A
            0x1F1E7, // REGIONAL INDICATOR SYMBOL LETTER B
            0x1F1E8, // REGIONAL INDICATOR SYMBOL LETTER C
            0x1F1E9, // REGIONAL INDICATOR SYMBOL LETTER D
            0x1F1EA, // REGIONAL INDICATOR SYMBOL LETTER E
            0x1F1EB, // REGIONAL INDICATOR SYMBOL LETTER F
            0x1F1EC, // REGIONAL INDICATOR SYMBOL LETTER G
            0x1F1ED, // REGIONAL INDICATOR SYMBOL LETTER H
            0x1F1EE, // REGIONAL INDICATOR SYMBOL LETTER I
            0x1F1EF, // REGIONAL INDICATOR SYMBOL LETTER J
            0x1F1F0, // REGIONAL INDICATOR SYMBOL LETTER K
            0x1F1F1, // REGIONAL INDICATOR SYMBOL LETTER L
            0x1F1F2, // REGIONAL INDICATOR SYMBOL LETTER M
            0x1F1F3, // REGIONAL INDICATOR SYMBOL LETTER N
            0x1F1F4, // REGIONAL INDICATOR SYMBOL LETTER O
            0x1F1F5, // REGIONAL INDICATOR SYMBOL LETTER P
            0x1F1F6, // REGIONAL INDICATOR SYMBOL LETTER Q
            0x1F1F7, // REGIONAL INDICATOR SYMBOL LETTER R
            0x1F1F8, // REGIONAL INDICATOR SYMBOL LETTER S
            0x1F1F9, // REGIONAL INDICATOR SYMBOL LETTER T
            0x1F1FA, // REGIONAL INDICATOR SYMBOL LETTER U
            0x1F1FB, // REGIONAL INDICATOR SYMBOL LETTER V
            0x1F1FC, // REGIONAL INDICATOR SYMBOL LETTER W
            0x1F1FD, // REGIONAL INDICATOR SYMBOL LETTER X
            0x1F1FE, // REGIONAL INDICATOR SYMBOL LETTER Y
            0x1F1FF, // REGIONAL INDICATOR SYMBOL LETTER Z
            0x1F201, // SQUARED KATAKANA KOKO
            0x1F202, // SQUARED KATAKANA SA
            0x1F21A, // SQUARED CJK UNIFIED IDEOGRAPH-7121
            0x1F22F, // SQUARED CJK UNIFIED IDEOGRAPH-6307
            0x1F232, // SQUARED CJK UNIFIED IDEOGRAPH-7981
            0x1F233, // SQUARED CJK UNIFIED IDEOGRAPH-7A7A
            0x1F234, // SQUARED CJK UNIFIED IDEOGRAPH-5408
            0x1F235, // SQUARED CJK UNIFIED IDEOGRAPH-6E80
            0x1F236, // SQUARED CJK UNIFIED IDEOGRAPH-6709
            0x1F237, // SQUARED CJK UNIFIED IDEOGRAPH-6708
            0x1F238, // SQUARED CJK UNIFIED IDEOGRAPH-7533
            0x1F239, // SQUARED CJK UNIFIED IDEOGRAPH-5272
            0x1F23A, // SQUARED CJK UNIFIED IDEOGRAPH-55B6
            0x1F250, // CIRCLED IDEOGRAPH ADVANTAGE
            0x1F251, // CIRCLED IDEOGRAPH ACCEPT
            0x1F300, // CYCLONE
            0x1F301, // FOGGY
            0x1F302, // CLOSED UMBRELLA
            0x1F303, // NIGHT WITH STARS
            0x1F304, // SUNRISE OVER MOUNTAINS
            0x1F305, // SUNRISE
            0x1F306, // CITYSCAPE AT DUSK
            0x1F307, // SUNSET OVER BUILDINGS
            0x1F308, // RAINBOW
            0x1F309, // BRIDGE AT NIGHT
            0x1F30A, // WATER WAVE
            0x1F30B, // VOLCANO
            0x1F30C, // MILKY WAY
            0x1F30F, // EARTH GLOBE ASIA-AUSTRALIA
            0x1F311, // NEW MOON SYMBOL
            0x1F313, // FIRST QUARTER MOON SYMBOL
            0x1F314, // WAXING GIBBOUS MOON SYMBOL
            0x1F315, // FULL MOON SYMBOL
            0x1F319, // CRESCENT MOON
            0x1F31B, // FIRST QUARTER MOON WITH FACE
            0x1F31F, // GLOWING STAR
            0x1F320, // SHOOTING STAR
            0x1F330, // CHESTNUT
            0x1F331, // SEEDLING
            0x1F334, // PALM TREE
            0x1F335, // CACTUS
            0x1F337, // TULIP
            0x1F338, // CHERRY BLOSSOM
            0x1F339, // ROSE
            0x1F33A, // HIBISCUS
            0x1F33B, // SUNFLOWER
            0x1F33C, // BLOSSOM
            0x1F33D, // EAR OF MAIZE
            0x1F33E, // EAR OF RICE
            0x1F33F, // HERB
            0x1F340, // FOUR LEAF CLOVER
            0x1F341, // MAPLE LEAF
            0x1F342, // FALLEN LEAF
            0x1F343, // LEAF FLUTTERING IN WIND
            0x1F344, // MUSHROOM
            0x1F345, // TOMATO
            0x1F346, // AUBERGINE
            0x1F347, // GRAPES
            0x1F348, // MELON
            0x1F349, // WATERMELON
            0x1F34A, // TANGERINE
            0x1F34C, // BANANA
            0x1F34D, // PINEAPPLE
            0x1F34E, // RED APPLE
            0x1F34F, // GREEN APPLE
            0x1F351, // PEACH
            0x1F352, // CHERRIES
            0x1F353, // STRAWBERRY
            0x1F354, // HAMBURGER
            0x1F355, // SLICE OF PIZZA
            0x1F356, // MEAT ON BONE
            0x1F357, // POULTRY LEG
            0x1F358, // RICE CRACKER
            0x1F359, // RICE BALL
            0x1F35A, // COOKED RICE
            0x1F35B, // CURRY AND RICE
            0x1F35C, // STEAMING BOWL
            0x1F35D, // SPAGHETTI
            0x1F35E, // BREAD
            0x1F35F, // FRENCH FRIES
            0x1F360, // ROASTED SWEET POTATO
            0x1F361, // DANGO
            0x1F362, // ODEN
            0x1F363, // SUSHI
            0x1F364, // FRIED SHRIMP
            0x1F365, // FISH CAKE WITH SWIRL DESIGN
            0x1F366, // SOFT ICE CREAM
            0x1F367, // SHAVED ICE
            0x1F368, // ICE CREAM
            0x1F369, // DOUGHNUT
            0x1F36A, // COOKIE
            0x1F36B, // CHOCOLATE BAR
            0x1F36C, // CANDY
            0x1F36D, // LOLLIPOP
            0x1F36E, // CUSTARD
            0x1F36F, // HONEY POT
            0x1F370, // SHORTCAKE
            0x1F371, // BENTO BOX
            0x1F372, // POT OF FOOD
            0x1F373, // COOKING
            0x1F374, // FORK AND KNIFE
            0x1F375, // TEACUP WITHOUT HANDLE
            0x1F376, // SAKE BOTTLE AND CUP
            0x1F377, // WINE GLASS
            0x1F378, // COCKTAIL GLASS
            0x1F379, // TROPICAL DRINK
            0x1F37A, // BEER MUG
            0x1F37B, // CLINKING BEER MUGS
            0x1F380, // RIBBON
            0x1F381, // WRAPPED PRESENT
            0x1F382, // BIRTHDAY CAKE
            0x1F383, // JACK-O-LANTERN
            0x1F384, // CHRISTMAS TREE
            0x1F385, // FATHER CHRISTMAS
            0x1F386, // FIREWORKS
            0x1F387, // FIREWORK SPARKLER
            0x1F388, // BALLOON
            0x1F389, // PARTY POPPER
            0x1F38A, // CONFETTI BALL
            0x1F38B, // TANABATA TREE
            0x1F38C, // CROSSED FLAGS
            0x1F38D, // PINE DECORATION
            0x1F38E, // JAPANESE DOLLS
            0x1F38F, // CARP STREAMER
            0x1F390, // WIND CHIME
            0x1F391, // MOON VIEWING CEREMONY
            0x1F392, // SCHOOL SATCHEL
            0x1F393, // GRADUATION CAP
            0x1F3A0, // CAROUSEL HORSE
            0x1F3A1, // FERRIS WHEEL
            0x1F3A2, // ROLLER COASTER
            0x1F3A3, // FISHING POLE AND FISH
            0x1F3A4, // MICROPHONE
            0x1F3A5, // MOVIE CAMERA
            0x1F3A6, // CINEMA
            0x1F3A7, // HEADPHONE
            0x1F3A8, // ARTIST PALETTE
            0x1F3A9, // TOP HAT
            0x1F3AA, // CIRCUS TENT
            0x1F3AB, // TICKET
            0x1F3AC, // CLAPPER BOARD
            0x1F3AD, // PERFORMING ARTS
            0x1F3AE, // VIDEO GAME
            0x1F3AF, // DIRECT HIT
            0x1F3B0, // SLOT MACHINE
            0x1F3B1, // BILLIARDS
            0x1F3B2, // GAME DIE
            0x1F3B3, // BOWLING
            0x1F3B4, // FLOWER PLAYING CARDS
            0x1F3B5, // MUSICAL NOTE
            0x1F3B6, // MULTIPLE MUSICAL NOTES
            0x1F3B7, // SAXOPHONE
            0x1F3B8, // GUITAR
            0x1F3B9, // MUSICAL KEYBOARD
            0x1F3BA, // TRUMPET
            0x1F3BB, // VIOLIN
            0x1F3BC, // MUSICAL SCORE
            0x1F3BD, // RUNNING SHIRT WITH SASH
            0x1F3BE, // TENNIS RACQUET AND BALL
            0x1F3BF, // SKI AND SKI BOOT
            0x1F3C0, // BASKETBALL AND HOOP
            0x1F3C1, // CHEQUERED FLAG
            0x1F3C2, // SNOWBOARDER
            0x1F3C3, // RUNNER
            0x1F3C4, // SURFER
            0x1F3C6, // TROPHY
            0x1F3C8, // AMERICAN FOOTBALL
            0x1F3CA, // SWIMMER
            0x1F3E0, // HOUSE BUILDING
            0x1F3E1, // HOUSE WITH GARDEN
            0x1F3E2, // OFFICE BUILDING
            0x1F3E3, // JAPANESE POST OFFICE
            0x1F3E5, // HOSPITAL
            0x1F3E6, // BANK
            0x1F3E7, // AUTOMATED TELLER MACHINE
            0x1F3E8, // HOTEL
            0x1F3E9, // LOVE HOTEL
            0x1F3EA, // CONVENIENCE STORE
            0x1F3EB, // SCHOOL
            0x1F3EC, // DEPARTMENT STORE
            0x1F3ED, // FACTORY
            0x1F3EE, // IZAKAYA LANTERN
            0x1F3EF, // JAPANESE CASTLE
            0x1F3F0, // EUROPEAN CASTLE
            0x1F40C, // SNAIL
            0x1F40D, // SNAKE
            0x1F40E, // HORSE
            0x1F411, // SHEEP
            0x1F412, // MONKEY
            0x1F414, // CHICKEN
            0x1F417, // BOAR
            0x1F418, // ELEPHANT
            0x1F419, // OCTOPUS
            0x1F41A, // SPIRAL SHELL
            0x1F41B, // BUG
            0x1F41C, // ANT
            0x1F41D, // HONEYBEE
            0x1F41E, // LADY BEETLE
            0x1F41F, // FISH
            0x1F420, // TROPICAL FISH
            0x1F421, // BLOWFISH
            0x1F422, // TURTLE
            0x1F423, // HATCHING CHICK
            0x1F424, // BABY CHICK
            0x1F425, // FRONT-FACING BABY CHICK
            0x1F426, // BIRD
            0x1F427, // PENGUIN
            0x1F428, // KOALA
            0x1F429, // POODLE
            0x1F42B, // BACTRIAN CAMEL
            0x1F42C, // DOLPHIN
            0x1F42D, // MOUSE FACE
            0x1F42E, // COW FACE
            0x1F42F, // TIGER FACE
            0x1F430, // RABBIT FACE
            0x1F431, // CAT FACE
            0x1F432, // DRAGON FACE
            0x1F433, // SPOUTING WHALE
            0x1F434, // HORSE FACE
            0x1F435, // MONKEY FACE
            0x1F436, // DOG FACE
            0x1F437, // PIG FACE
            0x1F438, // FROG FACE
            0x1F439, // HAMSTER FACE
            0x1F43A, // WOLF FACE
            0x1F43B, // BEAR FACE
            0x1F43C, // PANDA FACE
            0x1F43D, // PIG NOSE
            0x1F43E, // PAW PRINTS
            0x1F440, // EYES
            0x1F442, // EAR
            0x1F443, // NOSE
            0x1F444, // MOUTH
            0x1F445, // TONGUE
            0x1F446, // WHITE UP POINTING BACKHAND INDEX
            0x1F447, // WHITE DOWN POINTING BACKHAND INDEX
            0x1F448, // WHITE LEFT POINTING BACKHAND INDEX
            0x1F449, // WHITE RIGHT POINTING BACKHAND INDEX
            0x1F44A, // FISTED HAND SIGN
            0x1F44B, // WAVING HAND SIGN
            0x1F44C, // OK HAND SIGN
            0x1F44D, // THUMBS UP SIGN
            0x1F44E, // THUMBS DOWN SIGN
            0x1F44F, // CLAPPING HANDS SIGN
            0x1F450, // OPEN HANDS SIGN
            0x1F451, // CROWN
            0x1F452, // WOMANS HAT
            0x1F453, // EYEGLASSES
            0x1F454, // NECKTIE
            0x1F455, // T-SHIRT
            0x1F456, // JEANS
            0x1F457, // DRESS
            0x1F458, // KIMONO
            0x1F459, // BIKINI
            0x1F45A, // WOMANS CLOTHES
            0x1F45B, // PURSE
            0x1F45C, // HANDBAG
            0x1F45D, // POUCH
            0x1F45E, // MANS SHOE
            0x1F45F, // ATHLETIC SHOE
            0x1F460, // HIGH-HEELED SHOE
            0x1F461, // WOMANS SANDAL
            0x1F462, // WOMANS BOOTS
            0x1F463, // FOOTPRINTS
            0x1F464, // BUST IN SILHOUETTE
            0x1F466, // BOY
            0x1F467, // GIRL
            0x1F468, // MAN
            0x1F469, // WOMAN
            0x1F46A, // FAMILY
            0x1F46B, // MAN AND WOMAN HOLDING HANDS
            0x1F46E, // POLICE OFFICER
            0x1F46F, // WOMAN WITH BUNNY EARS
            0x1F470, // BRIDE WITH VEIL
            0x1F471, // PERSON WITH BLOND HAIR
            0x1F472, // MAN WITH GUA PI MAO
            0x1F473, // MAN WITH TURBAN
            0x1F474, // OLDER MAN
            0x1F475, // OLDER WOMAN
            0x1F476, // BABY
            0x1F477, // CONSTRUCTION WORKER
            0x1F478, // PRINCESS
            0x1F479, // JAPANESE OGRE
            0x1F47A, // JAPANESE GOBLIN
            0x1F47B, // GHOST
            0x1F47C, // BABY ANGEL
            0x1F47D, // EXTRATERRESTRIAL ALIEN
            0x1F47E, // ALIEN MONSTER
            0x1F47F, // IMP
            0x1F480, // SKULL
            0x1F481, // INFORMATION DESK PERSON
            0x1F482, // GUARDSMAN
            0x1F483, // DANCER
            0x1F484, // LIPSTICK
            0x1F485, // NAIL POLISH
            0x1F486, // FACE MASSAGE
            0x1F487, // HAIRCUT
            0x1F488, // BARBER POLE
            0x1F489, // SYRINGE
            0x1F48A, // PILL
            0x1F48B, // KISS MARK
            0x1F48C, // LOVE LETTER
            0x1F48D, // RING
            0x1F48E, // GEM STONE
            0x1F48F, // KISS
            0x1F490, // BOUQUET
            0x1F491, // COUPLE WITH HEART
            0x1F492, // WEDDING
            0x1F493, // BEATING HEART
            0x1F494, // BROKEN HEART
            0x1F495, // TWO HEARTS
            0x1F496, // SPARKLING HEART
            0x1F497, // GROWING HEART
            0x1F498, // HEART WITH ARROW
            0x1F499, // BLUE HEART
            0x1F49A, // GREEN HEART
            0x1F49B, // YELLOW HEART
            0x1F49C, // PURPLE HEART
            0x1F49D, // HEART WITH RIBBON
            0x1F49E, // REVOLVING HEARTS
            0x1F49F, // HEART DECORATION
            0x1F4A0, // DIAMOND SHAPE WITH A DOT INSIDE
            0x1F4A1, // ELECTRIC LIGHT BULB
            0x1F4A2, // ANGER SYMBOL
            0x1F4A3, // BOMB
            0x1F4A4, // SLEEPING SYMBOL
            0x1F4A5, // COLLISION SYMBOL
            0x1F4A6, // SPLASHING SWEAT SYMBOL
            0x1F4A7, // DROPLET
            0x1F4A8, // DASH SYMBOL
            0x1F4A9, // PILE OF POO
            0x1F4AA, // FLEXED BICEPS
            0x1F4AB, // DIZZY SYMBOL
            0x1F4AC, // SPEECH BALLOON
            0x1F4AE, // WHITE FLOWER
            0x1F4AF, // HUNDRED POINTS SYMBOL
            0x1F4B0, // MONEY BAG
            0x1F4B1, // CURRENCY EXCHANGE
            0x1F4B2, // HEAVY DOLLAR SIGN
            0x1F4B3, // CREDIT CARD
            0x1F4B4, // BANKNOTE WITH YEN SIGN
            0x1F4B5, // BANKNOTE WITH DOLLAR SIGN
            0x1F4B8, // MONEY WITH WINGS
            0x1F4B9, // CHART WITH UPWARDS TREND AND YEN SIGN
            0x1F4BA, // SEAT
            0x1F4BB, // PERSONAL COMPUTER
            0x1F4BC, // BRIEFCASE
            0x1F4BD, // MINIDISC
            0x1F4BE, // FLOPPY DISK
            0x1F4BF, // OPTICAL DISC
            0x1F4C0, // DVD
            0x1F4C1, // FILE FOLDER
            0x1F4C2, // OPEN FILE FOLDER
            0x1F4C3, // PAGE WITH CURL
            0x1F4C4, // PAGE FACING UP
            0x1F4C5, // CALENDAR
            0x1F4C6, // TEAR-OFF CALENDAR
            0x1F4C7, // CARD INDEX
            0x1F4C8, // CHART WITH UPWARDS TREND
            0x1F4C9, // CHART WITH DOWNWARDS TREND
            0x1F4CA, // BAR CHART
            0x1F4CB, // CLIPBOARD
            0x1F4CC, // PUSHPIN
            0x1F4CD, // ROUND PUSHPIN
            0x1F4CE, // PAPERCLIP
            0x1F4CF, // STRAIGHT RULER
            0x1F4D0, // TRIANGULAR RULER
            0x1F4D1, // BOOKMARK TABS
            0x1F4D2, // LEDGER
            0x1F4D3, // NOTEBOOK
            0x1F4D4, // NOTEBOOK WITH DECORATIVE COVER
            0x1F4D5, // CLOSED BOOK
            0x1F4D6, // OPEN BOOK
            0x1F4D7, // GREEN BOOK
            0x1F4D8, // BLUE BOOK
            0x1F4D9, // ORANGE BOOK
            0x1F4DA, // BOOKS
            0x1F4DB, // NAME BADGE
            0x1F4DC, // SCROLL
            0x1F4DD, // MEMO
            0x1F4DE, // TELEPHONE RECEIVER
            0x1F4DF, // PAGER
            0x1F4E0, // FAX MACHINE
            0x1F4E1, // SATELLITE ANTENNA
            0x1F4E2, // PUBLIC ADDRESS LOUDSPEAKER
            0x1F4E3, // CHEERING MEGAPHONE
            0x1F4E4, // OUTBOX TRAY
            0x1F4E5, // INBOX TRAY
            0x1F4E6, // PACKAGE
            0x1F4E7, // E-MAIL SYMBOL
            0x1F4E8, // INCOMING ENVELOPE
            0x1F4E9, // ENVELOPE WITH DOWNWARDS ARROW ABOVE
            0x1F4EA, // CLOSED MAILBOX WITH LOWERED FLAG
            0x1F4EB, // CLOSED MAILBOX WITH RAISED FLAG
            0x1F4EE, // POSTBOX
            0x1F4F0, // NEWSPAPER
            0x1F4F1, // MOBILE PHONE
            0x1F4F2, // MOBILE PHONE WITH RIGHTWARDS ARROW AT LEFT
            0x1F4F3, // VIBRATION MODE
            0x1F4F4, // MOBILE PHONE OFF
            0x1F4F6, // ANTENNA WITH BARS
            0x1F4F7, // CAMERA
            0x1F4F9, // VIDEO CAMERA
            0x1F4FA, // TELEVISION
            0x1F4FB, // RADIO
            0x1F4FC, // VIDEOCASSETTE
            0x1F503, // CLOCKWISE DOWNWARDS AND UPWARDS OPEN CIRCLE ARROWS
            0x1F50A, // SPEAKER WITH THREE SOUND WAVES
            0x1F50B, // BATTERY
            0x1F50C, // ELECTRIC PLUG
            0x1F50D, // LEFT-POINTING MAGNIFYING GLASS
            0x1F50E, // RIGHT-POINTING MAGNIFYING GLASS
            0x1F50F, // LOCK WITH INK PEN
            0x1F510, // CLOSED LOCK WITH KEY
            0x1F511, // KEY
            0x1F512, // LOCK
            0x1F513, // OPEN LOCK
            0x1F514, // BELL
            0x1F516, // BOOKMARK
            0x1F517, // LINK SYMBOL
            0x1F518, // RADIO BUTTON
            0x1F53A, // UP-POINTING RED TRIANGLE
            0x1F53B, // DOWN-POINTING RED TRIANGLE
            0x1F53C, // UP-POINTING SMALL RED TRIANGLE
            0x1F53D, // DOWN-POINTING SMALL RED TRIANGLE
            0x1F519, // BACK WITH LEFTWARDS ARROW ABOVE
            0x1F51A, // END WITH LEFTWARDS ARROW ABOVE
            0x1F51B, // ON WITH EXCLAMATION MARK WITH LEFT RIGHT ARROW ABOVE
            0x1F51C, // SOON WITH RIGHTWARDS ARROW ABOVE
            0x1F51D, // TOP WITH UPWARDS ARROW ABOVE
            0x1F51E, // NO ONE UNDER EIGHTEEN SYMBOL
            0x1F51F, // KEYCAP TEN
            0x1F520, // INPUT SYMBOL FOR LATIN CAPITAL LETTERS
            0x1F521, // INPUT SYMBOL FOR LATIN SMALL LETTERS
            0x1F522, // INPUT SYMBOL FOR NUMBERS
            0x1F523, // INPUT SYMBOL FOR SYMBOLS
            0x1F524, // INPUT SYMBOL FOR LATIN LETTERS
            0x1F525, // FIRE
            0x1F526, // ELECTRIC TORCH
            0x1F527, // WRENCH
            0x1F528, // HAMMER
            0x1F529, // NUT AND BOLT
            0x1F52A, // HOCHO
            0x1F52B, // PISTOL
            0x1F52E, // CRYSTAL BALL
            0x1F52F, // SIX POINTED STAR WITH MIDDLE DOT
            0x1F530, // JAPANESE SYMBOL FOR BEGINNER
            0x1F531, // TRIDENT EMBLEM
            0x1F532, // BLACK SQUARE BUTTON
            0x1F533, // WHITE SQUARE BUTTON
            0x1F534, // LARGE RED CIRCLE
            0x1F535, // LARGE BLUE CIRCLE
            0x1F536, // LARGE ORANGE DIAMOND
            0x1F537, // LARGE BLUE DIAMOND
            0x1F538, // SMALL ORANGE DIAMOND
            0x1F539, // SMALL BLUE DIAMOND
            0x1F550, // CLOCK FACE ONE OCLOCK
            0x1F551, // CLOCK FACE TWO OCLOCK
            0x1F552, // CLOCK FACE THREE OCLOCK
            0x1F553, // CLOCK FACE FOUR OCLOCK
            0x1F554, // CLOCK FACE FIVE OCLOCK
            0x1F555, // CLOCK FACE SIX OCLOCK
            0x1F556, // CLOCK FACE SEVEN OCLOCK
            0x1F557, // CLOCK FACE EIGHT OCLOCK
            0x1F558, // CLOCK FACE NINE OCLOCK
            0x1F559, // CLOCK FACE TEN OCLOCK
            0x1F55A, // CLOCK FACE ELEVEN OCLOCK
            0x1F55B, // CLOCK FACE TWELVE OCLOCK
            0x1F5FB, // MOUNT FUJI
            0x1F5FC, // TOKYO TOWER
            0x1F5FD, // STATUE OF LIBERTY
            0x1F5FE, // SILHOUETTE OF JAPAN
            0x1F5FF, // MOYAI
            0x1F601, // GRINNING FACE WITH SMILING EYES
            0x1F602, // FACE WITH TEARS OF JOY
            0x1F603, // SMILING FACE WITH OPEN MOUTH
            0x1F604, // SMILING FACE WITH OPEN MOUTH AND SMILING EYES
            0x1F605, // SMILING FACE WITH OPEN MOUTH AND COLD SWEAT
            0x1F606, // SMILING FACE WITH OPEN MOUTH AND TIGHTLY-CLOSED EYES
            0x1F609, // WINKING FACE
            0x1F60A, // SMILING FACE WITH SMILING EYES
            0x1F60B, // FACE SAVOURING DELICIOUS FOOD
            0x1F60C, // RELIEVED FACE
            0x1F60D, // SMILING FACE WITH HEART-SHAPED EYES
            0x1F60F, // SMIRKING FACE
            0x1F612, // UNAMUSED FACE
            0x1F613, // FACE WITH COLD SWEAT
            0x1F614, // PENSIVE FACE
            0x1F616, // CONFOUNDED FACE
            0x1F618, // FACE THROWING A KISS
            0x1F61A, // KISSING FACE WITH CLOSED EYES
            0x1F61C, // FACE WITH STUCK-OUT TONGUE AND WINKING EYE
            0x1F61D, // FACE WITH STUCK-OUT TONGUE AND TIGHTLY-CLOSED EYES
            0x1F61E, // DISAPPOINTED FACE
            0x1F620, // ANGRY FACE
            0x1F621, // POUTING FACE
            0x1F622, // CRYING FACE
            0x1F623, // PERSEVERING FACE
            0x1F624, // FACE WITH LOOK OF TRIUMPH
            0x1F625, // DISAPPOINTED BUT RELIEVED FACE
            0x1F628, // FEARFUL FACE
            0x1F629, // WEARY FACE
            0x1F62A, // SLEEPY FACE
            0x1F62B, // TIRED FACE
            0x1F62D, // LOUDLY CRYING FACE
            0x1F630, // FACE WITH OPEN MOUTH AND COLD SWEAT
            0x1F631, // FACE SCREAMING IN FEAR
            0x1F632, // ASTONISHED FACE
            0x1F633, // FLUSHED FACE
            0x1F635, // DIZZY FACE
            0x1F637, // FACE WITH MEDICAL MASK
            0x1F638, // GRINNING CAT FACE WITH SMILING EYES
            0x1F639, // CAT FACE WITH TEARS OF JOY
            0x1F63A, // SMILING CAT FACE WITH OPEN MOUTH
            0x1F63B, // SMILING CAT FACE WITH HEART-SHAPED EYES
            0x1F63C, // CAT FACE WITH WRY SMILE
            0x1F63D, // KISSING CAT FACE WITH CLOSED EYES
            0x1F63E, // POUTING CAT FACE
            0x1F63F, // CRYING CAT FACE
            0x1F640, // WEARY CAT FACE
            0x1F645, // FACE WITH NO GOOD GESTURE
            0x1F646, // FACE WITH OK GESTURE
            0x1F647, // PERSON BOWING DEEPLY
            0x1F648, // SEE-NO-EVIL MONKEY
            0x1F649, // HEAR-NO-EVIL MONKEY
            0x1F64A, // SPEAK-NO-EVIL MONKEY
            0x1F64B, // HAPPY PERSON RAISING ONE HAND
            0x1F64C, // PERSON RAISING BOTH HANDS IN CELEBRATION
            0x1F64D, // PERSON FROWNING
            0x1F64E, // PERSON WITH POUTING FACE
            0x1F64F, // PERSON WITH FOLDED HANDS
            0x1F680, // ROCKET
            0x1F683, // RAILWAY CAR
            0x1F684, // HIGH-SPEED TRAIN
            0x1F685, // HIGH-SPEED TRAIN WITH BULLET NOSE
            0x1F687, // METRO
            0x1F689, // STATION
            0x1F68C, // BUS
            0x1F68F, // BUS STOP
            0x1F691, // AMBULANCE
            0x1F692, // FIRE ENGINE
            0x1F693, // POLICE CAR
            0x1F695, // TAXI
            0x1F697, // AUTOMOBILE
            0x1F699, // RECREATIONAL VEHICLE
            0x1F69A, // DELIVERY TRUCK
            0x1F6A2, // SHIP
            0x1F6A4, // SPEEDBOAT
            0x1F6A5, // HORIZONTAL TRAFFIC LIGHT
            0x1F6A7, // CONSTRUCTION SIGN
            0x1F6A8, // POLICE CARS REVOLVING LIGHT
            0x1F6A9, // TRIANGULAR FLAG ON POST
            0x1F6AA, // DOOR
            0x1F6AB, // NO ENTRY SIGN
            0x1F6AC, // SMOKING SYMBOL
            0x1F6AD, // NO SMOKING SYMBOL
            0x1F6B2, // BICYCLE
            0x1F6B6, // PEDESTRIAN
            0x1F6B9, // MENS SYMBOL
            0x1F6BA, // WOMENS SYMBOL
            0x1F6BB, // RESTROOM
            0x1F6BC, // BABY SYMBOL
            0x1F6BD, // TOILET
            0x1F6BE, // WATER CLOSET
            0x1F6C0  // BAT
    };
}
