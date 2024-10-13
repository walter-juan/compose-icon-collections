package com.woowla.compose.icon.collections.devicons.devicons.typo3

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.Typo3Group

public val Typo3Group.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFf49700)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.07f, 87.9f)
                arcToRelative(17.52f, 17.52f, 0.0f, false, true, -5.37f, 0.77f)
                curveToRelative(-16.2f, 0.0f, -39.99f, -56.61f, -39.99f, -75.45f)
                curveToRelative(0.0f, -6.92f, 1.64f, -9.24f, 3.96f, -11.23f)
                curveTo(34.85f, 4.3f, 11.07f, 11.58f, 3.46f, 20.88f)
                curveTo(1.87f, 23.13f, 0.82f, 26.77f, 0.82f, 31.39f)
                curveToRelative(0.0f, 29.38f, 31.39f, 96.15f, 53.51f, 96.15f)
                curveToRelative(10.25f, 0.0f, 27.52f, -16.79f, 41.72f, -39.65f)
                moveTo(85.74f, 0.0f)
                curveToRelative(20.48f, 0.0f, 40.98f, 3.31f, 40.98f, 14.87f)
                curveToRelative(0.0f, 23.46f, -14.87f, 51.89f, -22.47f, 51.89f)
                curveToRelative(-13.54f, 0.0f, -30.43f, -37.67f, -30.43f, -56.52f)
                curveTo(73.82f, 1.65f, 77.11f, 0.0f, 85.71f, 0.0f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
