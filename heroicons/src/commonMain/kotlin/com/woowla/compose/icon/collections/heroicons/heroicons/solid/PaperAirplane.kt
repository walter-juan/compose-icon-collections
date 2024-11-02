package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.PaperAirplane: ImageVector
    get() {
        if (_paperAirplane != null) {
            return _paperAirplane!!
        }
        _paperAirplane = Builder(name = "PaperAirplane", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.478f, 2.404f)
                curveTo(3.213f, 2.327f, 2.928f, 2.402f, 2.734f, 2.598f)
                curveTo(2.541f, 2.795f, 2.471f, 3.082f, 2.552f, 3.345f)
                lineTo(4.984f, 11.25f)
                horizontalLineTo(13.5f)
                curveTo(13.914f, 11.25f, 14.25f, 11.586f, 14.25f, 12.0f)
                curveTo(14.25f, 12.414f, 13.914f, 12.75f, 13.5f, 12.75f)
                horizontalLineTo(4.984f)
                lineTo(2.552f, 20.655f)
                curveTo(2.471f, 20.918f, 2.541f, 21.205f, 2.734f, 21.401f)
                curveTo(2.928f, 21.598f, 3.213f, 21.672f, 3.478f, 21.595f)
                curveTo(10.177f, 19.649f, 16.397f, 16.581f, 21.923f, 12.609f)
                curveTo(22.119f, 12.468f, 22.236f, 12.241f, 22.236f, 12.0f)
                curveTo(22.236f, 11.758f, 22.119f, 11.532f, 21.923f, 11.391f)
                curveTo(16.397f, 7.418f, 10.177f, 4.35f, 3.478f, 2.404f)
                close()
            }
        }
        .build()
        return _paperAirplane!!
    }

private var _paperAirplane: ImageVector? = null
