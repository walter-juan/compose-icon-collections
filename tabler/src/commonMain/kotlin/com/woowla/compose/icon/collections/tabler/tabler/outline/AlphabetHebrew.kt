package com.woowla.compose.icon.collections.tabler.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.OutlineGroup
import androidx.compose.ui.graphics.StrokeCap.Companion.Round as strokeCapRound
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round as strokeJoinRound

public val OutlineGroup.AlphabetHebrew: ImageVector
    get() {
        if (_alphabetHebrew != null) {
            return _alphabetHebrew!!
        }
        _alphabetHebrew = Builder(name = "AlphabetHebrew", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 6.0f)
                curveToRelative(2.333f, 5.143f, 6.611f, 6.857f, 9.333f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.667f, 14.0f)
                curveToRelative(2.505f, -1.5f, 2.666f, -4.141f, 2.666f, -5.333f)
                curveToRelative(0.0f, -1.778f, -0.443f, -2.667f, -0.443f, -2.667f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = strokeCapRound, strokeLineJoin =
                    strokeJoinRound, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.485f, 18.0f)
                reflectiveCurveToRelative(-0.485f, -0.905f, -0.485f, -2.714f)
                curveToRelative(0.0f, -1.172f, 0.164f, -3.722f, 2.641f, -5.27f)
            }
        }
        .build()
        return _alphabetHebrew!!
    }

private var _alphabetHebrew: ImageVector? = null
