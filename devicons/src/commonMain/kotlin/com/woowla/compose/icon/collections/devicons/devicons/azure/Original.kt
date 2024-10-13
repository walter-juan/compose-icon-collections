package com.woowla.compose.icon.collections.devicons.devicons.azure

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
import com.woowla.compose.icon.collections.devicons.devicons.AzureGroup

public val AzureGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.0f to Color(0xFF114A8B), 1.0f to Color(0xFF0669BC), start =
                    Offset(56.57f,13.29f), end = Offset(17.74f,128.01f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.95f, 4.47f)
                lineToRelative(37.39f, 0.0f)
                lineTo(41.52f, 119.47f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, true, -5.65f, 4.06f)
                lineTo(6.77f, 123.53f)
                arcToRelative(5.96f, 5.96f, 0.0f, false, true, -4.84f, -2.48f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, -0.81f, -5.37f)
                lineTo(37.3f, 8.52f)
                arcTo(5.96f, 5.96f, 45.0f, false, true, 42.95f, 4.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0078d4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(97.28f, 81.61f)
                horizontalLineTo(37.99f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, false, -1.87f, 4.75f)
                lineToRelative(38.1f, 35.56f)
                arcToRelative(5.99f, 5.99f, 0.0f, false, false, 4.09f, 1.61f)
                horizontalLineToRelative(33.57f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0x4C000000), 0.07f to Color(0x33000000), 0.32f
                    to Color(0x19000000), 0.62f to Color(0x0C000000), 1.0f to Color(0x00000000),
                    start = Offset(68.7f,66.75f), end = Offset(59.72f,69.79f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(42.95f, 4.47f)
                arcTo(5.91f, 5.91f, 0.0f, false, false, 37.28f, 8.6f)
                lineTo(1.18f, 115.58f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, false, 5.61f, 7.95f)
                lineToRelative(29.85f, 0.0f)
                arcToRelative(6.38f, 6.38f, 135.0f, false, false, 4.9f, -4.16f)
                lineToRelative(7.2f, -21.22f)
                lineToRelative(25.72f, 23.99f)
                arcToRelative(6.08f, 6.08f, 0.0f, false, false, 3.83f, 1.4f)
                lineToRelative(33.45f, 0.0f)
                lineToRelative(-14.67f, -41.92f)
                lineToRelative(-42.77f, 0.01f)
                lineTo(80.47f, 4.47f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF3CCBF4), 1.0f to Color(0xFF2892DF), start =
                    Offset(63.76f,9.95f), end = Offset(106.39f,123.51f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(90.7f, 8.52f)
                arcTo(5.95f, 5.95f, 45.0f, false, false, 85.06f, 4.47f)
                lineTo(43.39f, 4.47f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, 5.64f, 4.05f)
                lineToRelative(36.16f, 107.15f)
                arcToRelative(5.95f, 5.95f, 0.0f, false, true, -5.64f, 7.86f)
                lineToRelative(41.67f, 0.0f)
                arcToRelative(5.96f, 5.96f, 45.0f, false, false, 5.64f, -7.86f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
