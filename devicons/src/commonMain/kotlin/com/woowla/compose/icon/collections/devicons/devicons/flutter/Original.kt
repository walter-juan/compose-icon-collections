package com.woowla.compose.icon.collections.devicons.devicons.flutter

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
import com.woowla.compose.icon.collections.devicons.devicons.FlutterGroup

public val FlutterGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF3FB6D3)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.3f, 64.2f)
                lineTo(76.3f, 0.0f)
                horizontalLineToRelative(39.4f)
                lineTo(32.1f, 83.6f)
                close()
                moveTo(76.3f, 128.0f)
                horizontalLineToRelative(39.4f)
                lineTo(81.6f, 93.9f)
                lineToRelative(34.1f, -34.8f)
                horizontalLineTo(76.3f)
                lineTo(42.2f, 93.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF27AACD)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(81.6f, 93.9f)
                lineToRelative(-20.0f, -20.0f)
                lineToRelative(-19.4f, 19.6f)
                lineToRelative(19.4f, 19.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF19599A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(115.7f, 128.0f)
                lineTo(81.6f, 93.9f)
                lineToRelative(-20.0f, 19.2f)
                lineTo(76.3f, 128.0f)
                close()
            }
            path(fill = linearGradient(0.0f to Color(0xFF1B4E94), 0.63f to Color(0xFF1A5497), 1.0f
                    to Color(0xFF195A9B), start = Offset(59.37f,116.36f), end =
                    Offset(86.83f,99.4f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(61.6f, 113.1f)
                lineToRelative(30.8f, -8.4f)
                lineToRelative(-10.8f, -10.8f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
