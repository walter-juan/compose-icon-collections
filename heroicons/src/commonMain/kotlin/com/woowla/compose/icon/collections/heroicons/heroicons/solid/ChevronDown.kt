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

public val SolidGroup.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = Builder(name = "ChevronDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.53f, 16.28f)
                curveTo(12.237f, 16.573f, 11.763f, 16.573f, 11.47f, 16.28f)
                lineTo(3.97f, 8.78f)
                curveTo(3.677f, 8.487f, 3.677f, 8.013f, 3.97f, 7.72f)
                curveTo(4.263f, 7.427f, 4.737f, 7.427f, 5.03f, 7.72f)
                lineTo(12.0f, 14.689f)
                lineTo(18.97f, 7.72f)
                curveTo(19.263f, 7.427f, 19.737f, 7.427f, 20.03f, 7.72f)
                curveTo(20.323f, 8.013f, 20.323f, 8.487f, 20.03f, 8.78f)
                lineTo(12.53f, 16.28f)
                close()
            }
        }
        .build()
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
