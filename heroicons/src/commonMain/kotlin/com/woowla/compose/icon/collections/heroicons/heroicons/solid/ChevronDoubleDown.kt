package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val SolidGroup.ChevronDoubleDown: ImageVector
    get() {
        if (_chevronDoubleDown != null) {
            return _chevronDoubleDown!!
        }
        _chevronDoubleDown = Builder(name = "ChevronDoubleDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 13.28f)
                curveTo(11.763f, 13.573f, 12.237f, 13.573f, 12.53f, 13.28f)
                lineTo(20.03f, 5.78f)
                curveTo(20.323f, 5.487f, 20.323f, 5.013f, 20.03f, 4.72f)
                curveTo(19.737f, 4.427f, 19.263f, 4.427f, 18.97f, 4.72f)
                lineTo(12.0f, 11.689f)
                lineTo(5.03f, 4.72f)
                curveTo(4.737f, 4.427f, 4.263f, 4.427f, 3.97f, 4.72f)
                curveTo(3.677f, 5.013f, 3.677f, 5.487f, 3.97f, 5.78f)
                lineTo(11.47f, 13.28f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.47f, 19.28f)
                curveTo(11.763f, 19.573f, 12.237f, 19.573f, 12.53f, 19.28f)
                lineTo(20.03f, 11.78f)
                curveTo(20.323f, 11.487f, 20.323f, 11.013f, 20.03f, 10.72f)
                curveTo(19.737f, 10.427f, 19.263f, 10.427f, 18.97f, 10.72f)
                lineTo(12.0f, 17.689f)
                lineTo(5.03f, 10.72f)
                curveTo(4.737f, 10.427f, 4.263f, 10.427f, 3.97f, 10.72f)
                curveTo(3.677f, 11.013f, 3.677f, 11.487f, 3.97f, 11.78f)
                lineTo(11.47f, 19.28f)
                close()
            }
        }
        .build()
        return _chevronDoubleDown!!
    }

private var _chevronDoubleDown: ImageVector? = null
