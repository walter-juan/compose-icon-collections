package com.woowla.compose.icon.collections.devicons.devicons.storybook

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.StorybookGroup

public val StorybookGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.35f, 2.01f)
                lineToRelative(-6.91f, 0.43f)
                lineToRelative(0.54f, 14.38f)
                curveToRelative(0.03f, 0.8f, -0.89f, 1.26f, -1.51f, 0.77f)
                lineToRelative(-4.63f, -3.65f)
                lineToRelative(-5.49f, 4.16f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, true, -1.5f, -0.78f)
                lineToRelative(0.62f, -14.12f)
                lineTo(19.87f, 7.48f)
                arcToRelative(6.26f, 6.26f, 0.0f, false, false, -5.87f, 6.49f)
                lineToRelative(3.86f, 102.84f)
                arcToRelative(6.26f, 6.26f, 0.0f, false, false, 5.98f, 6.02f)
                lineToRelative(83.61f, 3.75f)
                arcToRelative(6.27f, 6.27f, 0.0f, false, false, 4.61f, -1.73f)
                arcToRelative(6.27f, 6.27f, 0.0f, false, false, 1.94f, -4.53f)
                lineTo(114.0f, 8.26f)
                arcToRelative(6.26f, 6.26f, 0.0f, false, false, -1.98f, -4.57f)
                arcToRelative(6.26f, 6.26f, 0.0f, false, false, -4.68f, -1.69f)
                close()
                moveTo(65.89f, 23.2f)
                curveToRelative(16.31f, 0.0f, 25.21f, 8.72f, 25.21f, 25.32f)
                curveToRelative(-2.2f, 1.71f, -18.62f, 2.88f, -18.62f, 0.44f)
                curveToRelative(0.35f, -9.3f, -3.82f, -9.71f, -6.13f, -9.71f)
                curveToRelative(-2.2f, 0.0f, -5.9f, 0.66f, -5.9f, 5.64f)
                curveToRelative(0.0f, 12.29f, 31.69f, 11.63f, 31.69f, 36.42f)
                curveToRelative(0.0f, 13.95f, -11.34f, 21.66f, -25.79f, 21.66f)
                curveToRelative(-14.92f, 0.0f, -27.96f, -6.04f, -26.49f, -26.96f)
                curveToRelative(0.58f, -2.46f, 19.55f, -1.87f, 19.55f, 0.0f)
                curveToRelative(-0.23f, 8.64f, 1.74f, 11.18f, 6.71f, 11.18f)
                curveToRelative(3.82f, 0.0f, 5.55f, -2.1f, 5.55f, -5.65f)
                curveToRelative(0.0f, -12.62f, -31.23f, -13.06f, -31.23f, -36.2f)
                curveToRelative(0.0f, -13.28f, 9.14f, -22.14f, 25.44f, -22.14f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
