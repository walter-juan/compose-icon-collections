package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.GameLine: ImageVector
    get() {
        if (_gameLine != null) {
            return _gameLine!!
        }
        _gameLine = Builder(name = "GameLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(15.122f, 2.0f, 17.909f, 3.43f, 19.743f, 5.671f)
                lineTo(13.414f, 12.0f)
                lineTo(19.743f, 18.329f)
                curveTo(17.909f, 20.57f, 15.122f, 22.0f, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                curveTo(2.0f, 6.477f, 6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(7.582f, 4.0f, 4.0f, 7.582f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                curveTo(13.723f, 20.0f, 15.355f, 19.453f, 16.697f, 18.477f)
                lineTo(16.905f, 18.32f)
                lineTo(10.586f, 12.0f)
                lineTo(16.905f, 5.679f)
                lineTo(16.697f, 5.523f)
                curveTo(15.434f, 4.604f, 13.914f, 4.066f, 12.303f, 4.006f)
                lineTo(12.0f, 4.0f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(12.828f, 5.0f, 13.5f, 5.672f, 13.5f, 6.5f)
                curveTo(13.5f, 7.328f, 12.828f, 8.0f, 12.0f, 8.0f)
                curveTo(11.172f, 8.0f, 10.5f, 7.328f, 10.5f, 6.5f)
                curveTo(10.5f, 5.672f, 11.172f, 5.0f, 12.0f, 5.0f)
                close()
            }
        }
        .build()
        return _gameLine!!
    }

private var _gameLine: ImageVector? = null
