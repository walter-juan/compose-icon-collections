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

public val RegularGroup.BxBitcoin: ImageVector
    get() {
        if (_bxBitcoin != null) {
            return _bxBitcoin!!
        }
        _bxBitcoin = Builder(name = "BxBitcoin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                verticalLineToRelative(4.0f)
                lineTo(6.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.051f)
                curveToRelative(1.968f, -0.249f, 3.5f, -1.915f, 3.5f, -3.949f)
                curveToRelative(0.0f, -1.32f, -0.65f, -2.484f, -1.64f, -3.213f)
                arcTo(3.982f, 3.982f, 0.0f, false, false, 18.0f, 9.0f)
                curveToRelative(0.0f, -1.858f, -1.279f, -3.411f, -3.0f, -3.858f)
                lineTo(15.0f, 3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 3.0f)
                lineTo(9.0f, 3.0f)
                verticalLineToRelative(2.0f)
                lineTo(6.0f, 5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(14.5f, 17.0f)
                lineTo(10.0f, 17.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.5f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                close()
                moveTo(10.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.103f, 0.0f, 2.0f, 0.897f, 2.0f, 2.0f)
                reflectiveCurveToRelative(-0.897f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(10.0f, 7.0f)
                close()
            }
        }
        .build()
        return _bxBitcoin!!
    }

private var _bxBitcoin: ImageVector? = null
