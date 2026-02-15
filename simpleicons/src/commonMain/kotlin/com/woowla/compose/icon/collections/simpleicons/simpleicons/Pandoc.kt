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

public val Simpleicons.Pandoc: ImageVector
    get() {
        if (_pandoc != null) {
            return _pandoc!!
        }
        _pandoc = Builder(name = "Pandoc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.259f, 0.0f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, -0.925f, 0.837f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, 0.75f, 0.837f)
                horizontalLineToRelative(1.953f)
                lineTo(3.778f, 23.163f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, 0.75f, 0.837f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, 0.924f, -0.837f)
                lineToRelative(2.26f, -21.489f)
                horizontalLineToRelative(2.51f)
                quadTo(9.095f, 12.419f, 7.964f, 23.163f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, 0.75f, 0.837f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, 0.925f, -0.837f)
                lineToRelative(0.997f, -9.489f)
                horizontalLineToRelative(8.372f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, false, 0.925f, -0.837f)
                lineToRelative(0.733f, -6.977f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, false, -0.182f, -0.591f)
                lineTo(15.988f, 0.245f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 15.422f, 0.0f)
                close()
                moveTo(11.897f, 1.674f)
                lineTo(14.9f, 1.674f)
                lineToRelative(0.06f, 0.068f)
                lineToRelative(-0.403f, 3.84f)
                arcToRelative(0.494f, 0.494f, 0.0f, false, false, 0.5f, 0.558f)
                horizontalLineToRelative(3.84f)
                lineToRelative(0.06f, 0.067f)
                lineToRelative(-0.61f, 5.793f)
                horizontalLineToRelative(-7.534f)
                close()
            }
        }
        .build()
        return _pandoc!!
    }

private var _pandoc: ImageVector? = null
