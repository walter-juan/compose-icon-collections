package com.woowla.compose.icon.collections.fontawesome.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.BrandsGroup

public val BrandsGroup.Padlet: ImageVector
    get() {
        if (_padlet != null) {
            return _padlet!!
        }
        _padlet = Builder(name = "Padlet", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(297.9f, 0.0f)
                lineToRelative(0.1f, 0.0f)
                curveToRelative(7.6f, 0.1f, 14.4f, 4.7f, 17.5f, 11.8f)
                lineToRelative(132.0f, 308.5f)
                lineToRelative(0.3f, -0.1f)
                lineToRelative(0.2f, 0.4f)
                lineToRelative(-2.8f, 10.0f)
                lineToRelative(-42.9f, 158.0f)
                curveToRelative(-3.7f, 16.2f, -19.7f, 26.3f, -35.8f, 22.6f)
                lineToRelative(-68.4f, -15.6f)
                lineToRelative(-68.5f, 15.6f)
                curveToRelative(-16.1f, 3.7f, -32.1f, -6.4f, -35.8f, -22.6f)
                lineToRelative(-42.9f, -158.0f)
                lineToRelative(-2.7f, -10.0f)
                lineToRelative(0.1f, -0.4f)
                lineToRelative(132.1f, -308.4f)
                curveToRelative(3.0f, -7.0f, 9.9f, -11.6f, 17.5f, -11.8f)
                close()
                moveTo(160.1f, 322.1f)
                lineToRelative(131.0f, 39.1f)
                lineToRelative(6.9f, 122.5f)
                lineToRelative(7.9f, -121.5f)
                lineToRelative(130.6f, -39.3f)
                lineToRelative(0.2f, -0.1f)
                lineToRelative(-131.0f, 25.1f)
                lineToRelative(-8.6f, -320.2f)
                lineToRelative(-5.2f, 320.2f)
                lineToRelative(-131.8f, -25.8f)
                close()
                moveTo(426.0f, 222.6f)
                lineToRelative(94.4f, -41.0f)
                lineToRelative(73.8f, 0.0f)
                lineToRelative(-157.0f, 247.6f)
                lineToRelative(31.6f, -109.0f)
                lineToRelative(-42.8f, -97.6f)
                close()
                moveTo(597.5f, 181.4f)
                lineToRelative(41.4f, 76.2f)
                curveToRelative(4.0f, 7.5f, -3.9f, 15.9f, -11.6f, 12.2f)
                lineToRelative(-47.6f, -22.7f)
                lineToRelative(17.8f, -65.7f)
                close()
                moveTo(127.3f, 318.5f)
                lineTo(158.7f, 430.0f)
                lineTo(1.6f, 154.5f)
                curveToRelative(-5.9f, -10.4f, 5.5f, -22.0f, 15.9f, -16.2f)
                lineToRelative(151.8f, 84.2f)
                lineToRelative(-42.1f, 96.0f)
                close()
            }
        }
        .build()
        return _padlet!!
    }

private var _padlet: ImageVector? = null
