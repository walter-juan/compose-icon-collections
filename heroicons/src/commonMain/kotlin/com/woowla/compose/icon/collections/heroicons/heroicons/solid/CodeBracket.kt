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

public val SolidGroup.CodeBracket: ImageVector
    get() {
        if (_codeBracket != null) {
            return _codeBracket!!
        }
        _codeBracket = Builder(name = "CodeBracket", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.447f, 3.026f)
                curveTo(14.847f, 3.135f, 15.083f, 3.548f, 14.974f, 3.947f)
                lineTo(10.474f, 20.447f)
                curveTo(10.365f, 20.847f, 9.952f, 21.083f, 9.553f, 20.973f)
                curveTo(9.153f, 20.865f, 8.917f, 20.452f, 9.026f, 20.053f)
                lineTo(13.526f, 3.553f)
                curveTo(13.635f, 3.153f, 14.048f, 2.917f, 14.447f, 3.026f)
                close()
                moveTo(16.72f, 6.22f)
                curveTo(17.013f, 5.927f, 17.487f, 5.927f, 17.78f, 6.22f)
                lineTo(23.03f, 11.47f)
                curveTo(23.323f, 11.762f, 23.323f, 12.237f, 23.03f, 12.53f)
                lineTo(17.78f, 17.78f)
                curveTo(17.487f, 18.073f, 17.013f, 18.073f, 16.72f, 17.78f)
                curveTo(16.427f, 17.487f, 16.427f, 17.013f, 16.72f, 16.72f)
                lineTo(21.439f, 12.0f)
                lineTo(16.72f, 7.28f)
                curveTo(16.427f, 6.987f, 16.427f, 6.513f, 16.72f, 6.22f)
                close()
                moveTo(7.28f, 6.22f)
                curveTo(7.573f, 6.513f, 7.573f, 6.987f, 7.28f, 7.28f)
                lineTo(2.561f, 12.0f)
                lineTo(7.28f, 16.72f)
                curveTo(7.573f, 17.013f, 7.573f, 17.487f, 7.28f, 17.78f)
                curveTo(6.987f, 18.073f, 6.513f, 18.073f, 6.22f, 17.78f)
                lineTo(0.97f, 12.53f)
                curveTo(0.677f, 12.237f, 0.677f, 11.762f, 0.97f, 11.47f)
                lineTo(6.22f, 6.22f)
                curveTo(6.513f, 5.927f, 6.987f, 5.927f, 7.28f, 6.22f)
                close()
            }
        }
        .build()
        return _codeBracket!!
    }

private var _codeBracket: ImageVector? = null
