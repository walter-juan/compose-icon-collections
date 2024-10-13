package com.woowla.compose.icon.collections.devicons.devicons.vite

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.ViteGroup

public val ViteGroup.OriginalWordmark: ImageVector
    get() {
        if (_originalWordmark != null) {
            return _originalWordmark!!
        }
        _originalWordmark = Builder(name = "OriginalWordmark", defaultWidth = 128.0.dp,
                defaultHeight = 128.0.dp, viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF006bff)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(70.36f, 30.93f)
                lineTo(26.78f, 41.21f)
                lineToRelative(-6.45f, 55.86f)
                close()
                moveTo(21.69f, 42.16f)
                lineTo(0.0f, 47.05f)
                lineToRelative(19.6f, 49.8f)
                close()
                moveTo(113.37f, 60.58f)
                verticalLineToRelative(19.63f)
                lineTo(128.0f, 80.2f)
                lineTo(128.0f, 79.14f)
                horizontalLineToRelative(-13.31f)
                verticalLineToRelative(-8.61f)
                horizontalLineToRelative(12.38f)
                verticalLineToRelative(-1.01f)
                lineToRelative(-6.17f, -0.01f)
                lineToRelative(-6.18f, -0.02f)
                lineToRelative(-0.02f, -3.92f)
                lineToRelative(-0.01f, -3.92f)
                horizontalLineToRelative(13.13f)
                verticalLineToRelative(-1.06f)
                close()
                moveTo(56.04f, 60.59f)
                curveToRelative(-0.37f, 0.0f, -0.68f, 0.01f, -0.68f, 0.03f)
                curveToRelative(0.0f, 0.02f, 1.79f, 4.39f, 3.98f, 9.74f)
                curveToRelative(2.19f, 5.34f, 3.99f, 9.75f, 4.01f, 9.78f)
                curveToRelative(0.03f, 0.07f, 0.25f, 0.08f, 0.8f, 0.08f)
                horizontalLineToRelative(0.76f)
                lineToRelative(4.0f, -9.74f)
                curveToRelative(2.2f, -5.36f, 4.01f, -9.77f, 4.02f, -9.81f)
                curveToRelative(0.02f, -0.06f, -0.11f, -0.08f, -0.63f, -0.08f)
                horizontalLineToRelative(-0.64f)
                lineToRelative(-3.72f, 9.26f)
                curveToRelative(-2.04f, 5.1f, -3.74f, 9.25f, -3.79f, 9.24f)
                curveToRelative(-0.03f, -0.01f, -1.73f, -4.17f, -3.74f, -9.26f)
                lineToRelative(-3.68f, -9.24f)
                close()
                moveTo(80.49f, 60.59f)
                verticalLineToRelative(19.62f)
                horizontalLineToRelative(1.32f)
                lineTo(81.82f, 60.59f)
                close()
                moveTo(89.39f, 60.59f)
                verticalLineToRelative(0.53f)
                horizontalLineToRelative(-0.02f)
                verticalLineToRelative(0.53f)
                horizontalLineToRelative(7.57f)
                verticalLineToRelative(18.57f)
                horizontalLineToRelative(1.32f)
                lineTo(98.26f, 61.65f)
                horizontalLineToRelative(7.57f)
                verticalLineToRelative(-1.06f)
                close()
            }
        }
        .build()
        return _originalWordmark!!
    }

private var _originalWordmark: ImageVector? = null
