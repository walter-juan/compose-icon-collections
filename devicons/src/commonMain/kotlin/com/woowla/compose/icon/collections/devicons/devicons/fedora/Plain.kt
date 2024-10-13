package com.woowla.compose.icon.collections.devicons.devicons.fedora

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FedoraGroup

public val FedoraGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF51a2da)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.22f, 1.27f)
                curveTo(29.6f, 1.27f, 1.56f, 29.43f, 1.5f, 64.21f)
                horizontalLineToRelative(-0.01f)
                verticalLineToRelative(48.72f)
                lineTo(1.5f, 112.93f)
                curveToRelative(0.02f, 7.89f, 6.38f, 14.27f, 14.24f, 14.27f)
                horizontalLineToRelative(48.47f)
                curveToRelative(34.62f, -0.02f, 62.66f, -28.19f, 62.66f, -62.94f)
                curveToRelative(0.0f, -34.77f, -28.05f, -62.94f, -62.72f, -62.94f)
                close()
                moveTo(76.96f, 27.18f)
                curveToRelative(10.53f, 0.0f, 20.47f, 8.09f, 20.47f, 19.26f)
                curveToRelative(0.0f, 1.03f, 0.01f, 2.07f, -0.16f, 3.25f)
                curveToRelative(-0.29f, 2.97f, -2.99f, 5.11f, -5.94f, 4.69f)
                curveToRelative(-2.94f, -0.43f, -4.94f, -3.23f, -4.39f, -6.17f)
                curveToRelative(0.05f, -0.34f, 0.07f, -0.86f, 0.07f, -1.77f)
                curveToRelative(0.0f, -6.33f, -5.16f, -8.77f, -10.03f, -8.77f)
                curveToRelative(-4.88f, 0.0f, -9.27f, 4.12f, -9.28f, 8.77f)
                curveToRelative(0.08f, 5.39f, 0.0f, 10.73f, 0.0f, 16.11f)
                lineToRelative(9.05f, -0.07f)
                curveToRelative(7.07f, -0.14f, 7.15f, 10.54f, 0.08f, 10.49f)
                lineToRelative(-9.13f, 0.07f)
                curveToRelative(-0.02f, 4.34f, 0.03f, 3.55f, 0.01f, 5.73f)
                curveToRelative(0.0f, 0.0f, 0.07f, 5.3f, -0.08f, 9.31f)
                curveToRelative(-1.09f, 11.8f, -11.09f, 21.23f, -23.11f, 21.23f)
                curveToRelative(-12.75f, 0.0f, -23.24f, -10.46f, -23.24f, -23.28f)
                curveToRelative(0.38f, -13.19f, 10.86f, -23.57f, 24.05f, -23.45f)
                lineToRelative(7.36f, -0.05f)
                verticalLineToRelative(10.47f)
                lineToRelative(-7.36f, 0.07f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-7.25f, 0.22f, -13.47f, 5.16f, -13.58f, 12.96f)
                arcToRelative(12.77f, 12.77f, 0.0f, false, false, 12.81f, 12.8f)
                curveToRelative(7.09f, 0.0f, 12.76f, -5.18f, 12.76f, -12.78f)
                lineToRelative(-0.01f, -39.65f)
                curveToRelative(0.0f, -0.74f, 0.03f, -1.32f, 0.11f, -2.13f)
                curveToRelative(1.2f, -9.7f, 9.83f, -17.09f, 19.61f, -17.09f)
                close()
                moveTo(76.96f, 27.18f)
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
