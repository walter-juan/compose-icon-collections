package com.woowla.compose.icon.collections.devicons.devicons.visualbasic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.VisualbasicGroup

public val VisualbasicGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF004e8c)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 63.12f)
                arcToRelative(63.12f, 63.12f, 0.0f, false, true, -63.12f, 63.12f)
                arcTo(63.12f, 63.12f, 0.0f, false, true, 1.76f, 63.12f)
                arcTo(63.12f, 63.12f, 0.0f, false, true, 64.88f, 0.0f)
                arcTo(63.12f, 63.12f, 0.0f, false, true, 128.0f, 63.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.1f, strokeAlpha
                    = 0.1f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.13f, 17.75f)
                arcToRelative(63.12f, 63.12f, 0.0f, true, false, 89.12f, 89.12f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.17f, 38.17f)
                lineTo(47.13f, 77.62f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, false, -1.1f, 4.5f)
                horizontalLineToRelative(-0.14f)
                arcToRelative(23.41f, 23.41f, 0.0f, false, false, -1.01f, -4.4f)
                lineTo(31.07f, 38.27f)
                lineTo(24.58f, 38.27f)
                lineToRelative(18.03f, 49.71f)
                horizontalLineToRelative(6.49f)
                lineToRelative(18.33f, -49.71f)
                lineToRelative(-6.25f, -0.1f)
                close()
                moveTo(74.58f, 38.27f)
                verticalLineToRelative(49.71f)
                horizontalLineToRelative(14.44f)
                arcToRelative(17.04f, 17.04f, 0.0f, false, false, 11.54f, -3.95f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 4.58f, -10.34f)
                arcToRelative(11.68f, 11.68f, 0.0f, false, false, -3.02f, -8.35f)
                arcToRelative(12.64f, 12.64f, 0.0f, false, false, -8.05f, -3.79f)
                verticalLineToRelative(-0.14f)
                arcToRelative(12.35f, 12.35f, 0.0f, false, false, 6.31f, -4.44f)
                arcToRelative(12.09f, 12.09f, 0.0f, false, false, 2.35f, -7.34f)
                arcToRelative(10.2f, 10.2f, 0.0f, false, false, -3.79f, -8.22f)
                arcToRelative(15.47f, 15.47f, 0.0f, false, false, -10.22f, -3.16f)
                lineTo(74.58f, 38.27f)
                close()
                moveTo(87.11f, 43.45f)
                curveToRelative(6.35f, 0.0f, 9.53f, 2.41f, 9.53f, 7.24f)
                arcToRelative(8.03f, 8.03f, 0.0f, false, true, -2.74f, 6.51f)
                arcToRelative(11.32f, 11.32f, 0.0f, false, true, -7.48f, 2.37f)
                horizontalLineToRelative(-5.92f)
                lineTo(80.5f, 43.51f)
                lineToRelative(6.61f, -0.06f)
                close()
                moveTo(80.5f, 64.8f)
                lineToRelative(6.61f, 0.02f)
                curveToRelative(8.0f, 0.0f, 11.99f, 2.93f, 11.99f, 8.8f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -2.82f, 6.65f)
                arcToRelative(11.84f, 11.84f, 0.0f, false, true, -7.89f, 2.42f)
                horizontalLineToRelative(-7.89f)
                lineTo(80.5f, 64.8f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
