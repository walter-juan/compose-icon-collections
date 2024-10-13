package com.woowla.compose.icon.collections.devicons.devicons.magento

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.MagentoGroup

public val MagentoGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFf26322)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.04f, 0.0f)
                lineTo(8.59f, 32.02f)
                verticalLineToRelative(63.96f)
                lineToRelative(16.67f, 9.64f)
                lineToRelative(-0.1f, -63.96f)
                lineToRelative(38.79f, -22.41f)
                lineToRelative(38.77f, 22.41f)
                verticalLineToRelative(63.93f)
                lineToRelative(16.7f, -9.61f)
                lineTo(119.41f, 31.97f)
                lineToRelative(-0.25f, -0.14f)
                close()
                moveTo(64.04f, 1.15f)
                lineTo(118.42f, 32.54f)
                verticalLineToRelative(62.87f)
                lineToRelative(-14.72f, 8.47f)
                lineTo(103.71f, 41.09f)
                lineToRelative(-39.76f, -22.98f)
                lineToRelative(-39.78f, 22.98f)
                lineToRelative(0.1f, 62.81f)
                lineToRelative(-14.69f, -8.49f)
                lineTo(9.58f, 32.59f)
                close()
                moveTo(71.33f, 40.49f)
                verticalLineToRelative(63.96f)
                lineToRelative(-7.34f, 4.27f)
                lineToRelative(-7.38f, -4.22f)
                verticalLineToRelative(-63.98f)
                lineToRelative(-16.67f, 9.64f)
                lineToRelative(0.03f, 63.96f)
                lineTo(63.97f, 128.0f)
                lineToRelative(24.05f, -13.88f)
                lineTo(88.03f, 50.13f)
                close()
                moveTo(72.32f, 42.2f)
                lineTo(87.04f, 50.7f)
                verticalLineToRelative(62.85f)
                lineToRelative(-23.06f, 13.31f)
                lineToRelative(-23.01f, -13.31f)
                lineToRelative(-0.03f, -62.82f)
                lineToRelative(14.69f, -8.49f)
                verticalLineToRelative(62.83f)
                lineToRelative(8.38f, 4.79f)
                lineToRelative(8.32f, -4.85f)
                verticalLineToRelative(-0.28f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
