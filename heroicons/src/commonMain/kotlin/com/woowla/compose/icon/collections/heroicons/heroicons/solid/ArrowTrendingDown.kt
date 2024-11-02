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

public val SolidGroup.ArrowTrendingDown: ImageVector
    get() {
        if (_arrowTrendingDown != null) {
            return _arrowTrendingDown!!
        }
        _arrowTrendingDown = Builder(name = "ArrowTrendingDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.72f, 5.47f)
                curveTo(2.013f, 5.177f, 2.487f, 5.177f, 2.78f, 5.47f)
                lineTo(9.0f, 11.689f)
                lineTo(12.756f, 7.933f)
                curveTo(13.021f, 7.668f, 13.443f, 7.64f, 13.741f, 7.868f)
                curveTo(15.904f, 9.517f, 17.558f, 11.87f, 18.316f, 14.7f)
                lineTo(18.624f, 15.849f)
                lineTo(20.901f, 11.906f)
                curveTo(21.108f, 11.547f, 21.567f, 11.424f, 21.925f, 11.631f)
                curveTo(22.284f, 11.838f, 22.407f, 12.297f, 22.2f, 12.656f)
                lineTo(19.018f, 18.167f)
                curveTo(18.919f, 18.339f, 18.755f, 18.465f, 18.563f, 18.516f)
                curveTo(18.37f, 18.568f, 18.166f, 18.541f, 17.993f, 18.441f)
                lineTo(12.482f, 15.259f)
                curveTo(12.123f, 15.052f, 12.0f, 14.594f, 12.208f, 14.235f)
                curveTo(12.415f, 13.876f, 12.873f, 13.753f, 13.232f, 13.96f)
                lineTo(17.175f, 16.237f)
                lineTo(16.868f, 15.088f)
                curveTo(16.259f, 12.816f, 14.998f, 10.896f, 13.339f, 9.471f)
                lineTo(9.53f, 13.28f)
                curveTo(9.237f, 13.573f, 8.763f, 13.573f, 8.47f, 13.28f)
                lineTo(1.72f, 6.53f)
                curveTo(1.427f, 6.237f, 1.427f, 5.763f, 1.72f, 5.47f)
                close()
            }
        }
        .build()
        return _arrowTrendingDown!!
    }

private var _arrowTrendingDown: ImageVector? = null
