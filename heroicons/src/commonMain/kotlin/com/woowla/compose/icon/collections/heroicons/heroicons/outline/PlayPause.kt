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

public val OutlineGroup.PlayPause: ImageVector
    get() {
        if (_playPause != null) {
            return _playPause!!
        }
        _playPause = Builder(name = "PlayPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 7.5f)
                lineTo(21.0f, 18.0f)
                moveTo(15.0f, 7.5f)
                verticalLineTo(18.0f)
                moveTo(3.0f, 16.811f)
                verticalLineTo(8.689f)
                curveTo(3.0f, 7.825f, 3.933f, 7.283f, 4.683f, 7.712f)
                lineTo(11.791f, 11.773f)
                curveTo(12.546f, 12.205f, 12.546f, 13.295f, 11.791f, 13.727f)
                lineTo(4.683f, 17.788f)
                curveTo(3.933f, 18.217f, 3.0f, 17.675f, 3.0f, 16.811f)
                close()
            }
        }
        .build()
        return _playPause!!
    }

private var _playPause: ImageVector? = null
