package com.woowla.compose.icon.collections.devicons.devicons.dataspell

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.DataspellGroup

public val DataspellGroup.Plain: ImageVector
    get() {
        if (_plain != null) {
            return _plain!!
        }
        _plain = Builder(name = "Plain", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF087cfa)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.82f, 5.82f)
                lineTo(25.33f, 23.2f)
                lineTo(5.82f, 29.33f)
                lineToRelative(10.75f, 27.81f)
                lineTo(6.91f, 94.55f)
                lineToRelative(26.78f, 27.64f)
                horizontalLineToRelative(30.91f)
                lineToRelative(4.68f, -22.23f)
                lineTo(28.05f, 99.95f)
                lineTo(28.05f, 28.05f)
                horizontalLineToRelative(71.91f)
                lineTo(99.95f, 92.84f)
                lineToRelative(22.23f, -8.36f)
                verticalLineToRelative(-51.03f)
                lineTo(80.61f, 5.82f)
                lineToRelative(-32.37f, 10.18f)
                lineToRelative(-18.42f, -10.18f)
                close()
                moveTo(29.05f, 29.05f)
                verticalLineToRelative(69.91f)
                horizontalLineToRelative(69.91f)
                lineTo(98.95f, 29.05f)
                lineTo(29.05f, 29.05f)
                close()
                moveTo(74.4f, 36.94f)
                curveToRelative(3.9f, 0.0f, 7.21f, 1.18f, 9.93f, 3.42f)
                lineToRelative(-3.07f, 4.38f)
                curveToRelative(-2.36f, -1.66f, -4.73f, -2.6f, -6.97f, -2.6f)
                curveToRelative(-2.25f, 0.0f, -3.43f, 1.06f, -3.43f, 2.36f)
                verticalLineToRelative(0.12f)
                curveToRelative(0.0f, 1.77f, 1.18f, 2.36f, 5.79f, 3.55f)
                curveToRelative(5.44f, 1.42f, 8.51f, 3.31f, 8.51f, 8.03f)
                verticalLineToRelative(0.12f)
                curveToRelative(0.0f, 5.32f, -4.01f, 8.27f, -9.81f, 8.27f)
                curveToRelative(-4.02f, -0.12f, -8.15f, -1.53f, -11.34f, -4.37f)
                lineToRelative(3.43f, -4.14f)
                curveToRelative(2.37f, 2.01f, 4.97f, 3.19f, 7.92f, 3.19f)
                curveToRelative(2.37f, 0.0f, 3.9f, -0.94f, 3.9f, -2.48f)
                verticalLineToRelative(-0.12f)
                curveToRelative(0.0f, -1.53f, -0.94f, -2.25f, -5.32f, -3.43f)
                curveToRelative(-5.43f, -1.3f, -8.86f, -2.83f, -8.86f, -8.15f)
                verticalLineToRelative(-0.12f)
                curveToRelative(0.0f, -4.84f, 3.9f, -8.04f, 9.34f, -8.04f)
                close()
                moveTo(36.73f, 37.64f)
                horizontalLineToRelative(10.37f)
                curveToRelative(8.41f, 0.0f, 14.09f, 5.67f, 14.09f, 13.1f)
                curveToRelative(0.0f, 7.43f, -5.67f, 13.3f, -14.09f, 13.3f)
                lineToRelative(-10.37f, 0.19f)
                lineTo(36.73f, 37.64f)
                close()
                moveTo(42.59f, 43.11f)
                verticalLineToRelative(15.84f)
                horizontalLineToRelative(4.5f)
                curveToRelative(4.7f, 0.0f, 8.02f, -3.13f, 8.02f, -7.82f)
                curveToRelative(0.0f, -4.7f, -3.13f, -8.02f, -8.02f, -8.02f)
                horizontalLineToRelative(-4.5f)
                close()
                moveTo(36.43f, 87.24f)
                horizontalLineToRelative(26.39f)
                verticalLineToRelative(4.33f)
                horizontalLineToRelative(-26.39f)
                verticalLineToRelative(-4.33f)
                close()
            }
        }
        .build()
        return _plain!!
    }

private var _plain: ImageVector? = null
