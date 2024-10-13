package com.woowla.compose.icon.collections.devicons.devicons.windows11

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.Windows11Group

public val Windows11Group.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF0078d4)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(67.33f, 67.33f)
                horizontalLineToRelative(60.67f)
                lineTo(128.0f, 128.0f)
                lineTo(67.33f, 128.0f)
                close()
                moveTo(0.0f, 67.33f)
                horizontalLineToRelative(60.67f)
                lineTo(60.67f, 128.0f)
                lineTo(0.0f, 128.0f)
                close()
                moveTo(67.33f, 0.0f)
                horizontalLineToRelative(60.67f)
                verticalLineToRelative(60.67f)
                lineTo(67.33f, 60.67f)
                close()
                moveTo(0.0f, 0.0f)
                horizontalLineToRelative(60.67f)
                verticalLineToRelative(60.67f)
                lineTo(0.0f, 60.67f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
