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

public val SolidGroup.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.1f, 9.5f)
                curveTo(198.1f, -5.3f, 211.2f, -16.0f, 226.4f, -16.0f)
                lineToRelative(59.8f, 0.0f)
                curveToRelative(15.2f, 0.0f, 28.3f, 10.7f, 31.3f, 25.5f)
                lineTo(332.0f, 79.5f)
                curveToRelative(14.1f, 6.0f, 27.3f, 13.7f, 39.3f, 22.8f)
                lineToRelative(67.8f, -22.5f)
                curveToRelative(14.4f, -4.8f, 30.2f, 1.2f, 37.8f, 14.4f)
                lineToRelative(29.9f, 51.8f)
                curveToRelative(7.6f, 13.2f, 4.9f, 29.8f, -6.5f, 39.9f)
                lineTo(447.0f, 233.3f)
                curveToRelative(0.9f, 7.4f, 1.3f, 15.0f, 1.3f, 22.7f)
                reflectiveCurveToRelative(-0.5f, 15.3f, -1.3f, 22.7f)
                lineToRelative(53.4f, 47.5f)
                curveToRelative(11.4f, 10.1f, 14.0f, 26.8f, 6.5f, 39.9f)
                lineToRelative(-29.9f, 51.8f)
                curveToRelative(-7.6f, 13.1f, -23.4f, 19.2f, -37.8f, 14.4f)
                lineToRelative(-67.8f, -22.5f)
                curveToRelative(-12.1f, 9.1f, -25.3f, 16.7f, -39.3f, 22.8f)
                lineToRelative(-14.4f, 69.9f)
                curveToRelative(-3.1f, 14.9f, -16.2f, 25.5f, -31.3f, 25.5f)
                lineToRelative(-59.8f, 0.0f)
                curveToRelative(-15.2f, 0.0f, -28.3f, -10.7f, -31.3f, -25.5f)
                lineToRelative(-14.4f, -69.9f)
                curveToRelative(-14.1f, -6.0f, -27.2f, -13.7f, -39.3f, -22.8f)
                lineTo(73.5f, 432.3f)
                curveToRelative(-14.4f, 4.8f, -30.2f, -1.2f, -37.8f, -14.4f)
                lineTo(5.8f, 366.1f)
                curveToRelative(-7.6f, -13.2f, -4.9f, -29.8f, 6.5f, -39.9f)
                lineToRelative(53.4f, -47.5f)
                curveToRelative(-0.9f, -7.4f, -1.3f, -15.0f, -1.3f, -22.7f)
                reflectiveCurveToRelative(0.5f, -15.3f, 1.3f, -22.7f)
                lineTo(12.3f, 185.8f)
                curveToRelative(-11.4f, -10.1f, -14.0f, -26.8f, -6.5f, -39.9f)
                lineTo(35.7f, 94.1f)
                curveToRelative(7.6f, -13.2f, 23.4f, -19.2f, 37.8f, -14.4f)
                lineToRelative(67.8f, 22.5f)
                curveToRelative(12.1f, -9.1f, 25.3f, -16.7f, 39.3f, -22.8f)
                lineTo(195.1f, 9.5f)
                close()
                moveTo(256.3f, 336.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -0.6f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 0.6f, 160.0f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
