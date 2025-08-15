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

public val SolidGroup.UmbrellaBeach: ImageVector
    get() {
        if (_umbrellaBeach != null) {
            return _umbrellaBeach!!
        }
        _umbrellaBeach = Builder(name = "UmbrellaBeach", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(497.5f, 341.1f)
                curveToRelative(-5.9f, 16.7f, -25.3f, 23.0f, -41.1f, 15.1f)
                lineToRelative(-178.2f, -89.1f)
                lineToRelative(-1.6f, 3.2f)
                lineToRelative(-88.8f, 177.7f)
                lineToRelative(292.2f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(84.2f, 0.0f)
                lineToRelative(103.2f, -206.3f)
                lineToRelative(1.6f, -3.2f)
                lineToRelative(-165.4f, -82.7f)
                curveToRelative(-15.8f, -7.9f, -22.4f, -27.3f, -12.5f, -42.0f)
                curveToRelative(45.9f, -68.6f, 124.1f, -113.8f, 212.9f, -113.8f)
                curveToRelative(141.4f, 0.0f, 256.0f, 114.6f, 256.0f, 256.0f)
                curveToRelative(0.0f, 29.8f, -5.1f, 58.5f, -14.5f, 85.1f)
                close()
            }
        }
        .build()
        return _umbrellaBeach!!
    }

private var _umbrellaBeach: ImageVector? = null
