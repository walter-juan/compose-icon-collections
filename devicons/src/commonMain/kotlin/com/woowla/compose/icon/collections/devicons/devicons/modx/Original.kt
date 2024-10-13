package com.woowla.compose.icon.collections.devicons.devicons.modx

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
import com.woowla.compose.icon.collections.devicons.devicons.ModxGroup

public val ModxGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF00b5de)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(63.86f, 14.06f)
                lineToRelative(-8.29f, 13.32f)
                lineToRelative(43.22f, 26.5f)
                lineToRelative(24.87f, -39.82f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff5529)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(99.06f, 58.09f)
                lineToRelative(-27.18f, 42.81f)
                lineTo(111.97f, 125.9f)
                verticalLineTo(66.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF00decc)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.48f, 69.91f)
                lineToRelative(69.31f, -16.03f)
                lineTo(15.62f, 2.1f)
                verticalLineToRelative(59.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFFff9640)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.14f, 113.67f)
                lineTo(99.06f, 58.09f)
                lineTo(29.21f, 74.53f)
                lineTo(4.34f, 113.67f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
