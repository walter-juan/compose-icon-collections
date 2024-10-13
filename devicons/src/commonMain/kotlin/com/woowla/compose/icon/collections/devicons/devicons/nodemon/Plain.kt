package com.woowla.compose.icon.collections.devicons.devicons.nodemon

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.NodemonGroup

public val NodemonGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF76d04b)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.53f, 30.92f)
                lineTo(66.9f, 2.84f)
                arcToRelative(5.61f, 5.61f, 0.0f, false, false, -5.9f, 0.0f)
                lineTo(12.46f, 30.92f)
                curveToRelative(-1.83f, 1.02f, -2.95f, 2.95f, -2.95f, 5.09f)
                verticalLineTo(92.07f)
                curveToRelative(0.0f, 2.14f, 1.12f, 4.07f, 2.95f, 5.09f)
                lineToRelative(48.53f, 28.08f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, false, 5.9f, 0.0f)
                lineToRelative(48.63f, -28.08f)
                curveToRelative(1.83f, -1.02f, 2.95f, -2.95f, 2.95f, -5.09f)
                verticalLineTo(36.01f)
                curveToRelative(0.0f, -2.14f, -1.12f, -4.07f, -2.95f, -5.09f)
                close()
                moveTo(97.22f, 99.5f)
                curveToRelative(0.0f, 0.61f, -0.41f, 1.22f, -0.92f, 1.53f)
                curveToRelative(-0.51f, 0.31f, -1.22f, 0.31f, -1.83f, 0.0f)
                lineToRelative(-17.5f, -10.07f)
                curveToRelative(-1.12f, -0.61f, -1.83f, -1.83f, -1.83f, -3.05f)
                verticalLineTo(66.53f)
                curveToRelative(0.0f, -1.32f, -0.61f, -2.44f, -1.73f, -3.15f)
                lineToRelative(-7.43f, -4.27f)
                curveToRelative(-0.61f, -0.31f, -1.22f, -0.51f, -1.83f, -0.51f)
                curveToRelative(-0.61f, 0.0f, -1.22f, 0.2f, -1.73f, 0.51f)
                lineToRelative(-7.53f, 4.27f)
                curveToRelative(-1.12f, 0.71f, -1.73f, 1.83f, -1.73f, 3.15f)
                verticalLineToRelative(21.37f)
                curveToRelative(0.0f, 1.22f, -0.71f, 2.44f, -1.83f, 3.05f)
                lineToRelative(-17.5f, 10.07f)
                curveToRelative(-0.61f, 0.31f, -1.22f, 0.31f, -1.83f, 0.0f)
                curveToRelative(-0.51f, -0.31f, -0.81f, -0.92f, -0.81f, -1.53f)
                lineToRelative(-0.1f, -45.78f)
                curveToRelative(0.0f, -1.22f, 0.71f, -2.44f, 1.83f, -3.05f)
                lineToRelative(2.14f, -1.22f)
                curveToRelative(-3.36f, -4.99f, -5.39f, -12.31f, -2.85f, -23.4f)
                curveToRelative(0.0f, 0.0f, 5.6f, 15.77f, 16.89f, 15.26f)
                lineToRelative(13.33f, -7.63f)
                curveToRelative(0.51f, -0.31f, 1.02f, -0.41f, 1.63f, -0.51f)
                horizontalLineToRelative(0.31f)
                curveToRelative(0.51f, 0.1f, 1.12f, 0.2f, 1.63f, 0.51f)
                lineToRelative(13.23f, 7.63f)
                curveToRelative(11.29f, 0.51f, 16.89f, -15.26f, 16.89f, -15.26f)
                curveToRelative(2.54f, 11.09f, 0.51f, 18.42f, -2.85f, 23.4f)
                lineToRelative(2.24f, 1.22f)
                curveToRelative(1.12f, 0.61f, 1.73f, 1.83f, 1.73f, 3.05f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
