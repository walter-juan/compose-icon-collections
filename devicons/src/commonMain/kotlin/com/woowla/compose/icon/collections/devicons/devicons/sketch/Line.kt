package com.woowla.compose.icon.collections.devicons.devicons.sketch

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.SketchGroup

public val SketchGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFfdad00)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(64.0f, 6.52f)
                lineToRelative(-35.98f, 3.78f)
                lineToRelative(-0.18f, 0.1f)
                lineTo(0.0f, 47.46f)
                lineToRelative(0.01f, 0.02f)
                verticalLineToRelative(0.31f)
                lineTo(63.8f, 121.48f)
                lineToRelative(0.38f, -0.01f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(0.01f, -0.01f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 47.78f)
                verticalLineToRelative(-0.32f)
                lineToRelative(-27.82f, -37.06f)
                lineToRelative(-0.18f, -0.11f)
                lineToRelative(-0.05f, -0.01f)
                lineToRelative(-0.0f, -0.0f)
                lineTo(64.0f, 6.52f)
                close()
                moveTo(64.67f, 7.11f)
                lineTo(99.7f, 10.79f)
                lineTo(99.79f, 12.47f)
                lineTo(101.61f, 46.86f)
                lineTo(98.15f, 43.14f)
                lineTo(64.67f, 7.11f)
                close()
                moveTo(63.33f, 7.12f)
                lineTo(26.39f, 46.86f)
                lineToRelative(1.03f, -19.56f)
                lineToRelative(0.9f, -16.52f)
                lineToRelative(35.0f, -3.67f)
                close()
                moveTo(63.99f, 7.2f)
                lineTo(101.35f, 47.36f)
                lineTo(26.66f, 47.36f)
                lineToRelative(9.81f, -10.56f)
                lineTo(63.99f, 7.2f)
                close()
                moveTo(100.27f, 11.4f)
                lineTo(127.26f, 47.36f)
                lineTo(102.2f, 47.36f)
                lineTo(100.27f, 11.4f)
                close()
                moveTo(27.74f, 11.43f)
                lineTo(25.8f, 47.36f)
                lineTo(0.74f, 47.36f)
                lineToRelative(4.95f, -6.59f)
                lineToRelative(22.05f, -29.33f)
                close()
                moveTo(0.78f, 47.88f)
                horizontalLineToRelative(25.11f)
                lineToRelative(36.87f, 71.59f)
                lineToRelative(-15.24f, -17.6f)
                lineTo(0.78f, 47.88f)
                close()
                moveTo(26.48f, 47.88f)
                horizontalLineToRelative(75.04f)
                lineTo(64.0f, 120.74f)
                lineTo(26.48f, 47.88f)
                close()
                moveTo(102.12f, 47.88f)
                horizontalLineToRelative(25.1f)
                lineToRelative(-46.74f, 53.99f)
                lineToRelative(-15.24f, 17.6f)
                lineToRelative(36.88f, -71.59f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
