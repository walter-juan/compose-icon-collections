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

public val Simpleicons.Zola: ImageVector
    get() {
        if (_zola != null) {
            return _zola!!
        }
        _zola = Builder(name = "Zola", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.379f, 18.017f)
                lineTo(21.083f, 24.0f)
                lineTo(2.824f, 24.0f)
                arcToRelative(0.566f, 0.566f, 0.0f, false, true, -0.565f, -0.565f)
                lineTo(2.259f, 23.4f)
                curveToRelative(0.0f, -0.313f, 0.081f, -0.62f, 0.233f, -0.895f)
                lineTo(12.99f, 3.79f)
                curveToRelative(0.841f, -1.5f, 0.897f, -2.713f, -1.712f, -2.713f)
                reflectiveCurveToRelative(-5.386f, 0.909f, -6.442f, 5.077f)
                arcToRelative(0.565f, 0.565f, 0.0f, false, true, -1.112f, -0.17f)
                lineTo(4.019f, 0.0f)
                horizontalLineToRelative(16.894f)
                curveToRelative(-1.74f, 0.798f, -3.273f, 1.813f, -4.565f, 3.038f)
                curveToRelative(-1.578f, 1.497f, -2.699f, 3.125f, -4.876f, 6.451f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, false, -3.462f, 5.799f)
                arcToRelative(81.0f, 81.0f, 0.0f, false, false, -2.743f, 5.566f)
                curveToRelative(0.764f, -1.08f, 2.02f, -2.507f, 3.96f, -3.425f)
                curveToRelative(0.958f, -0.453f, 1.703f, -0.602f, 2.083f, -0.7f)
                arcToRelative(6.4f, 6.4f, 0.0f, false, false, 1.366f, -0.534f)
                lineToRelative(-2.251f, 4.015f)
                curveToRelative(-0.842f, 1.5f, 0.3f, 2.713f, 2.91f, 2.713f)
                curveToRelative(2.612f, 0.0f, 5.875f, -0.909f, 6.93f, -5.077f)
                arcToRelative(0.565f, 0.565f, 0.0f, false, true, 1.112f, 0.17f)
                close()
                moveTo(7.622f, 17.535f)
                curveToRelative(0.694f, -0.67f, 1.83f, -1.239f, 3.377f, -1.693f)
                lineToRelative(0.07f, -0.021f)
                curveToRelative(3.007f, -0.9f, 6.723f, -5.328f, 7.952f, -9.478f)
                lineToRelative(0.12f, -0.417f)
                curveToRelative(0.328f, -1.172f, 0.824f, -2.941f, 2.265f, -4.796f)
                quadToRelative(0.163f, -0.209f, 0.335f, -0.41f)
                curveToRelative(-1.749f, 0.814f, -3.294f, 1.852f, -4.609f, 3.097f)
                curveToRelative(-1.047f, 0.992f, -1.997f, 2.293f, -3.72f, 4.657f)
                curveToRelative(-1.352f, 1.855f, -2.385f, 3.437f, -3.22f, 4.713f)
                curveToRelative(-0.395f, 0.602f, -1.126f, 1.744f, -1.998f, 3.148f)
                curveToRelative(-0.265f, 0.427f, -0.627f, 1.02f, -0.97f, 1.594f)
                curveToRelative(0.124f, -0.124f, 0.257f, -0.258f, 0.398f, -0.394f)
            }
        }
        .build()
        return _zola!!
    }

private var _zola: ImageVector? = null
