package com.woowla.compose.icon.collections.devicons.devicons.unity

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.UnityGroup

public val UnityGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(59.05f, 0.0f)
                lineTo(7.34f, 29.85f)
                lineTo(7.34f, 89.56f)
                lineToRelative(19.83f, -11.45f)
                lineTo(27.16f, 54.71f)
                curveToRelative(0.01f, -0.4f, 0.22f, -0.77f, 0.57f, -0.97f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, true, 1.13f, -0.01f)
                lineToRelative(24.09f, 13.9f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 1.13f, 1.97f)
                verticalLineToRelative(27.8f)
                arcToRelative(1.16f, 1.16f, 0.0f, false, true, -0.56f, 0.98f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, true, -1.12f, 0.01f)
                lineToRelative(-20.27f, -11.72f)
                lineToRelative(-19.83f, 11.46f)
                lineTo(63.99f, 128.0f)
                lineToRelative(51.7f, -29.86f)
                lineToRelative(-19.82f, -11.46f)
                lineToRelative(-20.26f, 11.7f)
                arcToRelative(1.15f, 1.15f, 0.0f, false, true, -1.12f, -0.01f)
                arcToRelative(1.14f, 1.14f, 0.0f, false, true, -0.57f, -0.98f)
                lineTo(73.92f, 69.61f)
                curveToRelative(0.0f, -0.82f, 0.42f, -1.56f, 1.13f, -1.97f)
                lineTo(99.13f, 53.74f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, true, 1.12f, 0.01f)
                curveToRelative(0.35f, 0.2f, 0.57f, 0.56f, 0.57f, 0.97f)
                verticalLineToRelative(23.4f)
                lineToRelative(19.83f, 11.45f)
                lineTo(120.66f, 29.85f)
                horizontalLineToRelative(-0.01f)
                lineTo(68.96f, 0.0f)
                verticalLineToRelative(22.9f)
                lineToRelative(20.26f, 11.7f)
                curveToRelative(0.35f, 0.2f, 0.56f, 0.58f, 0.56f, 0.98f)
                curveToRelative(0.0f, 0.4f, -0.21f, 0.77f, -0.56f, 0.98f)
                lineTo(65.14f, 50.47f)
                arcToRelative(2.3f, 2.3f, 0.0f, false, true, -2.27f, 0.0f)
                lineTo(38.79f, 36.56f)
                arcToRelative(1.12f, 1.12f, 0.0f, false, true, -0.56f, -0.98f)
                arcToRelative(1.13f, 1.13f, 0.0f, false, true, 0.56f, -0.98f)
                lineTo(59.05f, 22.9f)
                close()
                moveTo(59.05f, 0.0f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
