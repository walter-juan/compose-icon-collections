package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Rss: ImageVector
    get() {
        if (_rss != null) {
            return _rss!!
        }
        _rss = Builder(name = "Rss", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.75f, 19.5f)
                verticalLineTo(18.75f)
                curveTo(12.75f, 14.608f, 9.392f, 11.25f, 5.25f, 11.25f)
                horizontalLineTo(4.5f)
                moveTo(4.5f, 4.5f)
                horizontalLineTo(5.25f)
                curveTo(13.12f, 4.5f, 19.5f, 10.88f, 19.5f, 18.75f)
                verticalLineTo(19.5f)
                moveTo(6.0f, 18.75f)
                curveTo(6.0f, 19.164f, 5.664f, 19.5f, 5.25f, 19.5f)
                curveTo(4.836f, 19.5f, 4.5f, 19.164f, 4.5f, 18.75f)
                curveTo(4.5f, 18.336f, 4.836f, 18.0f, 5.25f, 18.0f)
                curveTo(5.664f, 18.0f, 6.0f, 18.336f, 6.0f, 18.75f)
                close()
            }
        }
        .build()
        return _rss!!
    }

private var _rss: ImageVector? = null
