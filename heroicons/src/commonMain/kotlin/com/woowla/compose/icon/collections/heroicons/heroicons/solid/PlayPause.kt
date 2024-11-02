package com.woowla.compose.icon.collections.heroicons.heroicons.solid

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
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.PlayPause: ImageVector
    get() {
        if (_playPause != null) {
            return _playPause!!
        }
        _playPause = Builder(name = "PlayPause", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.75f)
                curveTo(14.586f, 6.75f, 14.25f, 7.086f, 14.25f, 7.5f)
                verticalLineTo(18.0f)
                curveTo(14.25f, 18.199f, 14.329f, 18.39f, 14.47f, 18.53f)
                curveTo(14.61f, 18.671f, 14.801f, 18.75f, 15.0f, 18.75f)
                horizontalLineTo(15.75f)
                curveTo(16.164f, 18.75f, 16.5f, 18.414f, 16.5f, 18.0f)
                verticalLineTo(7.5f)
                curveTo(16.5f, 7.086f, 16.164f, 6.75f, 15.75f, 6.75f)
                horizontalLineTo(15.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 6.75f)
                curveTo(19.836f, 6.75f, 19.5f, 7.086f, 19.5f, 7.5f)
                verticalLineTo(18.0f)
                curveTo(19.5f, 18.414f, 19.836f, 18.75f, 20.25f, 18.75f)
                horizontalLineTo(21.0f)
                curveTo(21.414f, 18.75f, 21.75f, 18.414f, 21.75f, 18.0f)
                lineTo(21.75f, 7.5f)
                curveTo(21.75f, 7.301f, 21.671f, 7.11f, 21.53f, 6.97f)
                curveTo(21.39f, 6.829f, 21.199f, 6.75f, 21.0f, 6.75f)
                horizontalLineTo(20.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.055f, 7.061f)
                curveTo(3.805f, 6.346f, 2.25f, 7.249f, 2.25f, 8.689f)
                verticalLineTo(16.811f)
                curveTo(2.25f, 18.251f, 3.805f, 19.154f, 5.055f, 18.439f)
                lineTo(12.163f, 14.378f)
                curveTo(13.422f, 13.658f, 13.422f, 11.842f, 12.163f, 11.122f)
                lineTo(5.055f, 7.061f)
                close()
            }
        }
        .build()
        return _playPause!!
    }

private var _playPause: ImageVector? = null
