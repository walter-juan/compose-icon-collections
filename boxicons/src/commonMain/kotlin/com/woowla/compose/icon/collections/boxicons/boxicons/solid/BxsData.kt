package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsData: ImageVector
    get() {
        if (_bxsData != null) {
            return _bxsData!!
        }
        _bxsData = Builder(name = "BxsData", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                curveToRelative(0.0f, -2.168f, -3.663f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveTo(4.0f, 3.832f, 4.0f, 6.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 2.168f, 3.663f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.832f, 8.0f, -4.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveToRelative(-4.337f, 0.0f, -8.0f, -1.832f, -8.0f, -4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.168f, 3.663f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.832f, 8.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, 2.168f, -3.663f, 4.0f, -8.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 10.0f)
                curveToRelative(0.0f, 2.168f, -3.663f, 4.0f, -8.0f, 4.0f)
                reflectiveCurveToRelative(-8.0f, -1.832f, -8.0f, -4.0f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 2.168f, 3.663f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.832f, 8.0f, -4.0f)
                verticalLineToRelative(-3.0f)
                close()
            }
        }
        .build()
        return _bxsData!!
    }

private var _bxsData: ImageVector? = null
