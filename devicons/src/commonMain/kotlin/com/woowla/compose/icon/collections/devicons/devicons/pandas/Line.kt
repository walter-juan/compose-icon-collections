package com.woowla.compose.icon.collections.devicons.devicons.pandas

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PandasGroup

public val PandasGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF130754)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(89.55f, 0.0f)
                verticalLineToRelative(96.8f)
                horizontalLineToRelative(14.87f)
                lineTo(104.42f, 0.0f)
                close()
                moveTo(90.54f, 0.99f)
                horizontalLineToRelative(12.89f)
                verticalLineToRelative(94.81f)
                lineTo(90.54f, 95.81f)
                close()
                moveTo(45.88f, 7.51f)
                verticalLineToRelative(29.82f)
                lineTo(60.75f, 37.32f)
                lineTo(60.75f, 7.51f)
                close()
                moveTo(46.87f, 8.5f)
                horizontalLineToRelative(12.89f)
                verticalLineToRelative(27.83f)
                lineTo(46.87f, 36.33f)
                close()
                moveTo(23.58f, 31.2f)
                lineTo(23.58f, 128.0f)
                horizontalLineToRelative(14.87f)
                lineTo(38.45f, 31.2f)
                close()
                moveTo(67.72f, 31.24f)
                lineTo(67.72f, 61.05f)
                lineTo(82.59f, 61.05f)
                lineTo(82.59f, 31.24f)
                close()
                moveTo(24.57f, 32.19f)
                horizontalLineToRelative(12.89f)
                verticalLineToRelative(94.81f)
                lineTo(24.57f, 127.01f)
                close()
                moveTo(68.71f, 32.23f)
                horizontalLineToRelative(12.89f)
                verticalLineToRelative(27.83f)
                lineTo(68.71f, 60.06f)
                close()
                moveTo(45.88f, 44.74f)
                verticalLineToRelative(14.59f)
                lineTo(60.75f, 59.33f)
                verticalLineToRelative(-14.59f)
                close()
                moveTo(46.87f, 45.73f)
                horizontalLineToRelative(12.89f)
                verticalLineToRelative(12.61f)
                lineTo(46.87f, 58.34f)
                close()
                moveTo(45.88f, 66.71f)
                verticalLineToRelative(29.81f)
                lineTo(60.75f, 96.53f)
                lineTo(60.75f, 66.71f)
                close()
                moveTo(46.87f, 67.71f)
                horizontalLineToRelative(12.89f)
                verticalLineToRelative(27.83f)
                lineTo(46.87f, 95.54f)
                close()
                moveTo(67.72f, 68.48f)
                verticalLineToRelative(14.59f)
                lineTo(82.59f, 83.07f)
                lineTo(82.59f, 68.48f)
                close()
                moveTo(68.71f, 69.47f)
                horizontalLineToRelative(12.89f)
                verticalLineToRelative(12.61f)
                lineTo(68.71f, 82.08f)
                close()
                moveTo(67.72f, 90.49f)
                verticalLineToRelative(29.81f)
                lineTo(82.59f, 120.31f)
                lineTo(82.59f, 90.49f)
                close()
                moveTo(68.71f, 91.49f)
                horizontalLineToRelative(12.89f)
                verticalLineToRelative(27.83f)
                lineTo(68.71f, 119.32f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
