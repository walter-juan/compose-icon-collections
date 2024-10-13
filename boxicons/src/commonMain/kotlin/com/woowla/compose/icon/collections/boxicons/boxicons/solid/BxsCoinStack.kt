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

public val SolidGroup.BxsCoinStack: ImageVector
    get() {
        if (_bxsCoinStack != null) {
            return _bxsCoinStack!!
        }
        _bxsCoinStack = Builder(name = "BxsCoinStack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveToRelative(3.976f, 0.0f, 8.0f, -1.374f, 8.0f, -4.0f)
                reflectiveCurveToRelative(-4.024f, -4.0f, -8.0f, -4.0f)
                reflectiveCurveToRelative(-8.0f, 1.374f, -8.0f, 4.0f)
                reflectiveCurveToRelative(4.024f, 4.0f, 8.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 10.0f)
                curveToRelative(0.0f, 2.626f, 4.024f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.374f, 8.0f, -4.0f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, 2.626f, -4.024f, 4.0f, -8.0f, 4.0f)
                reflectiveCurveToRelative(-8.0f, -1.374f, -8.0f, -4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                curveToRelative(0.0f, 2.626f, 4.024f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.374f, 8.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.626f, -4.024f, 4.0f, -8.0f, 4.0f)
                reflectiveCurveToRelative(-8.0f, -1.374f, -8.0f, -4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 18.0f)
                curveToRelative(0.0f, 2.626f, 4.024f, 4.0f, 8.0f, 4.0f)
                reflectiveCurveToRelative(8.0f, -1.374f, 8.0f, -4.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, 2.626f, -4.024f, 4.0f, -8.0f, 4.0f)
                reflectiveCurveToRelative(-8.0f, -1.374f, -8.0f, -4.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsCoinStack!!
    }

private var _bxsCoinStack: ImageVector? = null
