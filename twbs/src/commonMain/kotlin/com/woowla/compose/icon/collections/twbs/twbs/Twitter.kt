package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Twitter: ImageVector
    get() {
        if (_twitter != null) {
            return _twitter!!
        }
        _twitter = Builder(name = "Twitter", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.026f, 15.0f)
                curveToRelative(6.038f, 0.0f, 9.341f, -5.003f, 9.341f, -9.334f)
                quadToRelative(0.002f, -0.211f, -0.006f, -0.422f)
                arcTo(6.7f, 6.7f, 0.0f, false, false, 16.0f, 3.542f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -1.889f, 0.518f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 1.447f, -1.817f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.087f, 0.793f)
                arcTo(3.286f, 3.286f, 0.0f, false, false, 7.875f, 6.03f)
                arcToRelative(9.32f, 9.32f, 0.0f, false, true, -6.767f, -3.429f)
                arcToRelative(3.29f, 3.29f, 0.0f, false, false, 1.018f, 4.382f)
                arcTo(3.3f, 3.3f, 0.0f, false, true, 0.64f, 6.575f)
                verticalLineToRelative(0.045f)
                arcToRelative(3.29f, 3.29f, 0.0f, false, false, 2.632f, 3.218f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, true, -0.865f, 0.115f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.614f, -0.057f)
                arcToRelative(3.28f, 3.28f, 0.0f, false, false, 3.067f, 2.277f)
                arcTo(6.6f, 6.6f, 0.0f, false, true, 0.78f, 13.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.78f, -0.045f)
                arcTo(9.34f, 9.34f, 0.0f, false, false, 5.026f, 15.0f)
            }
        }
        .build()
        return _twitter!!
    }

private var _twitter: ImageVector? = null
