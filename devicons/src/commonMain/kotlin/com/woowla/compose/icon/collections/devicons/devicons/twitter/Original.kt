package com.woowla.compose.icon.collections.devicons.devicons.twitter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.TwitterGroup

public val TwitterGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.104373f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(75.92f, 54.2f)
                lineTo(122.54f, 0.0f)
                horizontalLineToRelative(-11.05f)
                lineTo(71.01f, 47.06f)
                lineTo(38.67f, 0.0f)
                horizontalLineTo(1.38f)
                lineToRelative(48.9f, 71.16f)
                lineTo(1.38f, 128.0f)
                horizontalLineToRelative(11.05f)
                lineTo(55.18f, 78.3f)
                lineTo(89.33f, 128.0f)
                horizontalLineToRelative(37.3f)
                lineTo(75.91f, 54.2f)
                close()
                moveTo(60.78f, 71.79f)
                lineToRelative(-4.95f, -7.09f)
                lineToRelative(-39.42f, -56.39f)
                horizontalLineToRelative(16.97f)
                lineTo(65.19f, 53.82f)
                lineToRelative(4.95f, 7.09f)
                lineToRelative(41.35f, 59.15f)
                horizontalLineToRelative(-16.97f)
                lineTo(60.78f, 71.79f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
