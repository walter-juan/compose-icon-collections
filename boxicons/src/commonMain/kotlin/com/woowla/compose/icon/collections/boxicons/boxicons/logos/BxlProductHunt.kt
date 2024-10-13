package com.woowla.compose.icon.collections.boxicons.boxicons.logos

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
import com.woowla.compose.icon.collections.boxicons.boxicons.LogosGroup

public val LogosGroup.BxlProductHunt: ImageVector
    get() {
        if (_bxlProductHunt != null) {
            return _bxlProductHunt!!
        }
        _bxlProductHunt = Builder(name = "BxlProductHunt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.337f, 9.0f)
                horizontalLineToRelative(-2.838f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(2.838f)
                arcToRelative(1.501f, 1.501f, 0.0f, true, false, 0.0f, -3.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.477f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.477f, 10.0f, -10.0f)
                reflectiveCurveTo(17.523f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(13.337f, 14.0f)
                horizontalLineToRelative(-2.838f)
                verticalLineToRelative(3.0f)
                lineTo(8.501f, 17.0f)
                lineTo(8.501f, 7.0f)
                horizontalLineToRelative(4.837f)
                arcToRelative(3.498f, 3.498f, 0.0f, false, true, 3.499f, 3.499f)
                arcToRelative(3.499f, 3.499f, 0.0f, false, true, -3.5f, 3.501f)
                close()
            }
        }
        .build()
        return _bxlProductHunt!!
    }

private var _bxlProductHunt: ImageVector? = null
