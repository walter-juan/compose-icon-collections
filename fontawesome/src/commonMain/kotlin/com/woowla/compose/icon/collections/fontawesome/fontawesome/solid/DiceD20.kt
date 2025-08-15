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

public val SolidGroup.DiceD20: ImageVector
    get() {
        if (_diceD20 != null) {
            return _diceD20!!
        }
        _diceD20 = Builder(name = "DiceD20", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.4f, -8.2f)
                curveToRelative(19.6f, -11.1f, 43.6f, -11.1f, 63.1f, 0.0f)
                lineToRelative(192.0f, 108.8f)
                curveToRelative(20.0f, 11.4f, 32.4f, 32.6f, 32.4f, 55.7f)
                lineToRelative(0.0f, 215.6f)
                curveToRelative(0.0f, 23.0f, -12.4f, 44.3f, -32.4f, 55.7f)
                lineToRelative(-192.0f, 108.8f)
                curveToRelative(-19.6f, 11.1f, -43.6f, 11.1f, -63.1f, 0.0f)
                lineTo(32.4f, 427.5f)
                curveTo(12.4f, 416.1f, 0.0f, 394.8f, 0.0f, 371.8f)
                lineTo(0.0f, 156.2f)
                curveToRelative(0.0f, -23.0f, 12.4f, -44.3f, 32.4f, -55.7f)
                lineTo(224.4f, -8.2f)
                close()
                moveTo(276.4f, 65.0f)
                curveTo(267.0f, 49.8f, 245.0f, 49.8f, 235.6f, 65.0f)
                lineToRelative(-76.6f, 123.7f)
                lineToRelative(-85.4f, -46.3f)
                lineToRelative(-3.8f, -1.6f)
                curveToRelative(-8.9f, -2.7f, -18.8f, 1.1f, -23.4f, 9.6f)
                reflectiveCurveToRelative(-2.4f, 18.9f, 4.7f, 24.8f)
                lineToRelative(3.3f, 2.3f)
                lineToRelative(83.4f, 45.2f)
                lineToRelative(-74.6f, 120.6f)
                curveTo(55.3f, 356.2f, 61.0f, 373.0f, 75.0f, 378.4f)
                lineToRelative(161.0f, 61.9f)
                lineToRelative(0.0f, 39.7f)
                curveToRelative(0.0f, 11.0f, 9.0f, 20.0f, 20.0f, 20.0f)
                reflectiveCurveToRelative(20.0f, -9.0f, 20.0f, -20.0f)
                lineToRelative(0.0f, -39.7f)
                lineToRelative(161.0f, -61.9f)
                curveToRelative(14.0f, -5.4f, 19.7f, -22.2f, 11.8f, -35.0f)
                lineToRelative(-74.7f, -120.6f)
                lineToRelative(83.4f, -45.2f)
                curveToRelative(9.7f, -5.3f, 13.3f, -17.4f, 8.1f, -27.1f)
                reflectiveCurveToRelative(-17.4f, -13.3f, -27.1f, -8.1f)
                lineTo(353.0f, 188.7f)
                lineTo(276.4f, 65.0f)
                close()
                moveTo(229.4f, 394.9f)
                lineToRelative(-122.0f, -46.9f)
                lineToRelative(54.5f, -88.1f)
                lineToRelative(67.5f, 135.0f)
                close()
                moveTo(404.6f, 348.0f)
                lineToRelative(-122.0f, 46.9f)
                lineToRelative(67.5f, -135.0f)
                lineToRelative(54.5f, 88.1f)
                close()
                moveTo(319.3f, 232.0f)
                lineTo(256.0f, 358.6f)
                lineTo(192.7f, 232.0f)
                lineTo(319.3f, 232.0f)
                close()
                moveTo(308.0f, 192.0f)
                lineToRelative(-104.1f, 0.0f)
                lineToRelative(52.0f, -84.0f)
                lineToRelative(52.0f, 84.0f)
                close()
            }
        }
        .build()
        return _diceD20!!
    }

private var _diceD20: ImageVector? = null
