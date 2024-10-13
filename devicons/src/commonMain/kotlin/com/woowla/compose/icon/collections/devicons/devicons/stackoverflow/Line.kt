package com.woowla.compose.icon.collections.devicons.devicons.stackoverflow

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.StackoverflowGroup

public val StackoverflowGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(83.69f, 0.0f)
                lineToRelative(-0.4f, 0.3f)
                lineToRelative(-9.48f, 7.04f)
                lineToRelative(34.35f, 46.17f)
                lineToRelative(9.87f, -7.34f)
                close()
                moveTo(83.49f, 1.38f)
                lineTo(116.66f, 45.97f)
                lineTo(108.38f, 52.12f)
                lineTo(75.2f, 7.54f)
                close()
                moveTo(62.7f, 18.05f)
                lineToRelative(-0.32f, 0.38f)
                lineToRelative(-7.56f, 9.07f)
                lineToRelative(44.24f, 36.83f)
                lineToRelative(7.87f, -9.45f)
                close()
                moveTo(62.83f, 19.45f)
                lineTo(105.54f, 55.0f)
                lineTo(98.94f, 62.93f)
                lineTo(56.22f, 27.38f)
                close()
                moveTo(45.87f, 41.68f)
                lineTo(45.66f, 42.13f)
                lineTo(40.67f, 52.83f)
                lineTo(92.85f, 77.12f)
                lineTo(98.05f, 65.97f)
                close()
                moveTo(46.35f, 42.99f)
                lineTo(96.74f, 66.45f)
                lineTo(92.38f, 75.81f)
                lineTo(41.99f, 52.35f)
                close()
                moveTo(35.96f, 67.43f)
                lineToRelative(-0.1f, 0.48f)
                lineToRelative(-2.43f, 11.56f)
                lineToRelative(56.33f, 11.83f)
                lineToRelative(2.53f, -12.03f)
                close()
                moveTo(36.72f, 68.61f)
                lineTo(91.11f, 80.04f)
                lineTo(88.99f, 90.13f)
                lineTo(34.59f, 78.71f)
                close()
                moveTo(9.95f, 81.94f)
                lineTo(9.95f, 128.0f)
                horizontalLineToRelative(102.44f)
                lineTo(112.4f, 81.94f)
                horizontalLineToRelative(-12.26f)
                lineToRelative(-0.0f, 33.8f)
                lineTo(22.22f, 115.74f)
                lineTo(22.22f, 81.94f)
                lineTo(10.45f, 81.94f)
                close()
                moveTo(10.94f, 82.93f)
                lineTo(21.23f, 82.93f)
                verticalLineToRelative(33.8f)
                horizontalLineToRelative(79.89f)
                lineToRelative(0.0f, -33.8f)
                horizontalLineToRelative(10.28f)
                verticalLineToRelative(44.08f)
                lineTo(10.95f, 127.01f)
                close()
                moveTo(33.0f, 93.21f)
                verticalLineToRelative(0.99f)
                lineToRelative(-0.49f, -0.49f)
                verticalLineToRelative(11.76f)
                horizontalLineToRelative(57.35f)
                lineTo(89.85f, 93.21f)
                horizontalLineToRelative(-56.36f)
                close()
                moveTo(33.49f, 94.2f)
                horizontalLineToRelative(55.37f)
                verticalLineToRelative(10.28f)
                lineTo(33.49f, 104.47f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
