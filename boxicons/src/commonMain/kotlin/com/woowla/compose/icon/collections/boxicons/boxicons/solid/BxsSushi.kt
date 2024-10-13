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

public val SolidGroup.BxsSushi: ImageVector
    get() {
        if (_bxsSushi != null) {
            return _bxsSushi!!
        }
        _bxsSushi = Builder(name = "BxsSushi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.07f, 7.0f)
                arcToRelative(3.0f, 1.71f, 0.0f, true, false, 6.0f, 0.0f)
                arcToRelative(3.0f, 1.71f, 0.0f, true, false, -6.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.07f, 22.0f)
                curveToRelative(4.48f, 0.0f, 8.0f, -2.2f, 8.0f, -5.0f)
                lineTo(20.07f, 7.0f)
                curveToRelative(0.0f, -2.8f, -3.52f, -5.0f, -8.0f, -5.0f)
                reflectiveCurveToRelative(-8.0f, 2.2f, -8.0f, 5.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 2.8f, 3.51f, 5.0f, 8.0f, 5.0f)
                close()
                moveTo(12.07f, 4.0f)
                curveToRelative(3.53f, 0.0f, 6.0f, 1.58f, 6.0f, 3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.29f, 0.87f)
                curveToRelative(-0.68f, 1.0f, -2.53f, 2.0f, -5.0f, 2.12f)
                horizontalLineToRelative(-1.39f)
                curveTo(8.88f, 9.83f, 7.0f, 8.89f, 6.35f, 7.84f)
                arcToRelative(2.16f, 2.16f, 0.0f, false, true, -0.28f, -0.76f)
                lineTo(6.07f, 7.0f)
                curveToRelative(0.0f, -1.42f, 2.46f, -3.0f, 6.0f, -3.0f)
                close()
            }
        }
        .build()
        return _bxsSushi!!
    }

private var _bxsSushi: ImageVector? = null
