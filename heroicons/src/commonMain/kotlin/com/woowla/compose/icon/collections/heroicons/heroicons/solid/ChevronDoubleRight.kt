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

public val SolidGroup.ChevronDoubleRight: ImageVector
    get() {
        if (_chevronDoubleRight != null) {
            return _chevronDoubleRight!!
        }
        _chevronDoubleRight = Builder(name = "ChevronDoubleRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.28f, 11.47f)
                curveTo(13.573f, 11.763f, 13.573f, 12.237f, 13.28f, 12.53f)
                lineTo(5.78f, 20.03f)
                curveTo(5.487f, 20.323f, 5.013f, 20.323f, 4.72f, 20.03f)
                curveTo(4.427f, 19.737f, 4.427f, 19.263f, 4.72f, 18.97f)
                lineTo(11.689f, 12.0f)
                lineTo(4.72f, 5.03f)
                curveTo(4.427f, 4.737f, 4.427f, 4.263f, 4.72f, 3.97f)
                curveTo(5.013f, 3.677f, 5.487f, 3.677f, 5.78f, 3.97f)
                lineTo(13.28f, 11.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.28f, 11.47f)
                curveTo(19.573f, 11.763f, 19.573f, 12.237f, 19.28f, 12.53f)
                lineTo(11.78f, 20.03f)
                curveTo(11.487f, 20.323f, 11.013f, 20.323f, 10.72f, 20.03f)
                curveTo(10.427f, 19.737f, 10.427f, 19.263f, 10.72f, 18.97f)
                lineTo(17.689f, 12.0f)
                lineTo(10.72f, 5.03f)
                curveTo(10.427f, 4.737f, 10.427f, 4.263f, 10.72f, 3.97f)
                curveTo(11.013f, 3.677f, 11.487f, 3.677f, 11.78f, 3.97f)
                lineTo(19.28f, 11.47f)
                close()
            }
        }
        .build()
        return _chevronDoubleRight!!
    }

private var _chevronDoubleRight: ImageVector? = null
