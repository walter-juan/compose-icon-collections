package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Pushbullet: ImageVector
    get() {
        if (_pushbullet != null) {
            return _pushbullet!!
        }
        _pushbullet = Builder(name = "Pushbullet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 1.688f)
                arcTo(10.312f, 10.312f, 0.0f, false, true, 22.312f, 12.0f)
                arcTo(10.312f, 10.312f, 0.0f, false, true, 12.0f, 22.312f)
                arcTo(10.312f, 10.312f, 0.0f, false, true, 1.688f, 12.0f)
                arcTo(10.312f, 10.312f, 0.0f, false, true, 12.0f, 1.688f)
                close()
                moveTo(7.258f, 6.92f)
                arcToRelative(0.659f, 0.772f, 0.0f, false, false, -0.659f, 0.772f)
                verticalLineToRelative(8.643f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, 0.603f, 0.603f)
                horizontalLineToRelative(1.733f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, 0.603f, -0.603f)
                lineTo(9.538f, 7.692f)
                arcToRelative(0.659f, 0.772f, 0.0f, false, false, -0.658f, -0.772f)
                close()
                moveTo(14.198f, 6.921f)
                curveToRelative(-0.975f, 0.005f, -1.93f, 0.005f, -2.867f, 0.002f)
                curveToRelative(-0.28f, 0.0f, -0.474f, 0.254f, -0.534f, 0.499f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.043f, 0.405f)
                curveToRelative(0.004f, 2.854f, 0.007f, 5.677f, 0.007f, 8.47f)
                curveToRelative(0.0f, 0.397f, 0.21f, 0.643f, 0.589f, 0.641f)
                curveToRelative(1.002f, -0.004f, 1.967f, -0.003f, 2.895f, 0.0f)
                curveToRelative(0.058f, 0.0f, 0.129f, 0.022f, 0.176f, 0.02f)
                curveToRelative(0.824f, -0.018f, 1.552f, -0.251f, 2.182f, -0.698f)
                curveToRelative(2.02f, -1.43f, 2.554f, -4.264f, 1.662f, -6.47f)
                curveToRelative(-0.574f, -1.417f, -1.743f, -2.573f, -3.27f, -2.82f)
                arcToRelative(5.027f, 5.027f, 0.0f, false, false, -0.797f, -0.049f)
                close()
            }
        }
        .build()
        return _pushbullet!!
    }

private var _pushbullet: ImageVector? = null
