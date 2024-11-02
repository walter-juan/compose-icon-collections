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

public val SolidGroup.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight = Builder(name = "ChevronRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.28f, 11.47f)
                curveTo(16.573f, 11.763f, 16.573f, 12.237f, 16.28f, 12.53f)
                lineTo(8.78f, 20.03f)
                curveTo(8.487f, 20.323f, 8.013f, 20.323f, 7.72f, 20.03f)
                curveTo(7.427f, 19.737f, 7.427f, 19.263f, 7.72f, 18.97f)
                lineTo(14.689f, 12.0f)
                lineTo(7.72f, 5.03f)
                curveTo(7.427f, 4.737f, 7.427f, 4.263f, 7.72f, 3.97f)
                curveTo(8.013f, 3.677f, 8.487f, 3.677f, 8.78f, 3.97f)
                lineTo(16.28f, 11.47f)
                close()
            }
        }
        .build()
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
