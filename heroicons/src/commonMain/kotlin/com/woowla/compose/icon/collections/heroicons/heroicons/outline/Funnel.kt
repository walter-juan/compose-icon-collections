package com.woowla.compose.icon.collections.heroicons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.OutlineGroup

public val OutlineGroup.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF0F172A)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(14.755f, 3.0f, 17.455f, 3.232f, 20.083f, 3.678f)
                curveTo(20.616f, 3.768f, 21.0f, 4.234f, 21.0f, 4.774f)
                verticalLineTo(5.818f)
                curveTo(21.0f, 6.415f, 20.763f, 6.987f, 20.341f, 7.409f)
                lineTo(14.909f, 12.841f)
                curveTo(14.487f, 13.263f, 14.25f, 13.835f, 14.25f, 14.432f)
                verticalLineTo(17.359f)
                curveTo(14.25f, 18.212f, 13.769f, 18.991f, 13.006f, 19.372f)
                lineTo(9.75f, 21.0f)
                verticalLineTo(14.432f)
                curveTo(9.75f, 13.835f, 9.513f, 13.263f, 9.091f, 12.841f)
                lineTo(3.659f, 7.409f)
                curveTo(3.237f, 6.987f, 3.0f, 6.415f, 3.0f, 5.818f)
                verticalLineTo(4.774f)
                curveTo(3.0f, 4.234f, 3.384f, 3.768f, 3.917f, 3.678f)
                curveTo(6.545f, 3.232f, 9.245f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
