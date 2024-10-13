package com.woowla.compose.icon.collections.devicons.devicons.packer

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PackerGroup

public val PackerGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF1d94dd)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.6f, 0.0f)
                verticalLineToRelative(18.94f)
                lineTo(71.85f, 36.41f)
                verticalLineToRelative(53.4f)
                lineToRelative(14.49f, 8.3f)
                curveToRelative(4.49f, 2.6f, 8.65f, 3.16f, 11.75f, 1.85f)
                curveToRelative(3.1f, -1.31f, 5.01f, -4.51f, 5.01f, -9.05f)
                lineTo(103.1f, 51.76f)
                curveToRelative(0.0f, -9.08f, -7.28f, -20.51f, -16.27f, -25.7f)
                close()
                moveTo(42.59f, 1.71f)
                lineTo(86.34f, 26.91f)
                curveToRelative(8.64f, 4.99f, 15.77f, 16.3f, 15.77f, 24.85f)
                lineTo(102.11f, 90.91f)
                curveToRelative(0.0f, 4.27f, -1.7f, 7.0f, -4.4f, 8.14f)
                curveToRelative(-2.71f, 1.14f, -6.56f, 0.69f, -10.88f, -1.8f)
                lineToRelative(-13.99f, -8.01f)
                lineTo(72.84f, 35.84f)
                lineTo(42.59f, 18.37f)
                close()
                moveTo(24.9f, 15.44f)
                verticalLineToRelative(88.35f)
                lineTo(66.81f, 128.0f)
                lineTo(66.81f, 39.66f)
                close()
                moveTo(25.89f, 17.15f)
                lineTo(65.83f, 40.23f)
                verticalLineToRelative(86.06f)
                lineToRelative(-39.94f, -23.07f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
