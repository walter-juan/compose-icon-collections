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

public val SolidGroup.HeartCrack: ImageVector
    get() {
        if (_heartCrack != null) {
            return _heartCrack!!
        }
        _heartCrack = Builder(name = "HeartCrack", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(133.1f, 32.0f)
                curveToRelative(17.3f, 0.0f, 34.2f, 3.4f, 49.9f, 9.7f)
                lineToRelative(54.8f, 85.2f)
                lineToRelative(-75.4f, 75.4f)
                curveToRelative(-1.5f, 1.5f, -2.4f, 3.6f, -2.3f, 5.8f)
                reflectiveCurveToRelative(1.0f, 4.2f, 2.6f, 5.7f)
                lineToRelative(112.0f, 104.0f)
                curveToRelative(2.9f, 2.7f, 7.4f, 2.9f, 10.5f, 0.3f)
                reflectiveCurveToRelative(3.8f, -7.0f, 1.7f, -10.4f)
                lineToRelative(-60.4f, -98.1f)
                lineToRelative(90.7f, -75.6f)
                curveToRelative(2.6f, -2.1f, 3.5f, -5.7f, 2.4f, -8.8f)
                lineTo(296.4f, 60.6f)
                curveTo(319.6f, 42.3f, 348.6f, 32.0f, 378.9f, 32.0f)
                curveTo(452.4f, 32.0f, 512.0f, 91.6f, 512.0f, 165.1f)
                lineToRelative(0.0f, 2.6f)
                curveToRelative(0.0f, 112.2f, -139.9f, 242.5f, -212.9f, 298.2f)
                curveToRelative(-12.4f, 9.4f, -27.6f, 14.1f, -43.1f, 14.1f)
                reflectiveCurveToRelative(-30.8f, -4.6f, -43.1f, -14.1f)
                curveTo(139.9f, 410.2f, 0.0f, 279.9f, 0.0f, 167.7f)
                lineToRelative(0.0f, -2.6f)
                curveTo(0.0f, 91.6f, 59.6f, 32.0f, 133.1f, 32.0f)
                close()
            }
        }
        .build()
        return _heartCrack!!
    }

private var _heartCrack: ImageVector? = null
