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

public val SolidGroup.ArrowDown: ImageVector
    get() {
        if (_arrowDown != null) {
            return _arrowDown!!
        }
        _arrowDown = Builder(name = "ArrowDown", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(12.414f, 2.25f, 12.75f, 2.586f, 12.75f, 3.0f)
                lineTo(12.75f, 19.189f)
                lineTo(18.97f, 12.97f)
                curveTo(19.263f, 12.677f, 19.737f, 12.677f, 20.03f, 12.97f)
                curveTo(20.323f, 13.263f, 20.323f, 13.737f, 20.03f, 14.03f)
                lineTo(12.53f, 21.53f)
                curveTo(12.237f, 21.823f, 11.763f, 21.823f, 11.47f, 21.53f)
                lineTo(3.97f, 14.03f)
                curveTo(3.677f, 13.737f, 3.677f, 13.263f, 3.97f, 12.97f)
                curveTo(4.263f, 12.677f, 4.737f, 12.677f, 5.03f, 12.97f)
                lineTo(11.25f, 19.189f)
                lineTo(11.25f, 3.0f)
                curveTo(11.25f, 2.586f, 11.586f, 2.25f, 12.0f, 2.25f)
                close()
            }
        }
        .build()
        return _arrowDown!!
    }

private var _arrowDown: ImageVector? = null
