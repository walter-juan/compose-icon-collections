package com.woowla.compose.icon.collections.devicons.devicons.scalingo

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ScalingoGroup

public val ScalingoGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF173aee)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.74f, 0.0f)
                curveToRelative(-5.52f, 0.01f, -10.92f, 2.86f, -13.83f, 7.87f)
                lineTo(25.21f, 57.14f)
                curveToRelative(-4.24f, 7.28f, -1.61f, 16.36f, 5.87f, 20.29f)
                curveToRelative(7.48f, 3.93f, 16.98f, 1.21f, 21.21f, -6.07f)
                lineToRelative(28.69f, -49.28f)
                curveToRelative(4.24f, -7.28f, 1.61f, -16.36f, -5.87f, -20.29f)
                arcTo(15.75f, 15.75f, 0.0f, false, false, 67.74f, 0.0f)
                close()
                moveTo(89.54f, 48.77f)
                curveToRelative(-5.52f, 0.01f, -10.92f, 2.86f, -13.84f, 7.87f)
                lineToRelative(-28.69f, 49.27f)
                curveToRelative(-4.24f, 7.28f, -1.61f, 16.36f, 5.87f, 20.29f)
                curveToRelative(7.48f, 3.93f, 16.98f, 1.21f, 21.22f, -6.07f)
                lineToRelative(28.69f, -49.28f)
                curveToRelative(4.24f, -7.28f, 1.61f, -16.36f, -5.87f, -20.29f)
                arcToRelative(15.74f, 15.74f, 0.0f, false, false, -7.38f, -1.8f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
