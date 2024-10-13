package com.woowla.compose.icon.collections.devicons.devicons.unrealengine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.UnrealengineGroup

public val UnrealengineGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(100.61f, 72.88f)
                curveToRelative(-1.06f, 5.12f, -5.78f, 18.27f, -20.85f, 25.38f)
                lineToRelative(-6.05f, -6.8f)
                lineToRelative(-10.21f, 10.26f)
                arcTo(37.67f, 37.67f, 0.0f, false, true, 33.7f, 86.43f)
                curveToRelative(1.09f, 0.34f, 2.2f, 0.55f, 3.34f, 0.63f)
                curveToRelative(1.67f, 0.03f, 3.48f, -0.58f, 3.48f, -3.39f)
                verticalLineTo(55.97f)
                arcToRelative(4.57f, 4.57f, 0.0f, false, false, -5.74f, -4.57f)
                curveToRelative(-4.73f, 1.09f, -8.5f, 12.88f, -8.5f, 12.88f)
                arcToRelative(37.51f, 37.51f, 0.0f, false, true, 12.98f, -28.74f)
                arcToRelative(38.04f, 38.04f, 0.0f, false, true, 19.15f, -8.84f)
                curveToRelative(-5.16f, 2.94f, -8.06f, 7.74f, -8.06f, 11.76f)
                curveToRelative(0.0f, 6.48f, 3.9f, 5.69f, 5.05f, 4.74f)
                verticalLineToRelative(37.38f)
                curveToRelative(0.2f, 0.47f, 0.45f, 0.91f, 0.76f, 1.32f)
                arcToRelative(5.53f, 5.53f, 0.0f, false, false, 4.52f, 2.29f)
                curveToRelative(3.9f, 0.0f, 8.97f, -4.46f, 8.97f, -4.46f)
                verticalLineTo(49.48f)
                curveToRelative(0.0f, -3.08f, -2.32f, -6.79f, -4.64f, -8.07f)
                curveToRelative(0.0f, 0.0f, 4.3f, -0.76f, 7.62f, 1.78f)
                arcToRelative(28.34f, 28.34f, 0.0f, false, true, 1.98f, -2.18f)
                curveToRelative(7.75f, -7.6f, 15.04f, -9.76f, 21.12f, -10.84f)
                curveToRelative(0.0f, 0.0f, -11.05f, 8.68f, -11.05f, 20.33f)
                curveToRelative(0.0f, 8.66f, 0.22f, 29.79f, 0.22f, 29.79f)
                curveToRelative(4.1f, 3.96f, 10.19f, -1.76f, 15.7f, -7.4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(64.0f, 2.38f)
                curveTo(29.97f, 2.38f, 2.38f, 29.97f, 2.38f, 64.0f)
                reflectiveCurveTo(29.97f, 125.62f, 64.0f, 125.62f)
                reflectiveCurveTo(125.62f, 98.03f, 125.62f, 64.0f)
                reflectiveCurveTo(98.03f, 2.38f, 64.0f, 2.38f)
                close()
                moveTo(64.0f, 123.15f)
                curveTo(31.33f, 123.15f, 4.85f, 96.67f, 4.85f, 64.0f)
                curveTo(4.85f, 31.33f, 31.34f, 4.85f, 64.0f, 4.85f)
                curveToRelative(32.67f, 0.0f, 59.15f, 26.48f, 59.15f, 59.15f)
                reflectiveCurveTo(96.67f, 123.16f, 64.0f, 123.16f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
