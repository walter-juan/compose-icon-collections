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

public val SolidGroup.ArrowLongRight: ImageVector
    get() {
        if (_arrowLongRight != null) {
            return _arrowLongRight!!
        }
        _arrowLongRight = Builder(name = "ArrowLongRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.72f, 7.72f)
                curveTo(17.013f, 7.427f, 17.487f, 7.427f, 17.78f, 7.72f)
                lineTo(21.53f, 11.47f)
                curveTo(21.823f, 11.763f, 21.823f, 12.237f, 21.53f, 12.53f)
                lineTo(17.78f, 16.28f)
                curveTo(17.487f, 16.573f, 17.013f, 16.573f, 16.72f, 16.28f)
                curveTo(16.427f, 15.987f, 16.427f, 15.513f, 16.72f, 15.22f)
                lineTo(19.189f, 12.75f)
                horizontalLineTo(3.0f)
                curveTo(2.586f, 12.75f, 2.25f, 12.414f, 2.25f, 12.0f)
                curveTo(2.25f, 11.586f, 2.586f, 11.25f, 3.0f, 11.25f)
                horizontalLineTo(19.189f)
                lineTo(16.72f, 8.78f)
                curveTo(16.427f, 8.487f, 16.427f, 8.013f, 16.72f, 7.72f)
                close()
            }
        }
        .build()
        return _arrowLongRight!!
    }

private var _arrowLongRight: ImageVector? = null
