package com.woowla.compose.icon.collections.devicons.devicons.minitab

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
import com.woowla.compose.icon.collections.devicons.devicons.MinitabGroup

public val MinitabGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF8DC63F)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(128.0f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(0.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0x338DC63F), 1.0f to Color(0x33000000), start =
                    Offset(99.32f,119.57f), end = Offset(21.21f,41.21f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(41.0f, 128.0f)
                lineToRelative(-26.2f, -21.7f)
                lineToRelative(19.8f, -53.9f)
                lineToRelative(19.2f, 17.9f)
                verticalLineTo(19.4f)
                horizontalLineToRelative(7.9f)
                lineToRelative(21.0f, 23.5f)
                lineToRelative(6.1f, -5.3f)
                lineTo(113.9f, 70.0f)
                lineToRelative(2.1f, -1.5f)
                lineToRelative(12.0f, 16.1f)
                verticalLineToRelative(43.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.0f, 19.4f)
                horizontalLineToRelative(19.7f)
                verticalLineToRelative(86.9f)
                horizontalLineTo(42.0f)
                close()
                moveTo(69.1f, 37.6f)
                horizontalLineToRelative(19.7f)
                verticalLineToRelative(68.7f)
                horizontalLineTo(69.1f)
                close()
                moveTo(96.3f, 68.5f)
                horizontalLineTo(116.0f)
                verticalLineToRelative(37.8f)
                horizontalLineTo(96.3f)
                close()
                moveTo(14.8f, 52.4f)
                horizontalLineToRelative(19.7f)
                verticalLineToRelative(53.9f)
                horizontalLineTo(14.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFFD1D1D2)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.8f, 100.3f)
                lineToRelative(19.8f, -7.4f)
                verticalLineToRelative(13.4f)
                horizontalLineTo(14.8f)
                close()
                moveTo(61.7f, 71.9f)
                verticalLineToRelative(34.4f)
                horizontalLineTo(42.0f)
                verticalLineTo(89.1f)
                close()
                moveTo(69.1f, 71.9f)
                lineToRelative(19.7f, 14.5f)
                verticalLineToRelative(19.9f)
                horizontalLineTo(69.1f)
                close()
                moveTo(96.3f, 86.2f)
                lineToRelative(19.7f, -7.6f)
                verticalLineToRelative(27.7f)
                horizontalLineTo(96.3f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
