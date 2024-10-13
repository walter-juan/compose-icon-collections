package com.woowla.compose.icon.collections.devicons.devicons.eslint

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.EslintGroup

public val EslintGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF4b32c3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.94f, 7.69f)
                curveToRelative(-2.06f, 0.0f, -4.03f, 1.34f, -5.16f, 3.2f)
                lineTo(0.77f, 61.37f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 0.0f, 5.99f)
                lineToRelative(29.01f, 50.17f)
                curveToRelative(1.03f, 1.86f, 2.99f, 2.79f, 5.16f, 2.79f)
                horizontalLineToRelative(58.12f)
                curveToRelative(2.07f, 0.0f, 4.03f, -0.93f, 5.16f, -2.68f)
                lineToRelative(29.01f, -50.17f)
                curveToRelative(1.03f, -2.07f, 1.03f, -4.23f, -0.1f, -5.99f)
                lineToRelative(-29.01f, -50.59f)
                curveToRelative(-1.03f, -1.86f, -2.99f, -3.2f, -5.16f, -3.2f)
                horizontalLineToRelative(-58.02f)
                close()
                moveTo(63.96f, 19.56f)
                curveToRelative(0.36f, 0.0f, 0.72f, 0.1f, 1.03f, 0.31f)
                lineToRelative(37.06f, 21.37f)
                curveToRelative(0.62f, 0.41f, 1.13f, 1.03f, 1.13f, 1.75f)
                verticalLineToRelative(42.74f)
                horizontalLineToRelative(-0.1f)
                curveToRelative(0.0f, 0.72f, -0.41f, 1.45f, -1.13f, 1.75f)
                lineToRelative(-36.96f, 21.37f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -2.06f, 0.0f)
                lineTo(25.86f, 87.59f)
                curveToRelative(-0.62f, -0.41f, -1.14f, -1.03f, -1.14f, -1.76f)
                lineTo(24.73f, 42.99f)
                curveToRelative(0.0f, -0.72f, 0.41f, -1.45f, 1.14f, -1.76f)
                lineToRelative(37.06f, -21.37f)
                curveToRelative(0.31f, -0.21f, 0.67f, -0.31f, 1.03f, -0.31f)
                close()
                moveTo(63.9f, 34.4f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, -0.98f, 0.23f)
                lineTo(38.66f, 48.67f)
                curveToRelative(-0.62f, 0.31f, -1.03f, 1.03f, -1.03f, 1.65f)
                verticalLineToRelative(28.08f)
                curveToRelative(0.0f, 0.72f, 0.41f, 1.45f, 1.03f, 1.75f)
                lineToRelative(24.36f, 14.04f)
                arcToRelative(2.18f, 2.18f, 0.0f, false, false, 1.96f, 0.0f)
                lineToRelative(24.26f, -14.04f)
                curveToRelative(0.62f, -0.41f, 1.03f, -1.03f, 1.03f, -1.75f)
                lineTo(90.28f, 50.32f)
                curveToRelative(0.0f, -0.62f, -0.41f, -1.34f, -1.03f, -1.65f)
                lineTo(64.88f, 34.63f)
                arcToRelative(2.19f, 2.19f, 0.0f, false, false, -0.98f, -0.23f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
