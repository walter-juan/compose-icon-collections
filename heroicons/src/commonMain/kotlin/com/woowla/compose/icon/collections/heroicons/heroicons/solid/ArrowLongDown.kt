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

public val SolidGroup.ArrowLongDown: ImageVector
    get() {
        if (_arrowLongDown != null) {
            return _arrowLongDown!!
        }
        _arrowLongDown = Builder(name = "ArrowLongDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(12.414f, 2.25f, 12.75f, 2.586f, 12.75f, 3.0f)
                lineTo(12.75f, 19.189f)
                lineTo(15.22f, 16.72f)
                curveTo(15.513f, 16.427f, 15.987f, 16.427f, 16.28f, 16.72f)
                curveTo(16.573f, 17.013f, 16.573f, 17.487f, 16.28f, 17.78f)
                lineTo(12.53f, 21.53f)
                curveTo(12.237f, 21.823f, 11.763f, 21.823f, 11.47f, 21.53f)
                lineTo(7.72f, 17.78f)
                curveTo(7.427f, 17.487f, 7.427f, 17.013f, 7.72f, 16.72f)
                curveTo(8.013f, 16.427f, 8.487f, 16.427f, 8.78f, 16.72f)
                lineTo(11.25f, 19.189f)
                lineTo(11.25f, 3.0f)
                curveTo(11.25f, 2.586f, 11.586f, 2.25f, 12.0f, 2.25f)
                close()
            }
        }
        .build()
        return _arrowLongDown!!
    }

private var _arrowLongDown: ImageVector? = null
