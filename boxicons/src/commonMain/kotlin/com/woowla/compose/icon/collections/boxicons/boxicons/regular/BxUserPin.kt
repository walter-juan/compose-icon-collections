package com.woowla.compose.icon.collections.boxicons.boxicons.regular

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
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxUserPin: ImageVector
    get() {
        if (_bxUserPin != null) {
            return _bxUserPin!!
        }
        _bxUserPin = Builder(name = "BxUserPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveToRelative(1.151f, 0.0f, 2.0f, -0.848f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.849f, -2.0f, -2.0f, -2.0f)
                curveToRelative(-1.15f, 0.0f, -2.0f, 0.848f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.85f, 2.0f, 2.0f, 2.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(-2.209f, 0.0f, -4.0f, 1.612f, -4.0f, 3.6f)
                verticalLineToRelative(0.386f)
                horizontalLineToRelative(8.0f)
                lineTo(16.0f, 14.6f)
                curveToRelative(0.0f, -1.988f, -1.791f, -3.6f, -4.0f, -3.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 2.0f)
                lineTo(5.0f, 2.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, 0.897f, -2.0f, 2.0f)
                verticalLineToRelative(13.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(3.0f, -3.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                lineTo(21.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, -0.897f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(12.0f, 19.0f)
                lineTo(10.0f, 17.0f)
                lineTo(5.0f, 17.0f)
                lineTo(5.0f, 4.0f)
                horizontalLineToRelative(14.0f)
                lineToRelative(0.002f, 13.0f)
                lineTo(14.0f, 17.0f)
                close()
            }
        }
        .build()
        return _bxUserPin!!
    }

private var _bxUserPin: ImageVector? = null
