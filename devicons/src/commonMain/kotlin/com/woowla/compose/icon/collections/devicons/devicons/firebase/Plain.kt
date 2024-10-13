package com.woowla.compose.icon.collections.devicons.devicons.firebase

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FirebaseGroup

public val FirebaseGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFFffa000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(34.87f, 0.0f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -0.31f, 0.03f)
                arcTo(1.93f, 1.93f, 0.0f, false, false, 32.97f, 1.64f)
                lineTo(17.91f, 98.0f)
                lineToRelative(9.91f, -18.87f)
                lineToRelative(25.07f, -47.72f)
                lineTo(36.6f, 1.03f)
                lineToRelative(-0.0f, -0.0f)
                arcTo(1.93f, 1.93f, 0.0f, false, false, 34.87f, 0.0f)
                close()
                moveTo(63.26f, 18.29f)
                curveToRelative(-0.72f, 0.0f, -1.38f, 0.4f, -1.72f, 1.03f)
                lineToRelative(-7.46f, 14.2f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(-34.1f, 64.92f)
                lineToRelative(10.75f, -10.77f)
                lineToRelative(34.46f, -34.52f)
                lineToRelative(11.5f, -11.52f)
                lineToRelative(-11.71f, -22.3f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -1.72f, -1.03f)
                close()
                moveTo(95.43f, 26.6f)
                arcToRelative(1.91f, 1.91f, 0.0f, false, false, -0.52f, 0.05f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -0.91f, 0.51f)
                lineTo(79.18f, 42.01f)
                lineTo(66.62f, 54.59f)
                lineToRelative(-48.99f, 49.08f)
                lineToRelative(41.61f, 23.34f)
                horizontalLineToRelative(0.0f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, false, 7.65f, 0.0f)
                lineToRelative(42.53f, -23.65f)
                lineToRelative(-12.15f, -75.15f)
                verticalLineToRelative(0.01f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -1.32f, -1.52f)
                arcToRelative(1.96f, 1.96f, 0.0f, false, false, -0.53f, -0.09f)
                close()
                moveTo(110.37f, 104.0f)
                lineTo(109.77f, 104.04f)
                lineTo(110.02f, 104.19f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
