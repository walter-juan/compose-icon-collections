package com.woowla.compose.icon.collections.devicons.devicons.neovim

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NeovimGroup

public val NeovimGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.01f, 0.0f)
                verticalLineToRelative(70.47f)
                lineToRelative(22.91f, 34.45f)
                lineToRelative(5.13f, -5.57f)
                lineToRelative(-0.18f, -71.37f)
                close()
                moveTo(39.51f, 0.42f)
                lineToRelative(-0.43f, 0.43f)
                lineToRelative(-19.6f, 19.8f)
                lineTo(88.99f, 126.43f)
                lineToRelative(19.99f, -20.0f)
                close()
                moveTo(39.36f, 1.97f)
                lineTo(107.73f, 106.3f)
                lineTo(89.15f, 124.88f)
                lineTo(20.74f, 20.78f)
                close()
                moveTo(88.99f, 2.38f)
                lineTo(114.88f, 28.39f)
                lineTo(115.06f, 98.97f)
                lineTo(111.04f, 103.34f)
                lineTo(88.99f, 70.17f)
                close()
                moveTo(17.56f, 21.87f)
                lineTo(17.14f, 22.29f)
                lineTo(11.95f, 27.53f)
                verticalLineToRelative(72.04f)
                lineTo(40.44f, 128.0f)
                lineTo(40.44f, 55.93f)
                close()
                moveTo(17.42f, 23.41f)
                lineTo(39.46f, 56.23f)
                verticalLineToRelative(69.4f)
                lineTo(12.94f, 99.17f)
                lineTo(12.94f, 27.94f)
                close()
                moveTo(17.41f, 23.43f)
                lineTo(16.99f, 23.86f)
                lineTo(12.95f, 27.94f)
                verticalLineToRelative(71.22f)
                lineToRelative(26.5f, 26.44f)
                lineTo(39.44f, 56.24f)
                close()
                moveTo(17.27f, 24.97f)
                lineTo(38.46f, 56.53f)
                verticalLineToRelative(66.7f)
                lineToRelative(-24.53f, -24.48f)
                lineTo(13.93f, 28.34f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
