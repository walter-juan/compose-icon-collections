package com.woowla.compose.icon.collections.devicons.devicons.ktor

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
import com.woowla.compose.icon.collections.devicons.devicons.KtorGroup

public val KtorGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = linearGradient(0.3f to Color(0xFF00AFFF), 0.69f to Color(0xFF5282FF), 1.0f
                    to Color(0xFF945DFF), start = Offset(30.35f,30.46f), end =
                    Offset(63.65f,63.88f)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(80.46f, 47.54f)
                lineTo(47.54f, 14.63f)
                lineTo(14.63f, 47.54f)
                lineToRelative(32.91f, 32.91f)
                close()
                moveTo(80.46f, 47.54f)
            }
            path(fill = linearGradient(0.11f to Color(0xFFC757BC), 0.17f to Color(0xFFCD5CA9), 0.49f
                    to Color(0xFFE8744F), 0.72f to Color(0xFFF88316), 0.82f to Color(0xFFFF8900),
                    start = Offset(64.68f,64.91f), end = Offset(96.16f,96.51f)), stroke = null,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveToRelative(47.54f, 80.46f)
                lineToRelative(32.91f, 32.91f)
                lineToRelative(32.91f, -32.91f)
                lineToRelative(-32.91f, -32.91f)
                close()
                moveTo(47.54f, 80.46f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.46f, 47.54f)
                lineTo(47.54f, 47.54f)
                verticalLineToRelative(32.91f)
                horizontalLineToRelative(32.91f)
                close()
                moveTo(80.46f, 47.54f)
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
