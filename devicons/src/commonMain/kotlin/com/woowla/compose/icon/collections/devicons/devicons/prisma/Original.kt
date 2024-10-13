package com.woowla.compose.icon.collections.devicons.devicons.prisma

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.PrismaGroup

public val PrismaGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF2d3748)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(66.46f, 0.01f)
                arcToRelative(6.31f, 6.31f, 0.0f, false, false, -5.81f, 3.03f)
                lineToRelative(-47.87f, 78.07f)
                arcToRelative(6.38f, 6.38f, 0.0f, false, false, 0.05f, 6.75f)
                lineToRelative(23.57f, 37.19f)
                arcToRelative(6.39f, 6.39f, 0.0f, false, false, 7.22f, 2.68f)
                lineToRelative(68.01f, -20.41f)
                arcToRelative(6.37f, 6.37f, 0.0f, false, false, 3.96f, -8.77f)
                lineToRelative(-43.72f, -94.85f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 66.46f, 0.01f)
                close()
                moveTo(68.25f, 23.96f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, 2.45f, 1.43f)
                lineToRelative(30.16f, 69.78f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, true, -1.51f, 3.24f)
                lineToRelative(-47.0f, 14.02f)
                arcToRelative(2.39f, 2.39f, 0.0f, false, true, -3.02f, -2.76f)
                lineToRelative(16.83f, -83.81f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, 2.1f, -1.91f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
