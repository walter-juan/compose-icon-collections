package com.woowla.compose.icon.collections.boxicons.boxicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.SolidGroup

public val SolidGroup.BxsCoupon: ImageVector
    get() {
        if (_bxsCoupon != null) {
            return _bxsCoupon!!
        }
        _bxsCoupon = Builder(name = "BxsCoupon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(0.893f)
                curveToRelative(0.996f, 0.0f, 1.92f, 0.681f, 2.08f, 1.664f)
                arcTo(2.001f, 2.001f, 0.0f, false, true, 3.0f, 14.0f)
                lineTo(2.0f, 14.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(2.001f, 2.001f, 0.0f, false, true, -1.973f, -2.336f)
                curveToRelative(0.16f, -0.983f, 1.084f, -1.664f, 2.08f, -1.664f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(11.0f, 17.0f)
                lineTo(9.0f, 17.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(9.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                lineTo(9.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _bxsCoupon!!
    }

private var _bxsCoupon: ImageVector? = null
