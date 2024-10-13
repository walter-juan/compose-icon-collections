package com.woowla.compose.icon.collections.devicons.devicons.vitest

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VitestGroup

public val VitestGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(39.16f, 82.4f)
                lineTo(10.54f, 53.78f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -8.76f, 8.76f)
                lineToRelative(57.83f, 57.83f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 4.38f, 1.82f)
                horizontalLineToRelative(0.03f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 4.38f, -1.82f)
                lineToRelative(57.83f, -57.83f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 1.78f, -4.37f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -10.54f, -4.39f)
                lineTo(88.84f, 82.4f)
                arcToRelative(6.01f, 6.01f, 0.0f, false, false, -0.32f, 0.3f)
                lineTo(64.0f, 107.21f)
                lineTo(39.48f, 82.7f)
                arcToRelative(6.24f, 6.24f, 0.0f, false, false, -0.32f, -0.3f)
                close()
                moveTo(96.06f, 40.82f)
                lineTo(65.46f, 85.06f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, -4.34f, -0.01f)
                arcToRelative(2.61f, 2.61f, 0.0f, false, true, -0.45f, -1.6f)
                lineToRelative(1.23f, -24.43f)
                lineToRelative(-19.77f, -4.19f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, -1.89f, -1.59f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, true, 0.28f, -2.45f)
                lineToRelative(30.6f, -44.24f)
                arcToRelative(2.63f, 2.63f, 0.0f, false, true, 3.01f, -1.0f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, true, 1.33f, 1.0f)
                curveToRelative(0.32f, 0.47f, 0.48f, 1.03f, 0.45f, 1.6f)
                lineToRelative(-1.22f, 24.43f)
                lineToRelative(19.77f, 4.19f)
                curveToRelative(0.42f, 0.09f, 0.82f, 0.28f, 1.15f, 0.56f)
                arcToRelative(2.61f, 2.61f, 0.0f, false, true, 0.47f, 3.48f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
