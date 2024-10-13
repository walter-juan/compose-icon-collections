package com.woowla.compose.icon.collections.devicons.devicons.bootstrap

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.BootstrapGroup

public val BootstrapGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.24f, 13.89f)
                curveToRelative(-7.18f, 0.0f, -12.49f, 6.28f, -12.25f, 13.1f)
                curveToRelative(0.23f, 6.55f, -0.07f, 15.03f, -2.2f, 21.94f)
                curveToRelative(-2.14f, 6.94f, -5.76f, 11.32f, -11.67f, 11.88f)
                verticalLineToRelative(6.39f)
                curveToRelative(5.91f, 0.56f, 9.53f, 4.95f, 11.67f, 11.88f)
                curveToRelative(2.13f, 6.91f, 2.43f, 15.39f, 2.2f, 21.94f)
                curveToRelative(-0.24f, 6.82f, 5.07f, 13.1f, 12.25f, 13.1f)
                horizontalLineToRelative(73.54f)
                curveToRelative(7.18f, 0.0f, 12.49f, -6.28f, 12.25f, -13.1f)
                curveToRelative(-0.23f, -6.55f, 0.07f, -15.03f, 2.2f, -21.94f)
                curveToRelative(2.14f, -6.93f, 5.75f, -11.32f, 11.66f, -11.88f)
                verticalLineToRelative(-6.39f)
                curveToRelative(-5.91f, -0.56f, -9.52f, -4.95f, -11.66f, -11.88f)
                curveToRelative(-2.13f, -6.91f, -2.43f, -15.39f, -2.2f, -21.94f)
                curveToRelative(0.24f, -6.82f, -5.07f, -13.1f, -12.25f, -13.1f)
                close()
                moveTo(85.35f, 75.57f)
                curveToRelative(0.0f, 9.38f, -7.0f, 15.07f, -18.62f, 15.07f)
                lineTo(45.31f, 90.64f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, -0.49f, -0.49f)
                lineTo(44.81f, 37.83f)
                arcToRelative(0.49f, 0.49f, 0.0f, false, true, 0.49f, -0.49f)
                horizontalLineToRelative(21.31f)
                curveToRelative(9.69f, 0.0f, 16.05f, 5.25f, 16.05f, 13.3f)
                curveToRelative(0.0f, 5.65f, -4.28f, 10.71f, -9.73f, 11.6f)
                verticalLineToRelative(0.3f)
                curveToRelative(7.42f, 0.81f, 12.41f, 5.95f, 12.41f, 13.04f)
                close()
                moveTo(64.57f, 44.1f)
                lineTo(53.29f, 44.1f)
                verticalLineToRelative(15.92f)
                horizontalLineToRelative(9.5f)
                curveToRelative(7.34f, 0.0f, 11.39f, -2.95f, 11.39f, -8.24f)
                curveToRelative(0.0f, -4.95f, -3.48f, -7.68f, -9.61f, -7.68f)
                close()
                moveTo(53.29f, 66.34f)
                verticalLineToRelative(17.55f)
                horizontalLineToRelative(11.69f)
                curveToRelative(7.64f, 0.0f, 11.69f, -3.07f, 11.69f, -8.83f)
                curveToRelative(0.0f, -5.76f, -4.16f, -8.72f, -12.19f, -8.72f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
