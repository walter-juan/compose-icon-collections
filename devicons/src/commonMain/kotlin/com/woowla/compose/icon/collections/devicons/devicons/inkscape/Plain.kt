package com.woowla.compose.icon.collections.devicons.devicons.inkscape

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.InkscapeGroup

public val InkscapeGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(102.4f, 101.5f)
                curveToRelative(-5.1f, 4.6f, 0.6f, 9.3f, 5.6f, 6.3f)
                curveToRelative(1.1f, -1.2f, 0.0f, -5.2f, -5.6f, -6.3f)
                close()
                moveTo(28.6f, 108.9f)
                curveToRelative(4.0f, 3.4f, 10.2f, -0.9f, 12.0f, -5.7f)
                curveToRelative(-3.9f, -5.1f, -18.3f, 0.2f, -12.0f, 5.7f)
                close()
                moveTo(104.5f, 96.8f)
                curveToRelative(0.0f, 2.3f, 16.8f, 3.8f, 16.8f, -0.5f)
                curveToRelative(-2.4f, -7.0f, -14.8f, -6.6f, -16.8f, 0.5f)
                close()
                moveTo(120.1f, 55.7f)
                lineTo(73.4f, 7.9f)
                curveToRelative(-5.7f, -5.5f, -15.2f, -5.5f, -20.6f, 0.0f)
                lineTo(7.7f, 54.0f)
                curveTo(-7.5f, 72.9f, 18.1f, 70.7f, 29.0f, 76.1f)
                curveToRelative(3.9f, 4.0f, -15.1f, 7.0f, -11.1f, 11.0f)
                curveToRelative(3.9f, 4.0f, 23.8f, 7.7f, 27.7f, 11.8f)
                lineToRelative(-4.1f, 12.3f)
                curveToRelative(3.9f, 4.0f, 13.0f, 0.2f, 14.7f, 9.5f)
                curveToRelative(1.2f, 6.6f, 16.4f, 2.8f, 23.8f, -2.6f)
                curveToRelative(3.9f, -4.0f, -7.5f, -3.6f, -3.6f, -7.7f)
                curveToRelative(9.8f, -10.0f, 18.9f, -3.6f, 22.2f, -13.7f)
                curveToRelative(1.7f, -5.0f, -14.4f, -7.6f, -10.5f, -11.7f)
                curveToRelative(11.4f, -6.5f, 50.5f, -10.8f, 32.0f, -29.3f)
                close()
                moveTo(64.1f, 86.8f)
                curveToRelative(-4.8f, 1.3f, -28.0f, -8.2f, -22.2f, -8.2f)
                curveToRelative(1.2f, 0.7f, 19.4f, 4.4f, 23.9f, 5.2f)
                curveToRelative(1.6f, 0.3f, 0.5f, 1.9f, -1.7f, 3.0f)
                close()
                moveTo(89.2f, 35.3f)
                lineToRelative(-8.8f, -7.1f)
                lineToRelative(-1.7f, 10.5f)
                lineToRelative(-7.4f, -3.9f)
                lineToRelative(-11.8f, 7.5f)
                lineToRelative(-3.9f, -15.5f)
                lineTo(49.1f, 38.0f)
                horizontalLineToRelative(-9.7f)
                curveToRelative(-4.0f, 0.0f, -4.4f, -5.3f, -0.8f, -8.9f)
                curveToRelative(6.3f, -6.8f, 13.5f, -13.8f, 17.4f, -17.8f)
                curveToRelative(3.9f, -4.0f, 10.8f, -4.0f, 14.7f, -0.1f)
                lineToRelative(17.8f, 18.1f)
                curveToRelative(1.7f, 1.7f, 1.7f, 5.0f, 0.7f, 6.0f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
