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

public val SolidGroup.TowerObservation: ImageVector
    get() {
        if (_towerObservation != null) {
            return _towerObservation!!
        }
        _towerObservation = Builder(name = "TowerObservation", defaultWidth = 448.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(209.7f, 3.4f)
                curveToRelative(9.0f, -4.5f, 19.6f, -4.5f, 28.6f, 0.0f)
                lineToRelative(160.0f, 80.0f)
                curveToRelative(15.8f, 7.9f, 22.2f, 27.1f, 14.3f, 42.9f)
                curveToRelative(-5.6f, 11.2f, -16.9f, 17.7f, -28.6f, 17.7f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-13.0f, 0.0f)
                lineToRelative(32.0f, 192.0f)
                lineToRelative(45.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(45.0f, 0.0f)
                lineToRelative(32.0f, -192.0f)
                lineToRelative(-13.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(-11.7f, 0.0f, -23.0f, -6.5f, -28.6f, -17.7f)
                curveToRelative(-7.9f, -15.8f, -1.5f, -35.0f, 14.3f, -42.9f)
                lineToRelative(160.0f, -80.0f)
                close()
                moveTo(310.7f, 448.0f)
                lineToRelative(-86.7f, -61.9f)
                lineToRelative(-86.7f, 61.9f)
                lineToRelative(173.4f, 0.0f)
                close()
                moveTo(157.7f, 256.0f)
                lineToRelative(-3.5f, 21.2f)
                lineToRelative(69.9f, 49.9f)
                lineToRelative(69.9f, -49.9f)
                lineToRelative(-3.5f, -21.2f)
                lineToRelative(-132.7f, 0.0f)
                close()
                moveTo(145.4f, 329.9f)
                lineToRelative(-10.1f, 60.6f)
                lineToRelative(47.5f, -33.9f)
                lineToRelative(-37.4f, -26.7f)
                close()
                moveTo(265.3f, 356.6f)
                lineToRelative(47.5f, 33.9f)
                lineToRelative(-10.1f, -60.6f)
                lineToRelative(-37.4f, 26.7f)
                close()
                moveTo(152.0f, 128.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                reflectiveCurveToRelative(10.7f, 24.0f, 24.0f, 24.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-144.0f, 0.0f)
                close()
            }
        }
        .build()
        return _towerObservation!!
    }

private var _towerObservation: ImageVector? = null
