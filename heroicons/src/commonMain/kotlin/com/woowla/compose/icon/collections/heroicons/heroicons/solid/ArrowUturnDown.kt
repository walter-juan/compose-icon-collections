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

public val SolidGroup.ArrowUturnDown: ImageVector
    get() {
        if (_arrowUturnDown != null) {
            return _arrowUturnDown!!
        }
        _arrowUturnDown = Builder(name = "ArrowUturnDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 3.75f)
                curveTo(12.101f, 3.75f, 9.75f, 6.101f, 9.75f, 9.0f)
                lineTo(9.75f, 19.189f)
                lineTo(14.47f, 14.47f)
                curveTo(14.763f, 14.177f, 15.237f, 14.177f, 15.53f, 14.47f)
                curveTo(15.823f, 14.763f, 15.823f, 15.237f, 15.53f, 15.53f)
                lineTo(9.53f, 21.53f)
                curveTo(9.39f, 21.671f, 9.199f, 21.75f, 9.0f, 21.75f)
                curveTo(8.801f, 21.75f, 8.61f, 21.671f, 8.47f, 21.53f)
                lineTo(2.47f, 15.53f)
                curveTo(2.177f, 15.237f, 2.177f, 14.763f, 2.47f, 14.47f)
                curveTo(2.763f, 14.177f, 3.237f, 14.177f, 3.53f, 14.47f)
                lineTo(8.25f, 19.189f)
                verticalLineTo(9.0f)
                curveTo(8.25f, 5.272f, 11.272f, 2.25f, 15.0f, 2.25f)
                curveTo(18.728f, 2.25f, 21.75f, 5.272f, 21.75f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(21.75f, 12.414f, 21.414f, 12.75f, 21.0f, 12.75f)
                curveTo(20.586f, 12.75f, 20.25f, 12.414f, 20.25f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(20.25f, 6.101f, 17.899f, 3.75f, 15.0f, 3.75f)
                close()
            }
        }
        .build()
        return _arrowUturnDown!!
    }

private var _arrowUturnDown: ImageVector? = null
