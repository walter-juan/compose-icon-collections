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

public val RegularGroup.BxTaxi: ImageVector
    get() {
        if (_bxTaxi != null) {
            return _bxTaxi!!
        }
        _bxTaxi = Builder(name = "BxTaxi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.772f, 10.156f)
                lineToRelative(-1.368f, -4.105f)
                arcTo(2.995f, 2.995f, 0.0f, false, false, 16.559f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(7.441f)
                arcToRelative(2.995f, 2.995f, 0.0f, false, false, -2.845f, 2.051f)
                lineToRelative(-1.368f, 4.105f)
                arcTo(2.003f, 2.003f, 0.0f, false, false, 2.0f, 12.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.753f, 0.423f, 1.402f, 1.039f, 1.743f)
                curveToRelative(-0.013f, 0.066f, -0.039f, 0.126f, -0.039f, 0.195f)
                verticalLineTo(21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                verticalLineToRelative(-2.062f)
                curveToRelative(0.0f, -0.069f, -0.026f, -0.13f, -0.039f, -0.195f)
                arcTo(1.993f, 1.993f, 0.0f, false, false, 22.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -0.829f, -0.508f, -1.541f, -1.228f, -1.844f)
                close()
                moveTo(4.0f, 17.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(16.0f)
                lineToRelative(0.002f, 5.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(7.441f, 6.0f)
                horizontalLineToRelative(9.117f)
                curveToRelative(0.431f, 0.0f, 0.813f, 0.274f, 0.949f, 0.684f)
                lineTo(18.613f, 10.0f)
                horizontalLineTo(5.387f)
                lineToRelative(1.105f, -3.316f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.441f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 14.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 14.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
        }
        .build()
        return _bxTaxi!!
    }

private var _bxTaxi: ImageVector? = null
