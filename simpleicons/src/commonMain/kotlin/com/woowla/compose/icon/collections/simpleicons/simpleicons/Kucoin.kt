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

public val Simpleicons.Kucoin: ImageVector
    get() {
        if (_kucoin != null) {
            return _kucoin!!
        }
        _kucoin = Builder(name = "Kucoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.928f, 11.996f)
                lineToRelative(7.122f, 7.122f)
                lineToRelative(4.49f, -4.49f)
                arcToRelative(2.004f, 2.004f, 0.0f, false, true, 2.865f, 0.0f)
                arcToRelative(2.004f, 2.004f, 0.0f, false, true, 0.0f, 2.865f)
                lineToRelative(-5.918f, 5.918f)
                arcToRelative(2.058f, 2.058f, 0.0f, false, true, -2.883f, 0.0f)
                lineToRelative(-8.541f, -8.542f)
                verticalLineToRelative(5.07f)
                arcToRelative(2.034f, 2.034f, 0.0f, true, true, -4.07f, 0.0f)
                verticalLineTo(4.043f)
                arcToRelative(2.034f, 2.034f, 0.0f, true, true, 4.07f, 0.0f)
                verticalLineToRelative(5.088f)
                lineTo(13.604f, 0.589f)
                arcToRelative(2.058f, 2.058f, 0.0f, false, true, 2.883f, 0.0f)
                lineToRelative(5.918f, 5.918f)
                curveToRelative(0.785f, 0.803f, 0.785f, 2.088f, 0.0f, 2.865f)
                curveToRelative(-0.804f, 0.785f, -2.089f, 0.785f, -2.865f, 0.0f)
                lineToRelative(-4.49f, -4.49f)
                close()
                moveTo(15.05f, 9.96f)
                arcToRelative(2.038f, 2.038f, 0.0f, false, false, -2.053f, 2.035f)
                curveToRelative(0.0f, 1.133f, 0.902f, 2.052f, 2.035f, 2.052f)
                arcToRelative(2.038f, 2.038f, 0.0f, false, false, 2.053f, -2.035f)
                verticalLineToRelative(-0.018f)
                arcToRelative(2.07f, 2.07f, 0.0f, false, false, -2.035f, -2.034f)
                close()
            }
        }
        .build()
        return _kucoin!!
    }

private var _kucoin: ImageVector? = null
