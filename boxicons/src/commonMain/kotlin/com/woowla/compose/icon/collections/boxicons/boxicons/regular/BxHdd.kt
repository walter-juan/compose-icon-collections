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

public val RegularGroup.BxHdd: ImageVector
    get() {
        if (_bxHdd != null) {
            return _bxHdd!!
        }
        _bxHdd = Builder(name = "BxHdd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.983f, 13.821f)
                lineToRelative(-1.851f, -10.18f)
                arcTo(1.998f, 1.998f, 0.0f, false, false, 18.165f, 2.0f)
                horizontalLineTo(5.835f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.968f, 1.643f)
                lineToRelative(-1.85f, 10.178f)
                lineToRelative(0.019f, 0.003f)
                curveToRelative(-0.012f, 0.06f, -0.036f, 0.114f, -0.036f, 0.176f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 1.103f, 0.897f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, -0.897f, 2.0f, -2.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.063f, -0.024f, -0.116f, -0.035f, -0.176f)
                lineToRelative(0.018f, -0.003f)
                close()
                moveTo(5.835f, 4.0f)
                horizontalLineToRelative(12.331f)
                lineToRelative(1.637f, 9.0f)
                horizontalLineTo(4.198f)
                lineToRelative(1.637f, -9.0f)
                close()
                moveTo(4.0f, 19.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(0.002f, 4.0f)
                horizontalLineTo(4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(14.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _bxHdd!!
    }

private var _bxHdd: ImageVector? = null
