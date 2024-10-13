package com.woowla.compose.icon.collections.devicons.devicons.supabase

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Brush.Companion.linearGradient
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
import com.woowla.compose.icon.collections.devicons.devicons.SupabaseGroup

public val SupabaseGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF249361), 1.0f to Color(0xFF3ECF8E), start =
                    Offset(63.39f,62.63f), end = Offset(109.35f,81.9f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(74.52f, 125.87f)
                curveToRelative(-3.27f, 4.12f, -9.9f, 1.86f, -9.98f, -3.4f)
                lineToRelative(-1.16f, -76.91f)
                horizontalLineToRelative(51.72f)
                curveToRelative(9.36f, 0.0f, 14.59f, 10.82f, 8.76f, 18.15f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF000000), 1.0f to Color(0x00000000), start =
                    Offset(43.01f,34.73f), end = Offset(63.97f,74.18f)), stroke = null, fillAlpha =
                    0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(74.52f, 125.87f)
                curveToRelative(-3.27f, 4.12f, -9.9f, 1.86f, -9.98f, -3.4f)
                lineToRelative(-1.16f, -76.91f)
                horizontalLineToRelative(51.72f)
                curveToRelative(9.36f, 0.0f, 14.59f, 10.82f, 8.76f, 18.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF3ecf8e)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(53.48f, 2.13f)
                curveToRelative(3.27f, -4.12f, 9.9f, -1.86f, 9.98f, 3.4f)
                lineToRelative(0.51f, 76.91f)
                horizontalLineTo(12.9f)
                curveToRelative(-9.36f, 0.0f, -14.59f, -10.82f, -8.76f, -18.15f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
