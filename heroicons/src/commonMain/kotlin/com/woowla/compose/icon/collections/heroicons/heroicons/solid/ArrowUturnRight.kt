package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.ArrowUturnRight: ImageVector
    get() {
        if (_arrowUturnRight != null) {
            return _arrowUturnRight!!
        }
        _arrowUturnRight = Builder(name = "ArrowUturnRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.47f, 2.47f)
                curveTo(14.763f, 2.177f, 15.237f, 2.177f, 15.53f, 2.47f)
                lineTo(21.53f, 8.47f)
                curveTo(21.823f, 8.763f, 21.823f, 9.237f, 21.53f, 9.53f)
                lineTo(15.53f, 15.53f)
                curveTo(15.237f, 15.823f, 14.763f, 15.823f, 14.47f, 15.53f)
                curveTo(14.177f, 15.237f, 14.177f, 14.763f, 14.47f, 14.47f)
                lineTo(19.189f, 9.75f)
                horizontalLineTo(9.0f)
                curveTo(6.101f, 9.75f, 3.75f, 12.101f, 3.75f, 15.0f)
                curveTo(3.75f, 17.899f, 6.101f, 20.25f, 9.0f, 20.25f)
                horizontalLineTo(12.0f)
                curveTo(12.414f, 20.25f, 12.75f, 20.586f, 12.75f, 21.0f)
                curveTo(12.75f, 21.414f, 12.414f, 21.75f, 12.0f, 21.75f)
                horizontalLineTo(9.0f)
                curveTo(5.272f, 21.75f, 2.25f, 18.728f, 2.25f, 15.0f)
                curveTo(2.25f, 11.272f, 5.272f, 8.25f, 9.0f, 8.25f)
                horizontalLineTo(19.189f)
                lineTo(14.47f, 3.53f)
                curveTo(14.177f, 3.237f, 14.177f, 2.763f, 14.47f, 2.47f)
                close()
            }
        }
        .build()
        return _arrowUturnRight!!
    }

private var _arrowUturnRight: ImageVector? = null
