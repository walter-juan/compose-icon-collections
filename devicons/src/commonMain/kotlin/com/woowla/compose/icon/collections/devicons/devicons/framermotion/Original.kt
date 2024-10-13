package com.woowla.compose.icon.collections.devicons.devicons.framermotion

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.devicons.devicons.FramermotionGroup

public val FramermotionGroup.Original: ImageVector
    get() {
        if (_original != null) {
            return _original!!
        }
        _original = Builder(name = "Original", defaultWidth = 128.0.dp, defaultHeight = 128.0.dp,
                viewportWidth = 128.0f, viewportHeight = 128.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.68f, 0.0f)
                horizontalLineToRelative(84.25f)
                verticalLineToRelative(42.67f)
                lineTo(64.81f, 42.67f)
                lineTo(22.68f, 0.0f)
                close()
                moveTo(22.68f, 42.67f)
                lineTo(64.81f, 42.67f)
                lineToRelative(42.13f, 42.67f)
                lineTo(64.81f, 85.33f)
                lineTo(64.81f, 128.0f)
                lineTo(22.68f, 85.33f)
                lineTo(22.68f, 42.67f)
                close()
            }
        }
        .build()
        return _original!!
    }

private var _original: ImageVector? = null
