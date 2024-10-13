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

public val RegularGroup.BxSearchAlt2: ImageVector
    get() {
        if (_bxSearchAlt2 != null) {
            return _bxSearchAlt2!!
        }
        _bxSearchAlt2 = Builder(name = "BxSearchAlt2", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.023f, 16.977f)
                arcToRelative(35.13f, 35.13f, 0.0f, false, true, -1.367f, -1.384f)
                curveToRelative(-0.372f, -0.378f, -0.596f, -0.653f, -0.596f, -0.653f)
                lineToRelative(-2.8f, -1.337f)
                arcTo(6.962f, 6.962f, 0.0f, false, false, 16.0f, 9.0f)
                curveToRelative(0.0f, -3.859f, -3.14f, -7.0f, -7.0f, -7.0f)
                reflectiveCurveTo(2.0f, 5.141f, 2.0f, 9.0f)
                reflectiveCurveToRelative(3.14f, 7.0f, 7.0f, 7.0f)
                curveToRelative(1.763f, 0.0f, 3.37f, -0.66f, 4.603f, -1.739f)
                lineToRelative(1.337f, 2.8f)
                reflectiveCurveToRelative(0.275f, 0.224f, 0.653f, 0.596f)
                curveToRelative(0.387f, 0.363f, 0.896f, 0.854f, 1.384f, 1.367f)
                lineToRelative(1.358f, 1.392f)
                lineToRelative(0.604f, 0.646f)
                lineToRelative(2.121f, -2.121f)
                lineToRelative(-0.646f, -0.604f)
                curveToRelative(-0.379f, -0.372f, -0.885f, -0.866f, -1.391f, -1.36f)
                close()
                moveTo(9.0f, 14.0f)
                curveToRelative(-2.757f, 0.0f, -5.0f, -2.243f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.243f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.243f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.243f, 5.0f, -5.0f, 5.0f)
                close()
            }
        }
        .build()
        return _bxSearchAlt2!!
    }

private var _bxSearchAlt2: ImageVector? = null
