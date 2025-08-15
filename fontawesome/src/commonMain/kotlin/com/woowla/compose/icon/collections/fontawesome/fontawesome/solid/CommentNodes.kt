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

public val SolidGroup.CommentNodes: ImageVector
    get() {
        if (_commentNodes != null) {
            return _commentNodes!!
        }
        _commentNodes = Builder(name = "CommentNodes", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 208.0f)
                curveTo(503.7f, 208.0f, 525.6f, 215.3f, 543.7f, 227.9f)
                curveTo(536.9f, 100.9f, 425.0f, 0.0f, 288.0f, 0.0f)
                curveTo(146.6f, 0.0f, 32.0f, 107.5f, 32.0f, 240.0f)
                curveTo(32.0f, 294.3f, 51.2f, 344.3f, 83.6f, 384.5f)
                lineTo(34.8f, 476.8f)
                curveToRelative(-4.8f, 9.0f, -3.3f, 20.0f, 3.6f, 27.5f)
                reflectiveCurveToRelative(17.8f, 9.8f, 27.1f, 5.8f)
                lineToRelative(118.4f, -50.7f)
                curveToRelative(27.2f, 11.4f, 56.9f, 18.4f, 88.1f, 20.2f)
                curveToRelative(0.1f, -18.9f, 4.9f, -38.0f, 15.0f, -55.5f)
                curveToRelative(17.1f, -29.7f, 45.8f, -48.5f, 77.0f, -54.2f)
                lineToRelative(9.2f, -16.0f)
                curveToRelative(-3.4f, -10.7f, -5.2f, -22.0f, -5.2f, -33.8f)
                curveToRelative(0.0f, -61.9f, 50.1f, -112.0f, 112.0f, -112.0f)
                close()
                moveTo(328.6f, 448.0f)
                curveToRelative(-17.7f, 30.6f, -7.2f, 69.7f, 23.4f, 87.4f)
                reflectiveCurveToRelative(69.7f, 7.2f, 87.4f, -23.4f)
                curveToRelative(1.5f, -2.6f, 2.8f, -5.3f, 3.9f, -8.0f)
                lineToRelative(73.3f, 0.0f)
                curveToRelative(1.1f, 2.7f, 2.4f, 5.4f, 3.9f, 8.0f)
                curveToRelative(17.7f, 30.6f, 56.8f, 41.1f, 87.4f, 23.4f)
                reflectiveCurveToRelative(41.1f, -56.8f, 23.4f, -87.4f)
                curveToRelative(-13.4f, -23.2f, -39.1f, -34.8f, -64.0f, -31.4f)
                lineToRelative(-17.6f, -30.7f)
                curveToRelative(-11.0f, 11.7f, -25.0f, 20.6f, -40.6f, 25.6f)
                lineToRelative(16.5f, 28.9f)
                curveToRelative(-3.8f, 4.8f, -6.8f, 10.0f, -9.0f, 15.6f)
                lineToRelative(-73.4f, 0.0f)
                curveToRelative(-2.2f, -5.6f, -5.3f, -10.8f, -9.0f, -15.6f)
                lineToRelative(33.0f, -57.7f)
                curveToRelative(4.1f, 0.8f, 8.4f, 1.3f, 12.8f, 1.3f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                reflectiveCurveToRelative(-64.0f, 28.7f, -64.0f, 64.0f)
                curveToRelative(0.0f, 13.4f, 4.1f, 25.8f, 11.2f, 36.1f)
                lineToRelative(-34.6f, 60.5f)
                curveToRelative(-25.0f, -3.4f, -50.6f, 8.3f, -64.0f, 31.4f)
                close()
            }
        }
        .build()
        return _commentNodes!!
    }

private var _commentNodes: ImageVector? = null
