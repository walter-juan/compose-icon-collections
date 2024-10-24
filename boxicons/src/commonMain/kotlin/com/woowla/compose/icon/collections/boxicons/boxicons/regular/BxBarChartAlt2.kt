package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBarChartAlt2: ImageVector
    get() {
        if (_bxBarChartAlt2 != null) {
            return _bxBarChartAlt2!!
        }
        _bxBarChartAlt2 = Builder(name = "BxBarChartAlt2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 7.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(5.0f)
                lineTo(4.0f, 9.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(22.0f, 9.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(4.0f, 11.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(8.0f)
                lineTo(4.0f, 19.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(15.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-9.0f)
                close()
                moveTo(20.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(16.0f, 9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _bxBarChartAlt2!!
    }

private var _bxBarChartAlt2: ImageVector? = null