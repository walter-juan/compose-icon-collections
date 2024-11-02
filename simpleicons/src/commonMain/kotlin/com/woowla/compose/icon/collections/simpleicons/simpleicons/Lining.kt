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

public val Simpleicons.Lining: ImageVector
    get() {
        if (_lining != null) {
            return _lining!!
        }
        _lining = Builder(name = "Lining", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.926f, 8.815f)
                curveToRelative(-0.261f, -0.004f, -0.696f, 0.011f, -1.422f, 0.084f)
                curveToRelative(-1.937f, 0.194f, -2.398f, 0.828f, -2.398f, 0.828f)
                lineTo(0.0f, 15.177f)
                horizontalLineToRelative(1.017f)
                curveToRelative(4.279f, -4.664f, 8.291f, -6.278f, 8.291f, -6.278f)
                reflectiveCurveToRelative(0.052f, -0.075f, -0.382f, -0.084f)
                close()
                moveTo(11.258f, 10.386f)
                curveToRelative(-1.71f, -0.008f, -3.181f, 0.092f, -3.803f, 0.366f)
                curveToRelative(-1.422f, 0.625f, -3.838f, 2.271f, -6.035f, 4.425f)
                curveToRelative(0.0f, 0.0f, 0.864f, 0.115f, 1.902f, -0.48f)
                curveToRelative(0.0f, 0.0f, 3.416f, -2.586f, 6.165f, -2.07f)
                curveToRelative(2.75f, 0.516f, 5.169f, 1.829f, 5.169f, 1.829f)
                reflectiveCurveToRelative(1.751f, 1.0f, 3.39f, 0.438f)
                curveToRelative(1.64f, -0.563f, 5.954f, -2.898f, 5.954f, -2.898f)
                reflectiveCurveToRelative(-3.266f, -0.776f, -6.265f, -1.182f)
                curveToRelative(-1.687f, -0.229f, -4.279f, -0.418f, -6.477f, -0.428f)
                close()
            }
        }
        .build()
        return _lining!!
    }

private var _lining: ImageVector? = null
