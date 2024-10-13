package com.woowla.compose.icon.collections.devicons.devicons.behance

import androidx.compose.ui.geometry.Offset
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
import com.woowla.compose.icon.collections.devicons.devicons.BehanceGroup

public val BehanceGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF005CFF), 1.0f to Color(0xFF0047AD), start =
                    Offset(64.0f,2.16f), end = Offset(64.0f,125.84f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.75f, 2.16f)
                lineTo(111.25f, 2.16f)
                arcTo(14.59f, 14.59f, 0.0f, false, true, 125.84f, 16.75f)
                lineTo(125.84f, 111.24f)
                arcTo(14.59f, 14.59f, 0.0f, false, true, 111.25f, 125.83f)
                lineTo(16.75f, 125.83f)
                arcTo(14.59f, 14.59f, 0.0f, false, true, 2.16f, 111.24f)
                lineTo(2.16f, 16.75f)
                arcTo(14.59f, 14.59f, 0.0f, false, true, 16.75f, 2.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.63f, 60.28f)
                reflectiveCurveToRelative(10.5f, -0.78f, 10.5f, -13.09f)
                reflectiveCurveToRelative(-8.59f, -18.32f, -19.47f, -18.32f)
                lineTo(7.86f, 28.87f)
                verticalLineToRelative(68.8f)
                horizontalLineToRelative(35.8f)
                reflectiveCurveToRelative(21.85f, 0.69f, 21.85f, -20.31f)
                curveToRelative(0.0f, 0.0f, 0.96f, -17.08f, -12.88f, -17.08f)
                close()
                moveTo(23.63f, 41.1f)
                horizontalLineToRelative(20.0f)
                reflectiveCurveToRelative(4.87f, 0.0f, 4.87f, 7.16f)
                reflectiveCurveToRelative(-2.86f, 8.2f, -6.11f, 8.2f)
                lineTo(23.64f, 56.46f)
                close()
                moveTo(42.73f, 85.44f)
                lineTo(23.64f, 85.44f)
                lineTo(23.64f, 67.06f)
                horizontalLineToRelative(20.0f)
                reflectiveCurveToRelative(7.25f, -0.1f, 7.25f, 9.45f)
                curveToRelative(0.02f, 7.95f, -5.28f, 8.85f, -8.15f, 8.93f)
                close()
                moveTo(94.66f, 46.38f)
                curveToRelative(-26.46f, 0.0f, -26.43f, 26.43f, -26.43f, 26.43f)
                reflectiveCurveToRelative(-1.82f, 26.3f, 26.43f, 26.3f)
                curveToRelative(0.0f, 0.0f, 23.54f, 1.34f, 23.54f, -18.29f)
                horizontalLineToRelative(-12.1f)
                reflectiveCurveToRelative(0.4f, 7.4f, -11.0f, 7.4f)
                curveToRelative(0.0f, 0.0f, -12.11f, 0.81f, -12.11f, -12.0f)
                horizontalLineToRelative(35.65f)
                reflectiveCurveToRelative(3.87f, -29.84f, -23.98f, -29.84f)
                close()
                moveTo(105.42f, 67.06f)
                horizontalLineToRelative(-22.6f)
                reflectiveCurveToRelative(1.48f, -10.6f, 12.11f, -10.6f)
                reflectiveCurveToRelative(10.49f, 10.6f, 10.49f, 10.6f)
                close()
                moveTo(79.86f, 32.93f)
                horizontalLineToRelative(28.38f)
                verticalLineToRelative(8.47f)
                lineTo(79.86f, 41.4f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
