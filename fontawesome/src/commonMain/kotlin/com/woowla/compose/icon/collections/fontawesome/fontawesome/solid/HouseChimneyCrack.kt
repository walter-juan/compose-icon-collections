package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.HouseChimneyCrack: ImageVector
    get() {
        if (_houseChimneyCrack != null) {
            return _houseChimneyCrack!!
        }
        _houseChimneyCrack = Builder(name = "HouseChimneyCrack", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.2f, 8.6f)
                curveToRelative(12.3f, -11.4f, 31.3f, -11.4f, 43.5f, 0.0f)
                lineTo(368.0f, 92.3f)
                lineTo(368.0f, 80.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 101.5f)
                lineToRelative(37.8f, 35.1f)
                curveToRelative(9.6f, 9.0f, 12.8f, 22.9f, 8.0f, 35.1f)
                reflectiveCurveTo(493.2f, 272.0f, 480.0f, 272.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(0.0f, 176.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineToRelative(-105.6f, 0.0f)
                lineToRelative(-38.4f, -64.0f)
                lineToRelative(80.8f, -67.3f)
                curveToRelative(7.8f, -6.5f, 7.6f, -18.6f, -0.4f, -24.9f)
                lineTo(218.6f, 263.2f)
                curveToRelative(-14.6f, -11.5f, -33.8f, 7.0f, -22.8f, 22.0f)
                lineTo(256.0f, 368.0f)
                lineTo(170.5f, 439.2f)
                curveToRelative(-6.1f, 5.0f, -7.5f, 13.8f, -3.5f, 20.5f)
                lineToRelative(31.3f, 52.2f)
                lineToRelative(-86.4f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineToRelative(0.0f, -176.0f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-13.2f, 0.0f, -25.0f, -8.1f, -29.8f, -20.3f)
                reflectiveCurveToRelative(-1.6f, -26.2f, 8.0f, -35.1f)
                lineToRelative(224.0f, -208.0f)
                close()
            }
        }
        .build()
        return _houseChimneyCrack!!
    }

private var _houseChimneyCrack: ImageVector? = null
