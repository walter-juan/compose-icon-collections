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

public val RegularGroup.BxDollar: ImageVector
    get() {
        if (_bxDollar != null) {
            return _bxDollar!!
        }
        _bxDollar = Builder(name = "BxDollar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.999f, 8.5f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, -2.837f, -2.755f, -4.131f, -5.0f, -4.429f)
                lineTo(12.999f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.071f)
                curveToRelative(-2.245f, 0.298f, -5.0f, 1.592f, -5.0f, 4.429f)
                curveToRelative(0.0f, 2.706f, 2.666f, 4.113f, 5.0f, 4.43f)
                verticalLineToRelative(4.97f)
                curveToRelative(-1.448f, -0.251f, -3.0f, -1.024f, -3.0f, -2.4f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.589f, 2.425f, 4.119f, 5.0f, 4.436f)
                lineTo(10.999f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.07f)
                curveToRelative(2.245f, -0.298f, 5.0f, -1.593f, 5.0f, -4.43f)
                reflectiveCurveToRelative(-2.755f, -4.131f, -5.0f, -4.429f)
                lineTo(12.999f, 6.1f)
                curveToRelative(1.33f, 0.239f, 3.0f, 0.941f, 3.0f, 2.4f)
                close()
                moveTo(7.999f, 8.5f)
                curveToRelative(0.0f, -1.459f, 1.67f, -2.161f, 3.0f, -2.4f)
                verticalLineToRelative(4.799f)
                curveToRelative(-1.371f, -0.253f, -3.0f, -1.002f, -3.0f, -2.399f)
                close()
                moveTo(15.999f, 15.5f)
                curveToRelative(0.0f, 1.459f, -1.67f, 2.161f, -3.0f, 2.4f)
                verticalLineToRelative(-4.8f)
                curveToRelative(1.33f, 0.239f, 3.0f, 0.941f, 3.0f, 2.4f)
                close()
            }
        }
        .build()
        return _bxDollar!!
    }

private var _bxDollar: ImageVector? = null
