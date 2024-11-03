package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.555f, 1.375f)
                lineTo(0.0f, 2.237f)
                verticalLineToRelative(5.45f)
                horizontalLineToRelative(6.555f)
                close()
                moveTo(0.0f, 13.795f)
                lineToRelative(6.555f, 0.933f)
                lineTo(6.555f, 8.313f)
                lineTo(0.0f, 8.313f)
                close()
                moveTo(7.278f, 8.395f)
                lineTo(7.304f, 14.773f)
                lineTo(16.0f, 16.0f)
                lineTo(16.0f, 8.395f)
                close()
                moveTo(16.0f, 0.0f)
                lineTo(7.33f, 1.244f)
                verticalLineToRelative(6.414f)
                lineTo(16.0f, 7.658f)
                close()
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null
