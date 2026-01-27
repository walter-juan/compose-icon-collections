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

public val SolidGroup.Vest: ImageVector
    get() {
        if (_vest != null) {
            return _vest!!
        }
        _vest = Builder(name = "Vest", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 464.0f)
                lineToRelative(0.0f, -170.1f)
                curveToRelative(0.0f, -3.9f, -0.5f, -7.8f, -1.4f, -11.6f)
                lineTo(144.4f, 65.4f)
                curveTo(162.1f, 77.2f, 188.2f, 88.0f, 224.0f, 88.0f)
                reflectiveCurveToRelative(61.9f, -10.8f, 79.6f, -22.6f)
                lineTo(249.4f, 282.3f)
                curveToRelative(-1.0f, 3.8f, -1.4f, 7.7f, -1.4f, 11.6f)
                lineTo(248.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(104.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -193.5f)
                curveToRelative(0.0f, -9.5f, -2.8f, -18.7f, -8.1f, -26.6f)
                lineToRelative(-47.9f, -71.8f)
                curveToRelative(-5.3f, -7.9f, -8.1f, -17.1f, -8.1f, -26.6f)
                lineTo(384.0f, 48.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-3.5f, 0.0f)
                curveToRelative(-0.3f, 0.0f, -0.6f, 0.0f, -1.0f, 0.0f)
                curveToRelative(-0.6f, 0.0f, -1.2f, 0.0f, -1.8f, 0.0f)
                curveToRelative(-18.8f, 0.0f, -34.1f, 9.7f, -44.1f, 18.8f)
                curveToRelative(-9.3f, 8.4f, -28.5f, 21.2f, -61.7f, 21.2f)
                reflectiveCurveToRelative(-52.4f, -12.8f, -61.7f, -21.2f)
                curveToRelative(-10.0f, -9.1f, -25.3f, -18.8f, -44.1f, -18.8f)
                curveToRelative(-0.6f, 0.0f, -1.2f, 0.0f, -1.8f, 0.0f)
                curveToRelative(-0.3f, 0.0f, -0.6f, 0.0f, -1.0f, 0.0f)
                lineTo(112.0f, 0.0f)
                curveTo(85.5f, 0.0f, 64.0f, 21.5f, 64.0f, 48.0f)
                lineToRelative(0.0f, 97.5f)
                curveToRelative(0.0f, 9.5f, -2.8f, 18.7f, -8.1f, 26.6f)
                lineTo(8.1f, 243.9f)
                curveTo(2.8f, 251.8f, 0.0f, 261.1f, 0.0f, 270.5f)
                lineTo(0.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(104.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _vest!!
    }

private var _vest: ImageVector? = null
