package com.woowla.compose.icon.collections.devicons.devicons.scalingo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ScalingoGroup

public val ScalingoGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF21cfee)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.9f, 7.87f)
                curveToRelative(4.24f, -7.28f, 13.74f, -9.99f, 21.21f, -6.07f)
                curveToRelative(7.48f, 3.93f, 10.1f, 13.01f, 5.87f, 20.29f)
                lineTo(52.29f, 71.36f)
                curveToRelative(-4.24f, 7.28f, -13.74f, 10.0f, -21.21f, 6.07f)
                curveToRelative(-7.48f, -3.92f, -10.1f, -13.01f, -5.87f, -20.29f)
                close()
                moveTo(53.9f, 7.87f)
            }
            path(fill = SolidColor(Color(0xFF173aee)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.71f, 56.64f)
                curveToRelative(4.24f, -7.28f, 13.74f, -10.0f, 21.21f, -6.07f)
                curveToRelative(7.48f, 3.93f, 10.1f, 13.01f, 5.87f, 20.29f)
                lineToRelative(-28.69f, 49.28f)
                curveToRelative(-4.24f, 7.28f, -13.74f, 9.99f, -21.21f, 6.07f)
                curveToRelative(-7.48f, -3.93f, -10.11f, -13.01f, -5.87f, -20.29f)
                close()
                moveTo(75.71f, 56.64f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
