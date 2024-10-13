package com.woowla.compose.icon.collections.devicons.devicons.v8

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.V8Group

public val V8Group.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF4889f4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.77f, 21.84f)
                lineToRelative(10.95f, 19.17f)
                horizontalLineToRelative(0.05f)
                lineToRelative(3.1f, 5.47f)
                horizontalLineToRelative(7.4f)
                lineToRelative(9.03f, 17.15f)
                arcToRelative(30.53f, 30.53f, 0.0f, false, true, 10.12f, -16.01f)
                curveToRelative(-3.12f, -4.58f, -4.58f, -10.1f, -4.05f, -15.62f)
                lineToRelative(-5.11f, -10.16f)
                lineTo(3.77f, 21.84f)
                close()
                moveTo(92.75f, 21.84f)
                lineTo(87.56f, 30.93f)
                arcToRelative(23.61f, 23.61f, 0.0f, false, true, -3.98f, 16.68f)
                arcToRelative(30.69f, 30.69f, 0.0f, false, true, 10.11f, 16.1f)
                lineToRelative(9.05f, -17.24f)
                horizontalLineToRelative(7.39f)
                lineToRelative(0.41f, -0.68f)
                lineToRelative(2.69f, -4.79f)
                horizontalLineToRelative(0.04f)
                lineToRelative(10.95f, -19.17f)
                lineTo(92.75f, 21.84f)
                close()
                moveTo(70.33f, 62.83f)
                lineTo(63.93f, 75.02f)
                lineToRelative(-6.55f, -11.98f)
                curveToRelative(-2.28f, 1.85f, -3.83f, 4.66f, -3.84f, 8.08f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 5.75f, 4.7f, 10.45f, 10.45f, 10.45f)
                arcToRelative(10.44f, 10.44f, 0.0f, false, false, 10.45f, -10.45f)
                curveToRelative(0.0f, -3.22f, -1.5f, -6.26f, -4.05f, -8.23f)
                curveToRelative(-0.03f, -0.02f, -0.05f, -0.04f, -0.08f, -0.05f)
                close()
                moveTo(54.39f, 100.19f)
                lineTo(64.0f, 117.66f)
                lineToRelative(9.6f, -17.44f)
                arcToRelative(30.52f, 30.52f, 0.0f, false, true, -9.6f, 1.51f)
                arcToRelative(30.69f, 30.69f, 0.0f, false, true, -9.61f, -1.55f)
                close()
                moveTo(93.36f, 64.34f)
                arcToRelative(30.24f, 30.24f, 0.0f, false, false, -10.4f, -16.63f)
                arcToRelative(23.27f, 23.27f, 0.0f, true, false, -42.1f, -15.68f)
                arcToRelative(23.2f, 23.2f, 0.0f, false, false, 4.18f, 15.68f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, false, -10.4f, 16.57f)
                arcToRelative(29.91f, 29.91f, 0.0f, false, false, -0.75f, 6.84f)
                curveToRelative(0.0f, 12.73f, 7.94f, 23.68f, 19.17f, 28.06f)
                arcToRelative(30.19f, 30.19f, 0.0f, false, false, 10.95f, 2.05f)
                arcToRelative(30.05f, 30.05f, 0.0f, false, false, 29.36f, -36.89f)
                close()
                moveTo(64.0f, 25.94f)
                arcToRelative(9.58f, 9.58f, 0.0f, true, true, 0.0f, 19.17f)
                arcToRelative(9.58f, 9.58f, 0.0f, false, true, 0.0f, -19.17f)
                close()
                moveTo(64.0f, 82.07f)
                curveToRelative(-6.02f, 0.0f, -10.95f, -4.93f, -10.95f, -10.95f)
                arcToRelative(10.95f, 10.95f, 0.0f, false, true, 17.66f, -8.63f)
                arcToRelative(10.88f, 10.88f, 0.0f, false, true, 4.24f, 8.63f)
                arcTo(10.95f, 10.95f, 0.0f, false, true, 64.0f, 82.07f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
