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

public val SolidGroup.TentArrowLeftRight: ImageVector
    get() {
        if (_tentArrowLeftRight != null) {
            return _tentArrowLeftRight!!
        }
        _tentArrowLeftRight = Builder(name = "TentArrowLeftRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(-0.5f, 113.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(72.0f, -72.0f)
                curveToRelative(9.4f, -9.4f, 24.6f, -9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-31.0f, 31.0f)
                lineToRelative(310.1f, 0.0f)
                lineToRelative(54.1f, 0.0f)
                lineToRelative(-31.0f, -31.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(72.0f, 72.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(-72.0f, 72.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                reflectiveCurveToRelative(-9.4f, -24.6f, 0.0f, -33.9f)
                lineToRelative(31.0f, -31.0f)
                lineToRelative(-102.1f, 0.0f)
                lineToRelative(-0.1f, 0.0f)
                lineToRelative(-262.0f, 0.0f)
                lineToRelative(31.0f, 31.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-72.0f, -72.0f)
                close()
                moveTo(37.1f, 476.0f)
                lineTo(60.3f, 292.6f)
                curveToRelative(1.2f, -9.7f, 6.8f, -18.3f, 15.1f, -23.3f)
                lineTo(238.8f, 170.0f)
                curveToRelative(10.2f, -6.2f, 22.9f, -6.2f, 33.1f, -0.1f)
                lineToRelative(165.5f, 99.4f)
                curveToRelative(8.4f, 5.0f, 14.0f, 13.7f, 15.3f, 23.4f)
                lineTo(475.9f, 476.0f)
                curveToRelative(2.4f, 19.1f, -12.5f, 36.0f, -31.7f, 36.0f)
                lineToRelative(-71.9f, 0.0f)
                curveToRelative(-12.1f, 0.0f, -23.2f, -6.8f, -28.6f, -17.7f)
                lineTo(275.4f, 357.9f)
                curveToRelative(-1.8f, -3.6f, -5.5f, -5.9f, -9.5f, -5.9f)
                curveToRelative(-5.9f, 0.0f, -10.6f, 4.7f, -10.6f, 10.6f)
                lineToRelative(0.0f, 117.4f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(68.8f, 512.0f)
                curveToRelative(-19.3f, 0.0f, -34.2f, -16.9f, -31.7f, -36.0f)
                close()
            }
        }
        .build()
        return _tentArrowLeftRight!!
    }

private var _tentArrowLeftRight: ImageVector? = null
