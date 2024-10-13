package com.woowla.compose.icon.collections.devicons.devicons.ubuntu

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.UbuntuGroup

public val UbuntuGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(80.66f)
                lineTo(104.66f, 0.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(77.22f, 55.02f)
                curveToRelative(4.61f, 0.0f, 8.35f, 3.77f, 8.35f, 8.42f)
                curveToRelative(0.0f, 4.65f, -3.74f, 8.42f, -8.35f, 8.42f)
                curveToRelative(-4.61f, 0.0f, -8.35f, -3.77f, -8.35f, -8.42f)
                curveToRelative(0.0f, -4.65f, 3.74f, -8.42f, 8.35f, -8.42f)
                close()
                moveTo(65.73f, 55.88f)
                curveToRelative(0.65f, 0.0f, 1.31f, 0.03f, 1.97f, 0.09f)
                arcToRelative(12.21f, 12.21f, 0.0f, false, false, -2.53f, 6.82f)
                curveToRelative(-6.57f, 0.12f, -12.64f, 3.39f, -16.4f, 8.84f)
                arcToRelative(11.83f, 11.83f, 0.0f, false, false, -3.82f, -1.55f)
                arcToRelative(11.78f, 11.78f, 0.0f, false, false, -2.52f, -0.27f)
                curveToRelative(-0.21f, 0.0f, -0.42f, 0.0f, -0.63f, 0.01f)
                lineToRelative(-0.0f, 0.0f)
                curveToRelative(4.87f, -8.66f, 14.15f, -14.01f, 23.94f, -13.95f)
                close()
                moveTo(88.33f, 68.21f)
                arcToRelative(27.77f, 27.77f, 0.0f, false, true, 3.94f, 20.96f)
                arcToRelative(27.68f, 27.68f, 0.0f, false, true, -5.3f, 11.34f)
                lineToRelative(0.0f, 0.01f)
                lineToRelative(-0.0f, -0.0f)
                lineToRelative(0.0f, -0.0f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, -4.0f, -6.27f)
                arcToRelative(20.66f, 20.66f, 0.0f, false, false, 2.6f, -6.52f)
                arcToRelative(20.74f, 20.74f, 0.0f, false, false, -1.93f, -13.98f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 4.69f, -5.54f)
                close()
                moveTo(42.44f, 73.48f)
                curveToRelative(4.61f, 0.0f, 8.35f, 3.77f, 8.35f, 8.42f)
                curveToRelative(0.0f, 4.65f, -3.74f, 8.42f, -8.35f, 8.42f)
                curveToRelative(-4.61f, 0.0f, -8.35f, -3.77f, -8.35f, -8.42f)
                curveToRelative(0.0f, -4.65f, 3.74f, -8.42f, 8.35f, -8.42f)
                close()
                moveTo(47.41f, 92.9f)
                curveToRelative(2.83f, 5.49f, 7.85f, 9.36f, 13.87f, 10.66f)
                lineToRelative(0.0f, -0.0f)
                arcToRelative(20.05f, 20.05f, 0.0f, false, false, 2.05f, 0.34f)
                arcToRelative(12.11f, 12.11f, 0.0f, false, false, 2.44f, 7.04f)
                arcToRelative(27.24f, 27.24f, 0.0f, false, true, -5.93f, -0.61f)
                curveToRelative(-8.9f, -1.92f, -16.15f, -8.07f, -19.57f, -16.53f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 7.14f, -0.88f)
                close()
                moveTo(75.34f, 95.19f)
                curveToRelative(4.61f, 0.0f, 8.35f, 3.77f, 8.35f, 8.42f)
                curveToRelative(0.0f, 4.65f, -3.74f, 8.42f, -8.35f, 8.42f)
                curveToRelative(-4.61f, 0.0f, -8.35f, -3.77f, -8.35f, -8.42f)
                curveToRelative(0.0f, -4.65f, 3.74f, -8.42f, 8.35f, -8.42f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
